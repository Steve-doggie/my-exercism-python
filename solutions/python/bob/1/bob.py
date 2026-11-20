def response(hey_bob):
    words = hey_bob.strip()
    if words.endswith("?") and words.isupper():
        return "Calm down, I know what I'm doing!"
    elif words.endswith("?"):
        return "Sure."
    elif words.isupper():
        return "Whoa, chill out!" 

    if words == "":
        return "Fine. Be that way!"
    else:
        return "Whatever."
