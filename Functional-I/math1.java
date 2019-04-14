public List<Integer> math1(List<Integer> nums) {
  nums.replaceAll(n -> (n + 1) * 10);
  return nums;
}

//*****************************OR*******************************************

public List<Integer> math1(List<Integer> nums) {
  return nums.stream().map(n -> (n + 1) * 10).collect(Collectors.toList());
}
