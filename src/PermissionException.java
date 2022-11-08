public class PermissionException extends RuntimeException {
    PermissionException(String massage){
        super(massage.length()!=0? massage: "~~~Nothing~~~");
    }

}
