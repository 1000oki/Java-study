public class PassException extends Exception{
    public PassException() {
        super("비밀번호는 null 일 수 없습니다.");
    }    
}
