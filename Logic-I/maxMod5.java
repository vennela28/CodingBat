public int maxMod5(int a, int b) {
  int result = 0;
  if(a == b){
    result = 0;
  }else if(a > b){
    result = a;
  }else{
    result = b;
  }
  
  if(a % 5 == b % 5){
    if(a < b){
      result = a;
    }else if(a > b){
      result = b;
    }else{
      result = 0;
    }
  }
  return result;
}
