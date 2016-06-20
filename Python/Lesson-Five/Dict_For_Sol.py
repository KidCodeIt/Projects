#
# Use the HashMap that us created that takes a String as the key and the stored object
# read in 5 strings for the keys and 5 to associate with the key
# Use a for loop so you don't need to just retype the same line over and over
#
#

myMap = {}


#create the for loop that loops through 5 times
for i in range(5):
	key = input("Please enter a String to use as a Key")

	value = input("Please enter a String to save as the value.")

	myMap[key] = value

#inside the loop
#it should ask for two Strings, one as the Key and one as the value

#if everything is saved into the HashMap correctly this will print all of the values
print myMap.values()

#This will print out all of the keys that you used
print myMap.keys()
