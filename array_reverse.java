import java.util.Scanner;
// import java.util.*;

public class array_reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++) {
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            System.out.print(a[n-1-i]+" ");
        }
    }
    
}
