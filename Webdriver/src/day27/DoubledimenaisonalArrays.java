package day27;

public class DoubledimenaisonalArrays {

	public static void main(String[] args) {
		Object [][] str=new Object[2][3];
		str[0][0]="selenium";
		str[0][1]=10;
		str[0][2]=19.45;
		
		str[1][0]=true;
		str[1][1]="Jmeter";
		str[1][2]="silk";
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length;j++)
			{
				System.out.print(str[i][j]+"   ");
			}
			System.out.println();
		}

	}

}
