import java.io.File;
import java.util.LinkedList;

/**
 * Created by r3v3nan7 on 20.01.17.
 */
public class IOManager {

    public static class OutputWriter{

        public static void writeMessage(String message)
        {
            System.out.print(message);
        }

        public static void writeMessageOnNewLine(String message)
        {
            System.out.println(message);
        }


        public static void writeEmptyLine()
        {
            System.out.println();
        }


        public static void displayException(String message)
        {
            System.out.print(message);
        }


        public static void traverseDirectory(String path){
            LinkedList<File> subFolders = new LinkedList<File>();
            File root = new File(path);

            subFolders.add(root);


            while (subFolders.size() != 0){
                File currentFolder = subFolders.removeFirst();

                if(currentFolder.listFiles() != null){
                    for (File file : currentFolder.listFiles()) {
                        if(file.isDirectory()){

                        }
                    }
                }


                System.out.println(currentFolder.toString());

            }

        }


    }


}
