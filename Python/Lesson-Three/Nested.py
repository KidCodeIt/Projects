boolt = True
boolf = False

if boolt:
	if boolt:
		print "This is inside two ifs"
	else:
		print "This won't print"
else:
	print "This also won't print"



if boolf:
	print "This won't print"
else:
	if boolt:
		print "This will print inside an else then and if"
	else:
		print "This will not print"


if boolt:
	if boolf:
		print "This won't print"
	else:
		print "This will print inside an if then and else"
else:
	print "This won't print"


if boolf:
	print "This won't print"
else:
	if boolf:
		print "This won't print"
	else:
		print "This will print inside an else then an else"
