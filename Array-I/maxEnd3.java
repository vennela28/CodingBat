public int[] maxEnd3(int[] nums) {
  if(nums[0]>nums[2]){
    return new int[]{nums[0], nums[0], nums[0]};
  }else{
    return new int[]{nums[2], nums[2], nums[2]};
  }
}
