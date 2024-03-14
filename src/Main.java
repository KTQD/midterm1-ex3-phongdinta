import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "src/input.txt";
        String outputFilePath = "src/output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("Nha Trang", "Vũng Tàu");
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("Thay thế và ghi vào file output.txt thành công.");
        }
        catch (IOException e) {
            System.err.println("Xảy ra lỗi khi đọc hoặc ghi file: " + e.getMessage());
        }
    }
}
