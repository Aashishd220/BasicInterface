//Class with main function
package Interface3;

public class VDemo {
public static void main(String args[])
{	
	Vehicle[] arr=new Vehicle[3];     //Array of Vehicle Interface
	arr[0]=new TwoWheeler();		 //assigning object to array
	arr[1]=new ThreeWheeler();
	arr[2]=new FourWheeler();
	
	for(int i=0;i<3;i++)
	{
		if(arr[i].getClass().getSimpleName().equals("ThreeWheeler"))  //using this we can compare.
		{
			arr[i].start();
		}
		
	}
}
}
