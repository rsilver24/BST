public class BinarySearchTree<Key extends Comparable<Key>, Value> {

    public Node<Key, Value> root;

    public BinarySearchTree() {
        
    }

    public int size() {
        return size(root);
    }

    //use Node's recursive size
    private int size(Node x) {
        return x.getSize();
    }

    public boolean isEmpty() {
        if (size(root) == 0)
            return true;
        return false;
    }

    //recursive put wrapper
    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    //recursive put
    //sets left/right or creates a new node appropriately, returns the
    //modified node n
    private Node<Key, Value> put(Node<Key, Value> n, Key key, Value val) {
        if (key.hashCode() == n.getKey().hashCode()){
            n.setValue(val);
            return n;
        } else if (key.hashCode() > n.getKey().hashCode()){
            if (n.getRight() == null){
                Node newNode = new Node(key, val, 0);
                n.setRight(newNode);
                return newNode;
            } return put(n.getRight(), key, val);
        } else if (key.hashCode() < n.getKey().hashCode()){
            if (n.getLeft() == null){
                Node newNode = new Node(key, val, 0);
                n.setLeft(newNode);
                return newNode;
            } return put(n.getLeft(), key, val);
        } return null;
    }

    //recursive get wrapper
    public Value get(Key key) {

        return get(root, key);
    }

    //recursive get
    //returns null if the key does not exist
    private Value get(Node<Key, Value> n, Key key) {
        if (key.hashCode() == n.getKey().hashCode()){
            return n.getValue();
        } else if (key.hashCode() > n.getKey().hashCode()){
            if (n.getRight() == null){
                return null;
            } return get(n.getRight(), key);
        } else if (key.hashCode() < n.getKey().hashCode()){
            if (n.getLeft() == null){
                return null;
            } return get(n.getLeft(), key);
        } return null;
    }

    public boolean contains(Key key) {

    }

    public Value remove(Key key) {
        Value v = get(key);
        root = remove(root, key);
        return v;
    }

    private Node remove(Node<Key, Value> n, Key key) {
        if (n == null) return null;
        int i = key.compareTo(n.getKey());
        if (i < 0) {
            n.setLeft(remove(n.getLeft(), key));
        } else if (i > 0) {
            n.setRight(remove(n.getRight(), key));
        } else {
            if (n.getRight() == null) return n.getLeft();
            if (n.getLeft() == null) return n.getRight();
            Node min = min(n.getRight());
            min.setLeft(n.getLeft());
            n = n.getRight();
        }
        n.setSize(size(n.getRight()) + size(n.getLeft()) + 1);
        return n;
    }

    public Key min() {
        return min(root).getKey();
    }

    //returns the node at the left most left branch of n
    private Node<Key, Value> min(Node<Key, Value> n) {

    }

    public Key max() {
        return max(root).getKey();
    }

    //returns the node at the right most right branch of n
    private Node<Key, Value> max(Node<Key, Value> n) {

    }

    public String toString() {
        String temp = toString(root);
        temp = temp.substring(0, temp.length() - 2);
        return "{" + temp + "}";
    }

    private String toString(Node<Key, Value> n) {
        if (n == null) return "";
        return toString(n.getLeft()) +
                n.getKey() + "=" + n.getValue() + ", " +
                toString(n.getRight());

    }
}