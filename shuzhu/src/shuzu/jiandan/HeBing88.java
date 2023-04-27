package shuzu.jiandan;


import java.util.Arrays;

public class HeBing88 {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int m = 3;
        merge(nums1, m, nums2, n);
        int[] num = {1,2,3,4,5,6};
        for(int i :num){   //集合或数组a : 数组名称num
            System.out.println("元素："+ i);
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int q = m;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < q; j++) {
                if (nums2[i] <= nums1[j]) {
                    for (int p = n + m - 1; p > j; p--) {
                        nums1[p] = nums1[p - 1];
                    }
                    q++;
                    nums1[j] = nums2[i];
                    break;
                }
                q++;
                nums1[j] = nums2[i];
            }
        }

    }

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {


        for (int i = 0; i < n; i++) {
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
    }
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {

        int p1 = 0, p2 = 0;
        int tail = 0;
        int[] res=new int[n+m];
        int cur;
        while(p1>=m||p2>=n){
            if(m==0){
                res[p2++]=nums2[p2++];
            }else if(n==0){
                res[p1++]=nums1[p1++];
            }else if(nums1[p1]<nums2[p2]){

            }
        }



        }


}
