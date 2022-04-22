num = 0
for i in range(0, 20):
    num = num + 2**i
    print("%7d"%num, 2**i, "2^%d"%i)
    if num >= 15678:
        break;
