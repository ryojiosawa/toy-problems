class Stack(object):
    def __init__(self):
        self.storage = []

    def push(self, value):
        self.storage.append(value)

    def pop(self):
        return self.storage.pop()

    def size(self):
        return len(self.storage)