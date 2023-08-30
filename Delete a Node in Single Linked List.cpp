GFG

Node* deleteNode(Node *head,int x)
{
    if(x==1)
        return head->next;

    Node* first = head;
    Node* last = head->next;
    int cont = 2;

    if(x==2)
    {
        first->next = last->next;
        return first;
    }


    while(last && cont <= x)
    {
        if(cont == x)
        {
            last = (last)? last->next: nullptr;
            first->next = last;
            return head;
        }

        first = last;
        last = (last)? last->next: nullptr;
        cont++;
    }

    first->next =nullptr;
    return head;
    //Your code here
}
