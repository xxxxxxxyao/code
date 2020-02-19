import java.util.Arrays;

public class Test {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=m;
        while(n>0){
            nums1[j]=nums2[i];
            i++;
            j++;
            n--;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }


    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int m=3;
        int[] nums2={2,5,6};
        int n=3;
        merge(nums1,m,nums2,n);

    }
}
