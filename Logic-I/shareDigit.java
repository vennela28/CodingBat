public boolean shareDigit(int a, int b) {
  int aRight = a % 10;
  int aLeft = a / 10;
  int bRight = b % 10;
  int bLeft = b / 10;
  if((aRight==bRight) || (aLeft==bLeft) || (aRight==bLeft) || (aLeft==bRight)){
    return true;
  }return false;
}
