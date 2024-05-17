import java.lang.reflect.*;
public class NewInstance{

	private String Empname = "Muthu";

	NewInstance(){

	}

	public void setName(String Empname){
		this.Empname= Empname;
	}

	public static void main(String[] args) {
		try{
			Constructor<NewInstance> construct = NewInstance.class.getDeclaredConstructor();
			NewInstance t1 = construct.newInstance();
            System.out.println(t1.Empname);
			t1.setName("Welcome");
			System.out.println(t1.Empname);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

