public class Main {
    public static void main(String[] args) {
        // Задаем текст для подсчета букв 'е'
        String text = "В тексте, который вы видите на этом изображении, посчитайте количество букв ‘е’ в каждом слове.";
        // Вызов метода для подсчета 'е' в тексте
        CountLetter.countEInText(text);

        System.out.println("-------------------------------------------------");

        // Проверяем валидность телефонных номеров
        String[] testPhones = {
                "+123-4567890123",
                "+12 3456789012",
                "+1234567890",
                "1234567890", // Неверный
                "+1-234-567-8901", // Неверный
                "+12345678", // Неверный, слишком короткий
                "+12345678901234" // Неверный, слишком длинный
        };

        for (String phone : testPhones) {
            boolean isValid = PhoneValidator.isValidPhone(phone);
            System.out.println(phone + " : " + (isValid ? "Валидный" : "Невалидный"));
        }

        System.out.println("-------------------------------------------------");

        // Удаляем буквы и пробелы из примера текста
        String sampleText = "Привет, это пример текста 123!";
        String result = removeLettersAndSpaces(sampleText);
        // Выводим результат
        printResult(result); // Ожидаемый вывод: "123!"
    }

    public static String removeLettersAndSpaces(String text) {
        return text.replaceAll("[\\p{L}\\s]", ""); // Удаляет буквы и пробелы
    }

    public static void printResult(String result) {
        System.out.println(result); // Вывод результата
    }
}