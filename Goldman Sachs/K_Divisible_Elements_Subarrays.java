import java.util.*;

class K_Divisible_Elements_Subarrays{
    public static void main(String[] args) {
        int nums[]={2,3,3,2,2};
        int k=2;
        int p=2;
        LeetCode ob=new LeetCode();
        System.out.println("Input: nums = [2,3,3,2,2], k = 2, p = 2");
        System.out.println("Output:"+ ob.countDistinct(nums,k,p));
    }
}
class LeetCode {
    public int countDistinct(int[] nums, int k, int p) {
        Set<String> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int count=0;
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<nums.length;j++){
                if(nums[j]%p==0) count++;
                if(count>k) break;
                if(count<=k) {
                    sb.append(nums[j]+ " ");
                    set.add(sb.toString());
                }
            }
        }
        return set.size();
    }
}