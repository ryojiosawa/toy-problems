class Queue(object):
    def __init__(self):
        self.storage = []

    def enqueue(self, item):
        self.storage.append(item)

    def dequeue(self):
        if len(self.storage) == 0:
            raise Exception('Queue is empty')
        value = self.storage.pop(0)
        return value

    def size(self):
        return len(self.storage)