Task 1:
  ````
  given a number which is invalid: 0
  when check is interestingNumber
  then output 0
  ````
  
Task 2:
````
given a number which is valid but is not in the range of interesting number: 1
when check is interestingNumber
then output 0
````

Task 3:
````
given a number which Any digit followed by all zeros: 100
when check is interestingNumber
then output 2
````

Task 4;
````
given a number which the digits is the same number: 111
when check is interestingNumber
then output 2
````

Task 5;
````
given a number which the digits are sequential & incementing: 123
when check is interestingNumber
then output 2
````

Task 6;
````
given a number which the digits are sequential & incementing: 890
when check is interestingNumber
then output 2
````

Task 7;
````
given a number which the digits are sequential & decrementing: 321
when check is interestingNumber
then output 2
````

Task 8;
````
given a number which the digits are a palindrome: 121
when check is interestingNumber
then output 2
````

Task 9:
````
given a number which the digits not match one of the values in the awesomePhrases array: 124, []
when check is interestingNumber
then output 0
````

Task 10:
````
given a number which the digits match one of the values in the awesomePhrases array: 124, [124, 245]
when check is interestingNumber
then output 2
````