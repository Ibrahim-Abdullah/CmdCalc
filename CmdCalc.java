public class CmdCalc{

	public static void main (String args[]){
		String function  = args[0];

		double first_operand = Double.parseDouble(args[1]);
		double second_operand = Double.parseDouble(args[2]);

		switch(function){
			case "Add":
			case "add":
			case "addition":
				System.out.println(first_operand+second_operand);
				break;
			case "Subtract":
			case "Sub":
			case "Subtraction":
				System.out.println(first_operand - second_operand);
				break;
			case "multiply":
			case "Multiply":
			case "multiplication":
				System.out.println(first_operand * second_operand);
				break;
			case "divide":
			case "Divide":
			case "div":
			case "division":
				System.out.println(first_operand/second_operand);
		}
	}
}