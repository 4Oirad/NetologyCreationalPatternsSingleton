import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.print("Введите размер списка: ");
        int n = scanner.nextInt();

        System.out.print("Введите верхнюю границу для значений: ");
        int m = scanner.nextInt();

        logger.log("Создаём и наполняем список");

        List<Integer> list = new ArrayList<>();
        System.out.print("Вот случайный список: ");
        for (int i = 0; i < n; i++) {
            int r = random.nextInt(m);
            list.add(r);
            System.out.print(r + " ");
        }
        System.out.println();

        logger.log("Просим пользователя ввести входные данные для фильтрации");

        System.out.print("Введите порог для фильтра: ");
        int f = scanner.nextInt();
        //System.out.println();

        logger.log("Запускаем фильтрацию");

        Filter filter = new Filter(f);
        List<Integer> newList = filter.filterOut(list);

        logger.log("Выводим результат на экран");

        System.out.print("Отфильтрованный список: ");
        for (Integer i : newList) {
            System.out.print(i + " ");
        }
        System.out.println();

        logger.log("Завершаем программу");
    }
}