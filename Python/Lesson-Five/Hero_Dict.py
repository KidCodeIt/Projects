
myHero {"SuperMan", "Strength", "Batman": "Money", "Spiderman": "Web-Slinging", "Ironman":"a IronMan Suite", "Thor":"a Magical Hammer");

print "You have a group of Super Heros" + myHero.keys()

userIn = input("type the name of a superhero to see their special ability");

if myHero.containsKey(userIN):
	print "Your Super Hero " + userIN + " has the power of " + myHero[userIN]

else:
	print "The Super Hero you named isn't in our group"
