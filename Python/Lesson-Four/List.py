

#creating list and adding elements to them


list1 = [0, 1, 2, 3]

print "The first element of the list is " + str(list1[0])
print "The second element of the list is " + str(list1[1])
print "The third element of the list is " + str(list1[2])
print "The fourth element of the list is " + str(list1[3])

#to add an element to the end of the list use append()

list1.append(4)

print "We have added another element"
print "The fifth element of the list is " + str(list1[4])

print "You can prints groups of a List the same way you can with Tuples"
print "This is everything is the middle of the list but not the ends"
print list1[1:4]

#you can also mix in data types with the same list
list1.append("abc")
list1.append(2.5)

print "The two new elements are " + str(list1[5:7])

print "We can print the entire list " + str(list1)

#if you want to remove something from the list

list1.remove(0)

print "We deleted the first element in the list"
print "We can print the entire list " + str(list1)

#This also removes an element
del list1[1]
print "We deleted another element from the list"
print "We can print the entire list " + str(list1)
