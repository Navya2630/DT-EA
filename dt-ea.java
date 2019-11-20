install.package("party")

library(party)

View(readingSkills)

input =  readingSkills[c(1:105),]

output = ctree(nativeSpeaker ~ age + shoeSize + score, data = input)

plot(output)