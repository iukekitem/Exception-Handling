public class HotAndHumidException extends Exception{
    public HotAndHumidException(String message){
        super(message);
    }
}

class TooHotException extends HotAndHumidException {
    public TooHotException(String message) {
        super(message);
    }
}

class TooHumidException extends HotAndHumidException {
    public TooHumidException(String message) {
        super(message);
    }
}
