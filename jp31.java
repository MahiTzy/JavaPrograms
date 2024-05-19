import java.util.*;

class jp31 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s;
        String w;

        int p = 0;
        System.out.println("Enter String");
        s = sc.nextLine();
        char vowels[] = {'a', 'e', 'i', 'o', 'u'};

        s = s + " ";
        int j = s.length();

        System.out.println("New String :");

        for (int i = 0; i < j; i++) {
            if (s.charAt(i) == ' ') {
                w = s.substring(p, i);
                if (Arrays.asList(vowels).contains(String.valueOf(w.charAt(0)).toLowerCase())) {
                    System.out.print(w + " ");
                }
                p = i + 1;
            }
        }
    }
}
