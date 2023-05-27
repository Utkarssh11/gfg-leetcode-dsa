
GFG - Problem of the day

class Solution:
    def modify_the_list(self, head):
        # code here
        stack = []
        p = head
        while p:
            stack.append(p.data)
            p = p.next

        n = len(stack)
        p = head
        k = n - 1
        while p:
            if k > (n - 1) // 2:
                p.data = stack[k] - p.data
            else:
                p.data = stack[k]
            p = p.next
            k -= 1
        return head


# {
