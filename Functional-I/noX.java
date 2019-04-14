public List<String> noX(List<String> strings) {
  strings.replaceAll(s -> s.replaceAll("x", ""));
  return strings;
}

//****************************************OR***********************************************

public List<String> noX(List<String> strings) {
  return strings.stream().map(s -> s.replaceAll("x", "")).collect(Collectors.toList());
}
