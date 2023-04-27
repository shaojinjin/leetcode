package shuzu.zhongdeng.shanshu15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
      int[] nums={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums){
        int l=0,r=nums.length-1;

        List<List<Integer>> list1=new ArrayList<>();
        while(l<nums.length-1) {

            for (int i = 1; i < nums.length; i++) {
                List<Integer> list=new ArrayList<>();
                if(-nums[i]==nums[l]+nums[r]&&i!=l&&i!=r){
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    list1.add(list);
                }
            }
            r--;
            if(r==l){

                r=nums.length-1+l-1;
                l++;
            }
        }
        return list1;

    }
    public static List<List<Integer>> threeSum2(int[] nums){
        Arrays.sort(nums);
        int l=0,r=nums.length-1;

        List<List<Integer>> list1=new ArrayList<>();
        while(l<nums.length-1) {
            if(l>0&&nums[l]==nums[l-1]){
                l++;
                continue;
            }else if(r<nums.length-1&&nums[r]==nums[r+1]){
                r--;
                continue;
            }
            for (int i = l+1; i < r; i++) {
                if (-nums[i]==nums[l]+nums[r]){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    list1.add(list);
                }
            }
            l++;
            r--;

        }
        return list1;

    }
    //先排序，最外层是一个循环，里面运用两个指针相对运动
    public List<List<Integer>> threeSum3(int[] nums){
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> list1=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1;
            int r=n-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];

                if(sum==0){
                    while(l<r&&nums[l]==nums[l+1]) l++;
                    while (l<r&&nums[r]==nums[r-1]) r--;
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    list1.add(list);
                    l++;
                    r--;
                }else if(sum<0){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return list1;
    }
}
