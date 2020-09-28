import java.util.Scanner;

public class SapXepChen {
    public static void demoSapXepChen(int[] list) {
        for (int i = 1; i < list.length; i++) {

            int Elememt = list[i];
            int k;

            for (k = i - 1; k >=0 && list[k] > Elememt ; k--) {

                list[k + 1] = list[k];
            }

            list[k + 1] = Elememt;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " value: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        demoSapXepChen(list);
        System.out.println("sort: ");
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + "\t");

        }
    }
}
