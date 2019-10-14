package third.controller;

import third.View.PopUp;

import java.util.ArrayList;

public class Controller
{
	private third.View.PopUp view;
	
	
	public int x;
	public String g;
	
	public void start()
	{
		view = new PopUp();
		workWithLoops();
		makingLists();
	}
	
	
	private void workWithLoops()
	{
		//step one: define and initialize variable.
		boolean isFinished = false;
		int counter = 0;
		
		//step 2: test var
		while (!isFinished)
		{
			view.displayMessage("hello");
			String words = view.askQuestion("what is answer?");
			view.displayMessage(words);
			
			//step 3: do stuff
			System.out.println("this is a loop  " + counter);
			counter += 1;
			
			if (counter > 3)
			{
				//step 4: update the var
				isFinished = true;
			}	
		}
		
		System.out.println("counter: " + counter);
		
		while (counter > 0)
		{
			System.out.println(counter);
			counter--;
		}
		
		for (int position = 0; position < 100; position += 1)
		{
			System.out.println("position: " + position);
		}
		
		for (int spot = 100; spot >= 0; spot -= 1)
		{
				System.out.println("spot: " + spot);
		}
		
		int special = 1;
		do
		{
			System.out.println("special" + special);
			special--;
		}while (special > 0);
	}
	
	
	private void sampleIfBlocks()
	{
		
	}
	
	
	private void makingLists()
	{
		ArrayList<String> userInput = new ArrayList<String>();
		
		String input = view.askQuestion("type in program");
		
		while (!input.equalsIgnoreCase("done"))
		{
			userInput.add(input);
			input = view.askQuestion("Typoe in more or 'done' to stop");
		}
		
	}
	
}
