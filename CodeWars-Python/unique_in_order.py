def unique_in_order(iterable):
    if len(iterable) == 0: return []
    newList = list()
    newList.append(iterable[0])
    for letter in iterable:
        if newList[len(newList) - 1] == letter:
            pass
        else:
            newList.append(letter)
    return newList



print(unique_in_order('AABBCCDDEGAA'))
