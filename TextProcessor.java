public class TextProcessor {

    // Метод для удаления всех букв и пробелов из текста.
    public static String removeLettersAndSpaces(String input) {
        // Регулярное выражение для поиска букв и пробелов
        return input.replaceAll("[\\p{L}\\s]", "");
    }

    // Метод для вывода результирующей строки
    public static void printResult(String result) {
        System.out.println("Результат: " + result);
    }
}