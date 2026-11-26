import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class Algo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = sc.nextLine().split("");

        int x = 0;
        int y = 0;

        Set<String> direction = new HashSet<>();
        direction.add("0, 0");

        for(int i = 0; i < n; i++) {
            switch(s[i]) {
                case "R":
                    x++;
                    break;
                case "L":
                    x--;
                    break;
                case "U":
                    y++;
                    break;
                case "D":
                    y--;
                    break;
            }

            String cur = x + ", " + y;

            if (direction.contains(cur)) {
                System.out.println("Yes");
                return;
            } else {
                direction.add(cur);
            }
        }
        System.out.println("No");
    }
}

