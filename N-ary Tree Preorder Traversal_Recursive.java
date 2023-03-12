/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        //Stack<Node> st = new Stack<>();
        List<Integer> output = new ArrayList<>();
        //st.push(root);
        //output.add(root.val);
        return output = procedure(root, output);
    }
    public List<Integer> procedure(Node x, List<Integer> y){
        if(x==null){
            return y;
        }
        y.add(x.val);
        for(Node i : x.children){
            procedure(i, y);
        }
        return y;
    }
}
