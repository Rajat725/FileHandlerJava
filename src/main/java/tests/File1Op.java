package tests;

import java.io.File;

public class File1Op {

    public static void createFolder(String path)
    {
        File file=new File(path);
        if (!file.exists())
        {
            file.mkdir();
            System.out.println("Folder Created "+path);
        }

    }

    public static void checkFolderexists(String path)
    {
        File file=new File(path);
        System.out.println(file.exists());
    }

    public static void renameFile(String old,String New)
    {
        File file=new File(old);
        if(file.exists())
        {
            file.renameTo(new File(New));
        }
        System.out.println("New File Name is "+file.getName());
    }

    public static void delete(String path)
    {
        File file=new File(path);
        if(file.exists())
        {
            for (File file1:file.listFiles()) {
                file1.delete();
            }
            file.delete();
        }
        System.out.println(file.exists());
    }


    public static void main(String[] args) throws InterruptedException {


        String path=System.getProperty("user.dir")+"//Data//AX";
        String pathNew=System.getProperty("user.dir")+"//Data//AXML";
        createFolder(path);
        Thread.sleep(3000);
        checkFolderexists(path);
        renameFile(path,pathNew);
        Thread.sleep(3000);
        delete(pathNew);

    }
}
