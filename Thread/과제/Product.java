package 과제;

public enum Product {
    과자(1500),
    휴지(2000),
    쌀(3000);

    private int price;


    Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
