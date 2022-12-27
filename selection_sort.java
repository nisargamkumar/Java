
public class selection_sort {
    public static void selectionSort(int[] a) {  
        for (int i=0; i<a.length-1; i++)  
        {  
            int index=i;  
            for (int j=i + 1;  j < a.length; j++) {  
                if (a[j]<a[index]){  
                    index = j;
                }  
            }  
            int smallerNumber = a[index];   
            a[index] = a[i];  
            a[i] = smallerNumber;  
        }  
    }  

    public static void main(String args []){  
        int[] a = {9,14,3,2,43,11,58,22};  
        selectionSort(a);
        for(int i:a) {  
            System.out.print(i+" ");  
        }  
    }  
}


