"""Unit test for roman.py"""

import roman
import unittest


class KnownValues(unittest.TestCase):
    knownValues = (
        (1, 'I'),
        (5, 'V'),
        (10, 'X'),
        (50, 'L'),
        (100, 'C'),
        (500, 'D'),
        (1000, 'M')
    )

    def testToRomanKnownValues(self):
        """toRoman should give known result with known input"""
        for integer, numeral in self.knownValues:
            result = roman.to_roman(integer)
            self.assertEqual(numeral, result)

    def testFromRomanKnownValues(self):
        """fromRoman should give known result with known input"""
        for integer, numeral in self.knownValues:
            result = roman.from_roman(numeral)
            self.assertEqual(integer, result)


class ToRomanBadInput(unittest.TestCase):
    def testTooLarge(self):
        """toRoman should fail with large input"""
        self.assertRaises(roman.OutOfRangeError, roman.to_roman, 4000)

    def testZero(self):
        """toRoman should fail with 0 input"""
        self.assertRaises(roman.OutOfRangeError, roman.to_roman, 0)

    def testNegative(self):
        """toRoman should fail with negative input"""
        self.assertRaises(roman.OutOfRangeError, roman.to_roman, -1)

    def testNonInteger(self):
        """toRoman should fail with non-integer input"""
        self.assertRaises(roman.NotIntegerError, roman.to_roman, 0.5)


class SanityCheck(unittest.TestCase):
    def testSanity(self):
        for integer in range(1, 4000):
            numeral = roman.to_roman(integer)
            result = roman.from_roman(numeral)
            self.assertEqual(numeral, result)

if __name__ == "__main__":
    unittest.main()