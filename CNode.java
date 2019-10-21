public class CNode {
    int val;
    CNode next = null;
    CNode random = null;

    CNode(int val) {
        this.val = val;
    }

    public String toString() {
        return String.format("CNode(%d)", val);
    }
}
