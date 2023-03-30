
public class Sort {
    public static void main(String[] args) {
        int[] a= {1, 3, 7, 5};
        if(sort(a, 0)) // calling function
        System.out.println("Yes");
        else System.out.println("no");
    }
    public static int sort(int n, int idx){
        if(a.length-1==0) 
        return 1;
        if(a[idx]<a[idx+1]){
          return  sort(a, idx+1); // recursion
        } else 
        return 0;
    }

}
