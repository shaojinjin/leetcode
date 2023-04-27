package shuzu.zhongdeng;

public class ZuiJieJin16 {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums){
        int n=nums.length;
        int i=0,j=1;
        while (j<n){
            while(nums[j]==nums[j-1]&&j<n){
                j++;//这里有错误，如果nums[j]!=nums[j-1],j就不动了
            }
            i++;
            nums[i]=nums[j];
        }
        return i;
    }
    //双指针，一快一慢，快的找不同，慢的记录新的
    public int removeDuplicates2(int[] nums) {
        int n=nums.length;
        int i=1,j=1;
        while (j<n){
            if(nums[j]!=nums[j-1]){
                nums[i]=nums[j];
                i++;//找到一个新的，i才往前进1位
            }
            j++;
        }
        return i;
    }
}
