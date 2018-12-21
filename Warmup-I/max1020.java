public int max1020(int a, int b) {
  boolean aVal = (a>=10 && a<=20);
  boolean bVal = (b>=10 && b<=20);
  if(aVal && bVal && a>b){
    return a;
  }else if(aVal && bVal && a<b){
    return b;
  }else if(!aVal && bVal){
    return b;
  }else if(aVal && !bVal){
    return a;
  }
  return 0;
}