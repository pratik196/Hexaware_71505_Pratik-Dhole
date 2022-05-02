class vc{
  public static void main(String[] args) {
    String s="abcdefghijklmnopqrst";
    String vo="";
    String co="";
    int n=s.length();
    int v = 0, c = 0, a1=0, a2=0;
    String gh=s.toLowerCase();
    System.out.println(gh);
    for (int i=0;i<n ;i++ ) {
    if (gh.charAt(i)=='a' || gh.charAt(i)=='e' || gh.charAt(i)=='i' ||
     gh.charAt(i)=='o' ||gh.charAt(i)=='u' ) {
	
	vo.charAt(v) = gh.charAt(i);
      v++;
    }
	for(i=0;i<v;i++){

		System.out.print(vo.charAt(i));
	}
    }
    for (int i=0;i<n ;i++ ) {
      else {
       // System.out.println("consent in the Strings are ");
       // System.out.println("Index of the consent is : " + i);
      }
    }

    }
  }