import java.util.*;
import java.util.Scanner;

public class array_third_largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int size=a.length;
        int len=a[size-3];
        System.out.println(len);
        }
    
}
