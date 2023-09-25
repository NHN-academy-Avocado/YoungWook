import java.util.Scanner;

public class Main2{
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int max=0;
        int index=1;
        for (int i=0; i<8; i++){
            int a= sc.nextInt();
            if(a>max){
                max=a;
                index=i;
            }
            
        }
        sc.close();
        System.out.println();
        System.out.println(max);
        System.out.println(index+1);
        }
}

