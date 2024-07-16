import java.io.*;
import java.util.*;

class Main {
    private static int N, rootNode = 1, first, second;
    private static List<Integer>[] adList, treeList;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("./input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        adList = new ArrayList[N + 1];
        treeList = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        for(int i = 1; i < N + 1; i++) {
            adList[i] = new ArrayList<>();
            treeList[i] = new ArrayList<>();
        }

        for(int i = 0; i < N - 1; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(tokenizer.nextToken());
            int to = Integer.parseInt(tokenizer.nextToken());
            adList[from].add(to);
            adList[to].add(from);
        }

        dfs(rootNode);

        for(int i = 1; i < N + 1; i++) {
            int[] result = findWinner(i, 0, 0, true);
            if(result[0] > result[1]) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static void dfs(int nowNode) {
        visited[nowNode] = true;
        for(Integer nextNode : adList[nowNode]) {
            if(!visited[nextNode]) {
                treeList[nowNode].add(nextNode);
                dfs(nextNode);
            }
        }
        visited[nowNode] = false;
    }

    private static int[] findWinner(int nowNode, int first, int second, boolean flag) {
        int[] result = {first, second};
        for(Integer nextNode : treeList[nowNode]) {
            int[] nowResult = findWinner(nextNode, first, second, !flag);
            if(flag && nowResult[0] - nowResult[1] > result[0] - result[1]
                    || !flag && nowResult[1] - nowResult[0] > result[1] - result[0]
                    || result[0] == 0 && result[1] == 0) {
                result[0] = nowResult[0];
                result[1] = nowResult[1];
            }
        }

        if(flag) {
            first += nowNode;
        } else {
            second += nowNode;
        }

        result[0] += first;
        result[1] += second;

        System.out.println("nowNode: " + nowNode + "first: " + result[0] + "second: " + result[1] + "flag: " + flag);

        return result;
    }
}