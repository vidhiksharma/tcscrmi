import java.rmi.Remote;
import java.rmi.RemoteException;
	public interface Calcu extends Remote
	{
		public long add(long a,long b)throws RemoteException;
		public long subtract(long a,long b)throws RemoteException;
		public long multiply(long a,long b)throws RemoteException;
		public long divide(long a,long b)throws RemoteException;
	}