"""Unit test for all_anagrams.py"""

import all_anagrams
import unittest


class AllAnagramsTest(unittest.TestCase):
    def testAllAnagrams(self):
        """all_anagrams should generate all anagrams"""
        s = 'abc'
        expected = ['abc', 'acb', 'bac', 'bca', 'cab', 'cba']
        self.assertItemsEqual(all_anagrams.all_anagrams(s), expected)


if __name__ == "__main__":
    unittest.main()