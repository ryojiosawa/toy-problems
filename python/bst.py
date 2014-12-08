class BST(object):
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

    def insert(self, value):
        if self.value >= value:
            self.left = BST(value)
        else:
            self.right = BST(value)

    def contains(self, value):
        if self.value == value:
            return True

        if self.value >= value:
            if self.left == None:
                return False
            else:
                return self.left.contains(value)
        else:
            if self.right == None:
                return False
            else:
                return self.right.contains(value)