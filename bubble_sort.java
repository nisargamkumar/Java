public class bubble_sort {

    public static void bubblesort(int a[]) {
        int n=a.length;
        int temp=0;   
        for(int i=0; i<n; i++) {
            for(int j=1; j<(n-i); j++) {
                if(a[j-1]>a[j]) {
                    temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[]={ 20,40,60,80,100,10,30,50,70,90};
        bubblesort(a);
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}

