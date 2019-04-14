public List<Integer> rightDigit(List<Integer> nums) {
  nums.replaceAll(n -> n % 10);
  return nums;
}

//*****************************OR*******************************************

public List<Integer> rightDigit(List<Integer> nums) {
  return nums.stream().map(n -> n % 10).collect(Collectors.toList());
}
