import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;


import static java.lang.System.out;

public class LinkDictionary {

    public static void main(String args[]) {

        BufferedReader reader;
        LinkedList<String> dict = new LinkedList<String>();
        try {
            reader = new BufferedReader(new FileReader("/Users/nicolevega/Desktop/prueba.txt"));//
            String line = reader.readLine();
            while (line != null) {
                if (dict.size() == 0) {
                    dict.add(line);
                } else {
                    //ordenar

                }
                line = reader.readLine();
            }
            reader.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter("sorteddict.txt"));
            for (int i = 0; i < dict.size(); i++) {
                out.println(dict.get(i));
                writer.write(dict.get(i).toString());
                writer.newLine();
            }

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}




