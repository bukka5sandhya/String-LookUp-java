Ram challenges Anil to a game. Anil has been given the word W andthe N number of sentences.

Anil needs to find the sentence number in which the word W appearsfor the first time in the N sentences. Help Anil find the sentencenumber.

Write a program that reads the word W and the N number ofsentences and prints the sentence number in which the word W appears for the first time in N sentences 

Note

Consider the lower and upper case letters as different in the words

Input
The first line of input contains the string representing the word W .

The second line of input contains an integer representing the number of sentences N .

The next N lines of input contain line-separated sentences.

Output

The output should be a single line containing an integer representing the sentence number in which theword W appears for the first time in the N sentences.

If the given word W does not appear in any of the sentences, then print 1 .

Explanation

Test Case: If the given W  plays and N  3 , the sentences is as follows:

Raju is going to school
Teja plays cricket
Car has four wheels


In sentence number 1, the word plays doesn't appear.

In sentence number 2, the word plays appears for the first time.

The output should be 2.

Sample Input 1

plays

3

Raju is going to school

Teja plays cricket

Car has four wheels

Sample Output 1

2

Sample Input 2

brain

5

Python is a programming language

The Human Brain is eighty percent Water

Kamala scores high in science

Curious brain learns fast

Lion is a Land animal

Sample Output 2

4
