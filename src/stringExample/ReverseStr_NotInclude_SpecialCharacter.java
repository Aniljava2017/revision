package stringExample;

public class ReverseStr_NotInclude_SpecialCharacter {
    public static void main(String[] args) {
        String str = "I @A~m @Ani!l K$um@r";
        String resultStr=" ";
        for (int i = str.length()-1; i >= 0; i--){
            if (str.charAt(i)> 64 && str.charAt(i)<=122){
                resultStr= resultStr + str.charAt(i);
            }
        }
        System.out.println("String after removing special characters : "+resultStr);
    }
}
