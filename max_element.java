public class max_element {
    public static int max(int[] arr) {
        int max = arr[0];

        for(int i =0; i<arr.length;i++) {
            if(max < arr[i]) {
              max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,9,1};
        System.out.println(max(arr));
    }
}