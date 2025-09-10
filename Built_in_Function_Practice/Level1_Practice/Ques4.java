import java.time.LocalDate;

public class Ques4 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2025, 9, 1);
        LocalDate date2 = LocalDate.of(2025, 12, 25);

        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is before " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        } else if (date1.isEqual(date2)) {
            System.out.println(date1 + " is the same as " + date2);
        }
    }
}
