package lopezs20;
import java.io.*;
import java.util.*;

//import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

import jdk.nashorn.internal.parser.Token;
public class RandomPasswordGenerator implements PasswordMethods{
    private static int pointer = 0;

    private static String[] fileline;

    private static String line = "";

    private HashSet<String> pairValues = new HashSet<>();

    private HashSet<String> reel = new HashSet<>();

    private Timer scheduler = new Timer(true);

    public String initialize(){
        System.out.println("\n***********Welcome to Password Generator! ************ ");
		System.out.println("Type what you need your password for (e.g. Need a good password).");
        FileReader read;

        Scanner input = new Scanner(System.in);

        String answer = input.nextLine();

        input.close();

        try{

            BufferedWriter writer = 

                new BufferedWriter(

                        new FileWriter(

                            "wordDoc.txt"

                        ));

            writer.write(answer);

            writer.close();

        }catch(Exception e){

            e.printStackTrace();

        }

        
            try{
                String[] psw = new String[10];
                // Read the text document
                read = new FileReader("wordDoc.txt");

                BufferedReader br = new BufferedReader(read); 
                // (n+n)*n
                while((line = br.readLine()) != null){

                    StringTokenizer token = new StringTokenizer(line);

                    fileline = new String[token.countTokens()];

                    while(token.hasMoreTokens()){

                        fileline[pointer] = token.toString();
                        if(fileline[pointer] != null || !fileline[pointer].contains(" ")){
                            psw[pointer] = generate(fileline[pointer++]);
                        }
                    }

                }
            }catch (FileNotFoundException e){

                System.err.println(e);

                System.exit(1);

            }catch (IOException exception){

                System.err.println(exception);

                System.exit(1);

        }

    return new String ();

    }

    public String collectPairValues(String word, HashSet<String> values){
        String siphon = "";

        String keep = "";

        for (int i = 0; i < word.length(); i++){

            siphon += word.charAt(i); 

            if (siphon.length() == 1){

                keep += siphon.charAt(0);

                if(values.contains(siphon)){

                    siphon = "";

                    continue;

                }

                char[] c = siphon.toCharArray();

                keep = keep.replace(c[0], ' ');

                siphon = "";

            }
        }
        keep = keep.replace(" ", "");
        return keep;
    }   

    public String generate(String file){
        // TODO: Check for vowels and return a random number depending on occurence
        pairValues = initialize(pairValues);
        String hashd = collectPairValues(file, pairValues);
        Random randomizer = new Random();

        
        return hashd;
    }
    public HashSet<String> initialize(HashSet<String> hashValueSet){
        if(hashValueSet.isEmpty()){
            if(hashValueSet.add("A")){   

                if(hashValueSet.add("a")){  
                
                    if(hashValueSet.add("E")){  

                        if(hashValueSet.add("e")){

                            if(hashValueSet.add("I")){

                                if(hashValueSet.add("i")){

                                    if(hashValueSet.add("O")){

                                        if(hashValueSet.add("o")){

                                            if(hashValueSet.add("U")){

                                                if(hashValueSet.add("u")){
                                                    return hashValueSet;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(hashValueSet.toString());
        System.out.println("Unknown entities were inserted before "+
                         "\nstandard initialization could continue...");
        Boolean flag = hashValueSet.removeAll(hashValueSet);
        if (flag){
            initialize(hashValueSet);
            schedule();
            System.out.println("Re-entry...");
            System.out.println("Success!");
        }  
        return hashValueSet;
    }

    public void schedule(){
        scheduler.scheduleAtFixedRate(new Tminus(), 100, 5000);
        scheduler.cancel();
    }
    
    private 
    
}
