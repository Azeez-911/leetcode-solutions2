/*
 * LeetCode #3310 - Remove Methods From Project
 * Difficulty : Medium
 * Language   : java
 * Runtime    : 72 ms
 * Memory     : 289.96 MB
 * URL        : https://leetcode.com/problems/remove-methods-from-project/
 */

class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {

        // Create adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Build graph
        for (int[] edge : invocations) {
            graph.get(edge[0]).add(edge[1]);
        }

        // suspicious[i] == true means method i is suspicious
        boolean[] suspicious = new boolean[n];

        // DFS from k
        dfs(k, graph, suspicious);

        // Check for any edge:
        // non-suspicious --> suspicious
        for (int[] edge : invocations) {
            int u = edge[0];
            int v = edge[1];

            if (!suspicious[u] && suspicious[v]) {
                // Cannot remove
                List<Integer> ans = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    ans.add(i);
                }
                return ans;
            }
        }

        // Removal is possible
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!suspicious[i]) {
                ans.add(i);
            }
        }

        return ans;
    }

    private void dfs(int node, List<List<Integer>> graph, boolean[] suspicious) {

        if (suspicious[node]) {
            return;
        }

        suspicious[node] = true;

        for (int next : graph.get(node)) {
            dfs(next, graph, suspicious);
        }
    }
}