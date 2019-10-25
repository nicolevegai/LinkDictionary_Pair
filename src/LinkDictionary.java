import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


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
                    if (!sortList(line, dict)) {
                        dict.add(line);
                    }

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
    public static boolean sortList(String inputvalue, List list){
        boolean retorno = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toString().toLowerCase().compareTo(inputvalue.toLowerCase()) > 0) {
                if(i == 0){
                    list.add(0, inputvalue);
                }else{
                    list.add(i, inputvalue);
                }
                retorno = true;
                break;
            }
        }
        return retorno;
    }

}




