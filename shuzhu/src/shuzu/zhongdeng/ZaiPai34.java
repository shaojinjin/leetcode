package shuzu.zhongdeng;

public class ZaiPai34 {
    public static void main(String[] args) {

        int[] nums={12,13};
    }
    public int[] searchRange(int[] nums, int target) {

        int n=nums.length;
        if(n==0){

            return new int[]{-1, -1};
        }
        if(n==1){
            return target==nums[0]?new int[]{0, 0}:new int[]{-1, -1};
        }
        int l=0,r=n-1;

        while (l<=r){
            int mid=(l+r)/2;
            if(target==nums[mid]){
                int first=mid-1;
                int last=mid+1;
                while(first>=0&&nums[first]==nums[mid]){
                    first--;
                }
                while (last<=n-1&&last>=0&&nums[last]==nums[mid]){
                    last++;
                }
                return new int[]{first+1,last-1};
            }else if(target>nums[mid]){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return new int[]{-1, -1};
    }
}
