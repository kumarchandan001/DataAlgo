class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int element : nums){
            if(element !=0){
                nums[index]=element;
                index++;
            }
        }
        for(int i= index; i<nums.length; i++){
            nums[i]=0;
        }
    }
}