

import java.util.*;

public class MinValues {


    static class Tower {
        int height;
        int index;
        public Tower(int height, int index) {
            this.height = height;
            this.index = index;
        }
    }

    public static class TowerComparator implements Comparator<Tower> {
        public int compare(Tower t1, Tower t2) {
            return t1.height - t2.height;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Tower[] towers = new Tower[n];
        for (int i = 0; i < n; i++) {
            towers[i] = new Tower(sc.nextInt(), i + 1);
        }
        List<String> lists = new ArrayList<>();
        Arrays.sort(towers, new TowerComparator());

        int count = 0;
        while (towers[n - 1].height - towers[0].height > 0 && k > 0) {
            towers[n - 1].height--;
            towers[0].height++;
            k--;
            count++;
            lists.add(towers[n - 1].index + " " + towers[0].index);
            Arrays.sort(towers, new TowerComparator());
        }
        System.out.println((towers[n - 1].height - towers[0].height) + " " + count);

        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
    }
}