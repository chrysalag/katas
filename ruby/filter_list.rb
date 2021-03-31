=begin
In this kata you will create a function 
that takes a list of non-negative integers and strings 
and returns a new list with the strings filtered out.
=end

def filter_list(l)
  ints = []
  l.each {|item|
    if (!item.is_a? String)
      ints << item
    end
  }
  ints
end

# This could have been solved in one code line