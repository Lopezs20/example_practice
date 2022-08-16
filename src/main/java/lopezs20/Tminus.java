package lopezs20;

import java.io.FileReader;
import java.util.TimerTask;
import java.io.*;
public class Tminus extends TimerTask{
    public void run(){
        // System.out.println();
        // for (int j = 0; j < 10; j++){
        //     for(int i = 0; i < 20; i++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        try{
            FileReader read = new FileReader("Alpha-male-smile-text.txt");
            BufferedReader br = new BufferedReader(read);
            String line = "";
            // while((line = br.readLine()) != null){
            //     System.out.println(line);
            // }
            System.out.println();
            for (line = br.readLine(); line != null;){
                    
                }
                System.out.println();
            }catch(Exception exception){
            exception.printStackTrace(); 
        }
    }
}
