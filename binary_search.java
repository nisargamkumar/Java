import java.util.*;

class binary_search {
    public static void binaryy_search(int a[], int first , int last, int key ) {
        int mid=(first + last)/2;
        while(first<=last) {
            if(a[mid]<key) {
                first=mid+1;
            } else if( a[mid] == key) {
                System.out.println(mid);
                break;
            } else {
                last=mid-1;
            }
            mid=(first+last)/2;
            }
            if(first>last) {
                System.out.println("error");
            }
        }
    public static void main(String args[]) {
        int a[]={10,20,40,50,60,80,55, 77, 11, 66};
        Arrays.sort(a);
        int key=50;
        int first=0;
        int last=a.length-1;
        binaryy_search(a,first,last,key);
    }
}
    