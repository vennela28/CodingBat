public String twoChar(String str, int index) {
  String result = "";
  if(str.length() <= index + 1 || index < 0 ){
    result = str.substring(0,2);
  }else{
    result = str.substring(index, index+2);
  }
  return result;
}
