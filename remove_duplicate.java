import java.util.Arrays;

public class remove_duplicate {
    public static int remdup(int a[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (a[i] != a[i+1]){  
                temp[j++] = a[i];  
            }  
         }  
        temp[j++] = a[n-1];     
        
        for (int i=0; i<j; i++){  
            a[i] = temp[i];  
        }  
        return j;  
    }     
    public static void main (String[] args) {  
        int a[] = {10,70,30,90,20,20,30,40,70,50};
        Arrays.sort(a);
        int length = a.length;  
        length = remdup(a, length);   
        for (int i=0; i<length; i++)  
           System.out.print(a[i]+" ");  
    }  
}

