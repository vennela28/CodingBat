public boolean lessBy10(int a, int b, int c) {
  int high = Math.max(a, b);
  high = Math.max(high, c);
  
  if((high-a >= 10) || (high-b >= 10) || (high-c >= 10)){
    return true;
  }return false;
}
