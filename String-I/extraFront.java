public String extraFront(String str) {
  String result = "";
  if(str.length()<2){
    result = str + str + str;
  }else{
    String front = str.substring(0,2);
    result =  front + front + front;
  }
  return result;
}