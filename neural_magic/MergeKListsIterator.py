class MergeListIterator():
    def __init__(self, lists) -> None:
        self.lists = lists
        self.indices = {e: 0 for e, _ in enumerate(self.lists)}
        self.max_indices = {e: len(v) for e, v in enumerate(self.lists)}

    def _get_min(self):
        min_val, min_li, min_l_idx = '', 0, 0
        for l, (li, l_idx) in zip(self.lists, self.indices.items()):
            if self.max_indices[li] != l_idx:
                if min_val == '' or min_val > l[l_idx]:
                    min_val = l[l_idx]
                    min_li = li
                    min_l_idx = min_l_idx
        return min_val, min_li, min_l_idx

    def next(self):
        min_val, min_li, min_l_idx = self._get_min()
        self.indices[min_li] += 1
        return min_val

    def has_next(self):
        for k, v in self.indices.items():
            if v != self.max_indices[k]:
                return True
        return False


if __name__ == "__main__":
    # lists = [
    #     [4, 5, 6],
    #     [1, 2, 3],
    #     [7, 8, 9]
    # ]
    lists = [
        [1, 4, 7],
        [2, 5, 8],
        [3, 6, 9]
    ]
    i, MAXITR = 1, 10
    itr = MergeListIterator(lists)
    while itr.has_next() and i != MAXITR:
        print(itr.next())
        i += 1
