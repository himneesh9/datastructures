public class fib {
    public static int printDec(int n){
          if(n==0 || n ==1){
              return 1;
          }

          return printDec(n-1)+ printDec(n-2);
        }


    public static void main(String[] args) {
        System.out.println(printDec(4));
    }
}
