public class Test{
    public static void main(String[] args) {
        int[] arr={1,5,3,4,7,9};
        int left=0;
        int right=arr.length-1;
        int mid=(left+right)/2;
        int b=search(arr,7,left,right);
        System.out.println(b);
    }

    public static int search(int[] arr,int key,int left,int right){
        int mid=(left+right)/2;
        if(arr[mid]==key){
            return mid;
        }else if(arr[mid]>key){
            return search(arr,7,left,mid-1);
        }else{
            return search(arr,7,mid+1,right);
        }
    }
}