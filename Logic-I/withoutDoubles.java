public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  int sum = die1 + die2;
  if(noDoubles && die1 == die2){
    if(die1==6){
      die1 = 1;
      sum = die2 + 1;
    }else{
      sum = sum + 1;
    }
  }else{
    sum = sum;
  }return sum;
}
