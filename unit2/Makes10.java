public int diff21(int n) {
  if (n <= 21){
    int a = 21 - n;
    return a;
  }else{
    int a = 2*(n - 21);
    return a;
  }
}
