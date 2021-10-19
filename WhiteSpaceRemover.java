import java.util.*;
//Add a word phrases and you can get rid of the whitespaces in that phrase
public class RemoveWhiteSpace {
    public static void main(String[] args) {
        System.out.println("Input a word phrase");
        Scanner scan=new Scanner(System.in)
                String str=scan.nextLine();
        //1st way
        String noSpaceStr = str.replaceAll("\\s", ""); // using built in method
        System.out.println(noSpaceStr);
        //2nd way
        char[] strArray = str.toCharArray();
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i < strArray.length; i++) {
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
                stringBuffer.append(strArray[i]);
            }
        }
        String noSpaceStr2 = stringBuffer.toString();
        System.out.println(noSpaceStr2);
    }
}