tabPatient <- unique(data$NIPATIENT)

write("", file = "C:/Users/Ansel/Desktop/hackaton/ans/test",append = FALSE, sep = "")

for (i in 1:length(tabPatient)){
  
  user <- data[data$NIPATIENT == tabPatient[i],]
  niserv <- user$NISERVICE
  datetime <- user$DATETIME
  tmp <- (1+integer(length(user)))*(-1)
  rsl <- c(rbind(niserv,tmp))
  #rsl <- c(rbind(datetime,niserv,tmp))
  rsl <- c(rsl,-2)
  
  write(gsub(',', '', toString(rsl)), file = "C:/Users/Ansel/Desktop/hackaton/ans/test",append = TRUE, sep = " ")
  
  write(gsub(',', '', toString(datetime)), file = "C:/Users/Ansel/Desktop/hackaton/ans/datetimes.csv",append = TRUE, sep = ",")
}