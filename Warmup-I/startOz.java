public String startOz(String str) {
  String result = "";
  if(str.length()>=2 && str.substring(0,2).equals("oz")){
    result = "oz";
  }else if(str.length()>=1 && str.substring(0,1).equals("o")){
    result = "o";
  }else if(str.length()>=2 && str.substring(1,2).equals("z")){
    result = "z";
  }return result;
}