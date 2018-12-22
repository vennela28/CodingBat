public String withoutX2(String str) {
 String temp = "";
 for(int i=0; i<str.length(); i++){
   if(i==0 && str.charAt(0)!='x'){
     temp += str.charAt(i);
   }else if(i==1 && str.charAt(1)!='x'){
     temp += str.charAt(i);
   }else if(i>1){
     temp += str.charAt(i);
   }
 }return temp;
}
