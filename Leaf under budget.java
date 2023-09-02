Leaf under budget


  GFG
     class Solution{
    public int getCount(Node node, int bud)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        int lvl=0,c=0;
        while(!q.isEmpty()){
            int size=q.size();
            lvl++;
            for(int i=0;i<size;i++){
                Node curr=q.remove();
                if(curr.left==null && curr.right==null && lvl<=bud){
                    bud-=lvl;
                    c++;
                }
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        return c;
    }
}
