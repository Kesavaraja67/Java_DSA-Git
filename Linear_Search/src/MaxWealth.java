public class MaxWealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts){
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            //when you start a new col, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;

            }
            // now we have the sum of accounts of person
            //check with overall ans
            if (ans < sum) {
                ans = sum;
            }

        }
        return ans;

    }
}
