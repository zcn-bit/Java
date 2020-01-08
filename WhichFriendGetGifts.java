public class WhichFriendGetGifts {

    public int LastRemaining_Solution(int n, int m) {
        if (n == 0)
            return -1;
        boolean[] selected = new boolean[n];
        for (int i = 0; i < n; i++) {
            selected[i] = false;
        }
        int count = 0;
        int p = 0;
        int k = 0;
        while (count < n-1) {
            p %= n;
            if (selected[p]) {
                p++;
                continue;
            }
            if (k == m-1) {
                selected[p] = true;
                k = 0;
                p++;
                count++;
            } else {
                k++;
                p++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (!selected[i]) {
                return i;
            }
        }
        return -1;
    }
}
