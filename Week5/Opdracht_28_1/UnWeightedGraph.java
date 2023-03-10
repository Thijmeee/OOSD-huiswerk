package Week5.Opdracht_28_1;

import java.util.ArrayList;
import java.util.List;

public class UnWeightedGraph {
    private List<Vertex> vertices = new ArrayList<>();

    public void addVertex(Vertex vertex){
        vertices.add(vertex);
    }

    public void addEdge(Vertex v1, Vertex v2)
    {
        v1.addConnection(v2);
        v2.addConnection(v1);
    }
}
