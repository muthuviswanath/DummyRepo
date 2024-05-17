/*
 * 2 ABC
 * 3 DEF
 * 4 GHI
 * 5 JKL
 * 6 MNO
 * 7 PQRS
 * 8 TUV
 * 9 WXYZ
 * 
 * InputString 23
 * Output [AD, AE, AF, BD, BE, BF, CD, CE, CF]
 * 
 */
import java.util.*;
public class TelephoneCombination {
    
    public static List<String> combinations(String digits){
        List<String> result = new ArrayList<String>();
        if(digits.length() == 0){
            return result;
        }
        result.add("");
        String[] d = new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for(char i:digits.toCharArray()){
            String s = d[i-'2'];
            List<String> t = new ArrayList<>();
            for (String a: result){
                for(String b: s.split("")){
                    t.add(a+b);
                }
            }
            result = t;
        }
        return result;
    }

    public static void main(String[] args) {
        List result = combinations("23");
        System.out.println(result);
    }
}

