public int[] makeLast(int[] nums) {
  int[] a = new int[2*nums.length];
  a[a.length-1] = nums[nums.length-1];
  return a;
}
