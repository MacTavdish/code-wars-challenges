# regardless of casing, write a function that returns True if numbers of "o" and "x" is equal
def xo(s):
    return s.lower().count('x') == s.lower().count('o')
print(xo("Xozx"))
