public class LogLevels {
    
    public static String message(String logLine) {
        int colonIndex = logLine.indexOf(':');

        return logLine.substring(colonIndex + 1).trim();
    }

    public static String logLevel(String logLine) {
        int bracketIndex = logLine.indexOf(']');

        return logLine.substring(1, bracketIndex).toLowerCase();
    }

    public static String reformat(String logLine) {
    

        String msg = message(logLine);
        String level = logLevel(logLine);

        return msg + " (" + level + ")";

        
    }
}
