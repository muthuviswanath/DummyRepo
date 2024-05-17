class Test {
    int age = 45;
}

class ShallowCopy{
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = t1;

        t2.age = 10;
        System.out.println("Value of age for T1 Instance: " + t1.age);
        System.out.println("Value of age for T2 Instance: " + t2.age);
    }
}

/*
 * t1 ->                11ABCD - t1,t2
 * t2 = t1
 */