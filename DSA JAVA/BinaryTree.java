class Node{
    int data;
    Node left,right;
    Node(int val){
        this.data=val;
        this.right=null;
        this.left=null;
    }
}
class BinarySearchTree{
    Node root=null;
    Node insert(Node root1,int val){
        if(root1==null){
            return new Node(val);
        }
        else if(root1.data>val){
            root1.left=insert(root1.left,val);
        }
        else{
            root1.right=insert(root1.right,val);
        }
        return root1;
    }    
    void inOrder(Node root1){
        if(root1==null)
            return;
        inOrder(root1.left);
        System.out.println(root1.data);
        inOrder(root1.right); 
    }       
    boolean search(Node dummyRoot,int val){
        if(dummyRoot==null)
            return false;
        if(dummyRoot.data== val){
            return true;
        }
        else if(dummyRoot.data>val){
            return search(dummyRoot.left,val);
        }
        else{
            return search(dummyRoot.right,val);
        }
    }            

}

class BinaryTree {
    public static void main(String[] args){
       BinarySearchTree tree1=new BinarySearchTree();
       
       tree1.root=tree1.insert(tree1.root,5);
       
       tree1.root=tree1.insert(tree1.root,1);
      tree1.root=tree1.insert(tree1.root,4);
      tree1.root=tree1.insert(tree1.root,7);
       tree1.root=tree1.insert(tree1.root,9);
       tree1.inOrder(tree1.root);
       System.out.println(tree1.search(tree1.root,10));
       
    }
}
