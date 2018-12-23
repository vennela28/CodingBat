public int teenSum(int a, int b) {
  int sum = a + b;
  boolean aIsTeen = (a >= 13) && (a <= 19);
  boolean bIsTeen = (b >= 13) && (b <= 19);
  if(aIsTeen || bIsTeen ){
    return 19;
  }return sum;
}
