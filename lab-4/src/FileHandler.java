import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
class CustomFileNotFoundException extends Exception {
    public CustomFileNotFoundException(String message) {
        super(message);
    }
}

public class FileHandler {
    private static final String LOG_FILE = "exception_log.txt";

    public static void handleException(Exception e) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            writer.println("Исключение произошло при " + LocalDateTime.now());
            writer.println("Тип исключения: " + e.getClass().getName());
            writer.println("Сообщение: " + e.getMessage());
            writer.println("Трассировка стека:");
            e.printStackTrace(writer);
            writer.println();
        } catch (IOException ex) {
            System.err.println("Ошибка записи в файл журнала: " + ex.getMessage());
        }
    }

    public static void readFile(String fileName) {
        try {
            File file = new File(fileName);
            FileReader reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            handleException(new CustomFileNotFoundException("Файл не найден: " + fileName));
        }
    }
}