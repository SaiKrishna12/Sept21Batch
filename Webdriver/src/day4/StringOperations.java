package day4;

public class StringOperations {

	public static void main(String[] args) {
		String x="Hello";
		String y="Hello";
		if(x.equals(y))
		{
			System.out.println("Strings are same ");
		}
		else
		{
			System.out.println("Strings are different");
		}
		
		String i="Hello";
		String j="hello";
		if(i.equalsIgnoreCase(j))
		{
			System.out.println("String are same");
		}
		else
		{
			System.out.println("Strings are different");
		}
		
		String a="Hello Friends";
		String b="Friends";
		if(a.contains(b))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		

	}

}
