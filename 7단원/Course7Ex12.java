public class Course7Ex12 {
    public static void main(String[] args) {
        Apartment myApartment = new Apartment(63, "woonamdong 60");
        myApartment.addResident("Kim");
        myApartment.addResident("Byeong");
        myApartment.addResident("Evil");

        System.out.println(myApartment);
        System.out.println("Residents Num: " + myApartment.getResidentsNum());
        System.out.println("Resident 1: " + myApartment.getResidentName(1));

        myApartment.removeResident(2);
        System.out.println("Remove done." + "\n");
        System.out.println(myApartment);
    }
}
