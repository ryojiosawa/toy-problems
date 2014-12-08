"""Unit test for primeTester.py"""

import prime
import unittest


class PrimeTesterTest(unittest.TestCase):
    def testPrimeTesterPositive(self):
        """primeTester should return true if a number is prime"""
        self.assertEquals(prime.prime_tester(1), True)
        self.assertEquals(prime.prime_tester(7), True)
        self.assertEquals(prime.prime_tester(11), True)
        self.assertEquals(prime.prime_tester(17), True)
        self.assertEquals(prime.prime_tester(23), True)
        self.assertEquals(prime.prime_tester(1789), True)

    def testPrimeTesterNegative(self):
        """primeTester should return false if a numbers is not prime"""
        self.assertEquals(prime.prime_tester(9), False)
        self.assertEquals(prime.prime_tester(15), False)
        self.assertEquals(prime.prime_tester(20), False)


if __name__ == "__main__":
    unittest.main()
