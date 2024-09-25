import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamAverageExample {
    public static void main(String[] args) {
        // Создаем список чисел
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40, 45);

        // Используем Stream API для фильтрации четных чисел и вычисления их среднего
        OptionalDouble average = numbers.stream()
                .filter(num -> num % 2 == 0) // Фильтруем только четные числа
                .mapToInt(num -> num)        // Преобразуем в IntStream
                .average();                  // Вычисляем среднее

        // Проверяем, есть ли результат, и выводим его
        if (average.isPresent()) {
            System.out.println("Среднее значение четных чисел: " + average.getAsDouble());
        } else {
            System.out.println("Четных чисел в списке нет.");
        }
    }
}
