public class PhoneValidator {
    // Регулярное выражение для проверки международного телефонного номера
    private static final String PHONE_PATTERN = "^[+]\\d{1,3}[- ]?\\d{4,14}$";

    public static boolean isValidPhone(String phone) {
        return phone.matches(PHONE_PATTERN);
    }
}


/*В данном регулярном выражении:
        ^ — начало строки.
        \\+ — символ +, обозначающий, что номер международный.
        - \\d{1,3} — от 1 до 3 цифр, представляющих код страны.
        - [- ]? — опциональный символ (может быть пробел или дефис).
        - \\d{4,14} — от 4 до 14 цифр, представляющих основную часть номера.
        - $ — конец строки.
         */