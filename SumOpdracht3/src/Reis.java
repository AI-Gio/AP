import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reis {
    private List<Vertex> path = new ArrayList<>();

    public void setPath(List<Vertex> path){
        this.path = path;
    }

    public String toString(){
        String reis = "";
        String eindbestemming = "";
        for (Vertex plek:path){
            eindbestemming = "";
            reis += plek;
            reis += ", ";
            eindbestemming += plek;
        }
        return "Dit is de snelste weg naar "+ eindbestemming+" is: " + reis ;
    }
}
