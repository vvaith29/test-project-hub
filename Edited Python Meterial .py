import keyword

print(keyword.kwlist) --> to get the list of keywords in python 
--------------------------------------------------------------------------------
Base conversion of int DT : 

To convert any int DT to binary,octal,hexadecimal we can use the following:

num = 45678
print(bin(num)) # Returns the binary representtion of the integer 
print(oct(num)) # Returns the octal representtion of the integer
print(hex(num)) # Returns the hexadecimal representtion of the integer
Complex DT :
x= 10 + 20j
print(x)
print(type(x))  # Shows the object type 
print(id(num))   # Shows the object address location or it's identity   
-------------------------------------------------------------------------------
# String Dt Slice Operator
# in String DT the index starts from Zero (0)
# Slice operator works in  n-1 for the last word 
#The Below string has 10 characters starting from 0. if we provide the the last index of the string it returns the string with end char -1 
#if we are not specifying the last index it will take the whole string as the argument 
#if the indexes are in reverse order it will return the empty string
# its optional that we can specify the start index or end index but either one indexes has to been passed else it will return empty 
# There is no exception in slice operator i.e we can specify the end index even if it does not present in the string.
# Slice opertor returns the whole string if we do not mention start and end index 

Ex;1
word = 'GobeldyGook'
new_word = word[0:10]  
print(new_word) # Output --> GobeldyGoo

Ex;2 
word = 'GobeldyGook'
new_word = word[0:] # End index is not provided 
print(new_word)  # --> GobeldyGook

Ex;3 
word = 'GobeldyGook'
new_word = word[0:100]  # End index is not out of range 
print(new_word)  #-->GobeldyGook

Ex; 4 
word = 'GobeldyGook'
new_word = word[:10] # Starting index is not specified 
print(new_word) # --> GobeldyGoo

Ex;5
word = 'GobeldyGook'
new_word = word[:] # Starting index and end index is not specified
print(new_word)

Ex;6 
word = 'GobeldyGook'
new_word = word[5:1] # reverse order of the String nd it returns empty
print(new_word) # --> empty 
