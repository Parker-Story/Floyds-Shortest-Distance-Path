import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
   This class provides methods to parse input data from a file.
 */
public class FileParser 
{
    /**
       Parses the input data from the specified file.
      
       @param fileName The name of the input file to parse.
       @return An InputData object containing the parsed data.
       @throws IOException If an I/O error occurs while reading the file.
     */
   public static InputData parseInput(String fileName) throws IOException 
   {
      Scanner scanner = new Scanner(new File(fileName));
      int numVertices = scanner.nextInt();
      int[][] adjacencyMatrix = new int[numVertices][numVertices];
   
      // Parse adjacency matrix
      for (int i = 0; i < numVertices; i++) 
      {
         for (int j = 0; j < numVertices; j++) 
         {
            adjacencyMatrix[i][j] = scanner.nextInt();
         }
      }
   
      // Parse path requests
      int numPaths = scanner.nextInt();
      int[][] pathRequests = new int[numPaths][2];
        
      
      for (int i = 0; i < numPaths; i++) 
      {
         pathRequests[i][0] = scanner.nextInt(); 
         pathRequests[i][1] = scanner.nextInt();
      }
   
      scanner.close();
      return new InputData(numVertices, adjacencyMatrix, numPaths, pathRequests);
   }
}
