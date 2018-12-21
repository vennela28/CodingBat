public boolean in3050(int a, int b) {
  boolean a30 = (a>=30 && a<=40);
  boolean a40 = (a>=40 && a<=50);
  boolean b30 = (b>=30 && b<=40);
  boolean b40 = (b>=40 && b<=50);
  
  if((a30 && b30) || (a40 && b40)){
    return true;
  }return false;
}