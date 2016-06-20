class Animal():

	def __init__(self, name, anType):
		self.name = name
		self.anType = anType


	def getName(self):
		return self.name

	def getType(self):
		print self.anType
