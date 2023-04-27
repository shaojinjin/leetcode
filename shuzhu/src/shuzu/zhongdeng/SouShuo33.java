package shuzu.zhongdeng;

public class SouShuo33 {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {

        //将数组一分为二，其中一定有一个是有序的，另一个可能是有序，也能是部分有序。
        //此时有序部分用二分法查找。无序部分再一分为二，其中一个一定有序，另一个可能有序，可能无序。就这样循环.
        int n=nums.length;
        if(n==0){
            return -1;
        }
        if(n==1){
            return target==nums[0]?0:-1;
        }
        int l=0,r=n-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                return mid;
            }
            //对半分，先看看哪一半是有序的，另一半可能跟有序也可能无序；
            if(nums[mid]>=nums[0])//如果中间的数比第一个数大，说明左边是有序的，否则就是右边有序
                //因为原先的数组是有序的，而旋转后是把后面的一部分数组放到了前面
                {
                if(target>nums[0]&&target<nums[mid]){
                    r=mid-1;

                }else{
                    l=mid+1;
                }
            }else{
                if(target>nums[mid]&&target<nums[r]){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }

        }
        return -1;

    }
}
