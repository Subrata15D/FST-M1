public class Activity2 {

    public static void main(String[] args) {
        
        int[] numbers = {10, 77, 10, 54, -11, 10};

        
        boolean result = checkSumOfTens(numbers);

        
        System.out.println("Result: " + result);
    }

    public static boolean checkSumOfTens(int[] array) {
        int sum = 0;

        
        for (int num : array) {
            
            if (num == 10) {
                sum += num;
            }
        }

        
        return sum == 30;
    }
}
