import java.util.ArrayList;
import java.util.List;
public class Testing {
	static void display(String s){
		System.out.println(s);
	}
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); 
        list.add("The :: operator");
        list.add("is present since Java 1.8");
        list.forEach(Testing::display); 
	}   
}


