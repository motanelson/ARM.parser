
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ARMParserApp {
    static String source="";
    public static void main(String[] args) {
      try {
            source="";
            File myObj = new File("my.s");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                source=source+data+"\n";
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        
        
        
           
            
            try {
                // Cria um CharStream a partir da entrada do usuário
                CharStream charStream = CharStreams.fromString(source);

                // Inicializa o lexer e o parser com o CharStream
                ARMLexer lexer = new ARMLexer(charStream);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                ARMParser parser = new ARMParser(tokens);

                // Inicia o parser a partir da regra de entrada
                ParseTree tree = parser.program();

                // Exibe a árvore sintática
                System.out.println("Árvore Sintática: " + tree.toStringTree(parser));

            } catch (Exception e) {
                System.out.println("Erro ao analisar o código ARM: " + e.getMessage());
            }
        }
        
         
}
