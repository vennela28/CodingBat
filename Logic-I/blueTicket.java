public int blueTicket(int a, int b, int c) {
  int sum = 0;
  int aSum = a + b;
  int bSum = c + b;
  int cSum = a + c;
  if(aSum == 10 || bSum == 10 || cSum == 10){
    sum = 10;
  }else if(aSum - bSum == 10 || aSum - cSum == 10 ){
    sum = 5;
  }else{
    sum = 0;
  }
  return sum;
}
