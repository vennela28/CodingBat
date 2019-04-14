public List<Integer> doubling(List<Integer> nums) {
  nums.replaceAll(n -> n * 2);
  return nums;
}

//*****************************OR*******************************************

public List<Integer> doubling(List<Integer> nums) {
  return nums.stream().map(n -> n * 2).collect(Collectors.toList());
}
