package Task_3;

public class Main {
    public static void main(String[] args) {
        String yourString = "abcdrwxyz";//Your string value
        method1(yourString);
    }
    private static void method1(String s) {
        char[] chars = s.toCharArray();
        char[] earlyLetters = new char[]{'a', 'b', 'c', 'd'};
        char[] lateLetters = new char[]{'w', 'x', 'y', 'z'};
        for (int i = 0; i<chars.length; i++){
            if(charInArray(chars[i], earlyLetters)) {
                System.out.println("early letter found");
            } else if (charInArray(chars[i], lateLetters)){
                try {
                    method2(chars[i]);
                } catch (RuntimeException re){
                    System.out.println(re.getMessage());
                }
            } else {
                System.out.println("Found " + chars[i]);
            }
        }
    }
    private static boolean charInArray(char c, char[] chars) {
        for (int i = 0; i<chars.length; i++){
            if (c==chars[i]) {
                return true;
            }
        }
        return false;
    }
    private static void method2(char c) {
        throw new RuntimeException("This is a " + c);
    }
}