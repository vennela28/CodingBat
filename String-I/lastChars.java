public String lastChars(String a, String b) {
   String result = "";
  if(a=="" && b==""){
    result = "@@";
  }else if(a==""){
    result = "@" + b.substring(b.length()-1);
  }
  else if(b==""){
    result = a.substring(0,1) + "@";
  }
  else if(a!="" && b!=""){
    result = a.substring(0,1) + b.substring(b.length()-1);
  }return result;
}