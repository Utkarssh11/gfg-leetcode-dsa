GFG
  AVL Tree Deletion


    class Sol {

   public static int height(Node N)

    {

        // if Node is null, return height as 0

        if (N == null)

            return 0;




        // return the height of the Node

        return N.height;

    }




    public static Node rightRotate(Node y)

    {

        // perform right rotation on the Node y

        Node x = y.left;

        Node T2 = x.right;

        x.right = y;

        y.left = T2;

        // update the heights of the Nodes

        y.height = Math.max(height(y.left), height(y.right))+1;

        x.height = Math.max(height(x.left), height(x.right))+1;

        return x;

    }




    public static Node leftRotate(Node x)

    {

        // perform left rotation on the Node x

        Node y = x.right;

        Node T2 = y.left;

        y.left = x;

        x.right = T2;

        // update the heights of the Nodes

        x.height = Math.max(height(x.left), height(x.right))+1;

        y.height = Math.max(height(y.left), height(y.right))+1;

        return y;

    }




    public static int getBalance(Node N)

    {

        // get the balance factor of the Node N

        if (N == null)

            return 0;

        return height(N.left) - height(N.right);

    }




    public static Node minValueNode(Node node)

    {

        // find the minimum value Node in the subtree rooted at node

        Node current = node;

        while (current.left != null)

            current = current.left;




        return current;

    }

    public static Node deleteNode(Node root, int key)

    {

         if (root == null)

            return root;




        // if key is smaller than the root's key, recursively delete in left subtree

        if (key < root.data)

            root.left = deleteNode(root.left, key);




        // if key is greater than the root's key, recursively delete in right subtree

        else if (key > root.data)

            root.right = deleteNode(root.right, key);







        else

        {




            // Node with only one child or no child

            if ((root.left == null) || (root.right == null))

            {

                Node temp = null;




                // set temp to the non-null child

                if (temp == root.left)

                    temp = root.right;

                else

                    temp = root.left;




                // if temp is null, set root to null

                if (temp == null)

                {

                    temp = root;

                    root = null;

                }

                else   

                    root = temp; 

            }

            else

            {

                // Node with two children

                // find the inorder successor (smallest in the right subtree)

                Node temp = minValueNode(root.right);




                // copy the value of the inorder successor to the root

                root.data = temp.data;




                // recursively delete the inorder successor

                root.right = deleteNode(root.right, temp.data);

            }

        }




        // if root is null, return null

        if (root == null)

            return root;




        // update the height of the root

        root.height = Math.max(height(root.left), height(root.right)) + 1;




        // get the balance factor of the root

        int balance = getBalance(root);




        // perform rotations based on the balance factor

        if (balance > 1 && getBalance(root.left) >= 0)

            return rightRotate(root);




        if (balance > 1 && getBalance(root.left) < 0)

        {

            root.left = leftRotate(root.left);

            return rightRotate(root);

        }




        if (balance < -1 && getBalance(root.right) <= 0)

            return leftRotate(root);




        if (balance < -1 && getBalance(root.right) > 0)

        {

            root.right = rightRotate(root.right);

            return leftRotate(root);

        }




        return root;




    }

}
