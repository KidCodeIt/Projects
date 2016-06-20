var1 = 2
var2 = 2.5
var3 = 'a'
var4 = "World"

print "output 1: Hello"

print "output 2: " + str(var1)
print var1

#you can print just nums if there are no strings concatenated to it
print "output 3: " + str(var2)
print var2

print "output 4: " + var3

print "output 5: " + var4

#can't do just this
#print "Hello " + var1
print "output 6: Hello " + str(var1)

#can't do just this
#print var1 + " " + var2
print "output 7: Hello " + var3

#can't do just this
#print var3 + var1
print "output 8: " + var3 + str(var1)

#this adds the two nums together
print var1 + var2

#this adds the two nums together and concatenates it to the word solution
print "solution " + str(var1 + var2)

#can't do just this
#print var3 + " " + var1
print "output 9: " + var3 + " " + str(var1)

#can't do just this
#print var3 + var2
print "output 10: " + var3 + str(var2)

#can't do just this
#print var3 + " " + var2
print "output 11: " + var3 + " " + str(var2)
