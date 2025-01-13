package Tasks;

public class stringReverse {

    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        stringReverse reverser = new stringReverse();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Original: " + new String(s));
        reverser.reverseString(s);
        System.out.println("Reverso: " + new String(s));
    }
}
