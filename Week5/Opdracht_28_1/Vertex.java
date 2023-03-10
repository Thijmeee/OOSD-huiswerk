package Week5.Opdracht_28_1;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private List<Vertex> connections = new ArrayList<>();

    public Vertex(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Vertex> getConnections() {
        return connections;
    }

    public void addConnection(Vertex v){
        connections.add(v);
    }

    @Override
    public String toString() {
        return name;
    }
}
