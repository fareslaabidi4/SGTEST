import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import service.MachineManagement;
import service.MachineReader;
import service.ReadDataFile;

public class App {	
    
    
    protected static List<String> listResultats;

	public static void main(String... args) throws  IOException {
		
			File file = new File("C:/Users/fares/Desktop/Test.txt");
			App instance = new App();
			listResultats = instance.lancerTraitementsMachines(file);
            System.out.println(listResultats);
		
	}


	private List<String> lancerTraitementsMachines(File fichier)
			throws  IOException {
	
			MachineReader reader = new MachineReader();
			Scanner scanner = new Scanner(fichier);
			try {
				traiterPremiereLigne(reader, scanner);
				return traiterLignesSuivantes(reader, scanner);
			} finally {
				if (scanner != null) {
					scanner.close();
				}
			}
		}
	


	protected void traiterPremiereLigne(MachineReader reader, Scanner scanner)
			 {
		if (scanner.hasNext()) {
			reader.setSurface(scanner.nextLine());
		}
		
	}


	private List<String> traiterLignesSuivantes(MachineReader reader,
			Scanner scanner) {
		List<String> listePositions = new ArrayList<String>();
		while (scanner.hasNext()) {
			// lecture de la positon initiale de la machine
			reader.setMachine(scanner.nextLine());

			if (scanner.hasNext()) {
				reader.setInstructions(scanner.nextLine());
				listePositions.add(readerEtLancerTraitement(reader));
			} 
		}
		return listePositions;
	}


	private String readerEtLancerTraitement(MachineReader reader)
			 {
		
			MachineManagement traitement = new MachineManagement();
			traitement.setSurface(ReadDataFile
					.formaterLigneSurface(reader.getSurface()));
			traitement.setPositionMachine(ReadDataFile
					.formaterLigneMachine(reader.getMachine()));
			traitement.setListeInstruction(ReadDataFile
					.formaterLigneInstruction(reader.getInstructions()));
			traitement.executerInstructions();
			
			return traitement.toString();
		
	}


}
