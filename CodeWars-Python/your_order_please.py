def order(sentence):
    list = sentence.split()
    list.sort(key=takeDigit)
    return ' '.join(list)

def takeDigit(word):
    for letter in word:
        if letter.isdigit():
            return letter
print(order("i2s kobi1 hung3ry"))
