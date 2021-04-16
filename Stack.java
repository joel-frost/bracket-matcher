@SuppressWarnings("unchecked")
public class Stack<T> {
	
	private int maxSize;
	private int top = 0;
	private Object[] data;
	
	public Stack(int size)
	{
		maxSize = size;
		data = new Object[maxSize];
	}
	public boolean isFull()
	{
		return top == maxSize;
	}
	
	public boolean isEmpty()
	{
		return top == 0;
	}
	
	public void Push (T value)
	{
		if (!isFull())
		{
			data[top++] = value;
		}
	}
	
	
	public T Pop()
	{
		if (!isEmpty())
		{
			return (T) data[--top];
		}
		
		return null;
	}
	
	public T Peek()
	{
		return (T) data[top - 1];
	}
	
	public int Count()
	{
		return top;
	}
	
}
