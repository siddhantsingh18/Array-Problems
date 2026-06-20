public class search_element {

    public static boolean searchElement(int[] arr, int target) {
        for(int i = 0;i<arr.length;i++) {
            if(arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,3,1,7};
        boolean ans = searchElement(arr,7);
        System.out.println(ans);
    }
}