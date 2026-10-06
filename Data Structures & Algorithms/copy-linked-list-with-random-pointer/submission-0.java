/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> oldToCopy = new HashMap<>();

        Node curr = head;

        while (curr != null) {
            Node newNode = new Node(curr.val);
            oldToCopy.put(curr,newNode);
            curr = curr.next;
        }

        Node secondPass = head;
        
        while (secondPass != null) {
            Node newNode = oldToCopy.get(secondPass); 
            newNode.next = oldToCopy.get(secondPass.next);
            newNode.random = oldToCopy.get(secondPass.random);
            secondPass = secondPass.next;
        }

        return oldToCopy.get(head);
    }
}
