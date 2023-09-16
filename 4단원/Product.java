public class Product {  //Ex9
    private final String name; //제품 이름
    private int productAmount = 0;  //제품 저장갯수

    public Product(String name) {
        this.name = name;

    }

    public void download(int quan) { // 저장 수를 증가시키는 메소드
        if (quan >= 0) {
            productAmount += quan;
        }
    }

    public void upload(int quan) {  //물건 적재시 소모되는 메소드
        if (quan >= 0 && productAmount >= quan) {
            productAmount -= quan;
        }

    }

    @Override
    public String toString() {
        return name + ", " + productAmount + "amount ";
    }


}
