import java.rmi.Naming;
public class ServerRmi
{
    ServerRmi()
    {
        try
        {
          calc c=new calcimpl();
          Naming.rebind("rmi://localhost:1099/calcservice",c);
        }
        catch(Exception e)
        {
          System.out.println("Exception:"+e);
        }
        }
    public static void main(String arg[])
    {
      new ServerRmi();
    }
}
