import os, sys
from colorama import Fore, Style, init

def getItem(passw, id):
    return passw[int(id)-1]

def printItem(item):
    if item.isdigit():
        print(Fore.GREEN + item + Style.RESET_ALL)
    else:
        print(Fore.YELLOW + item + Style.RESET_ALL)

def main(args):
    if not len(args) == 5:
        raise ValueError("Wrong number of args")

    passw = args[1]
    id1, id2, id3 = [getItem(passw, args[2]), getItem(passw, args[3]), getItem(passw, args[4])]

    init()
    printItem(id1)
    printItem(id2)
    printItem(id3)

if __name__ == "__main__":
    main(sys.argv)