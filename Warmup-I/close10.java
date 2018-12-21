public int close10(int a, int b) {
  int num1 = Math.abs(10-a);
  int num2 = Math.abs(10-b);
  if(num1 > num2){
    return b;
  }else if(num2 > num1){
    return a;
  }return 0;
}