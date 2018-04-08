import back_end.Data;

import java.util.List;

import static utils.IOUtils.*;


public class Main {
    public static void main(String[] args) {

        Data data = new Data();


        List<String> list = readFile("files/input.txt");
        writeToFile(data.combineLists(list), "files/output.txt");


    }


}


