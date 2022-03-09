public class PassWordException extends Exception{
    public PassWordException() {
        super("비밀번호는 null 일 수 없습니다.");
    }    
}
