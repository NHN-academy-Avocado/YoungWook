package 연습3;

public class OrderTest {
    public static void main(String[] args) {
        OrderedLinkedList list1 = new OrderedLinkedList(1);
        list1.insert(3);
        list1.insert(5);

        OrderedLinkedList list2 = new OrderedLinkedList(2);
        list2.insert(4);
        list2.insert(6);

        System.out.println("List 1: ");
        list1.print();
        System.out.println();

        System.out.println("List 2: ");
        list2.print();
        System.out.println();

        System.out.println("List 1 ordered? " + list1.isOrdered());
        System.out.println("List 2 ordered? " + list2.isOrdered());

        int elementToDelete = 3;
        list1 = list1.delete(elementToDelete);
        System.out.println("After deleting " + elementToDelete + " from List 1:");
        list1.print();
        System.out.println();

        int elementToInsert = 0;
        list1.insert(elementToInsert);
        System.out.println("After inserting " + elementToInsert + " into List 1:");
        list1.print();
        System.out.println();

        OrderedLinkedList mergedList = OrderedLinkedList.merge(list1, list2);
        System.out.println("Merged List:");
        mergedList.print();
        System.out.println();

        OrderedLinkedList mergedInPlaceList = OrderedLinkedList.mergeInPlace(list1, list2);
        System.out.println("Merged In-Place List:");
        mergedInPlaceList.print();
        System.out.println();

        OrderedLinkedList interleavedList = OrderedLinkedList.interleave(list1, list2);
        System.out.println("Interleaved List:");
        interleavedList.print();
        System.out.println();
    }
}
