import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */
/*
 * 19. Lo shu Magic square The Lo Shu Magic Square is a grid with 3 rows and 3 columns, shown in Figure 7-31.
 *  The Lo Shu Magic Square has the following properties: •	The	grid	contains	the	numbers	1	through	9	exactly. 
 *  •	The	sum	of	each	row,	each	column,	and	each	diagonal	all	add	up	to	the	same	number.	
 *  This is shown in Figure 7-32. In a program you can simulate a magic square using a two-dimensional array.
 *   Write a method that accepts a two-dimensional array as an argument, and determines whether the array is a Lo Shu Magic Square. 
 *   Test the function in a program.

 */



/**
 * @author super
 * Date: 2018/15/11
 * Class: COSC-221
 */
public class Lo_Shu_Magic_Square {

	/**
	 * @param args
	 */
	static Scanner KeyInput=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		takearray();
		System.out.print("\n\nProgram restarted\n");
		main(args);
		}
		catch(InputMismatchException e)
		{
			System.out.print("Invalid Input program terminated");
		}
	}
	
	
	/*
	 * This method will take the input of the array from the user
	 */
	public static void takearray()
	{		
		int contents[][] = { {6, 1,8} , { 7, 5,3}, {2,9,4} };
	
		for(int i=0; i<contents.length;i++)
		{
				for(int j=0;j<contents[i].length;j++) {
				System.out.print("Enter the value of element "+ i+","+j+":");
				contents[i][j]=KeyInput.nextInt();
			}}
		
		
		printarray(contents);
		checkarray(contents);
		
	}

	/*
	 * 
	 * THis method will take 2d array as argument and print it.
	 * 
	 * @args contents[][]
	 */
	
	public static void printarray(int contents[][])
	{
		for(int i=0; i<contents.length;i++)
		{
			System.out.print("\n");
		
			

			for(int j=0;j<contents[i].length;j++) {
				System.out.print(contents[i][j]+"\t");
			}
		}
				
	}

/*
 * THis method will take the contents 2d array and check is that is the Lo shu square
 * @args contents[][]

 */
	public static void checkarray(int contents[][])
	{
		System.out.println("Testing the 2d array\n\n");
		int flag1=-1;
		int flag2=-1;
		int flag3=-1;
		int flag4=-1;	
								if((contents[0][0]==2)|| (contents[0][0]==4) ||(contents[0][0]==6)||(contents[0][0]==8))
						{
							flag1=1;
							
						}
								if((contents[0][2]==2)|| (contents[0][2]==4) ||(contents[0][2]==6)||(contents[0][2]==8))
						{
							flag2=1;
							
						}
								if((contents[2][0]==2)|| (contents[2][0]==4) ||(contents[2][0]==6)||(contents[2][0]==8))
						{
							flag3=1;
							
						}
								if((contents[2][2]==2)|| (contents[2][2]==4) ||(contents[2][2]==6)||(contents[2][2]==8))
						{
							flag4=1;
							
						}

		if((flag1==1) &&(flag2==1) &&(flag3==1) &&(flag4==1))
			System.out.print("This is a Lo Shu square");
		else
			System.out.print("THis is Not a Lo Shu square");
		
	}
	
}
