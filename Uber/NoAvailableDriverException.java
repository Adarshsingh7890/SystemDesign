package Uber;


public class NoAvailableDriverException extends Exception {
    public NoAvailableDriverException(String message){
        super(message);
    }
}
