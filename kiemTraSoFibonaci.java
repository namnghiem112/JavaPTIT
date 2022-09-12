
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author NghiêmNam
 */
public class kiemTraSoFibonaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	long[] a=new long[93];
	a[0]=0;
	a[1]=1;
	for(int i=2;i<93;i++)
	{
		a[i]=a[i-1]+a[i-2];
	}
	while(t!=0)
	{
		long n=sc.nextLong();
		boolean check=false;
		for(int i=0;i<93;i++)
		{
			if(a[i]==n)
			{
				check=true;
				break;
			}
		}
		if(check==true) System.out.println("YES");
		else System.out.println("NO");
		t--;
	}
    }
    
}
