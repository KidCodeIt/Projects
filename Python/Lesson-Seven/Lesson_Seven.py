from Dog import Dog
from Animal import *

def main():
	print "We have added more to our Dog and Animal class"

	dog1 = Dog("Spot","BullDog")
	animal1 = Animal("Mickey", "Mouse")

	animal1.getName()
	animal1.getType()

	dog1.getName()
	dog1.getBreed()

	dog1.setName("Pluto")
	dog1.getName()



main()
