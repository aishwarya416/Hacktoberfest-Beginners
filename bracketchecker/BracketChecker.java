package bracketchecker;

public class BracketChecker {
	
	private String input;
	private boolean validity;
	
	public BracketChecker(String in)
	{
		input = in;		
	}
	
	public void check()
	{
		int stackSize = input.length();
		StackX theStack1 = new StackX(stackSize);
		
		for(int j =0; j<input.length(); j++)
		{
			char ch = input.charAt(j);
			
			switch(ch)
			{
			case '{':
			case '[':
			case '(':
				theStack1.push(ch);
				break;
			case '}':
			case ']':
			case ')':
				if (!theStack1.isEmpty())
				{
					char chx = theStack1.pop();
					if ((ch=='}' && chx!='{') || (ch==']' && chx!='[') || (ch==')' && chx!='('))
						System.out.println("Error: "+ch+" at "+j);
					else
						validity = true;					
				}
					
				else
					System.out.println("Error: '"+ch+"' at "+(j+1));
				break;
			default:
				break;
				
			}
		}
		
		if(!theStack1.isEmpty())
			System.out.println("Error: missing right delimiter");
		if(validity==true)
			System.out.println("Valid");
	}

}

