/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    public static final String DELIM = ",";
    public static final String  NULL_SYMBOL= "x";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "";

        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    private void serialize(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append(NULL_SYMBOL).append(DELIM);
            return;
        }
        sb.append(root.val).append(DELIM);
        serialize(root.left, sb);
        serialize(root.right, sb);
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null || data.length() == 0) return null;        
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(DELIM)));
        return deserialize(queue);
    }

    private TreeNode deserialize(Queue<String> que) {
        if(que.size() == 0) return null;
        String currentNodeString = que.poll();
        if(currentNodeString.equals(NULL_SYMBOL)) return null;
        TreeNode root = new TreeNode(Integer.parseInt(currentNodeString));
        root.left = deserialize(que);
        root.right = deserialize(que);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
