package tests;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File4Op {

    public static void main(String[] args) throws IOException, InterruptedException {


        //Write a CSV File
        String path=System.getProperty("user.dir")+"\\Data\\test.csv";
        FileWriter fileWriter=new FileWriter(path);
        fileWriter.append("Name,Age,Salary \n");
        fileWriter.append("Rajat,25,20000 \n");
        fileWriter.append("Rajat,25,20000 \n");
        fileWriter.append("Rajat,25,20000 \n");
        fileWriter.append("Rajat,25,20000 \n");
        fileWriter.append("Rajat,25,20000 \n");
        fileWriter.close();
       // Thread.sleep(3000);
        //Read From File
        Scanner scanner=new Scanner(new File(path));
        scanner.useDelimiter(",");
        while (scanner.hasNext())
        {
            System.out.print(scanner.next()+"  ");
        }
        scanner.close();





    }
}
