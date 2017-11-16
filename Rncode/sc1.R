library(ggplot2)
library(readr)

dat <- read_csv("/home/etudiants/martine57u/Téléchargements/past_hospit.csv",
         col_types = cols(DATE_ENT = col_datetime(format = "%Y%m%d")))

ggplot(data = data, aes(x=DATETIME_ENT, y=as.character(NIPATIENT),color=as.factor(NISERVICE))) +
  theme(axis.text.x = element_text(angle = 90,size=7))+
  geom_point(size=0.7)