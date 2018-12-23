public boolean twoAsOne(int a, int b, int c) {
  int aSum = a + b;
  int bSum = b + c;
  int cSum = c + a;
  if((aSum == c) || (bSum == a) || (cSum == b)){
    return true;
  }return false;
}
