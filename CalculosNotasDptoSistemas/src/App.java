import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        String line[], registro;
        String filePath = "notas.txt";
        float media = 0, finalMark;
        try {
            reader = new BufferedReader(new FileReader(filePath));// ABRIR notas(E)
            writer = new BufferedWriter(new FileWriter("EP.txt"));// ABRIR EP(S)
            float sumatoriaNotas = 0, mayor = 0;
            int contEstudiantes = 0;
            while ((registro = reader.readLine()) != null) {
                line = registro.split(",");
                finalMark = Float.parseFloat(line[line.length - 1]);
                sumatoriaNotas = sumatoriaNotas + finalMark;
                contEstudiantes++;
                if (finalMark < 3.0) {
                    writer.write(registro);
                    writer.newLine();
                }
                if (mayor < finalMark)
                    mayor = finalMark;

            }
            media = sumatoriaNotas / contEstudiantes;
            System.out.println("El promedio de las notas es: " + media);
            System.out.println("La nota mayor es: " + mayor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            reader.close();
            writer.close();
        }

        try {
            reader = new BufferedReader(new FileReader(filePath));// ABRIR notas(E)
            while ((registro = reader.readLine()) != null) {
                line = registro.split(",");
                finalMark = Float.parseFloat(line[line.length - 1]);
                if (media < finalMark)
                    System.out.println(line[0] + "-" + line[1] + " está por encima de la media");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            reader.close();
        }
    }
}
