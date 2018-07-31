def namelist(names):
    res = ""
    for index in range(len(names)):
        for value in names[index].values():
            if index == 0:
                res = value
            elif index == len(names) - 1:
                res = res + " & " + value
            else:
                res = res + ", " + value
    return res

hashm = [{'name': 'Bart'},{'name': 'Lisa'},{'name': 'Maggie'},{'name': 'Homer'},{'name': 'Marge'}]
print(namelist(hashm))
