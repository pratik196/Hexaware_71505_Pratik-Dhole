class rev{
  public static void main(String[] args) {
    String s="pratik"; String str="";
    int n=s.length();
    char ch;
    for (int i=0;i<n ;i++ ) {
       ch=s.charAt(i);
      str=ch+str;
    }System.out.println(str);
  }
}