public class Rit extends Edge{
    private Integer km;

    public Rit(Integer km, Vertex startVertex, Vertex targetVertex) {
        super(startVertex, targetVertex);
        this.km = km;
    }

    // Getters en Setters

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    public Integer getWeight() {
        return km;
    }

    public void setWeight(Integer weight){
        km = weight;
    }
}
