package aed.recursiveUtils;

public class PersonalTester {

    public static void main(String[] args) {

        String bal = "[{]}";
        Recursion R = new Recursion();
        boolean b = R.isBalanced(bal);
        System.out.printf("isBalanced(\"%s\") => %b\n ", bal, b);

    }

}
