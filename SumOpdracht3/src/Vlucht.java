public class Vlucht extends Edge{
    private Integer euro;

    public Vlucht(Integer euro, Vertex startVertex, Vertex targetVertex) {
        super(startVertex, targetVertex);
        this.euro = euro;
    }

    // Getters en Setters

    public Integer getEuro() {
        return euro;
    }

    public void setEuro(Integer euro) {
        this.euro = euro;
    }

    public Integer getWeight() {
        return euro;
    }

    public void setWeight(Integer weight){
        euro = weight;
    }
}
