public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            int x = nums.length;
            for(int i=0;i<x-1;i++){//loop array from 0 to length-1
                for(int j=i+1;j<x;j++){// loop array to 1 to length-1
                    if(nums[i]+nums[j]==target){// check if taget = addition of i+j
                        return new int[]{i,j};// return values of int[] with i,j
                    }
                }
            }
            //no match found
            return new int[]{};//return value of int[] as empty
        }
}
