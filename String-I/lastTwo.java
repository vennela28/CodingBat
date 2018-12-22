public String lastTwo(String str) {
  String result = "";
  if(str.length()==2){
    result = str.substring(str.length()-1) + str.substring(str.length()-2, str.length()-1);
  }else if(str.length()>2){
    result = str.substring(0, str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
  }else{
    result = str;
  }
  return result;
}