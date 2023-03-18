class Node{
    int data;
    Node left,right;
    Node(int x){
        this.data = x;
        left = right = null;
    }
}
class BSTree{
    Node root;
    BSTree(){
        root = null;
    }
    static Node addNode(Node nd,int x){
        if(nd == null)  nd = new Node(x);
        else if(nd.data > x) nd.left = addNode(nd.left , x);
        else    nd.right = addNode(nd.right, x);

        return nd;
    }
    //preorder traversal
    static void preorder(Node nd){
        if(nd == null)  return;
        System.out.print(nd.data + " ");
        preorder(nd.left);
        preorder(nd.right);
    }
    // inorder traversal
    static void inorder(Node nd){
        if(nd == null)  return;
        inorder(nd.left);
        System.out.print(nd.data + " ");
        inorder(nd.right);
    }
    // postorder traversal
    static void postorder(Node nd){
        if(nd == null)  return;
        postorder(nd.left);
        postorder(nd.right);
        System.out.print(nd.data + " ");
    }
    static int height(Node nd){
        if(nd == null)  return 0;
        return (int)Math.max(height(nd.left),height(nd.right))+1;
    }
    public static void main(String[] args) {
        BSTree bst = new BSTree();
        for(int i=1;i<6;i++){
            bst.root = addNode(bst.root,i);
        }
        System.out.print("Preorder: ");
        preorder(bst.root);
        System.out.print("\nInorder: ");
        inorder(bst.root);
        System.out.print("\nPostorder: ");
        postorder(bst.root);
        System.out.println("\nHeight of tree: "+height(bst.root));
    }
}