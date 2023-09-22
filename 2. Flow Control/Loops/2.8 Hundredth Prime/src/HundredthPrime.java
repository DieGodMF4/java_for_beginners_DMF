public class HundredthPrime {
    public static void main(String[] args) {
        int count = 1;
        int num_current = 1;
        while (count < 100) {
            num_current++;
            for (int div_current = num_current - 1; div_current > 1; div_current--) {
                if (num_current % div_current == 0) {
                    break;
                } else if (div_current == 2) {
                    count++;
                }
            }
        }
        System.out.println(num_current);
    }
}