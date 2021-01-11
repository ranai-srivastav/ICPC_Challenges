import math

numTests = int(input(""))

for x in range(0, numTests):
    numWars = int(input(""))
    print(int((math.sqrt(8 * numWars + 1)-1)/2.0))