def one_plus_one():
	return 1 + 1

def square(x):
	return x * x

def maxFunction(val1, val2):
	if val1 > val2 :
		return val1
	else:
		return val2

def concatString(str1, str2):
	return str1 + str2

def bday(name):
	return "Happy Birthday " + name

def fizzBuzz(size):
	counter = 1
	while (counter <= size):
		if(counter % 15==0):
			print ("FizzBuzz")
		elif(counter % 3 ==0):
			print ("Buzz ")
		elif(counter % 5 ==0):
			print("Fizz")
		else:
			print (counter)
		counter += 1

fizzBuzz(20)