import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de votación");
        String fileName = ".\\SequentialFile\\Votos.txt";
        BufferedWriter writer = null;
        Scanner input = new Scanner(System.in);
        Methods myMethods = new Methods();
        try {
            String opc = "", name = "", cod = "", nroCandidato = "";
            // JOptionPane.showInputDialog("Ingrese el código del estudiante: ");
            writer = new BufferedWriter(new FileWriter(fileName));
            do {
                while (!(myMethods.validaTamCod(cod) && myMethods.validateNums(cod))) {
                    System.out.println("Ingrese el código del estudiante: ");
                    cod = input.nextLine();
                }
                while (!myMethods.validateName(name)) {
                    System.out.println("Ingrese el nombre del estudiante: ");
                    name = input.nextLine();
                }
                while (!myMethods.validateNroCandidato(nroCandidato)) {
                    System.out.println("Ingrese el número del candidato: ");
                    nroCandidato = input.nextLine();
                }
                writer.write(cod + "," + name + "," + nroCandidato);
                name = "";
                cod = "";
                nroCandidato = "";
                System.out.println("¿Desea ingresar más votantes? S=Sí, N = No");
                opc = input.nextLine();
                if (opc.toLowerCase().equals("s")) {
                    writer.newLine();
                }
            } while (opc.toLowerCase().equals("s"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (input != null) {
                input.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }
}
