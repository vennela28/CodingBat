public String deFront(String str) {  
  String result = "";
  if(str.substring(0,1).equals("a") && str.substring(1,2).equals("b") && str.length()>=2){
    result = "ab" + str.substring(2);
  }
  else if(str.substring(0,1).equals("a") && str.length()>2){
    result = "a" + str.substring(2);
  }else if(str.substring(0,1).equals("a") && str.length()==2){
    result = "a";
  }else if(str.substring(1,2).equals("b") && str.length()>2){
    result = "b" + str.substring(2);
  }else{
    result = str.substring(2);
  }
  return result;
}