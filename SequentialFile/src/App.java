import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.Buffer;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String fileName = "Votos.txt";
        BufferedWriter writer = null;
        Scanner input = new Scanner(System.in);
        Methods myMethods = new Methods();
        try {
            String opc = "", name = "", cod = "", nroCandidato = "";
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
                System.out.println("¿Desea ingresar más votantes? S=Sí, N = No");
                opc = input.nextLine();
                if (opc.equals("S")) {
                    writer.newLine();
                }
            } while (opc.equals("S"));
            input.close();
            writer.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
