public String left2(String str) {
  String result ="";
  if(str.length()>2){
    result = str.substring(2) + str.substring(0,2);
  }else{
    result = str;
  }
  return result;
}