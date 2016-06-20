from Animal import Animal
class Dog(Animal):

	def __init__(self, name, breed):
		Animal.__init__(self, name, "dog")
		self.name = name
		self.breed = breed

	def getBreed(self):
		return self.breed

	def setName(self, name):
		self.name = name

	def setBreed(self, breed):
		self.breed = breed
