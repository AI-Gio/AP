public class Treinrit extends Edge{
    private Integer min;

    public Treinrit(Integer min, Vertex startVertex, Vertex targetVertex) {
        super(startVertex, targetVertex);
        this.min = min;
    }

    // Getters en Setters

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getWeight() {
        return min;
    }

    public void setWeight(Integer weight){
        min = weight;
    }
}
