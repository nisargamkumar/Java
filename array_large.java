import java.util.*;
import java.util.Scanner;

public class array_large {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n =sc.nextInt();
            int a[]= new int[n];
            for(int i=0;i<n; i++)
            {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int size=a.length;
            int len=a[size-1];
            System.out.println(len);
        }
        }
        