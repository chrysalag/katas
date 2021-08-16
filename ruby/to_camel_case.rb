=begin
Convert string to camel case

Complete the method/function so that it converts dash/underscore delimited words into camel casing. 
The first word within the output should be capitalized only if the original word was capitalized 
(known as Upper Camel Case, also often referred to as Pascal case). 
=end

def to_camel_case(str)
    str.gsub(/[_-]/, ' ').split.each_with_index { |word, index| 
        word.capitalize! if index > 0
    }.join
end