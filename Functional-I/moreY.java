public List<String> moreY(List<String> strings) {
  strings.replaceAll(s -> "y" + s + "y");
  return strings;
}

//*****************************OR*******************************************

public List<String> moreY(List<String> strings) {
  return strings.stream().map(s -> "y" + s + "y").collect(Collectors.toList());
}
