import java.util.*;

class jp32 {
    public static boolean isPalindrome(String w, int j) {
        String rev = "";
        for (int i = j - 1; i >= 0; i--) {
            rev = rev + w.charAt(i);
        }
        return rev.equals(w);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s, w;
        System.out.println("Enter String");
        s = sc.nextLine();
        s = s + " ";
        int k = 0;
	int j = s.length();
	
        for (int i = 0; i < j; i++) {
            if (s.charAt(i) == ' ') {
                w = s.substring(k, i);
                int wl = w.length();
                if (isPalindrome(w, wl)) {
                    System.out.print(w + " ");
                }
                k = i + 1;
            }
        }
    }
}
