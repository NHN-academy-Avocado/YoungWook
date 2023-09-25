package Travelsal;

public class TestTravel {
    public static void main(String[] args) {
        Traversal traversal = new Traversal(5, 4, 0.3);
        System.out.println("Start:");
        System.out.println(traversal.toString());

        traversal.searchTraversal(2, 2);

        System.out.println("Finish:");
        System.out.println(traversal.toString());
    }
}
