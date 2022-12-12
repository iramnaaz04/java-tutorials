import java.util.Scanner;
public class GraphColoring {
    private int V, numOfColors;
    private int[] color;
    private int[][] graph;


    public void graphColor(int[][] g, int noc) {
        V = g.length;
        numOfColors = noc;
        color = new int[V];
        graph = g;

        try {
            solve(0);
            System.out.println("No solution");
        } catch (Exception e) {
            System.out.println("\nSolution exists ");
            display();
        }
    }
    public void solve(int v) throws Exception {

        if (v == V)
            throw new Exception("Solution found");
        for (int c = 1; c <= numOfColors; c++) {
            if (isPossible(v, c)) {

                color[v] = c;
                solve(v + 1);
                color[v] = 0;
            }
        }
    }
    public boolean isPossible(int v, int c) {
        for (int i = 0; i < V; i++)
            if (graph[v][i] == 1 && c == color[i]) return false;
        return true;
    }

    public void display() {
        System.out.print("\nColors : ");
        for (int i = 0; i < V; i++)
            System.out.print(color[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Graph Coloring Algorithm \n");
        GraphColoring gc = new GraphColoring();


        System.out.println("Enter number of vertices:\n");
        int V = scan.nextInt();
        System.out.println("\nEnter matrix:\n");
        int[][] graph = new int[V][V];
        for (int i = 0; i < V; i++)
            for (int j = 0; j < V; j++)
                graph[i][j] = scan.nextInt();

        System.out.println("\nEnter number of colors:");
        int c = scan.nextInt();

        gc.graphColor(graph, c);

    }
}