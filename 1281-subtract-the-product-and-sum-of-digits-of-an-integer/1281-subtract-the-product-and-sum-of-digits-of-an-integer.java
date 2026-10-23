class Solution {
    public int subtractProductAndSum(int n) {
      int sum=0;
      int count=1;
      int d;
      int product=1;
      while(n>0){
        d=n%10;
        product=count*d;
        count=product;
        sum=sum+d;
        n=n/10;
      }  
      int result=product-sum;
      return result;
    }
}