/**
Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, 
which is the number of times you must multiply the digits in num until you reach a single digit.
*/


function persistence(num) {
    multiplications = 0
    while (num % 10 !== num) {
      num = [...''+num].reduce((a, b) => a*b)
      multiplications++
    }
    return multiplications
}