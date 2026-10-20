def label(colors):
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
    zeros = color_map[colors[2]]

    base_value = first_digit * 10 + second_digit
    total = base_value * (10 ** zeros)

    if total >= 10**9:
        return f"{total / 10**9:g} gigaohms"
    elif total >= 10**6:
        return f"{total / 10**6:g} megaohms"
    elif total >= 10**3:
        return f"{total / 10**3:g} kiloohms"
    else:
        return f"{total} ohms"
