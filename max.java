class max{
  public static void main(String[] args) {
    int arr[]={297,32,196,152,179};
    int max=0;
    for (int i=0;i<5 ;i++ ) {
      if (max<arr[i]) {
        max=arr[i];
      }

    }System.out.println(max);
  }
}