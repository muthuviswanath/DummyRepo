public class Challenge {
    String name;
    long mobilenumber;
    int empno;
    Challenge(String name, long mobilenumber){
        this.name = name;
        this.mobilenumber = mobilenumber;
        System.out.println("Welcome "+ name + " You have registered with the mobile number " + mobilenumber);
    }
    Challenge(int empno, long mobilenumber){
        this.empno = empno;
        this.mobilenumber = mobilenumber;
        System.out.println("Welcome "+ empno + " You have registered with the mobile number " + mobilenumber);
    }
    Challenge(String name, int empno, long mobilenumber){
        this.empno = empno;
        this.mobilenumber = mobilenumber;
        this.name = name;
        System.out.println("Welcome "+ name + " You have registered with the mobile number " + mobilenumber + "Your regid: " + empno);
    }

    public static void main(String[] args) {
        Challenge c = new Challenge("Rahul", 834534534534L);
        Challenge d = new Challenge(123123, 2353455530L);
        Challenge e = new Challenge("Abhi",123123, 2353455530L);

    }
}
