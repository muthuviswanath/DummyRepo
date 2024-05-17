class Test {
    int age = 45;
}
public class DeepCopy {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        t2.age = 10;
        System.out.println(t2.age);
        System.out.println(t1.age);

    }
}
