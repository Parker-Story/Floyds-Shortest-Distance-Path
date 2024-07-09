import java.io.IOException;

public class FloydDriver 
{
    public static void main(String[] args) 
    {
        try 
        {
            // Parse input data from the specified file
            InputData inputData = FileParser.parseInput("sample.txt");
            
            GraphData graphData = FloydsAlgorithm.computeDistanceAndPathMatrix(inputData.getAdjacencyMatrix());

            // Output shortest distances and paths
            FloydsAlgorithm.standardOutput(inputData, graphData.getDistanceMatrix(), graphData.getPathMatrix());
            FloydsAlgorithm.fileOutput(graphData.getDistanceMatrix(), graphData.getPathMatrix());

        } 
        catch (IOException e) 
        {
            // Print error message if an I/O error occurs while reading the input file
            System.out.println("Error reading input file: " + e.getMessage());
        }
    }
}
