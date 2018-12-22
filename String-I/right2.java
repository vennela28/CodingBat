public String right2(String str) {
  String result ="";
  if(str.length()>2){
    result = str.substring(str.length()-2) + str.substring(0,str.length()-2);
  }else{
    result = str;
  }
  return result;
}