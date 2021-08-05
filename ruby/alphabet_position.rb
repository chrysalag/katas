=begin
In this kata you are required to, given a string, replace every letter with its position in the alphabet.

If anything in the text isn't a letter, ignore it and don't return it.

"a" = 1, "b" = 2, etc.
=end

def alphabet_position(text)
  text.downcase.gsub(/[^a-z]/i, '').bytes.map{ |c| c - 96 }.join(' ')
end