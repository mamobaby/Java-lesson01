class Lesson03 {
    public static void main(String[] args) {
        String[] arr;
        arr = new String[3];

        arr[0]="sato";
        arr[1]="suzuki";
        arr[2]="takahashi";

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        String[] array ={"kato","yamamoto","nakabayashi"};

        array[2] ="tanaka";

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        String[][] name = {{"kato","seizi"},{"tanaka","yuta"}};

        System.out.println(name[0][1]);
    }
}
