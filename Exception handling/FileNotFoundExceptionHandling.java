import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadWrite {
    void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("xyz.txt");
    }

    void saveFile() throws FileNotFoundException {
        String txt = "xyhdhdn";
        FileOutputStream fos = new FileOutputStream("abc.txt");
    }
}

public class FileNotFoundExceptionHandling {
    public static void main(String[] args) {
        ReadWrite rw = new ReadWrite();
        System.out.println("Handling the exception!!");
        try {
            rw.readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            rw.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Normal Termination of program !!!");
    }
}
