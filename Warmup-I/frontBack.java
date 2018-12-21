public String frontBack(String str) {
  String result = "";
  if(str.length()<=1){
    result = str;
  }else{
    String mid = str.substring(1,str.length()-1);
    result = str.charAt(str.length()-1) + mid + str.charAt(0);
  }
  return result;
}