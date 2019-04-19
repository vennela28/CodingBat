public boolean scoresIncreasing(int[] scores) {
  boolean res = false;
  for(int i=0; i < (scores.length-1); i++){
    if(scores[i] <= scores[i+1]){
      res = true;
    }else{
      return false;
    }
  }return res;
}