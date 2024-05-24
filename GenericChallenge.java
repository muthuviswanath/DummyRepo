import java.util.LinkedList;

public class GenericChallenge<Coffee, Tea> {
    Coffee emp_n;
    Tea mobile;

    GenericChallenge(Coffee emp_n, Tea mobile) {
        this.emp_n = emp_n;
        this.mobile = mobile;
        System.out.println("Welcome " + emp_n + ". You have registered with your number: " + mobile);
    }

    public static void main(String[] args) {
        GenericChallenge<String, Integer> str = new GenericChallenge("Siraj", 9345344);
        GenericChallenge<Integer, Long> intr = new GenericChallenge(123324, 9344343434343434L);
        GenericChallenge gr = new GenericChallenge("Rakesh", 234234234L);
        GenericChallenge br = new GenericChallenge(true, 234234234L);
        /*
         * T - Type
         * E - Element
         * K - Key
         * V - Value
         * N - Number
         */
    }
}
