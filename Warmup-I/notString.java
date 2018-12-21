public String notString(String str) {
  String result = "";
  if(str.startsWith("not")){
    result = str;
  }else{
    result = "not "+ str;
  }
  return result;
}