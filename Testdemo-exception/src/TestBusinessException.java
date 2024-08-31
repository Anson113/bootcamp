public class TestBusinessException extends Exception {
private int code;

public int getcode() {
    return this.code;
}

public TestBusinessException (ErrorCode errorCode) {
    super(errorCode.getMessage());
    this.code = errorCode.getCode();
}


public String codeWithMessage() {
    return "Errpr: " + this.code + " " + this.getMessage();
}


























}
