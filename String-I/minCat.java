public String minCat(String a, String b) {
  String result = "";
  if(a.length() > b.length()){
    result = a.substring(a.length() - b.length()) + b;
  }else{
    result = a + b.substring(b.length() - a.length());
  }
  return result;
}