public class LineComparison {
    public static void main(String[] args) {

        double lengthOfLine1 = 4, lengthOfLine2 = 4;
        System.out.println("Length of line1 = " + lengthOfLine1);
        System.out.println("Length of line2 = " + lengthOfLine2);

        Integer l1 = new Integer((int) lengthOfLine1);
        Integer l2 = new Integer((int) lengthOfLine1);

        if (lengthOfLine1 == lengthOfLine1) {
            System.out.println("line are equal");
        } else if (lengthOfLine2 == lengthOfLine1) {
            System.out.println("line are not equal");
        }
        String str_Sample = "a";
        System.out.println("Compare To 'a' b is : " + str_Sample.compareTo("b"));

        str_Sample = "b";
        System.out.println("Compare To 'b' a is : " + str_Sample.compareTo("a"));

        str_Sample = "b";
        System.out.println("Compare To 'b' b is : " + str_Sample.compareTo("b"));
    }
}


