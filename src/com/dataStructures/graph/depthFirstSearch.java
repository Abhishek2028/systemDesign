//package com.dataStructures.graph;
//
//import java.util.*;
//
//public class depthFirstSearch {
//    public static void main(String[] args) {
//        List<int[]> graph = null;
//        traverseGraph(graph);
//    }
//
//    public static HashMap<Integer, List<Integer>> generateGraph(List<List<Integer>> graph){
//        HashMap<Integer, List<Integer>> vertices = new HashMap<>();
//        for (int i = 0; i < graph.size(); i++) {
//            //node -> {{neighbour,distance}, {neighbour,distance} , {neighbour, distance } }
//            vertices.putIfAbsent(graph.get(i).get(0), Arrays.asList(graph.get(i).get(1), graph.get(i).get(2)));
//        }
//        return vertices;
//    }
//
//    public static void traverseGraph(List<List<Integer>> graph) {
//        HashMap<Integer, List<Integer>> vertices = generateGraph(graph);
//        Set<String> set = new HashSet<>();
//        //counting number of disconnected sets in the graph.
//        int count = 0;
//        List<int[]> dirs = new ArrayList<>();
//        dirs.add(new int[]{-1, 0});
//        dirs.add(new int[]{1, 0});
//        dirs.add(new int[]{0, -1});
//        dirs.add(new int[]{0, -1});
//        count += dfs(vertices, 0, 0, 0, set, dirs);
//        System.out.println("Number of disjoint sets are" + count);
//    }
//
//    private static int dfs(HashMap<Integer, List<Integer>> vertices, int x, int y, int count, Set<String> set, List<int[]> dirs) {
//        String curPos = x + "-" + y;
//        if (set.contains(curPos)) {
//            return 0;
//        }
//        count++;
//        set.add(curPos);
//        for (int i = 0; i < dirs.size(); i++) {
//            int curX = x + dirs.get(i)[0];
//            int curY = y + dirs.get(i)[1];
//            if (curX > 0 && curY > 0) {
//                count += dfs(vertices, curX, curY, count, set, dirs);
//            }
//        }
//        return count;
//    }
//
//    private int bfs(HashMap<Integer, List<Integer>> vertices, int srcX, int srcY, int destX, int destY) {
//        if (vertices.size() == 0) {
//            return -1;
//        }
//        List<int[]> dirs = new ArrayList<>();
//        dirs.add(new int[]{-1, 0});
//        dirs.add(new int[]{1, 0});
//        dirs.add(new int[]{0, -1});
//        dirs.add(new int[]{0, -1});
//        Queue<int[]> q = new ArrayDeque<>();
//        q.add(new int[]{srcX, srcY});
//        int res = 0;
//        while (!q.isEmpty()) {
//            int[] cur = q.poll();
//            if (cur[0] == destX && cur[1] == destY) {
//                return res;
//            }
//            res++;
//            for (int i = 0; i < dirs.size(); i++) {
//                int curX = cur[0] + dirs.get(i)[0];
//                int curY = cur[1] + dirs.get(i)[1];
//                if (curX > 0 && curY > 0) {
//                    q.add(new int[]{curX, curY});
//                }
//            }
//        }
//        return res;
//    }
//
//    public void topologicalSort(){
//        //start at every node, visit all it's neighbours and mark them visited, and don't visit them again.
//        //iterate over the list of nodes and do the same.
//    }
//
//    private static void kahnsAlgorithm(){
//        //first iterate over the graph.
//        //Initialize an array of size n. Count the number of incoming edges of each node and store them at their respective position in the incomingCount array.
//        //Repeat start
//        //Now, push all the vertices with the count 0 in a queue.
//        //Now, keep popping elements where the incomingCount[i] = 0, and add it to the path array ( result vector ) .
//        //Since the element is popped, reduce the incomingCount[i] of the current element neighbours by 1.
//        //If in this process, if any of the incomingCount[i] becomes 0, add that also into the queue.
//        //Repeat end
//        //Repeat the process between Repeat start and Repeat end till all incomingCount[i] becomes 0.
//        //The resulting path vector is the result.
//    }
//
//    private static int dijkstraAlgorithm(List<List<Integer>> graph, int numVertices){
//        HashMap<Integer, List<Integer>> vertices = generateGraph(graph);
//        int[] distance = new int[numVertices];
//        Arrays.fill(distance,1000001);
//        PriorityQueue<int[]> pq = new PriorityQueue<>();
//        pq.add(new int[]{0,0});
//        while(!pq.isEmpty()){
//            int[] nextElement = pq.poll();
//            int nextNode = nextElement[0];
//            int nextDistance = nextElement[1];
//            Iterator<List<Integer>> iterator = vertices.values().iterator();
//            while (iterator.hasNext()){
//                List<Integer> neighbour = iterator.next();
//                Integer distanceToNextNode = neighbour.get(0);
//                Integer neighbourNode = neighbour.get(1);
//                if(distanceToNextNode + nextDistance < distance[neighbourNode]){
//                    distance[neighbourNode] = distanceToNextNode + nextDistance;
//                    pq.add(new int[neighbourNode,distance[neighbourNode]]);
//                }
//            }
//        }
//        return distance[distance.length-1];
//    }
//
//    public static void bellmanFordAlgorithm(HashMap<Integer, int[]> vertices, int numVertices){
//        //vertices -> {1 -> {2,4}, {3,-2}}
//        //{2 -> {4,1},{5,-3}}
//        //Basically , u -> {v,weight}
//        int[] distance = new int[numVertices];
//        Arrays.fill(distance,1000001);
//        distance[0] = 0; //the source
//        for(int i=0;i<numVertices-1;i++){
//            for(Map.Entry<Integer, int[]> entry : vertices.entrySet()){
//                int u = entry.getKey();
//                int v = entry.getValue()[0];
//                int w = entry.getValue()[1];
//                if(distance[v] > distance[u] + w){
//                    distance[v] = distance[u] + w;
//                }
//            }
//        }
//        for(int i=0;i<numVertices;i++){
//            System.out.println(distance[i] + "\t");
//        }
//    }
//
//    public static void floydWarshallAlgorithm(HashMap<Integer, int[]> vertices, int numVertices){
//
//    }
//
//}
