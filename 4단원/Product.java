public class Product {  //Ex9
    private String Name; //제품 이름
    private int Productamount = 0;  //제품 저장갯수

    public Product(String name) {
        this.Name = name;

    }

    public void download(int quan) { // 저장 수를 증가시키는 메소드
        if (quan >= 0) {
            Productamount += quan;
        }
    }

    public void Upload(int quan) {  //물건 적재시 소모되는 메소드
        if (quan >= 0 && Productamount >= quan) {
            Productamount -= quan;
        }

    }

    @Override
    public String toString() {
        return Name + ", " + Productamount + "amount ";
    }


}
