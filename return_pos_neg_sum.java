public class return_pos_neg_sum {

    public static int[] getPosNeg(int[] arr) {
        int posSum = 0;
        int negSum = 0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] > 0) {
                posSum = posSum + arr[i];
            }
            else {
                negSum = negSum + arr[i];
            }
        }
        int[] ans = {posSum, negSum};
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,-3,4,-5};
        int[] ans = getPosNeg(arr);
        System.out.println("Positive Sum = " + ans[0]);
        System.out.println("Negative Sum = " + ans[1]);
    }
}