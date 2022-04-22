num = 15678

listB = []
while num != 0:
    listB.append(num % 2)
    num = num / 2

listB.reverse()

myStr = ''.join(str(x) for x in listB)

print(myStr)
