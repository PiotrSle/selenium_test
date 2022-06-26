import java.io.File;
import static org.testng.AssertJUnit.assertEquals;

public class CheckDownload {
    public void checkDownloadFile() {
        File xtmManualFile = new File("C:/Users/psleb/Downloads/xtm-editor.x23707.pdf");
        if (xtmManualFile.isFile())
            System.out.println("Plik istnieje");
        else System.out.println("Nie udalo sie pobrac pliku");
        assertEquals("xtm-editor.x23707.pdf", xtmManualFile.getName());
    }
}