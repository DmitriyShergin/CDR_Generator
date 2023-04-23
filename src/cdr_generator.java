import java.util.Random;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class cdr_generator {
    public static String randomDate() {
        Random random = new Random();
        int year = random.nextInt(101) + 2000;
        int month = random.nextInt(12);
        // календарь с заданным годом и месяцем
        Calendar calendar = new GregorianCalendar(year, month, 1);
        // максимально дней в месяце
        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        int day = random.nextInt(maxDay) + 1;
        int hour = random.nextInt(24);
        int minute = random.nextInt(60);
        int second = random.nextInt(60);

        String date = String.format("%04d%02d%02d%02d%02d%02d", year, month+1, day, hour, minute, second);

        return date;
    }

    public static long PhoneNumber() {
        Random random = new Random();
        long number = 7;
        for (int i = 0; i < 10; i++) {
            int digit = random.nextInt(10);
            number = (number << 1) + (number << 3) + digit;
        }
        return number;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(2) + 1;
        long num2 = PhoneNumber();
        String num3 = randomDate();
        String num4 = randomDate();
        System.out.printf("%02d,%d,%s,%s%n", num1, num2, num3, num4);
    }
}
