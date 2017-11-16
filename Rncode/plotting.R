library(ggplot2)

ggplot(data = past_hospit_2, aes(x = DATE_ENT, y = NIP, group=NOM, color=NOM)) +
  geom_point()

ggplot(data = past_hospit_single, aes(x = DATE_ENT, y = NOM, color=DATE_ENT)) +
  geom_point()
