GFG

Nth node from end of linked list

// Function to find the data of nth node from the end of a linked list.
int getNthFromLast(Node *head, int n) {
  // Your code here
  Node *c = head;
  int count = 0;
  while (c) {
    ++count;
    c = c->next;
  }
  if (count < n)
    return -1;

  count -= n;
  while (count > 0) {
    --count;
    head = head->next;
  }
  return head->data;
}
