public boolean hasTeen(int a, int b, int c) {
  boolean aTeen = ((a>=13 && a<=19));
  boolean bTeen = ((b>=13 && b<=19));
  boolean cTeen = ((c>=13 && c<=19));
  if(!aTeen && !bTeen && !cTeen){
    return false;
  }return true;
}