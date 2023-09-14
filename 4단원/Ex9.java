public class Ex9 { //Producrt Testing

    public static void main(String[] args) {
        Product lamp = new Product("Lamp 60 Watt");
        System.out.println("Before the loading: " + lamp);
        lamp.download(1000);
        lamp.Upload(100);
        System.out.println("After the loading: " + lamp);
    }
}
