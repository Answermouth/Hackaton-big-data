replaceServByLetter <- function(x) {
  result <- "z"
  switch(x,
         "354"={result <- 'A'},
         "342"={result <- 'A'},
         "356"={result <- 'A'},
         "367"={result <- 'B'},
         "362"={result <- 'C'},
         "370"={result <- 'D'},
         "350"={result <- 'E'},
         "355"={result <- 'F'},
         "339"={result <- 'F'},
         "363"={result <- 'G'},
         "352"={result <- 'G'},
         "364"={result <- 'G'},
         "349"={result <- 'H'},
         "366"={result <- 'I'},
         "371"={result <- 'J'},
         "382"={result <- 'K'},
         "347"={result <- 'L'},
         "361"={result <- 'L'},
         "378"={result <- 'M'},
         "343"={result <- 'N'},
         "353"={result <- 'O'},
         "341"={result <- 'P'},
         "376"={result <- 'Q'},
         "358"={result <- 'R'},
         "344"={result <- 'R'},
         "357"={result <- 'R'},
         "368"={result <- 'S'},
         "365"={result <- 'T'},
         "348"={result <- 'U'},
         "359"={result <- 'V'},
         "346"={result <- 'W'},
         "360"={result <- 'W'},
         "351"={result <- 'X'},
         "377"={result <- 'Y'},
         "345"={result <- 'Z'},
         "381"={result <- 'Z'},
         "380"={result <- 'Z'},
         "372"={result <- 'a'},
         "340"={result <- 'b'},
         "379"={result <- 'c'}
  )
  return(result)
}

replaceServByLetter2 <- function(x) {
  result <- "100"
  switch(x,
         "A"={result <- 200},
         "B"={result <- 201},
         "C"={result <- 202},
         "D"={result <- 203},
         "E"={result <- 204},
         "F"={result <- 205},
         "G"={result <- 206},
         "H"={result <- 207},
         "I"={result <- 208},
         "J"={result <- 209},
         "K"={result <- 210},
         "L"={result <- 211},
         "M"={result <- 212},
         "N"={result <- 213},
         "O"={result <- 214},
         "P"={result <- 215},
         "Q"={result <- 216},
         "R"={result <- 217},
         "S"={result <- 218},
         "T"={result <- 219},
         "U"={result <- 220},
         "V"={result <- 221},
         "W"={result <- 222},
         "X"={result <- 223},
         "Y"={result <- 224},
         "Z"={result <- 225},
         "a"={result <- 226},
         "b"={result <- 227},
         "c"={result <- 228}
  )
  return(result)
}


# data import
library(readr)
data <- read_csv("../data/nice_data.csv", 
                      col_types = cols(DATETIME = col_datetime(format = "%Y%m%d%H%M")))

# data preparation
keep <- c("NIPATIENT","DATETIME","NISERVICE")
data <- data[keep]
data["DATETIME"] <- apply(data["DATETIME"], 1, as.POSIXct)
data["NISERVICE"] <- apply(data["NISERVICE"], 1, as.character)
data["NISERVICE"] <- apply(data["NISERVICE"], 1, replaceServByLetter)
data["NISERVICE"] <- apply(data["NISERVICE"], 1, replaceServByLetter2)

# data export
tabPatient <- unique(data$NIPATIENT)

file.remove("../data/prepared_data", "../data/datetimes")

for (i in 1:length(tabPatient)){
  
  user <- data[data$NIPATIENT == tabPatient[i],]
  datetime <- user$DATETIME
  user <- user$NISERVICE
  tmp <- (1+integer(length(user)))*(-1)
  rsl <- c(rbind(user,tmp))
  dt <- c(datetime)
  rsl <- c(rsl,-2)
  
  write(gsub(',', '', toString(rsl)), file = "../data/prepared_data",append = TRUE, sep = " ")
  write(gsub(',', '', toString(dt)), file = "../data/datetimes",append = TRUE, sep = " ")
}