/**
 * Starter code for the Maze path finder problem.
 */

import java.io.*;
import java.util.*;

/*
 * Recursive class to represent a position in a path
 */
class Position {
    public int i;     //row
    public int j;     //column
    public char val;  //1, 0, or 'X'

    // reference to the previous position (parent) that leads to this position on a path
    Position parent;



}


public class PathFinder {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("***Usage: java PathFinder maze_file");
            System.exit(-1);
        }

        char[][] maze;
        maze = readMaze(args[0]);
        printMaze(maze);
        Position[] path = stackSearch(maze);
        System.out.println("stackSearch Solution:");
        printPath(path);
        printMaze(maze);

        char[][] maze2 = readMaze(args[0]);
        path = queueSearch(maze2);
        System.out.println("queueSearch Solution:");
        printPath(path);
        printMaze(maze2);
    }


    public static Position[] stackSearch(char[][] maze) {
      
        return null;
    }

    public static Position[] queueSearch(char[][] maze) {
        // todo: your path finding algorithm here using the queue to manage search list
        // your algorithm should mark the path in the maze, and return array of Position
        // objects coressponding to path, or null if no path found

        
    }

    public static void printPath(Position[] path) {
        // todo: print the path to the stdout

        System.out.print("Path: (");
        for (int i = path.length - 1; i >= 0; i--) {
            Position print = path[i];
            if (i == 0) {
                System.out.print("[" + print.i + "][" + print.j + "]");
            } else {
                System.out.print("[" + print.i + "][" + print.j + "],");
            }

        }
        System.out.println(")");
    }

    /**
     * Reads maze file in format:
     * N  -- size of maze
     * 0 1 0 1 0 1 -- space-separated
     *
     * @param filename
     * @return
     * @throws IOException
     */
    public static char[][] readMaze(String filename) throws IOException {
        char[][] maze;
        Scanner scanner;
        try {
            scanner = new Scanner(new FileInputStream(filename));
        } catch (IOException ex) {
            System.err.println("*** Invalid filename: " + filename);
            return null;
        }

        int N = scanner.nextInt();
        scanner.nextLine();
        maze = new char[N][N];
        int i = 0;
        while (i < N && scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] tokens = line.split("\\s+");
            int j = 0;
            for (; j < tokens.length; j++) {
                maze[i][j] = tokens[j].charAt(0);
            }
            if (j != N) {
                System.err.println("*** Invalid line: " + i + " has wrong # columns: " + j);
                return null;
            }
            i++;
        }
        if (i != N) {
            System.err.println("*** Invalid file: has wrong number of rows: " + i);
            return null;
        }
        return maze;
    }

    public static void printMaze(char[][] maze) {

        if (maze == null || maze[0] == null) {
            System.err.println("*** Invalid maze array");
            return;
        }

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

}
