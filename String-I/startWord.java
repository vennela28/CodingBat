public String startWord(String str, String word) {
  if(str.length()<word.length()){
    return "";
  }
  if(str.length()==0){
    return "";
  }
  if(word.length()==1){
    return str.substring(0,1);
  }else if(str.substring(1,word.length()).equals(word.substring(1,word.length()))){
    return str.substring(0,word.length());
  }else{
    return "";
  }
}
