package Chapter7.Example7_7;

public class DangerException extends Exception {
    final String message = "超重";

    public String warnMess() {
        return message;
    }
}
