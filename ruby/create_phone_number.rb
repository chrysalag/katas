#Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

def create_phone_number(numbers)
  "(#{numbers[0..2].join('')}) #{numbers[3..5].join('')}-#{numbers[6..].join('')}"
end