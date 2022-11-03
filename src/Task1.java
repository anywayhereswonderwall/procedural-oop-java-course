import java.util.Arrays;
import java.util.Scanner;  // Import the Scanner class

class Task1 {
    public static void main(String[] args) {
        System.out.println(solve());
    }
    public static boolean solve() {
        Scanner in = new Scanner(System.in);
        int[] nums = {0, 0, 0};
        nums[0] = in.nextInt();
        nums[1] = in.nextInt();
        nums[2] = in.nextInt();
        Arrays.sort(nums);
        if (nums[0] * nums[0] + nums[1] * nums[1] == nums[2] * nums[2]) {
            return true;
        }
        return false;
    }
}
