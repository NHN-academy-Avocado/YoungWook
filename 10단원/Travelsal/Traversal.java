package Travelsal;

public class Traversal {
    private char[][] moor;
    private int startX;
    private int startY;

    public Traversal(char[][] moor, int startX, int startY) {
        this.moor = moor;
        this.startX = startX;
        this.startY = startY;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();

        // Loop through the moor and build the result string
        for (int row = 0; row < moor.length; row++) {
            for (int col = 0; col < moor[row].length; col++) {
                char cell = moor[row][col];
                if (cell == 'o') {
                    result.append('o'); // Water zone
                } else if (cell == '#') {
                    result.append('#'); // Land zone belonging to traversal
                } else {
                    result.append('*'); // Remaining land zone
                }
            }
            result.append('\n'); // Newline at the end of each row
        }

        return result.toString();
    }

    public static void main(String[] args) {
        char[][] moor = {
                {'o', 'o', 'o', '#', 'o'},
                {'o', 'o', '#', 'o', 'o'},
                {'o', 'o', 'o', 'o', 'o'},
                {'o', '#', 'o', 'o', 'o'},
                {'o', 'o', 'o', 'o', 'o'}
        };

        Traversal traversal = new Traversal(moor, 2, 2);
        System.out.println(traversal.toString());
    }
}
