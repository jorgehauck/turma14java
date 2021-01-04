package udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestEmployee {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Quantos funcionários serão registrados?");
		int n = sc.nextInt();
		System.out.println();
		for(int i = 1; i<=n; i++)
		{
			System.out.println("Funcionário #"+i);
			System.out.println("Id:");
			int id = sc.nextInt();
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Salario: ");
			double salario = sc.nextDouble();
			list.add(new Employee(id, nome, salario));
		}
			System.out.println();
			System.out.print("Insira a id do funcionário que terá aumento de salário:");
			int id = sc.nextInt();
			
			
			Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			
			if(emp == null)
			{
				System.out.println("Este id não existe!");
			}
			else
			{
				System.out.println("Insira a porcentagem: ");
				double percentage = sc.nextDouble();
				emp.increaseSalary(percentage);
			}
			
			System.out.println("Lista de Funcionários: ");
			for(Employee i : list)
			{
				System.out.println(i);
			}
			
		sc.close();
	}
}
