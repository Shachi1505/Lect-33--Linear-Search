public class Lastidx {
   public static void main(String[] args) {
    int[] a={ 2, 5, 8, 2};
    int n = a.length;
    int x=2; // target
System.out.println( last(a, n, x)); 
   } 
  public static int last(int[] a, int n, int x) {
    if(n==0) return -1;
    int ans = last(a, n-1,x); // recursion
    if (ans != -1) return ans+1;
    else if(a[0] == x) return 0;
    else return -1;
   }
    
}
