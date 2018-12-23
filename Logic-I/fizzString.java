public String fizzString(String str) {
  if(str.startsWith("f") && str.endsWith("b")){
    str = "FizzBuzz";
  }if(str.startsWith("f")){
    str = "Fizz";
  }if(str.endsWith("b")){
    str = "Buzz";
  }
  return str;
}
