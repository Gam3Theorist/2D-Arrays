import java.util.Scanner;

public class ticTacToe
	{
		static Scanner userIntInput = new Scanner(System.in);
		static Scanner userStringInput = new Scanner(System.in);

		public static void main(String[] args)
			{
				challenge1();
				challenge2();
				challenge3();
			}

		public static void challenge1()
			{
				int numbers[][] = new int[3][2];
					{
						numbers[0][0] = 10;
						numbers[0][1] = 20;
						numbers[1][0] = 30;
						numbers[1][1] = 40;
						numbers[2][0] = 50;
						numbers[2][1] = 60;
					}
				System.out.println(numbers[2][1]);
			}

		public static void challenge2()
			{
				String name[][] = new String[4][3];
					{
						for (int row = 0; row < name.length; row += 1)
							{
								System.out.println(" ");
								for (int colmn = 0; colmn < name[0].length; colmn = colmn + 1)
									{

										name[row][colmn] = "MHS";
										System.out.print(name[row][colmn] + " ");
									}

							}

					}
			}

		public static void challenge3()
			{
				int number2 = 1;
				int number[][] = new int[3][3];
					{
						for (int row = 0; row < number.length; row += 1)
							{
								System.out.println(" ");
									{
										for (int colmn = 0; colmn < number[0].length; colmn = colmn + 1)
											{
												number[row][colmn] = number2;
												number2++;
												System.out.print(number[row][colmn] + " ");
											}
									}
							}
					}
			}
	}