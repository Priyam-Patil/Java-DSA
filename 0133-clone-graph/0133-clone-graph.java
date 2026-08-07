/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/



class Solution {
    public Node cloneUtil(Node node,HashMap<Node,Node> map){
        Node newNode=new Node(node.val);
        map.put(node,newNode);
        for(Node neigh:node.neighbors){
            // no clone
            if(!map.containsKey(neigh)){
                newNode.neighbors.add(cloneUtil(neigh,map));
                
            }else{

                newNode.neighbors.add(map.get(neigh));
            }
        }
      return  newNode;
    }

    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        HashMap<Node,Node> map=new HashMap<>();//key-oldNode,value-newNode
        return cloneUtil(node,map);
    }
}