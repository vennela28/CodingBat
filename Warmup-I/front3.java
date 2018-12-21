public String front3(String str) {
  String front = "";
  if(str.length()<=3){
    front = str + str + str;
  }else{
    front = str.substring(0, 3) + str.substring(0,3) + str.substring(0,3);
  }
  return front;
}