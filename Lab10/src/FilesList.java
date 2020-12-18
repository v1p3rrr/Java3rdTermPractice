import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class FilesList {

    private ArrayList<File> files = new ArrayList<>();

    private File dir;

    public FilesList(String path) throws IOException {
        dir = new File (path);
        if (dir.exists()) {
            File[] listFiles = dir.listFiles();
            int i=0;
            if (listFiles != null) {
                Collections.addAll(files, listFiles);
            } else System.out.println("Provided directory is empty");

        } else throw new IOException();
    }

    @Override
    public String toString(){
        return files.toString();
    }

    public String firstFive() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; (files.size() >= 5) ? i < 5 : i < files.size(); i++) {
            sb.append(files.get(i) + "; ");
        }
        return sb.toString();
    }
}
