public class Course7Ex12 {
    public static void main(String[] args) {
        Apartment myApartment = new Apartment(100, "123 Main Street");
        myApartment.addResident("Kim");
        myApartment.addResident("Byang");
        myApartment.addResident("na");

        System.out.println(myApartment);
        System.out.println("Number of residents: " + myApartment.getResidentsNum());
        System.out.println("Resident 1: " + myApartment.getResidentName(1));

        myApartment.removeResident(1);
        System.out.println("After removing resident 1:");
        System.out.println(myApartment);
    }
}
