public class fib {
    public static int printDec(int n){
        if(n==1 || n==0){
            return n;
        }
            else{
                return printDec(n-1)+printDec(n-2);}
        }


    public static void main(String[] args) {
        System.out.println(printDec(25));
    }
}
