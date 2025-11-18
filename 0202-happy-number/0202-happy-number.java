class Solution {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        slow = square(n);
        fast = square(square(n));

        while(slow != fast){
            slow = square(slow);
            fast = square(square(fast));
        }

        return slow == 1;
    }

    int square(int n) {
        int ans = 0;
        while (n != 0) {
            int dig = n % 10;
            ans += dig * dig;
            n = n / 10;
        }
        return ans;
    }

}