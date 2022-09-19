package serhii.codewars.cw20211105;

public class TimeFormatter {
    private static final String NOW= "now";
    private static final String SECOND = " second";
    private static final String MINUTE = " minute";
    private static final String HOUR = " hour";
    private static final String ENDING = "s ";

    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return NOW;
        }
        int second = seconds % 60;
        int minute = seconds / 60;
        int hour = seconds / 3600;
        if (hour != 0 && minute != 0) {
            return hour + HOUR + (hour > 1 ? ENDING : " ")
                    + minute + MINUTE + (minute > 1 ? ENDING : " ")
                    + second + SECOND + (second > 1 ? ENDING : "");
        }
        if (hour == 0 && minute != 0) {
            return minute + MINUTE + (minute > 1 ? ENDING : " ")
                    + second + SECOND + (second > 1 ? ENDING : "");
        }
        return second + SECOND + (second > 1 ? ENDING : "");
    }

    public static void main(String[] args) {
        System.out.println(TimeFormatter.formatDuration(1));
        System.out.println(TimeFormatter.formatDuration(62));
        System.out.println(TimeFormatter.formatDuration(3662));
        System.out.println(TimeFormatter.formatDuration(0));
        System.out.println(TimeFormatter.formatDuration(180));
    }
}