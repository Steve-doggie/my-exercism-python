def score(x, y):
    distance_square = x**2 + y**2

    if distance_square <= 1:
        return 10
    elif distance_square <= 25:
        return 5
    elif distance_square <= 100:
        return 1
    else:
        return 0
