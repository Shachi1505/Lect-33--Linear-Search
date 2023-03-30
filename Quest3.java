public class Index {
   public static void Index(int[] a, int n, int x, int idx){
        if(idx>=n) return -1;
        // x= target
        if(a[idx] == x) 
        System.out.println(idx); // Print that index
        Index(a,n,x,idx+1); // recursive call, transverse again
   }
        public static void main(String[] args) {
            int[] a ={ 1, 3, 7, 9, 9};
           // 9 is target element
           // start with 0 index
            Index(a,a.length, 9, 0);
        }
    }
