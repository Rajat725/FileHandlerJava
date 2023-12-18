package tests;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class File2Op {

    public static void createFile(String path) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File Created at " + path);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void writeToFile1(String path) throws IOException {
        File file = new File(path);
        if (file.exists()) {
            FileWriter fileWriter = new FileWriter(file);
            try {
                fileWriter.write("Heloo Welcome To Java");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            fileWriter.close();

        }
        Scanner scanner=new Scanner(file);
        while (scanner.hasNextLine())
        {
            System.out.println(scanner.nextLine());
        }


    }

    public static void writeToFile2(String path) throws IOException {
        File file = new File(path);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        if (file.exists()) {
            try {
                fileOutputStream.write("Helo Babay 2".getBytes());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            fileOutputStream.close();
        }
        FileInputStream fileInputStream=new FileInputStream(path);
        System.out.println(new String(fileInputStream.readAllBytes()));
    }

    public static void writeToFile3(String path) {
        File file = new File(path);
        if (file.exists()) {
            try {
                Files.write(Path.of(path), "HEHEHEEHEHe".getBytes());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        List<String> list = null;
        try {
            list = Files.readAllLines(Path.of(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String string:list) {
            System.out.println(string);
        }

    }

    public static void del(String path) {
        File file = new File(path);
        try {
            Files.delete(Path.of(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static void main(String[] args) throws IOException {
        String path=System.getProperty("user.dir")+"//Data//AX.txt";
        createFile(path);
        writeToFile1(path);
        writeToFile2(path);
        writeToFile3(path);
        del(path);


    }
}
