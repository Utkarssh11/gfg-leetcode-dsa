GFG
Union of Two Linked Lists




class Solution
{
    public:
    struct Node* makeUnion(struct Node* head1, struct Node* head2)
    {
        // code here
        set<int> vis;
        while(head1)
        {
               vis.insert(head1->data);
               head1 = head1->next;
        }
        while(head2)
        {
            vis.insert(head2->data);
            head2 = head2->next;
        }
        Node* root = new Node(-1);
        Node* temp = root;
        for(auto val:vis)
        {
            Node* node = new Node(val);
            temp->next = node;
            temp = node;
        }
        return root->next;
    }
};
