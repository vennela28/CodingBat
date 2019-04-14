public List<String> addStar(List<String> strings) {
  strings.replaceAll(s -> s + "*");
  return strings;
}

//*****************************OR*******************************************

public List<String> addStar(List<String> strings) {
  return strings.stream().map(s -> s + "*").collect(Collectors.toList());
}
