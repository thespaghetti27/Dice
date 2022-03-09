import java.util.*;
class puzzle{
	public static String grid = ("■ ■ ■ ■ ■\r\n" +
			"■ ■ ■ ■ ■\r\n" +
			"■ ■ ■ ■ ■\r\n" +
			"■ ■ ■ ■ ■\r\n" +
			"■ ■ ■ ■ ■\r\n");
	public static Random randomNumber = new Random();
	public static Scanner input = new Scanner(System.in);
	public static char dot = '□';
	public static void main(String[] args) {
		boolean run = true;
		while(run == true) {
			grid = ("■ ■ ■ ■ ■\r\n" +
					"■ ■ ■ ■ ■\r\n" +
					"■ ■ ■ ■ ■\r\n" +
					"■ ■ ■ ■ ■\r\n" +
					"■ ■ ■ ■ ■\r\n");
			input.nextLine();
			int dice = randomNumber.nextInt(6);
			switch(dice) {
			case 0:
				one();
				break;
			case 1:
				two();
				break;
			case 2:
				three();
				break;
			case 3:
				four();
				break;
			case 4:
				five();
				break;
			case 5:
				six();
				break;
			}
		}
	}
	public static void one() {
		char[] gridPoints = grid.toCharArray();
		gridPoints[26] = dot;
		grid = String.valueOf(gridPoints);
		System.out.println();
		System.out.print(grid);
	}
	public static void two() {
		char[] gridPoints = grid.toCharArray();
		gridPoints[13] = dot;
		gridPoints[39] = dot;
		grid = String.valueOf(gridPoints);
		System.out.println();
		System.out.print(grid);
	}
	public static void three() {
		char[] gridPoints = grid.toCharArray();
		gridPoints[13] = dot;
		gridPoints[26] = dot;
		gridPoints[39] = dot;
		grid = String.valueOf(gridPoints);
		System.out.println();
		System.out.print(grid);
	}
	public static void four() {
		char[] gridPoints = grid.toCharArray();
		gridPoints[13] = dot;
		gridPoints[17] = dot;
		gridPoints[35] = dot;
		gridPoints[39] = dot;
		grid = String.valueOf(gridPoints);
		System.out.println();
		System.out.print(grid);
	}
	public static void five() {
		char[] gridPoints = grid.toCharArray();
		gridPoints[13] = dot;
		gridPoints[17] = dot;
		gridPoints[26] = dot;
		gridPoints[35] = dot;
		gridPoints[39] = dot;
		grid = String.valueOf(gridPoints);
		System.out.println();
		System.out.print(grid);
	}
	public static void six() {
		char[] gridPoints = grid.toCharArray();
		gridPoints[13] = dot;
		gridPoints[17] = dot;
		gridPoints[24] = dot;
		gridPoints[28] = dot;
		gridPoints[35] = dot;
		gridPoints[39] = dot;
		grid = String.valueOf(gridPoints);
		System.out.println();
		System.out.print(grid);
	}
}