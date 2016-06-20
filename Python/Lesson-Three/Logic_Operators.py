print "This is on the Logic Operators"

var1 = True
var2 = False

var3 = (2 == 3)

print "Is 2 equal to 3? answer: " + str(var3)

var3 = (2 != 3)
print "Is 2 not equal to 3? answer: " + str(var3)

if 2 == 3:
	print "True: This prints if 2 is equal to 3"
else:
	print "False: This prints if 2 is not equal to 3"

if 2 != 3:
	print "True: This prints if 2 is not equal to 3"
else:
	print " False: This prints if 2 is equal to 3"

if var1:
	print "This will print if var1 is true"
else:
	print "This will print if var1 is false"

if var2:
	print "This will print if var2 is true"
else:
	print "This will print if var3 is false"



#Using the &&(and) Logic Operator
if True && True:
	print "This will only print if both are true"
else:
	print "This won't print because both are true"

if True && False:
	print "This won't print because one is True and the other is False"
else:
	print "This will print because part of the && is Flase"

if False && False:
	print "This won't print because this is all False"
else:
	print "This will print because it is all false"



#Using the ||(or) Logic Operator
if True || True:
	print "This will print because it is all True"
else:
	print "This won't print because it is all True"

if True || False:
	print "This will print because Part is True and part is False"
else:
	print "This will not print because part is True and part is False"

if False || True:
	print "This will also print because part is False but also part is True"
else:
	print "This won't work because there is some True value"

if False || False:
	print "This will not print because there is no True value"
else:
	print "This will print because everything is False"
