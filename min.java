class min{
  public static void main(String[] args) {
    int arr[]={297,32,196,152,179};
    int min=arr[0];
    for (int i=0;i<arr.length ;i++ ) {
      if (min>arr[i]) {
        min=arr[i];
      }
    }System.out.println(min);
  }
}