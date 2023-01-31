package exercise;

import java.util.List;

// BEGIN
class App {
    public static List<String> freeDomain = List.of("gmail.com", "yandex.ru", "hotmail.com");

    public static long getCountOfFreeEmails(List<String> emails) {
        return emails.stream()
                .filter(email -> freeDomain.contains(email.split("@")[1]))
                .count();
    }
}
// END
