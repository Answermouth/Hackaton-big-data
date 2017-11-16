library(ggplot2)

cleaned_nice_data <- nice_data[nice_data$DATETIME > as.POSIXct("2011-01-01 00:00:00"),]

ggplot(data = data, aes(x = DATETIME, y = NIPATIENT, group=NISERVICE, color=NISERVICE)) +
  geom_point()

ggplot(data = past_hospit_single[past_hospit_single$DATETIME > as.POSIXct("2011-01-01 00:00:00"),], aes(x = DATETIME, y = NOM, color=DATETIME)) +
  geom_point()
