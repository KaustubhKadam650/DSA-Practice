public class RatInMaze {

    public static boolean solveMaze(int maze[][]){
        int N = maze.length;
        int sol[][]= new int[N][N];
        
    }
    public static boolean isSafe(int maze[][], int x ,int y){

        return(x >=0 && x < maze.length && y>=0 && y< maze.length && maze[x][y] == 1); 
    }

    public static boolean solveMazeUntil(int maze[][], int x ,int y, int sol[][]){
        if (x== maze.length-1 && y == maze.length-1 && maze[x][y] ==1) {
            sol[x][y] == 1;
            return true;
        }
    }
    public static void main(String[] args) {
        int maze[][] = {{ 1, 0, 0, 0 },
        { 1, 1, 0, 1 },
        { 0, 1, 0, 0 },
        { 1, 1, 1, 1 }
        };

    }
}
    

