public String delDel(String str) {
  String result = "";
  if(str.length()>=4 && str.indexOf("del")==1){
    result = str.substring(0,1) + str.substring(4);
    return result;
  }return str;
}