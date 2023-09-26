package 연습4;

public class Main {
    public static void main(String[] args) {
        ListOfPersons listOfPersons = new ListOfPersons();

        listOfPersons.insert(new Person("김", "영욱", 26, "운암동"));
        listOfPersons.insert(new Person("정", "병훈", 25, "양동"));
        listOfPersons.insert(new Person("조", "존슨", 35, "바지"));

        System.out.println("All :");
        listOfPersons.printAll();

        listOfPersons.delete("존슨");

        System.out.println("\nAfter deleting :");
        listOfPersons.printAll();

        Person updatedPerson = new Person("가", "나다", 28, "사전");
        listOfPersons.update("병훈", updatedPerson);

        System.out.println("\nAfter updating :");
        listOfPersons.printAll();

        System.out.println("\n운암동에 사는 사람: " + listOfPersons.countByCity("운암동"));
        System.out.println("Average : " + listOfPersons.averageAge());
    }
}
