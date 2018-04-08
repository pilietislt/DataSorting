package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOUtils {

    public static List<String> readFile(String fileName){

        File file = new File(fileName);
        Scanner input = null;

        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> list = new ArrayList<String>();

        while (input.hasNextLine()) {
            list.add(input.nextLine());
        }
        return list;
    }
    public static  void writeToFile(List<String> str, String fileName){
        try ( BufferedWriter bw =
                      new BufferedWriter (new FileWriter(fileName)) )
        {
            for (String line : str) {
                bw.write (line + "\n");
            }

            bw.close ();

        } catch (IOException e) {
            e.printStackTrace ();
        }

    }
}
