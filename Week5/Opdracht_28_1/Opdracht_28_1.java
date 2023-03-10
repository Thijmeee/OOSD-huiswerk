package Week5.Opdracht_28_1;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Opdracht_28_1 {
    public static void main(String[] args) throws IOException {
        readGraphFromFile();
    }


    private static void readGraphFromFile() throws IOException {
        URL url = new URL("https://liveexample.pearsoncmg.com/test/GraphSample1.txt");
        UnWeightedGraph g = new UnWeightedGraph();

        Scanner scanner = new Scanner(url.openStream());

        Vertex firstVertex = null;
        Vertex secondVertex;

        boolean firstLine = true;

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] lineWithoutSpaces = line.split(" ");

            if (firstLine){
                System.out.println("The number of vertices is: " + lineWithoutSpaces[0]);
                firstLine = false;
            }

            if (lineWithoutSpaces.length > 2){
                firstVertex = new Vertex(lineWithoutSpaces[0]);
                g.addVertex(firstVertex);

                for (int i = 1; i < lineWithoutSpaces.length; i++) {
                    secondVertex = new Vertex(lineWithoutSpaces[i]);
                    g.addVertex(secondVertex);
                    g.addEdge(firstVertex, secondVertex);
                }
            }

            String connections = "";
            if (firstVertex == null){
                continue;
            }

            for (Vertex connection : firstVertex.getConnections()) {
                connections += "(" + firstVertex + ", " + connection + ") ";
            }

            System.out.println("Vertex: " + firstVertex + ": " +  connections);
        }
    }
}
