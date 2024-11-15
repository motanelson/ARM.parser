
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.Scanner;

public class ARMParserApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código ARM (ou pressione Enter para sair):");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("Encerrando o programa.");
                break;
            }

            try {
                // Cria um CharStream a partir da entrada do usuário
                CharStream charStream = CharStreams.fromString(input);

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
        
        scanner.close();
    }
}
