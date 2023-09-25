package Travelsal;

public class Traversal {

    private boolean[][] moor;

    private boolean[][] visited;


    public Traversal(int rows, int colums, double probLand) {
        this.moor = new boolean[rows][colums];
        this.visited = new boolean[rows][colums];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < colums; c++) {
                moor[r][c] = (Math.random() < probLand);
            }
        }
    }


    public boolean land(int r, int c) {
        return (r >= 0) && (r < moor.length) &&
                (c >= 0) && (c < moor[0].length) &&
                moor[r][c];
    }

    public void markVisited(int r, int c) {
        if (land(r, c)) {
            visited[r][c] = true;
        }
    }

    public boolean isVisited(int r, int c) {
        return visited[r][c];
    }

    public String toString() { //Ex7
        StringBuilder res = new StringBuilder();
        for (int r = 0; r < moor.length; r++) {
            for (int c = 0; c < moor[0].length; c++) {
                res.append("\t");
                res.append(land(r, c) ? (visited[r][c] ? "#" : "*") : "o");
            }
            res = res.append("\n");
        }
        return res.toString();
    }

    public void searchTraversal(int r, int c) { //Ex8
        if (!land(r, c) || isVisited(r, c)) {
            return;
        }

        markVisited(r, c);

        searchTraversal(r - 1, c);
        searchTraversal(r + 1, c);
        searchTraversal(r, c - 1);
        searchTraversal(r, c + 1);
        searchTraversal(r - 1, c - 1); //Ex9
        searchTraversal(r - 1, c + 1);
        searchTraversal(r + 1, c - 1);
        searchTraversal(r + 1, c + 1);
    }


}