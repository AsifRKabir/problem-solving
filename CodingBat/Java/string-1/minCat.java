public String minCat(String a, String b) {
  if(a.length() == 0 || b.length() == 0) return "";
  
  if(a.length() < b.length()){
    return a + b.substring(b.length() - a.length());
  }
  else if(a.length() > b.length()){
    return a.substring(a.length() - b.length()) + b;
  }
  else return a + b;
}