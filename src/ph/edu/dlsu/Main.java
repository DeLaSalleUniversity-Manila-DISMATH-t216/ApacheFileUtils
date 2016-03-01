package ph.edu.dlsu;

import org.apache.commons.io.FileUtils;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            File f1 = new File("toCopy.txt");
            File f2 = new File("Copy.txt");

            FileUtils.copyFile(f1, f2);

            System.out.println("File has been successfully copied!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
