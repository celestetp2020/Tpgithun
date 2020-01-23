package farben;

import java.util.Scanner;

import cinq.TableCinq;

public class Main {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		TableCinq t = new TableCinq();
		Affiche a = new Affiche();		
		while(true)
		{
			String req =  s.nextLine();
			
			if (req.contentEquals("1"))
				t.main(args);
			else
				a.affiche();
				
		}

	}

}
