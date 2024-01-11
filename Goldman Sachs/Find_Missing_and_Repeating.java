import java.util.Arrays;

class Find_Missing_and_Repeating{
    public static void main(String[] args) {
        Solve obj = new Solve();
        int n=3;
        int[] arr={1, 3, 3};
        int ans[] = obj.findTwoElement(arr,n);
        System.out.println("The missing element is : "+ans[1]);
        System.out.println("The Repeating element is : "+ans[0]);
        
    }
}
class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int[] result = new int[2];
        int[] count = new int[arr.length + 1];
        Arrays.fill(count, 0);

        for (int i = 0; i < arr.length; i++) {
            if (count[arr[i]] != 0) {
                result[0] = arr[i];
            } else {
                count[arr[i]] = 1;
            }
        }

        for (int i = 1; i <= arr.length; i++) {
            if (count[i] == 0) {
                result[1] = i;
                break;
            }
        }

        return result;
    }
}