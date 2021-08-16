/*
Your objective is simple: In fewer than 40 characters (and with a few restrictions), 
write a function that returns the square of a number passed in. 
This number may be anywhere between -32,768 and 32,768, 
and may include decimals (you will however absolutely not have to worry about a square being >= 2^53).

In the case that a number is a decimal, after squaring it, 
round it to the nearest whole number. The Math class, along with .toFixed() is tested for (you can't pass with it), 
but not disabled, so feel free to use it if that makes it easier before you start minifying your solution.
Similarly, the * and the + operators are not allowed,
but not disabled in the hopes that this may make it slightly easier for some warriors. 
External libraries and eval() are disabled.
*/

sq=x=>parseInt(x/(1/x)-(-0.5))