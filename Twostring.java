public class Twostring {
    
    String word1;
    String word2;

    public Twostring() {
        word1 = "I love you for ever";
        word2 = "Do you want to be my girl friend.";
    }
    public static void main(String[] args) {
        Twostring obj = new Twostring();
        int length1 = obj.word1.length();
        int length2 = obj.word2.length();
        System.out.println(length1);
        System.out.println(length2);
        System.out.println(Math.max(length1,length2));

    }
}