package request;

public class HttpRequest {

    private static String BASE_URL;
    private static boolean IS_CONSOLE_LOG;

    public static void setHttpRequestConfiguration(String baseUrl, boolean isConsoleLogUsed) {
        BASE_URL = baseUrl;
        IS_CONSOLE_LOG = isConsoleLogUsed;
    }


}
