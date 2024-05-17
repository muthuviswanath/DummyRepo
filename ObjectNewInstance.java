import java.lang.reflect.*;

class Test{
    int age = 20;

    Test(){

    }

    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args){
        try{
            Constructor<Test> con = Test.class.getDeclaredConstructor();
            Test t1 = con.newInstance();
            t1.setAge(100);
            System.out.println(t1.age);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
