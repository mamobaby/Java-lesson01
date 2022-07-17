import javax.print.event.PrintJobListener;

class Lesson06 {
    public static void main(String[] args) {
        int x = 8;
        int y = 3;
        int z = 10;
        z++;

        System.out.println(x >=5 && x <= 10);
        System.out.println(y >=5 && y <= 10);

        System.out.println(x == 3 || y == 3);
        System.out.println(x == 1 || y == 1);

        System.out.println(x += 10);
        System.out.println(x += y);

        System.out.println(z);
    }
}
