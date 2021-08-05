=begin
Digital root is the recursive sum of all the digits in a number.

Given n, take the sum of the digits of n. If that value has more than one digit, 
continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.
=end

def digital_root(n)
  digits = n.digits
  n = digits.reduce(:+)
  if n>9 then 
    n = digital_root(n) 
  end
  n
end