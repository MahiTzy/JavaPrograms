public class trycatch {
    public static void ensurePositive(int n) {
        if (n < 0){
            throw new IllegalArgumentException("Bhkkkkk galt input ba mardawa");
        }
    }

    public static void main(String[] args){
        try {
            trycatch.ensurePositive(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
