package udemy;

import java.util.Scanner;

public class TestaPensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Pensionato[] vect = new Pensionato[10];
		System.out.println("How many rooms will be rented? ");
		int N = sc.nextInt();
		
		for(int i = 0; i<N; i++)
		{
			System.out.println("Rent #"+(i+1)+":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			vect[i] = new Pensionato(name, email, room);
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i = 0; i<10; i++)
		{
			if(vect[i] != null)
			{
				System.out.println(vect[i].getRoom()+": "+vect[i].getName()+", "+vect[i].getEmail());
				
			}
		}
		
		
		
		
		
		sc.close();

	}

}
