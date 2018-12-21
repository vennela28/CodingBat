public boolean nearHundred(int n) {
  int n100 = Math.abs(100-n);
  int n200 = Math.abs(200-n);
  if(n100<=10 || n200<=10){
    return true;
  }return false;
}