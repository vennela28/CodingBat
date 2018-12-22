public String atFirst(String str) {
  String result = "";
  if(str.length()>=2){
    result = str.substring(0,2);
  }else if(str.length()==1){
    result = str.charAt(0) + "@";
  }else{
    result = "@@";
  }
  return result;
}