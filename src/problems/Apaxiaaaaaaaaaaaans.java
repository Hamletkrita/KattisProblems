import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apaxiaaaaaaaaaaaans {
    public static void main( String[] args ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine().toLowerCase();

        char[]namechar = name.toCharArray();
        String namestring = "";
        int index = 0;
        for (char a: namechar) {
            char ch = a;
            char b;
            if(index == namechar.length -1){
                b = ' ';
            }else{
                b = namechar[index+1];
            }

            if(a != b){
                namestring +=a;
            }


            index++;

        }
        System.out.println(namestring);


    }
}
