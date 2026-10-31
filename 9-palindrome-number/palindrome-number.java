class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        if (x != 0 && x % 10 == 0) {
            return false;
        }

        int divisor = 1;
        int temp = x;

        while (temp >= 10) {
            temp = temp / 10;
            divisor = divisor * 10;
        }

        while (x > 0) {

            int left = x / divisor;
            int right = x % 10;

            if (left != right) {
                return false;
            }

            x = x % divisor;
            x = x / 10;

            divisor = divisor / 100;
        }

        return true;
    }
}