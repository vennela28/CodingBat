public boolean lastDigit(int a, int b, int c) {
  int aRight = a % 10;
  int bRight = b % 10;
  int cRight = c % 10;
  if(aRight == bRight || bRight == cRight || aRight == cRight){
    return true;
  }return false;
}
