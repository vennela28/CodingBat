public String conCat(String a, String b) {
  String result = "";
  if(a==""){
    result = b;
  }
  else if(b==""){
    result = a;
  }
  else if(a!="" && b!="" && a.substring(a.length()-1).equals(b.substring(0,1))){
    result = a + b.substring(1);
  }else{
    result = a + b;
  }return result;
}