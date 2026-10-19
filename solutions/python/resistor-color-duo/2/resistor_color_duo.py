def value(colors):
    color_map = {
        "black": 0,
        "brown": 1,
        "red": 2,
        "orange": 3,
        "yellow": 4,
        "green": 5,
        "blue": 6,
        "violet": 7,
        "grey": 8,
        "white": 9  
    }

    first_digit = color_map[colors[0]]
    second_digit = color_map[colors[1]]

    return first_digit * 10 + second_digit
