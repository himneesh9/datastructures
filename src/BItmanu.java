public class BItmanu {
    public static int countSetbits(int n){
        int count =0;
        int bitmask = 1;
        while(n > 0){
            if((n & bitmask) == 1){
                count++;
            }
          n = n>>1;
        }
        return count;
    }


    public static void main(String[] args) {

    }
}
