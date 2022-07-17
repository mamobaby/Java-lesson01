import java.util.Scanner;

class Lesson07 {
    public static void main(String[] args) {

        // 年齢を入力
        Scanner scanner = new Scanner(System.in);
        System.out.println("年齢を入力してください");
        // 型変換
        String n = scanner.next();
        int age = Integer.parseInt(n);

        // 成人かどうかを判別
        if(age >= 18) {
            System.out.println("adult");
        } else {
            System.out.println("child");
        } 
    }    
}
