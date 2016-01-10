import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
class Main
{
	public static void main(String[] args)
	{
		CalcPane calc = new CalcPane();

	}
}

class CalcPane implements ActionListener
{
	long input = 0L;
	Long[]placearray = {
			1L, 10L, 100L, 1000L, 10000L, 100000L, 1000000L
	};
	Long[] Curr_Digits = {0L, 0L, 0L, 0L, 0L, 0L, 0L};
	int numofdigits = 0;
	Long First_Operand = 0L;
	Long Second_Operand = 0L;
	String Operator = "";
	JFrame frame;
	JPanel panel;
	JButton Clear;
	JButton One;
	JButton Two;
	JButton Three;
	JButton Four;
	JButton Five;
	JButton Six;
	JButton Seven;
	JButton Eight;
	JButton Nine;
	JButton Zero;
	JButton Add;
	JButton Subtract;
	JButton Multiply;
	JButton Divide;
	JButton Equals;
	JTextField text;
	void reverse(Long[] data) {
	    for (int left = 0, right = data.length - 1; left < right; left++, right--) {
	        // swap the values at the left and right indices
	        Long temp = data[left];
	        data[left]  = data[right];
	        data[right] = temp;
	    }
	}
	Long Get_Current_Number()
	{
		Long temp2 = 0L;
		int count = 0;
		for(int i = 0; i < 7; i++)
		{
			if(Curr_Digits[i] != 10L)
			{
				count++;
			}
		}
		Long[] temp = new Long[count];
		for(int i = 0; i < 7; i++)
		{
			if(Curr_Digits[i] != 10L)
			{
				temp[i] = Curr_Digits[i];
			}
		}
		reverse(temp);
		for(int i = 0; i < count; i++)
		{
			temp2 += (temp[i] * placearray[i]);
		}
		System.out.println("returning temp2: " + temp2);
		return temp2;
	}
		
