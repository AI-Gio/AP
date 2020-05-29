import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void RitTest() {
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");
        Vertex v6 = new Vertex("6");

        v1.addNeighbour(new Rit(2,v1,v3));
        v1.addNeighbour(new Rit(1,v1,v2));
        v2.addNeighbour(new Rit(5,v2,v3));
        v2.addNeighbour(new Rit(1,v2,v4));
        v3.addNeighbour(new Rit(6,v3,v5));
        v3.addNeighbour(new Rit(3,v3,v6));
        v4.addNeighbour(new Rit(5,v4,v5));

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.computePath(v1);
        Reis reis = new Reis();
        reis.setPath(dijkstra.getShortestPathTo(v6));
        assertEquals("Dit is de snelste weg naar 6 is: 1, 3, 6, ", reis.toString());
    }

    @Test
    public void VluchtTest(){
        Vertex v1 = new Vertex("Amsterdam");
        Vertex v2 = new Vertex("New York");
        Vertex v3 = new Vertex("Tokyo");

        v1.addNeighbour(new Vlucht(80,v1,v3));
        v1.addNeighbour(new Vlucht(20,v1,v2));
        v2.addNeighbour(new Vlucht(20,v2,v3));

        Dijkstra dijkstra = new Dijkstra();
        Reis reis = new Reis();
        dijkstra.computePath(v1);
        reis.setPath(dijkstra.getShortestPathTo(v3));
        assertEquals("Dit is de snelste weg naar Tokyo is: Amsterdam, New York, Tokyo, ", reis.toString());
    }

    @Test
    public void Treinrit(){
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");

        v1.addNeighbour(new Treinrit(10,v1,v2));
        v1.addNeighbour(new Treinrit(50,v1,v5));
        v2.addNeighbour(new Treinrit(10,v2,v3));
        v3.addNeighbour(new Treinrit(10,v3,v4));
        v4.addNeighbour(new Treinrit(10,v4,v5));

        Dijkstra dijkstra = new Dijkstra();
        Reis reis = new Reis();
        dijkstra.computePath(v1);
        reis.setPath(dijkstra.getShortestPathTo(v5));
        assertEquals("Dit is de snelste weg naar 5 is: 1, 2, 3, 4, 5, ", reis.toString());

    }

}