package excecoes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestaErro2 {

	public static void main(String[] args) {
		
		try {
			new FileInputStream("C://ARQUIVO.TXT");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
