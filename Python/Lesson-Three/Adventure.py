


print "We have an urgent misson for you!"
#This needs to read in input for variable name
name = input("What is your code name?")


print "Great! Agent " + name

print "The Evil DR. Fox is chicken napping chickens everywhere!"
print "We need your help to rescue them, and Stop DR. Fox"
#This needs to read in input
weapon = input("First you will need to choose your weapon. Do you want to use a Fox Mask or a Tennis Raquet?(Mask/Raquet)")

#weapon = scan.next();

if weapon == "Mask":
	print "Great choice, you picked the Fox Mask"
elif weapon == "Raquet":
	print "Excellent choice, you picked the Tennis Raquet"

print "Our intel has told us that DR. Fox is hiding away in his secret layer Mount FoxHole"
print "The plane is waiting in the hanger for you, good luck on your mission we are counting on you"
#needs input
time = input("Do you want to airdrop in at night or during the day? (night/day)")

#time = scan.next();

if time == "night":
	print "Great choice, you were able to land without being detected"
	#
	door = input("Their looks like there is a door in the side of the mountain. Do you want to try going through the door?(yes/no)")
	#door = scan.next();

if door == "yes":
	if weapon == "Mask":
		print "You put on your Fox Mask and tried opening the door"
		print "The door was unlocked and you enter DR. Fox's layer."
		print "You wander around DR. Fox's Layer"
		#Cluck reads in
		cluck = input("Eventually you hear clucking. Do you follow the noise of the clucking?(yes/no)")

		#cluck = scan.next();

		if cluck == "yes":
			print "You eventually make it to the are where the clucking is."
			print"You peak around the corner to see all of the chickens in a cage."
			print "The chickens are guarded by two Henchmen."
			print "You still have your Fox Mask on and walk out towards the gaurds."
			print "Your Mask works and they don't realize you aren't a hentchmen."
			#action is input
			action = input("You are approaching them what do you do?(talk/attack)")
			#action = scan.next();
			if action == "talk":
				print "You tell the hentchmen that DR. Fox needs them immediately, and that you are their to guard the chickens."
				print "The immediately know you are an intruder because they are Foxes and can't understand you."
				print "One of them attacks you, and the other runs to alert DR. Fox and get back up."
				print "Back up shows up and they are able to capture you."
				print "You have failed your mission."
			elif action == "attack":
				print "When you get close enough, you surprise attack the two guards."
				print "Your plan works and you are able to defeat them."
				print "You then break the chickens out and now you need to escape."
				print "You look around and notice a vent in the wall"

				escape = input("How do you want to escape?(vent/other)")
				#escape = scan.next();
				if escape == "vent":
					print "You lead the chickens through the vent and outside, you signal for a helicopter."
					print "Everyone makes it onboard safely."
					print "Misson Accomplished. Good Work."
				elif escape == "other":
					print "You wander through the tunnels with all of the chickens."
					print "Eventually other henchmen return to the empty cage and the knocked out guards."
					print "They alert DR.Fox and they begin searching the layer."
					print "You don't make it outside in time, and you are found and captured with all of the chickens."
					print "You have failed your mission."

		elif cluck == "no":
			print "You decided to ignore the clucking and continue to crawl around in the vents."
			print "As you crawl around DR. Fox's henchmen hear you and they eventually track you down in the vents and capture you."
			print "You have failed your mission."
	elif weapon == "Raquet":
		print "You try opening the door"
		#input
		goIn = input("The door is unlocked, do you want to go in?(yes/no)")
		#goIn = scan.next();

		if goIn == "yes":
			print "You walk in and are immediatly detected, after putting up a hard fight you are captured."
			print "You have failed your mission."
		elif goIn == "no":
			print "You look around nearby and you notice a vent slightly open."
			print "You choose to go in that way."
			print "As you crawl through the vent you hear clucking."
			#input
			cluck = input("Do you want to go towards the clucking? (yes/no)")
			#cluck = scan.next();
			if cluck == "yes":
				print "As you crawl closer to the clucking you begin hearing barks from DR. Fox's Henchmen"
				print "You crawl out of the vent, and peak around the corner to see all of the chickens in a cage."
				print "The chickens are guarded by two Henchmen."
				print "You notice a Tennis Ball on the ground and you get an idea."
				print "You take your Tennis Raquet and you hit the tennis ball down the hall past the gaurds."
				print "Your idea works and the henchmen take off after the ball."
				print "The Chickens are unguarded, you go up and break them out."
				escape = input("How do you want to escape?(vent/other)")
				#input
				#escape = scan.next();
				if escape == "vent":
					print "You lead the chickens through the vent and outside, you signal for a helicopter."
					print "Everyone makes it onboard safely."
					print "Misson Accomplished. Good Work."
				elif escape == "other":
					print "You wander through the tunnels with all of the chickens."
					print "Eventually the henchmen return the the cage and find it empty."
					print "They alert DR.Fox and they begin searching the layer."
					print "You don't make it outside in time, and you are found and captured with all of the chickens."
					print "You have failed your mission."
			elif cluck == "no":
				print "You decided to ignore the clucking and continue to crawl around in the vents."
				print "As you crawl around DR. Fox's henchmen hear you and they eventually track you down in the vents and capture you."
				print "You have failed your mission."
