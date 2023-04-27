package shuzu.zhongdeng.shengshui11;
import java.lang.Math;
public class Solution {

    public static void main(String[] args) {

        int[] height={1,8,6,2,5,4,8,3,7};
        int a=maxArea2(height);
        System.out.println(a);

    }
    //暴力
    public int maxArea(int[] height) {
        int max=-1;
        int n=height.length;
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++)
            {
                if(height[i]<=height[j]){
                    if(max<height[i]*Math.abs(i-j))
                    {
                        max=height[i]* Math.abs(i - j);
                    }
                }

            }
        }
        return max;


    }
    //双指针
    public static int maxArea2(int[] height){
        int i=0,j=height.length-1;
        int max=0;
        while(i<j){
            if(height[i]<height[j]){
                if(max<(j-i)*height[i]){
                    max=(j-i)*height[i];
                }
                i++;
            }
            else{
                if(max<(j-i)*height[j]){
                    max=(j-i)*height[j];
                }
                j--;
            }
        }
        return max;
    }
    //正解
    public static int maxArea3(int[] height){
        int i=0,j=height.length-1;
        int max=0;
        while (i<j){
            int area = Math.min(height[i], height[j]) * (j - i);
            max=Math.max(max,area);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}
