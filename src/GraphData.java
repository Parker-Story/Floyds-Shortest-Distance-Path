/**
   Represents the data of the two output graphs, including the distance matrix and the path matrix.
 */
public class GraphData 
{
    private int[][] distanceMatrix;
    private int[][] pathMatrix;

    /**
       Constructs a new GraphData object with the specified distance matrix and path matrix.
      
       @param distanceMatrix The distance matrix representing the shortest distances between vertices.
       @param pathMatrix     The path matrix representing the shortest paths between vertices.
     */
    public GraphData(int[][] distanceMatrix, int[][] pathMatrix) 
    {
        this.distanceMatrix = distanceMatrix;
        this.pathMatrix = pathMatrix;
    }

    /**
       Returns the distance matrix representing the shortest distances between vertices.
      
       @return The distance matrix.
     */
    public int[][] getDistanceMatrix() 
    {
        return distanceMatrix;
    }

    /**
       Returns the path matrix representing the shortest paths between vertices.
      
       @return The path matrix.
     */
    public int[][] getPathMatrix() 
    {
        return pathMatrix;
    }
}
