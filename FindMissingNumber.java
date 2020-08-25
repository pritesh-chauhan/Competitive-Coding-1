//Time complexity: O(logn) Binay Search
//Space Complexity: O(1)

public class FindMissingNumber{
    public static int search(int[] nums){
        int l=0, h=nums.length-1;
        while(l<=h){
            int m=l+(h-l)/2;
            //Checking difference of mid and its previous element considering mid > 0
            if(m>0 && (nums[m] - nums[m-1] > 1))
                return nums[m]-1;
            //Checking mid element is not equal to its index+1 considering mid+1 < arr.length
            else if((m+1)<nums.length && nums[m] != (m+1)){
                h=m-1;
            }
            else{
                l=m+1;
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,4};
        System.out.println(search(nums));
    }
}