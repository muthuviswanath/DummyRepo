//1. A = {10,45,23,67,23,89}
// B = {76,34,12,45,122}
public class MergeArray {
    public static void main(String[] args) {
        int[] a = {10,45,23,67,23,89}; //6
        int[] b = {76,34,12,45,122}; //5
        int[] c = new int[a.length + b.length];//11
        for(int i=0;i<c.length;i++){ // i = 0 to 10
            if(i < a.length) //0 - 6
                c[i] = a[i];
            else
                c[i] =   b[i - a.length];           // c[6] = b[0] = 6 - a.length(6)
        }

        for(int element:c){
            System.out.print(element+ " ");
        }
    }
}