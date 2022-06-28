import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDisplayImpl extends DisplayImpl {
    private String fileName;

    public FileDisplayImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void rawOpen() {
        System.out.println(fileName + " open");
    }

    @Override
    public void rawPrint() {
        try (FileReader reader = new FileReader(fileName)){
            System.out.println(reader.read());
        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void rawClose() {
        System.out.println(fileName + " is closed");
    }
}
