public class Main {
	
	static Stack<Character> stack = new Stack<Character>(16);

	public static void main(String[] args) 
	{		
		System.out.println(isValid("[{{}]"));
	}
	
	
	private static char reverseBracket(char bracket)
	{
		switch (bracket)
		{
		case ('('):
			return ')';
		case ('['):
			return ']';
		case ('{'):
			return '}';
		case(')'):
			return '(';
		case(']'):
			return '[';
		case('}'):
			return '{';
		}
		return ' ';
	}
	
	private static boolean isLeftBracket(char bracket)
	{
		return (bracket == '(' || bracket == '[' || bracket == '{');
	}
	
	private static boolean isValid(String bracketString)
	{
		for (int i = 0; i < bracketString.length(); i++)
		{
			char currentBracket = bracketString.charAt(i);
			char rev = reverseBracket(currentBracket);
			
			if (isLeftBracket(currentBracket))
			{
				stack.Push(currentBracket);
			}
			
			else if (stack.isEmpty() || stack.Pop() != rev)
			{
				return false;
			}
		}
		
		return stack.isEmpty();
	}

}
