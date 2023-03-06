import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        combSort(arr);
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void combSort(int[] arr) {
        int n = arr.length;
        int step = n;
        double factor = 1.247;
        boolean sorted = false;

        while (!sorted) {
            step = (int) Math.floor(step / factor);
            if (step <= 1) {
                step = 1;
                sorted = true;
            }
            int i = 0;
            while (i + step < n) {
                if (arr[i] > arr[i + step]) {
                    int temp = arr[i];
                    arr[i] = arr[i + step];
                    arr[i + step] = temp;
                    sorted = false;
                }
                i++;
            }
        }
    }
}
