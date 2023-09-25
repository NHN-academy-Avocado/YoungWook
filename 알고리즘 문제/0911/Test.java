public class Test {
    public static StringBuilder prime(int num,int i,StringBuilder sb){
        if (num==1)
        {
            return sb;
        }

        if(num%i==0){
            sb.append(i+"*");
            num/=i;
        }
        else{
            i++;
        }

        return prime(num,i,sb);
    }
    public static void main(String[] args) {
        StringBuilder sb= prime(10, 2, new StringBuilder());
        System.out.println(sb);
        
    }
}
