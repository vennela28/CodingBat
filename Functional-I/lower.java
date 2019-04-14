public List<String> lower(List<String> strings) {
  strings.replaceAll(s -> s.toLowerCase());
  return strings;
}

//*****************************OR*******************************************

public List<String> lower(List<String> strings) {
  return strings.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
}
