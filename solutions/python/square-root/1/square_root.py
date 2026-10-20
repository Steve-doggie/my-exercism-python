def square_root(number):
    if number == 0:
        return 0

    low = 1
    high = number

    while low <= high:
        mid = (low + high) // 2
        square = mid * mid

        if square == number:
            return mid
        elif square < number:
            low = mid + 1
        else:
            high = mid - 1
    
