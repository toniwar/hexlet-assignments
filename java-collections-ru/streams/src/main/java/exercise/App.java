package exercise;

import java.util.List;

// BEGIN
class App {
    public static int getCountOfFreeEmails(List<String> emails) {
        var freeDomains = List.of("gmail.com", "yandex.ru", "hotmail.com");
        return emails.stream()
                .map(email -> {
                    var split = email.split("@");
                    return split[1];
                })
                .reduce(0, (sum, email) -> {
            for (var domain : freeDomains) {
                if (email.contains(domain)) {
                    sum++;
                }
            }
            return sum;
        }, Integer::sum);
    }
}
// END
