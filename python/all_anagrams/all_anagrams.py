def all_anagrams(s):
    """all_anagrams should generate all possible anagrams from a given input string"""

    results = []
    chars_to_add = list(s)

    def generate_anagrams(depth, anagram):
        if depth == 0:
            results.append(anagram)
            return

        for char in chars_to_add:
            if anagram.find(char) == -1:
                generate_anagrams(depth - 1, anagram + char)

    generate_anagrams(len(chars_to_add), '')
    return results