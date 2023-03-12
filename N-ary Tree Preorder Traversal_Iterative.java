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
        List<Integer> output = new ArrayList<>();
        if(root == null){
            return output;
        }
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node curr = st.pop();
            output.add(curr.val);
            for(int i = curr.children.size() - 1; i>=0; i--){
                Node child = curr.children.get(i);
                st.push(child);
            }
        }

        return output;

        //return output = procedure(root, output);
    }
    // public List<Integer> procedure(Node x, List<Integer> y){
    //     if(x==null){
    //         return y;
    //     }
    //     y.add(x.val);
    //     for(Node i : x.children){
    //         procedure(i, y);
    //     }
    //     return y;
    // }
}
