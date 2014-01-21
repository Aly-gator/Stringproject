package three.view;

import javax.swing.JOptionPane;

public class StringView
{
	public void displayRuntimeError()
	{
		int tempNumber;
		String tempString;
		
		JOptionPane.showMessageDialog(null,  "Let's crash the program!!!");
		tempString = JOptionPane.showInputDialog("Type in your favorite number!");
		tempNumber = Integer.parseInt(tempString);
		JOptionPane.showMessageDialog(null, "Your favorite number is " + tempNumber);
		
	}
	
	public void usePassedValue(String currentValue)
	{
		JOptionPane.showMessageDialog(null, "You typed in this earlier: " + currentValue);
	}

	public String sendParameterMethod()
	{
		//When using a method you must first assign it a value!
		String temp = null;
		
		JOptionPane.showMessageDialog(null, "Let's pass values!!!");
		temp = JOptionPane.showInputDialog("Type in your favorite words");
		
		return temp;
	}

	public void moreInteractive(String userName, String funnyPhrase)
	{
		JOptionPane.showMessageDialog(null,  "Hi there, we are going to use two parameters");
		JOptionPane.showMessageDialog(null, userName + "thinks that" + "/n" + funnyPhrase + "is funny");
	}
	
	public void testStringMethods()
	{
		//You will need to call your methods in here
		testSubstring();
	    testGetBytes();
	}
	
	private void testSubstring()
	{
		JOptionPane.showMessageDialog(null,  "Let's look at a substring" + "\n" + "or the part of a string");
		JOptionPane.showMessageDialog(null,  "The string I am using is stored in testString");
		String testString = "supercalifragilisticexpealidocious";
		JOptionPane.showMessageDialog(null, "Its value is:" + "\n" + testString); 
		String temp = testString.substring(7,12);
		JOptionPane.showMessageDialog(null, "here it is from the 7th letter: " + temp);
	}
	
	private void testGetBytes()
	{
		byte[] myBytes;
		String myString = "   gobble de gooke  ";
		myBytes = myString.getBytes();
		
	}
	
	private void length()
	{
		String squirttleString = " Meeeep ";
		int myLength = squirttleString.length();
	}
}












