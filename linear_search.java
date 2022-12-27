//import java.util.*;

public class linear_search {
     
    public static int linear_search(int a[], int key) {
        for(int i=0; i<a.length; i++) {
            if(a[i]==key) {
            return i;
        }
    }
        return -1;
     }
    public static void main(String[] args) {
        int a[]= {12, 14 , 16, 22, 66, 3 ,56};
        int key=66;
        System.out.print(linear_search(a,key));
     }  
}


