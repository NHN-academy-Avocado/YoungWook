package Exersize.Ex3;

public class Derived extends Base {
    public Derived() {
        super();
        infod = "I am an object of the Derived class";
    }

    public String getInfo() {
        return infod + ", " + super.getInfo();
    }

    private String infod;
}
