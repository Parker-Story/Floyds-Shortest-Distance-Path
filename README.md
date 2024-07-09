# Floyds-Shortest-Distance-Path

Table of Contents
Project's Title
Project Description
How to Install and Run the Project
How to Use the Project


# Project Description
This project is a Java application that utilizes an adjacency matrix to compute and output the shortest distances and paths between a set of vertices using the Floyd-Warshall algorithm.

Overview
The application reads input from a file named sample.txt, which contains:

1. The number of vertices.
2. An adjacency matrix representing the graph.
3. The number of paths to be explored.
4. The specific paths to be computed.
5. The adjacency matrix uses:

0 to represent self-travel (e.g., vertex (1,1)).
-1 to represent paths that need to be explored.

Example: sample.txt

6
0 3 -1 7 -1 -1
3 0 1 4 -1 -1
-1 1 0 2 -1 3
7 4 2 0 6 -1
-1 -1 -1 6 0 1
-1 -1 3 -1 1 0
3
2 4
4 2
1 6

* The first number, 6, represents the total number of vertices.
* The adjacency matrix follows, with 0s representing self-travel and -1s representing paths to be explored.
* The number 3 indicates how many paths need to be explored.
* The subsequent lines (2 4, 4 2, and 1 6) represent the specific paths to compute.

# Technologies Used
Java: Chosen for its robustness and ease of handling complex algorithms.
Floyd-Warshall Algorithm: Employed to compute shortest paths efficiently.

Challenges and Future Enhancements
Challenges: Implementing accurate input parsing and ensuring the Floyd-Warshall algorithm works correctly with varied inputs.
Future Enhancements: Adding a graphical user interface (GUI) to improve user interaction and external user experience. Enhancing the file structure and project organization to align with best practices in software development.
Personal Reflection
This project was part of an algorithms class assignment. The initial requirements called for command line input, which can be achieved by replacing "sample.txt" with args[0] in the driver. I used this project to practice using GitHub and am still learning about appropriate file structure and project flow. I find the Floyd-Warshall algorithm enjoyable to work with and look forward to adding more features in the future.

How to Install and Run the Project
Placeholder for installation and running instructions.

How to Use the Project
Placeholder for usage instructions.