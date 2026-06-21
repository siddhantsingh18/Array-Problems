public class count_zeroes_ones {

    public static int[] getZeroesOnes(int[] arr){
        int zeroCount = 0;
        int onesCount = 0;

        for(int i =0; i<arr.length;i++) {
            if(arr[i] == 0) {
                zeroCount++ ;
            }
            else {
                onesCount++;
            }
        }
        int[] ans = {zeroCount, onesCount};
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,1,1};
        int[] ans = getZeroesOnes(arr);

        System.out.println("Zeroes : " +ans[0]);
        System.out.println("Ones : " +ans[1]);
    }
}