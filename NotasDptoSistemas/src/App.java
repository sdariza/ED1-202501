import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String filePath = ".\\notas.txt";
        BufferedWriter writer = null;
        Scanner input = new Scanner(System.in);
        String id, name, mark1, mark2, mark3, total, opc;
        try {// Trato de crear el archivo en la ruta filePath
            writer = new BufferedWriter(new FileWriter(filePath));// ABRIR notas(S)
            do {
                System.out.println("Ingrese la identificación del estudiante");
                id = input.nextLine();
                System.out.println("Ingrese el nombre del estudiante");
                name = input.nextLine();
                System.out.println("Ingrese la nota 1 ");
                mark1 = input.nextLine();
                System.out.println("Ingrese la nota 2 ");
                mark2 = input.nextLine();
                System.out.println("Ingrese la nota 3 ");
                mark3 = input.nextLine();
                total = Float.toString((float) ((float) Float.parseFloat(mark1) * 0.3 +
                        Float.parseFloat(mark2) * 0.3
                        + Float.parseFloat(mark3) * 0.4));
                writer.write(id + "," + name + "," + mark1 + "," + mark2 + "," + mark3 + ","
                        + total);
                writer.newLine();
                System.out.println("¿Desea añadir más estudiantes? S=Sí, N=No");
                opc = input.nextLine().toLowerCase();
                id = name = mark1 = mark2 = mark3 = total = null;
            } while (opc.equals("s"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            writer.close();
            input.close();
        }
        BufferedReader reader = null;
        String line[], registro;
        try {
            reader = new BufferedReader(new FileReader(filePath));// ABRIR notas(E)
            writer = new BufferedWriter(new FileWriter("EP.txt"));// ABRIR EP(S)
            while ((registro = reader.readLine()) != null) {
                line = registro.split(",");
                if (Float.parseFloat(line[line.length - 1]) < 3.0) {
                    writer.write(registro);
                    writer.newLine();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            reader.close();
            writer.close();
        }
    }
}
