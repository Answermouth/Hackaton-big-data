library(Matrix)
library(arules)
library(arulesSequences)

x <- read_baskets(con = system.file("misc", "C:/Users/a.gamet/Desktop/cleaned data/hospit.csv", package = "arulesSequences"), info = c("sequenceID","eventID","SIZE"))

#as(x, "data.frame")

s1 <- cspade(x, parameter = list(support = 0.4), control = list(verbose = TRUE))

#summary(s1)
#as(s1, "data.frame")