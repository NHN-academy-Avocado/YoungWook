public class Main {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibonacci(10));

    }

    public static long factorial(int number) {
        switch (number){
            case 0:
            case 1:
                return 1;
            default:
                return number*factorial(number-1);
        }
        

    }

    public static long fibonacci(int number) {
        switch (number){
            case 0:
            case 1:
                return 1;
            default:
                return number+fibonacci(number-1);
        }
        

    }
}
