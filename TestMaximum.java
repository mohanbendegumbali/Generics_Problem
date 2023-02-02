public class TestMaximum {
    int maxNum;

    void getMaximumNumber(Integer num1, Integer num2, Integer num3) {
        maxNum = num1; 
        if (num2.compareTo(maxNum) > 0) {
            System.out.println(num2 + "  is greater");
        } else if (num3.compareTo(maxNum) > 0) {
            System.out.println(num3 + "  is greater");
        } else {
            System.out.println(num1 + " is greater");
        }
    }

    public static void main(String[] args) {

        TestMaximum testMaximum = new TestMaximum();
        testMaximum.getMaximumNumber(16, 21, 14);
    }
}