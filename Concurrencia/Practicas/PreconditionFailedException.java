
public class PreconditionFailedException extends RuntimeException {

  private static final long serialVersionUID = -2282419737036152870L;
  
  public PreconditionFailedException(String msg){
    super(msg);
   }

  public PreconditionFailedException(){
    super("The PRE did NOT hold");
   }

}
