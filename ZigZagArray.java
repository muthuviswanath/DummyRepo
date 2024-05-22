//1. A = {10,45,23,67,23,89}
//B = {76,34,12,45,122}

public class ZigZagArray {
    public static void main(String[] args) {
        int[] a = { 2,24,36,48,50 }; // 6
        int[] b = { 11,23,25,27,39,41,53 }; // 5
        int[] c = new int[a.length + b.length];// 11
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if(a[i] < b[j]){
            c[k] = a[i++];// k =0 i = 0 c[2] = a[1]. // i = 1 k =1
            }
            else{
            c[k] = b[j++];    
            }
            k++;
        }
        while (i < a.length) {
            c[k++] = a[i++]; // c[10] = a[5]
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }

        for(int element: c){
            System.out.print(element + " ");
        }
    }
}
