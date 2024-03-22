GFG Sol java

Diagonal sum in binary tree


class Tree {
    public static ArrayList <Integer> diagonalSum(Node root) 
    {
        // code here.
        ArrayList<Integer>ans= new ArrayList<>();
        if(root==null) return null;
        Queue<Node> q= new LinkedList<>();
        q.offer(root);
        while(q.size()!=0){
            int sz=q.size();
            int sum=0;
            while(sz-->0){
                Node rn= q.poll();
                while(rn!=null){sum+=rn.data;
                if(rn.left!=null)q.offer(rn.left);
                rn=rn.right;

                }
            }
            ans.add(sum);

        }
        return ans;
    }
}