	CalcPane()
	{
		for(int i = 0; i < 7; i++)
		{
			Curr_Digits[i] = 10L;
		}
		frame = new JFrame("Life");
		//frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		frame.add(panel);
		Clear = new JButton("C");
		One = new JButton("1");
		Two = new JButton("2");
		Three = new JButton("3");
		Four = new JButton("4");
		Five = new JButton("5");
		Six = new JButton("6");
		Seven = new JButton("7");
		Eight = new JButton("8");
		Nine = new JButton("9");
		Zero = new JButton("0");
		Add = new JButton("+");
		Subtract = new JButton("-");
		Multiply = new JButton("*");
		Divide = new JButton("/");
		Equals = new JButton("=");
		panel.add(Clear);
		panel.add(One);
		panel.add(Two);
		panel.add(Three);
		panel.add(Four);
		panel.add(Five);
		panel.add(Six);
		panel.add(Seven);
		panel.add(Eight);
		panel.add(Nine);
		panel.add(Zero);
		panel.add(Add);
		panel.add(Subtract);
		panel.add(Multiply);
		panel.add(Divide);
		panel.add(Equals);
		text = new JTextField("", 15);
		panel.add(text);
		frame.setSize(500, 500);
		//frame.pack();
		Clear.setActionCommand("Clear");
		Clear.addActionListener(this);
		One.addActionListener(this);
		One.setActionCommand("1");
		Two.addActionListener(this);
		Two.setActionCommand("2");
		Three.addActionListener(this);
		Three.setActionCommand("3");
		Four.addActionListener(this);
		Four.setActionCommand("4");
		Five.addActionListener(this);
		Five.setActionCommand("5");
		Six.addActionListener(this);
		Six.setActionCommand("6");
		Seven.addActionListener(this);
		Seven.setActionCommand("7");
		Eight.addActionListener(this);
		Eight.setActionCommand("8");
		Nine.addActionListener(this);
		Nine.setActionCommand("9");
		Zero.addActionListener(this);
		Zero.setActionCommand("0");
		Add.addActionListener(this);
		Add.setActionCommand("+");
		Subtract.addActionListener(this);
		Subtract.setActionCommand("-");
		Multiply.addActionListener(this);
		Multiply.setActionCommand("*");
		Divide.addActionListener(this);
		Divide.setActionCommand("/");
		Equals.addActionListener(this);
		Equals.setActionCommand("Equals");
	}


	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand().equals("+"))
		{
			Operator = "+";
			input = 0L;
			numofdigits = 0;
			for(int i = 0; i < 7; i++)
			{
				Curr_Digits[i] = 10L;
			}
			System.out.println("Add key was pressed");
		}
		else if(e.getActionCommand().equals("-"))
		{
			Operator = "-";
			input = 0L;
			numofdigits = 0;
			for(int i = 0; i < 7; i++)
			{
				Curr_Digits[i] = 10L;
			}
			System.out.println("Subtract key was pressed");
		}
		else if(e.getActionCommand().equals("*"))
		{
			Operator = "*";
			input = 0L;
			numofdigits = 0;
			for(int i = 0; i < 7; i++)
			{
				Curr_Digits[i] = 10L;
			}
			System.out.println("Multiply key was pressed");
		}
		else if(e.getActionCommand().equals("/"))
		{
			Operator = "/";
			input = 0L;
			numofdigits = 0;
			for(int i = 0; i < 7; i++)
			{
				Curr_Digits[i] = 10L;
			}
			System.out.println("Divide key was pressed");
		}
		else if(e.getActionCommand().equals("1"))
		{
			Curr_Digits[numofdigits] = 1L;
			if(Operator.equals(""))
			{
				First_Operand += (Get_Current_Number());
			}
			else
			{
				Second_Operand += (Get_Current_Number());
			}
			System.out.println("1 key was pressed");
			input += 1L * placearray[numofdigits];
			text.setText(String.valueOf(Get_Current_Number()));
			System.out.println("Internal first operand: " + First_Operand + " Internal Second Operand: " + Second_Operand);
			numofdigits++;
			
		}
		else if(e.getActionCommand().equals("2"))
		{
			Curr_Digits[numofdigits] = 2L;
			if(Operator.equals(""))
				{
				First_Operand = (Get_Current_Number());
				}
			else
				{
				Second_Operand = (Get_Current_Number());
				}
			System.out.println("2 key was pressed");
			input += 2L * placearray[numofdigits];
			text.setText(String.valueOf(Get_Current_Number()));
			System.out.println("Internal first operand: " + First_Operand + " Internal Second Operand: " + Second_Operand);
			numofdigits++;
		}
		else if(e.getActionCommand().equals("3"))
		{
			Curr_Digits[numofdigits] = 3L;
			if(Operator.equals(""))
				{
					First_Operand = (Get_Current_Number());
				}
			else
				{
					Second_Operand = (Get_Current_Number());
				}
			input += 3L * placearray[numofdigits];
			System.out.println("3 key was pressed");
			text.setText(String.valueOf(Get_Current_Number()));
			System.out.println("Internal first operand: " + First_Operand + " Internal Second Operand: " + Second_Operand);
			numofdigits++;
			
		}
		else if(e.getActionCommand().equals("4"))
		{
			Curr_Digits[numofdigits] = 4L;
			if(Operator.equals(""))
				{
					First_Operand = (Get_Current_Number());
				}
			else
				{
					Second_Operand = (Get_Current_Number());
				}
			System.out.println("4 key was pressed");
			input += 4L * placearray[numofdigits];
			text.setText(String.valueOf(Get_Current_Number()));
			System.out.println("Internal first operand: " + First_Operand + " Internal Second Operand: " + Second_Operand);
			numofdigits++;
		}
		else if(e.getActionCommand().equals("5"))
		{
			Curr_Digits[numofdigits] = 5L;
			if(Operator.equals(""))
				{
					First_Operand = (Get_Current_Number());
				}
			else
				{
					Second_Operand = (Get_Current_Number());
				}
			System.out.println("5 key was pressed");
			input += 5L * placearray[numofdigits];
			text.setText(String.valueOf(Get_Current_Number()));
			System.out.println("Internal first operand: " + First_Operand + " Internal Second Operand: " + Second_Operand);
			numofdigits++;
		}
		else if(e.getActionCommand().equals("6"))
		{
			Curr_Digits[numofdigits] = 6L;
			if(Operator.equals(""))
				{
					First_Operand = (Get_Current_Number());
				}
			else
				{
					Second_Operand = (Get_Current_Number());
				}
			System.out.println("6 key was pressed");
			input += 6L * placearray[numofdigits];
			text.setText(String.valueOf(Get_Current_Number()));
			System.out.println("Internal first operand: " + First_Operand + " Internal Second Operand: " + Second_Operand);
			numofdigits++;
		}
		else if(e.getActionCommand().equals("7"))
		{
			Curr_Digits[numofdigits] = 7L;
			if(Operator.equals(""))
				{
					First_Operand = (Get_Current_Number());
				}
			else
				{
					Second_Operand = (Get_Current_Number());
				}
			System.out.println("7 key was pressed");
			input += 7L * placearray[numofdigits];
			text.setText(String.valueOf(Get_Current_Number()));
			System.out.println("Internal first operand: " + First_Operand + " Internal Second Operand: " + Second_Operand);
			numofdigits++;
		}
		else if(e.getActionCommand().equals("8"))
		{
			Curr_Digits[numofdigits] = 8L;
			if(Operator.equals(""))
				{
					First_Operand = (Get_Current_Number());
				}
			else
				{
					Second_Operand = (Get_Current_Number());
				}
			System.out.println("8 key was pressed");
			input += 8L * placearray[numofdigits];
			text.setText(String.valueOf(Get_Current_Number()));
			System.out.println("Internal first operand: " + First_Operand + " Internal Second Operand: " + Second_Operand);
			numofdigits++;
		}
		else if(e.getActionCommand().equals("9"))
		{
			Curr_Digits[numofdigits] = 9L;
			if(Operator.equals(""))
				{
					First_Operand = (Get_Current_Number());
				}
			else
				{
					Second_Operand = (Get_Current_Number());
				}
			System.out.println("9 key was pressed");
			input += 9L * placearray[numofdigits];
			text.setText(String.valueOf(Get_Current_Number()));
			System.out.println("Internal first operand: " + First_Operand + " Internal Second Operand: " + Second_Operand);
			numofdigits++;
		}
		else if(e.getActionCommand().equals("0"))
		{
			Curr_Digits[numofdigits] = 0L;
			if(Operator.equals(""))
				{
					First_Operand = (Get_Current_Number());
				}
			else
				{
					Second_Operand = (Get_Current_Number());
				}
			System.out.println("0 key was pressed");
			input += 0L * placearray[numofdigits];
			text.setText(String.valueOf(Get_Current_Number()));
			System.out.println("Internal first operand: " + First_Operand + " Internal Second Operand: " + Second_Operand);
			numofdigits++;
		}
		else if(e.getActionCommand().equals("Clear"))
		{
			text.setText("");
			Operator = "";
			First_Operand = 0L;
			Second_Operand = 0L;
			input = 0L;
			numofdigits = 0;
			for(int i = 0; i < 7; i++)
			{
				Curr_Digits[i] = 10L;
			}
			System.out.println("Clear key was pressed");
		}
		else if(e.getActionCommand().equals("Equals"))
		{
			long result =  0L;
			if(Operator.equals("+"))
			{
				result = (long)(First_Operand) + (long)(Second_Operand);
				System.out.println(result);
				String s = String.valueOf(result);
				//String result3 = new StringBuilder(s).reverse().toString();
				//result2 = result3;
				text.setText(s);
			}
			else if(Operator.equals("-"))
			{
				result = (long)(First_Operand) - (long)(Second_Operand);
				System.out.println(result);
				String s = String.valueOf(result);
				//String result3 = new StringBuilder(s).reverse().toString();
				//result2 = result3;
				text.setText(s);
			}
			else if(Operator.equals("*"))
			{
				result = (long)(First_Operand) * (long)(Second_Operand);
				System.out.println(result);
				String s = String.valueOf(result);
				//String result3 = new StringBuilder(s).reverse().toString();
				//result2 = result3;
				text.setText(s);
			}
			else if(Operator.equals("/"))
			{
				
				float floatresult = (float)(First_Operand) / (float)(Second_Operand);
				System.out.println(floatresult);
				String s = String.valueOf(floatresult);
				//String result3 = new StringBuilder(s).reverse().toString();
				//result2 = result3;
				text.setText(s);
			}
			Operator = "";
			First_Operand = 0L;
			Second_Operand = 0L;
			numofdigits = 0;
			for(int i = 0; i < 7; i++)
			{
				Curr_Digits[i] = 10L;
			}
			System.out.println("Equals key was pressed");
		}
	}
}
