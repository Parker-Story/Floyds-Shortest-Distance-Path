import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
   This class provides methods to compute shortest paths between all pairs of vertices using Floyd's Algorithm.
 */
public class FloydsAlgorithm {

    /**
       Computes the distance and path matrices for the given adjacency matrix using Floyd's Algorithm.
      
       @param adjacencyMatrix The adjacency matrix representing the graph.
       @return A GraphData object containing the distance and path matrices.
     */
    public static GraphData computeDistanceAndPathMatrix(int[][] adjacencyMatrix) 
    {
        int numVertices = adjacencyMatrix.length;
        int[][] pathMatrix = new int[numVertices][numVertices];
        int[][] distanceMatrix = new int[numVertices][numVertices];

        // Initialize distanceMatrix with the values from the input adjacency matrix
        for (int i = 0; i < numVertices; i++) 
        {
            for (int j = 0; j < numVertices; j++) 
            {
                distanceMatrix[i][j] = adjacencyMatrix[i][j];
            }
        }

        // Initialize pathMatrix with 0s
        for (int i = 0; i < numVertices; i++) 
        {
            for (int j = 0; j < numVertices; j++) 
            {
                pathMatrix[i][j] = 0;
            }
        }

        // Apply Floyd's Algorithm to compute shortest paths and form the P matrix
        for (int k = 0; k < numVertices; k++) 
        {
            for (int i = 0; i < numVertices; i++) 
            {
                for (int j = 0; j < numVertices; j++) 
                {
                    if (distanceMatrix[i][k] != -1 && distanceMatrix[k][j] != -1 && (distanceMatrix[i][j] == -1 || 
                        distanceMatrix[i][j] > distanceMatrix[i][k] + distanceMatrix[k][j])) 
                    {
                        distanceMatrix[i][j] = distanceMatrix[i][k] + distanceMatrix[k][j];
                        pathMatrix[i][j] = k + 1; // Store the intermediate vertex
                    }
                }
            }
        }

        return new GraphData(distanceMatrix, pathMatrix);
    }

    /**
       Recursively prints the path between two vertices using the path matrix.
      
       @param pathMatrix The path matrix.
       @param start      The starting vertex.
       @param end        The ending vertex.
     */
    private static void printPath(int[][] pathMatrix, int start, int end) 
    {
        if (pathMatrix[start - 1][end - 1] != 0) 
        {
            printPath(pathMatrix, start, pathMatrix[start - 1][end - 1]);
            System.out.print(pathMatrix[start - 1][end - 1] + ", ");
            printPath(pathMatrix, pathMatrix[start - 1][end - 1], end);
        }
    }

    /**
       Checks if a valid path exists between two vertices.
      
       @param distanceMatrix The distance matrix.
       @param start          The starting vertex.
       @param end            The ending vertex.
       @return True if a valid path exists, false otherwise.
     */
    private static boolean pathExists(int[][] distanceMatrix, int start, int end) 
    {
        return distanceMatrix[start - 1][end - 1] != -1;
    }

    /**
       Outputs the shortest paths to the standard output.
     
       @param inputData      The input data containing the path requests.
       @param distanceMatrix The distance matrix.
       @param pathMatrix     The path matrix.
     */
    public static void standardOutput(InputData inputData, int[][] distanceMatrix, int[][] pathMatrix) 
    {
        int[][] pathRequests = inputData.getPathRequests();

        for (int[] pathRequest : pathRequests) 
        {
            int start = pathRequest[0];
            int end = pathRequest[1];

            if (pathExists(distanceMatrix, start, end)) 
            {
                System.out.print(start + ", ");
                printPath(pathMatrix, start, end);
            } 
            else 
            {
                System.out.print("NO PATH EXSIST between " + start + " and ");
            }

            System.out.println(end);
        }
    }

    /**
       Outputs the distance and path matrices to a file named "out.txt".
      
       @param distanceMatrix The distance matrix.
       @param pathMatrix     The path matrix.
       @throws IOException If an I/O error occurs while writing to the file.
     */
    public static void fileOutput(int[][] distanceMatrix, int[][] pathMatrix) throws IOException 
    {
        try (PrintWriter writer = new PrintWriter(new FileWriter("out.txt"))) 
        {
            // Write distance matrix to file
            for (int[] row : distanceMatrix) 
            {
                for (int value : row) 
                {
                    writer.print(value + " ");
                }
                writer.println();
            }

            // Empty line between matrices
            writer.println();

            // Write path matrix to file
            for (int[] row : pathMatrix) 
            {
                for (int value : row) 
                {
                    writer.print(value + " ");
                }
                writer.println();
            }
        }
    }
}
