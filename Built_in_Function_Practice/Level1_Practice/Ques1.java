import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Ques1{
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata")); // IST
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles")); // PST

        System.out.println("GMT Time: " + gmt.format(formatter));
        System.out.println("IST Time: " + ist.format(formatter));
        System.out.println("PST Time: " + pst.format(formatter));
    }
}

