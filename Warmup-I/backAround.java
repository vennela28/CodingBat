public String backAround(String str) {
  String result = "";
  if(str.length()==1){
    result = str + str + str;
  }else{
    String last = str.substring(str.length()-1);
    result = last + str + last;
  }return result;
}