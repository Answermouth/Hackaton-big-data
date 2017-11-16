library(readr)
past_hospit_2 <- read_csv("/home/etudiants/martine57u/Téléchargements/ans/past_hospit_2.csv", 
                          col_types = cols(DATE_ENT = col_date(format = "%Y%m%d"), 
                                           DATE_ENT_1 = col_date(format = "%Y%m%d"), 
                                           DATE_SOR = col_date(format = "%Y%m%d"), 
                                           DATE_SOR_1 = col_date(format = "%Y%m%d"), 
                                           HEURE_ENT = col_time(format = "%H%M"), 
                                           HEURE_ENT_1 = col_time(format = "%H%M"), 
                                           HEURE_SOR = col_time(format = "%H%M"), 
                                           HEURE_SOR_1 = col_time(format = "%H%M")))


library(readr)
past_hospit_3 <- read_csv("/home/etudiants/martine57u/Téléchargements/ans/past_hospit_3.csv")
