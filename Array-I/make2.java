public int[] make2(int[] a, int[] b) {
  int nums[] = new int[2];
  if(a.length>=2){
    nums = new int[]{a[0], a[1]};
  }if(a.length==1 && b.length >= 1){
    nums = new int[]{a[0], b[0]};
  }if(a.length==0){
    nums = b;
  }
  return nums;
}
