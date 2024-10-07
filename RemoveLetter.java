package Recursion_On_Strings;

public class RemoveLetter {
    private static void letter(String space, String word,char comparator) {
        if(word.isEmpty()){
            System.out.println(space);
            return;
        }
        char ch=word.charAt(0);
        if(ch==comparator){
            letter(space,word.substring(1),comparator);
        }else {
            letter(space+ch,word.substring(1),comparator);
        }

    }

//    2. without extra String
    static String returnString(String str,char comparator){
    if(str.isEmpty()){
        return " ";
    }
    char ch=str.charAt(0);
    if(ch==comparator){
        return returnString(str.substring(1),comparator);
    }else {
        return ch+returnString(str.substring(1),comparator);
    }
    }


//    Skip a word between a String;
    static String  wholeWord(String str){
        if(str.isEmpty()){
            return" ";
        }
        if(str.startsWith("apple")){
            return wholeWord(str.substring(5));
        }else {
            return str.charAt(0)+wholeWord(str.substring(1));
        }
    }
//    SKIP APP BUT NOT WITH APPLE
    static String  NotwholeWord(String str){
        if(str.isEmpty()){
            return" ";
        }
        if(str.startsWith("app") &&!str.startsWith("apple")){
            return NotwholeWord(str.substring(3));
        }else {
            return str.charAt(0)+NotwholeWord(str.substring(1));
        }
    }
    public static void main(String[] args) {
        String word="baccad";
        letter(" ",word,'a');
        System.out.println(returnString("asddwassaadwa",'a'));
        String str="bcapplegs";
        System.out.println(wholeWord(str));
        String name="rrappleddapps";
        System.out.println(NotwholeWord(name));
    }


}
