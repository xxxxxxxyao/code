public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 9, 56};
        int left=0;
        int right=arr.length-1;
        int ret = binarySearch(arr, 56,left,right);
        System.out.println("下标为：" + ret);
    }

    public static int binarySearch(int[] array, int key, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (array[mid] == key) {
            return mid;
        } else if (array[mid] > key) {
            return binarySearch(array, key, left, mid - 1);
        } else {
            return binarySearch(array, key, mid + 1, right);
        }
    }
}
   /* public static int search(int[] arr,int key){
        int left=0;
        int right=arr.length-1;
        while(left<=right) {
            int mid = (left + right) / 2;
            if (key == arr[mid]) {
                return mid;
            }if (key > arr[mid]) {
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return -1;
    }*/

