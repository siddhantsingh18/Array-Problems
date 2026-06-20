// MULTIPLY EACH ELEMENT BY 10
public class multiply {

    public static int[] multiplyBy10(int[] arr){
        int size = arr.length;
        int newArray[] = new int[size];

        for(int i=0;i<size;i++) {
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int ans[] = multiplyBy10(arr);
        System.out.println("New Array : ");
        for(int i : ans) {
            System.out.println(i);
        }
    }
}