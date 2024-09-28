public class FindInsert {
    public int searchInsert(int[] nums, int target) {
        //start looping
        for(int i=0;i<nums.length;i++){
            //find a nums which is greater than target
            // return i as output
            if(nums[i]>=target){
                return i;
            }
        }
        // as no number was found return length as the insertion point will be at the end
        return nums.length;
    }
}
