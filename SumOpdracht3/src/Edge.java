// bron:https://gist.github.com/artlovan/a07f29e16ab725f8077157de7abdf125
public abstract class Edge {
    private Vertex startVertex;
    private Vertex targetVertex;


    public Edge(Vertex startVertex, Vertex targetVertex) {
        this.startVertex = startVertex;
        this.targetVertex = targetVertex;
    }

    public abstract Integer getWeight();

    public abstract void setWeight(Integer weight);

    public Vertex getStartVertex() {
        return startVertex;
    }

    public void setStartVertex(Vertex startVertex) {
        this.startVertex = startVertex;
    }

    public Vertex getTargetVertex() {
        return targetVertex;
    }

    public void setTargetVertex(Vertex targetVertex) {
        this.targetVertex = targetVertex;
    }

    // transport eenheden
}
