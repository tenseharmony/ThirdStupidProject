package third.controller; /* where Runner is located */

public class Runner /* public: viable by all program */
{
	public static void main (String [] args)
	{
		Controller app = new Controller(); /* declares and initializes instances */
		app.start(); /* tells controller to call start method */
	}//end main
}//end class