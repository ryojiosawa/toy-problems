"""
Prime number is a function that accepts a number and returns true if it's
a prime number, false if it's not.
"""

def prime_tester(num):
    if type(num) != int or num < 0:
        return False

    for i in range(2, num):
        if num % i == 0:
            return False

    return True

