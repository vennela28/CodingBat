public int[] front11(int[] a, int[] b) {
  if (a.length == 0 && b.length == 0) {
    return a;
  }
  int nums[] = new int[2];
  if(a.length >= 1 && b.length >= 1){
    nums = new int[]{a[0], b[0]};
  }
  if(a.length == 0){
    nums = new int[]{b[0]};
  }
  if(b.length == 0){
    nums = new int[]{a[0]};
  }return nums;
}
