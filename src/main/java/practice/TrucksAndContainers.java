package practice;

import java.util.Scanner;

public class TrucksAndContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //получение количество коробок от пользователя
        int boxes = scanner.nextInt();

        int maxBoxesPerContainer = 27;
        int maxContainersInTruck = 12;
        int containers = 0;
        int trucks = 0;


        for(int i = 1; i <= boxes; i ++) {
            if (i%(maxBoxesPerContainer * maxContainersInTruck) == 1) {
                trucks ++;
                System.out.println("Грузовик: " + trucks);
            }
            if (i%maxBoxesPerContainer == 1) {
                containers++;
                System.out.println("\tКонтейнер: " + containers);
            }
            if (i%maxBoxesPerContainer != 0) {
                System.out.println("\t\tЯщик: " + i);
            } else {
                System.out.println("\t\tЯщик: " + 27 * containers);
            }
        }
        System.out.println("Необходимо:");
        System.out.println("грузовиков - " + trucks + " шт.");
        System.out.println("контейнеров - " + containers + " шт.");


        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
    }

}
