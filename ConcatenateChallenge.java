public class ConcatenateChallenge {
    // static <T> void display(T a){
    //     System.out.println(a.getClass().getName() + " = " + a);
    // }
    static <Coffee> void display(Coffee a,int b){
        System.out.println(a +" "+ b);
    }
    static <Arr> void display(Arr[] a){
        for (Arr element: a){
            System.out.println("Welcome " + element);
        }
    }

    public static void main(String[] args) {
        display(new Integer[]{1});
    }
}
