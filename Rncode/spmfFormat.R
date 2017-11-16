tabPatient <- unique(data$NIPATIENT)

file.remove("C:/Users/Ansel/Desktop/hackaton/ans/test", "C:/Users/Ansel/Desktop/hackaton/ans/datetimes.csv")

for (i in 1:length(tabPatient)){
  
  user <- data[data$NIPATIENT == tabPatient[i],]
  datetime <- user$DATETIME
  user <- user$NISERVICE
  tmp <- (1+integer(length(user)))*(-1)
  rsl <- c(rbind(user,tmp))
  dt <- c(datetime)
  rsl <- c(rsl,-2)
  
  write(gsub(',', '', toString(rsl)), file = "C:/Users/Ansel/Desktop/hackaton/ans/test",append = TRUE, sep = " ")
  write(gsub(',', '', toString(dt)), file = "C:/Users/Ansel/Desktop/hackaton/ans/datetimes.csv",append = TRUE, sep = ",")
}