elif door == "no":
	print "You look around nearby and you notice a vent slightly open."
#input
	vent = input("Do you want to go in using the vent?(yes/no)")
	#vent = scan.next();
	if vent == "yes":
		#Doing now
		print "You choose to go in that way."
		print "As you crawl through the vent you hear clucking."
		#input
		cluck = input("Do you want to go towards the clucking? (yes/no)")
		#cluck = scan.next();
		if cluck == "yes":
			print "As you crawl closer to the clucking you begin hearing barks from DR. Fox's Henchmen"
			print "You crawl out of the vent, and peak around the corner to see all of the chickens in a cage."
			print "The chickens are guarded by two Henchmen."
			if weapon == "Raquet":
				print "You notice a Tennis Ball on the ground and you get an idea."
				print "You take your Tennis Raquet and you hit the tennis ball down the hall past the gaurds."
				print "Your idea works and the henchmen take off after the ball."
				print "The Chickens are unguarded, you go up and break them out."
				#takes input
				escape = input("How do you want to escape?(vent/other)")
				#escape = scan.next()
				if escape == "vent":
					print "You lead the chickens through the vent and outside, you signal for a helicopter."
					print "Everyone makes it onboard safely."
					print "Misson Accomplished. Good Work."
				elif escape == "other":
					print "You wander through the tunnels with all of the chickens."
					print "Eventually the henchmen return the the cage and find it empty."
					print "They alert DR.Fox and they begin searching the layer."
					print "You don't make it outside in time, and you are found and captured with all of the chickens."
					print "You have failed your mission."
			elif weapon == "Mask":
				print "You put on your Fox Mask and walk out towards the gaurds."
				print "Your Mask works and they don't realize you aren't a hentchmen."
				#this takes input
				action = input("You are approaching them what do you do?(talk/attack)")
				#action = scan.next();
				if action == "talk":
					print "You tell the hentchmen that DR. Fox needs them immediately, and that you are their to guard the chickens."
					print "The immediately know you are an intruder because they are Foxes and can't understand you."
					print "One of them attacks you, and the other runs to alert DR. Fox and get back up."
					print "Back up shows up and they are able to capture you."
					print "You have failed your mission."
				elif action == "attack":
					print "When you get close enough, you surprise attack the two guards."
					print "Your plan works and you are able to defeat them."
					print "You then break the chickens out and now you need to escape."
					#escape is input
					escape = input("How do you want to escape?(vent/other)")
					#escape = scan.next();
					if escape == "vent":
						print "You lead the chickens through the vent and outside, you signal for a helicopter."
						print "Everyone makes it onboard safely."
						print "Misson Accomplished. Good Work."
					elif escape == "other":
						print "You wander through the tunnels with all of the chickens."
						print "Eventually other henchmen return the the cage empty and the two guards where knocked out."
						print "They alert DR.Fox and they begin searching the layer."
						print "You don't make it outside in time, and you are found and captured with all of the chickens."
						print "You have failed your mission."
		elif cluck == "no":
			print "You decided to ignore the clucking and continue to crawl around in the vents."
			print "As you crawl around DR. Fox's henchmen hear you and they eventually track you down in the vents and capture you."
			print "You have failed your mission."
	elif vent == "no":
		print "You decide to look for a different way in."
		print "You wander around the mountain, you eventually get lost and are never heard from again."
		print "You have failed your mission."
elif time == "day":
	print "Unfortunately DR. Fox detected you while dropping in, they are on high alert."
	print "you notice a door that leads into the layer."
	print "As you approach the door, guards come running out."
	print "They are able to capture you"
	print "You have failed your mission."
