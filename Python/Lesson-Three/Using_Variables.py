#using variables in if-else statements

#The different relational and logic operations
# <, <=, >, >=, ==, !=

num1 = 2;
num2 = 3;

#Less than
if num1 < num2:
	print "if: num1 is less than num2"
else:
	print "This won't be printed"

#Less than or equal to
if num1 <= num2:
	print "if: num1 is less than or equal to num2"
else:
	print "This won't be printed"

#Greater than
if num1 > num2:
	print "This won't be printed"
else:
	print "else: num1 is not greater than num2"

#Greater than or equal to
if num1 >= num2:
	print "This won't be printed"
else:
	print "else: num1 is not greater than or equal to num2"

#Equal too
if num1 == num2:
	print "This won't be printed"
else:
	print "else: num1 is not equal to num2"

#Not equal too
if num1 != num2:
	print "if: num1 is not eqaul to num2"
else:
	print "This won't be printed"
