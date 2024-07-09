/**
   This class represents the data extracted from the input file.
 */
public class InputData 
{
    private int numVertices;
    private int[][] adjacencyMatrix;
    private int numPaths;
    private int[][] pathRequests;

    /**
       Constructs an InputData object with the given parameters.
     
       @param numVertices     The number of vertices in the graph.
       @param adjacencyMatrix The adjacency matrix representing the graph.
       @param numPaths        The number of requested paths.
       @param pathRequests    The sequence of vertex pairs defining the required terminal vertices of paths.
     */
    public InputData(int numVertices, int[][] adjacencyMatrix, int numPaths, int[][] pathRequests) 
    {
        this.numVertices = numVertices;
        this.adjacencyMatrix = adjacencyMatrix;
        this.numPaths = numPaths;
        this.pathRequests = pathRequests;
    }

    /**
       Gets the number of vertices in the graph.
     
       @return The number of vertices.
     */
    public int getNumVertices() 
    {
        return numVertices;
    }

    /**
       Gets the adjacency matrix representing the graph.
     
       @return The adjacency matrix.
     */
    public int[][] getAdjacencyMatrix() 
    {
        return adjacencyMatrix;
    }
    

    /**
       Gets the number of requested paths.
      
       @return The number of requested paths.
     */
    public int getNumPaths() 
    {
        return numPaths;
    }

    /**
       Gets the sequence of vertex pairs defining the required terminal vertices of paths.
      
       @return The sequence of vertex pairs.
     */
    public int[][] getPathRequests() 
    {
        return pathRequests;
    }
}
