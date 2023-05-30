GFG
Word Search


class Solution:
    def solve(self, board, word, k, i, j, marked):
        dx = [-1, 0, 0, 1]
        dy = [0, -1, 1, 0]
        if k == len(word):
            return 1

        for kk in range(4):
            ni = i + dx[kk]
            nj = j + dy[kk]
            if (
                ni >= 0
                and ni < self.n
                and nj >= 0
                and nj < self.m
                and marked[ni][nj] == 0
                and board[ni][nj] == word[k]
            ):
                marked[ni][nj] = 1
                if self.solve(board, word, k + 1, ni, nj, marked):
                    return 1
                marked[ni][nj] = 0

        return 0

    def isWordExist(self, board, word):
        # Code here
        self.n = len(board)
        self.m = len(board[0])
        marked = [[0 for _ in range(self.m)] for _ in range(self.n)]

        for i in range(self.n):
            for j in range(self.m):
                if board[i][j] == word[0]:
                    marked[i][j] = 1
                    if self.solve(board, word, 1, i, j, marked):
                        return 1
                    marked[i][j] = 0

        return 0


# {
