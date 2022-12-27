public class quick_sort {

    int partition(int a[], int l, int h)
    {
        int pivot = a[h];
        int i = (l-1); 
        for (int j=l; j<h; j++)
        {
            if (a[j] <= pivot)
            {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[h];
        a[h] = temp;
        return i+1;
    }

    void sort(int a[], int l, int h)
    {
        if (l<h)
        {
            int pi = partition(a, l, h);
            sort(a, l, pi-1);
            sort(a, pi+1, h);
        }
    }

    static void printArray(int a[])
    {
        int n = a.length;
        for (int i=0; i<n; ++i)
            System.out.print(a[i]+" ");
        System.out.println();
    }
    
    public static void main(String args[])
    {
        int a[] = {10, 7, 8, 9, 1, 5};
        int n = a.length;
 
        quick_sort ob = new quick_sort();
        ob.sort(a, 0, n-1);
        printArray(a);
    }
}