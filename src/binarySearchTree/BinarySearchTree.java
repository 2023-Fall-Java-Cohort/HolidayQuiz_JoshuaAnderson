package binarySearchTree;

public class BinarySearchTree {
  Node root;

  public BinarySearchTree() {
    root = null;
  }

  public void createBinarySearchTree(int[] arr) {
    for (int i : arr) {
      if (root == null) {
        root = new Node(i);
        continue;
      }
      insert(root, i);
    }
  }

  public Node insert(Node node, int key) {
    // If the tree is empty, return a new node
    if (node == null) {
      node = new Node(key);
      return node;
    }

    // Otherwise, recur down the tree
    if (key < node.key)
      node.left = insert(node.left, key);
    else if (key > node.key)
      node.right = insert(node.right, key);

    // Return the (unchanged) node pointer
    return node;
  }

  public Node search(Node node, int key) {
    // Base Cases: root is null or key is present at root
    if (root == null || root.key == key)
      return root;

    // Key is greater than root's key
    if (root.key < key)
      return search(root.right, key);

    // Key is smaller than root's key
    return search(root.left, key);
  }

  public Node delete_Recursive(Node node, int key) {
    // tree is empty
    if (root == null)
      return root;
    // traverse the tree
    if (key < root.key) // traverse left subtree
      root.left = delete_Recursive(root.left, key);
    else if (key > root.key) // traverse right subtree
      root.right = delete_Recursive(root.right, key);
    else {
      // node contains only one child
      if (root.left == null)
        return root.right;
      else if (root.right == null)
        return root.left;

      // node has two children;
      // get inorder successor (min value in the right subtree)
      root.key = minValue(root.right);

      // Delete the inorder successor
      root.right = delete_Recursive(root.right, root.key);
    }
    return root;
  }

  int minValue(Node root) {
    // initially minval = root
    int minval = root.key;
    // find minval
    while (root.left != null) {
      minval = root.left.key;
      root = root.left;
    }
    return minval;
  }

  // method for inorder traversal of BST
  public void inOrderTraversal() {
    inorder_Recursive(root);
  }

  // recursively traverse the BST
  void inorder_Recursive(Node root) {
    if (root != null) {
      inorder_Recursive(root.left);
      System.out.print(root.key + " ");
      inorder_Recursive(root.right);
    }
  }

  boolean search(int key) {
    root = search_Recursive(root, key);
    if (root != null)
      return true;
    else
      return false;
  }

  // recursive insert function
  Node search_Recursive(Node root, int key) {
    // Base Cases: root is null or key is present at root
    if (root == null || root.key == key)
      return root;
    // val is greater than root's key
    if (root.key > key)
      return search_Recursive(root.left, key);
    // val is less than root's key
    return search_Recursive(root.right, key);
  }
}

// We definitely did not cover this in class... This does not make a lot of sense
// to me, the logic of the tree makes sense, but I don't really understand the
// code. I think I may better understand it with a real world example.
// Sources:
// https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
// https://www.softwaretestinghelp.com/binary-search-tree-in-java/