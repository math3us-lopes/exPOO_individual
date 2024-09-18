package Sistema;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import model.Cliente;
import model.Produto;
import model.Venda;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    private static final String PRODUTOS_FILE = "temp/produtos.txt";
    private static final String CLIENTES_FILE = "temp/clientes.txt";
    private static final String VENDAS_FILE = "temp/vendas.txt";

    public static void main(String[] args) {
        configurarLogger();
        Scanner scanner = new Scanner(System.in);

        List<Produto> produtos = lerProdutos(PRODUTOS_FILE);
        List<Cliente> clientes = lerClientes(CLIENTES_FILE);
        List<Venda> vendas = lerVendas(VENDAS_FILE);

        int opcao;
        do {
            exibirMenuPrincipal();
            opcao = lerOpcao(scanner, 1, 4);

            switch (opcao) {
                case 1:
                    menuRelatorioTela(scanner, produtos, clientes, vendas);
                    break;
                case 2:
                    menuRelatorioTela(scanner, produtos, clientes, vendas);
                    break;
                case 3:
                    realizarCompra(scanner, clientes, produtos, vendas);
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    logger.info("Sistema encerrado pelo usuário.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    private static void realizarCompra(Scanner scanner, List<Cliente> clientes, List<Produto> produtos,
			List<Venda> vendas) {
		// TODO Auto-generated method stub
		
	}

	private static void menuRelatorioTela(Scanner scanner, List<Produto> produtos, List<Cliente> clientes,
			List<Venda> vendas) {
		// TODO Auto-generated method stub
		
	}

	private static List<Venda> lerVendas(String vendasFile) {
		// TODO Auto-generated method stub
		return null;
	}

	private static List<Cliente> lerClientes(String clientesFile) {
		// TODO Auto-generated method stub
		return null;
	}

	private static List<Produto> lerProdutos(String produtosFile) {
		// TODO Auto-generated method stub
		return null;
	}

	// Configuração do Logger
    private static void configurarLogger() {
        Logger rootLogger = Logger.getLogger("");
        Handler[] handlers = rootLogger.getHandlers();
        if (handlers.length > 0 && handlers[0] instanceof ConsoleHandler) {
            rootLogger.removeHandler(handlers[0]);
        }

        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
        logger.setLevel(Level.ALL);
        logger.setUseParentHandlers(false);

        try {
            FileHandler fileHandler = new FileHandler("konoha.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            System.out.println("Erro ao configurar o logger: " + e.getMessage());
        }
    }

    // Exibir o menu principal
    private static void exibirMenuPrincipal() {
        logger.info("\n=== Mercearia Konoha ===");
        logger.info("1. Relatório na Tela");
        logger.info("2. Relatório Impresso");
        logger.info("3. Realizar Compra");
        logger.info("4. Sair");
        logger.info("Escolha uma opção: ");
    }

    // Método para ler a opção do usuário e validar a entrada
    private static int lerOpcao(Scanner scanner, int min, int max) {
        int opcao = -1;
        try {
            opcao = Integer.parseInt(scanner.nextLine());
            if (opcao < min || opcao > max) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            System.out.println("Opção inválida. Escolha entre " + min + " e " + max + ".");
        }
        return opcao;
    }
}
