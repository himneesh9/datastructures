public class countingBIts {
    public static void countBits(int n) {
        int arr[] = new int[n+1];
        arr[0] = 0;
        for(int i = 1 ; i <= n ; i++){
            int count=0;
            int num = i;
            while(num!=0){
                int last_bit= num & 1;
                count += last_bit;
                num = num>>>1;
            }
            arr[i] = count;
        }

        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n = 2;

       countBits(n);
    }
}
