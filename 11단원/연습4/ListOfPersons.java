package 연습4;

class ListOfPersons {
    private static class Node {
        Person person;
        Node next;

        Node(Person person) {
            this.person = person;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public ListOfPersons() {
        head = null;
        size = 0;
    }

    public void insert(Person person) {
        Node newNode = new Node(person);
        if (head == null || person.lastName.compareTo(head.person.lastName) < 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && person.lastName.compareTo(current.next.person.lastName) >= 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    public void delete(String lastName) {
        if (head == null) {
            return;
        }

        if (head.person.lastName.equals(lastName)) {
            head = head.next;
            size--;
            return;
        }

        Node current = head;
        while (current.next != null && !current.next.person.lastName.equals(lastName)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            size--;
        }
    }

    public void update(String lastName, Person newPerson) {
        delete(lastName);
        insert(newPerson);
    }

    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.println(
                    current.person.firstName + " " + current.person.lastName + " (Age: " + current.person.age +
                            ", City: " + current.person.city + ")");
            current = current.next;
        }
    }

    public int countByCity(String city) {
        int count = 0;
        Node current = head;
        while (current != null) {
            if (current.person.city.equals(city)) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    public double averageAge() {
        if (size == 0) {
            return 0.0;
        }

        int totalAge = 0;
        Node current = head;
        while (current != null) {
            totalAge += current.person.age;
            current = current.next;
        }
        return (double) totalAge / size;
    }
}
