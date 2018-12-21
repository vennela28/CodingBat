public String missingChar(String str, int n) {
  String result = "";
  for(int i = 0; i<str.length(); i++){
    result = str.substring(0,n) + str.substring(n+1);
  }
  return result;
}