public class LogLevels {
    
    public static String message(String logLine) {
        int twoPoints= logLine.indexOf(":");
        return logLine.substring(twoPoints+1).trim();
    }

    public static String logLevel(String logLine) {
        int firstIndex= logLine.indexOf("[");
        int lastIndex= logLine.indexOf("]");
        return logLine.substring(firstIndex+1, lastIndex).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) +")";
    }
}
