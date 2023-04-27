package shuzu.jiandan;

public class YiChu27 {
    public static void main(String[] args) {

    }
    public int removeElement(int[] nums, int val) {
        int i=0,j=0;
        int n=nums.length;
        while(j<n){
            if(nums[j]!=val){
                nums[i]=nums[j+1];
                i++;
            }
            j++;
        }
        return i;

    }
}
