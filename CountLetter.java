class CountLetter {

    // Функция для подсчета букв 'е' в слове
    public static int countE(String word) {
        return (int) word.chars().filter(c -> c == 'е' || c == 'Е').count();
    }

    // Подсчет общего количества 'е' в тексте
    public static int countEInText(String text) {
        String[] words = text.split("\\s+"); // Разделение текста на слова
        int totalCount = 0; // Переменная для общего подсчета букв 'е'

        // Подсчет количества букв 'е' в каждом слове
        for (String word : words) {
            int count = countE(word);
            totalCount += count; // Добавляем количество 'е' этого слова к общему счетчику
            System.out.println("Слово: \"" + word + "\" содержит " + count + " буквы 'е'");
        }

        // Вывод общего количества букв 'е'
        System.out.println("Общее количество букв 'е': " + totalCount);
        return totalCount;
    }
}