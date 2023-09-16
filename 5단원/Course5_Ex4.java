public class Course5_Ex4 {
    public static void main(String[] args) {
        Triangle tri1 = new Triangle(4, 4, 4);
        Triangle tri2 = new Triangle(4, 4, 2);
        Triangle tri3 = new Triangle(4, 3, 2);
        System.out.println(tri1.relength());
        System.out.println(tri2.relength());
        System.out.println(tri3.relength());
        tri1.sidecheck();
        tri2.sidecheck();
        tri3.sidecheck();
        System.out.println("SumSide 1= " + tri1.sumside());
        System.out.println("SumSide 2= " + tri2.sumside());
        System.out.println("SumSide 3= " + tri3.sumside());
        System.out.println("Area 1= " + tri1.area());
        System.out.println("Area 2= " + tri2.area());
        System.out.println("Area 3= " + tri3.area());
        System.out.println("Type 1= " + tri1.typetriangle());
        System.out.println("Type 2= " + tri2.typetriangle());
        System.out.println("Type 3= " + tri3.typetriangle());

    }
}
