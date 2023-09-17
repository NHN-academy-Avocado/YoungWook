public class Course5_Ex7 {
    public static void main(String[] args) {
        Date date1 = new Date(31, 12, 2022);
        Date date2 = new Date(1, 1, 2023);
        Date date3 = new Date(29, 2, 2024);

        System.out.println("Date 1: " + date1.getDay() + "/" + date1.getMonth() + "/" + date1.getYear());
        System.out.println("Date 2: " + date2.getDay() + "/" + date2.getMonth() + "/" + date2.getYear());
        System.out.println("Date 3: " + date3.getDay() + "/" + date3.getMonth() + "/" + date3.getYear());

        System.out.println("Date 1 is equal to Date 2: " + date1.isEqual(date2));
        System.out.println("Date 1 precedes Date 2: " + date1.isBefore(date2));
        System.out.println("Date 3 is a leap year: " + date3.isLeapYear());

        Date nextDay = date1.getNextDay();
        System.out.println(
                "Next day after Date 1: " + nextDay.getDay() + "/" + nextDay.getMonth() + "/" + nextDay.getYear());
    }
}
