import java.math.BigInteger;
class Solution {
    public static String multiply(String num1, String num2) {
        BigInteger no1 = new BigInteger(num1);
        BigInteger no2 = new BigInteger(num2);

        return no1.multiply(no2).toString();
    }

    public static void main(String[] args) {
        String num1 = "2";
        String num2 = "3";

        System.out.println(multiply(num1, num2));
    }
}
