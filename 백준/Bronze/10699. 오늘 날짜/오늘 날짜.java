import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){
        LocalDateTime now = LocalDateTime.now();
        String formatted = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(formatted);
    }
}