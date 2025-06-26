class Solution {
    int maxDiameter = 0;

    int diameter(Node root) {
        height(root); // this updates maxDiameter
        return maxDiameter;
    }

    // Helper function to compute height and update maxDiameter
    int height(Node node) {
        if (node == null)
            return -1; // height in terms of edges

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // diameter through current node = left + right + 2 edges
        int diaThroughNode = leftHeight + rightHeight + 2;
        maxDiameter = Math.max(maxDiameter, diaThroughNode);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
