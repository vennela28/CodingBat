public int maxTriple(int[] nums) {
  int firstLarge = Math.max(nums[0], nums[nums.length/2]);
  int secondLarge = Math.max(nums[nums.length/2], nums[nums.length-1]);
  int largest = Math.max(firstLarge, secondLarge);
  return largest;
}
