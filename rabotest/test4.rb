def findthird
  num = 1
  sum = 0
  while (num <= 6) do
    if (num % 3 == 0 || num.to_s.include?("3"))
      puts num
      puts 
    end

    num = num + 1
  end
end

findthird