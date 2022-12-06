package ifmg.pfront.chatbot;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatbotApplication 
	implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ChatbotApplication.class, args);
	}

	@Override
	public void run(String[] args){
		System.out.println("Parâmetros informados: " + Arrays.asList(args));
		try {
			new LoopLinhaComando().run();
		} catch (IOException e) {
			System.out.println("FALHA NA EXECUÇÃO: ");
			e.printStackTrace();
		}
	}

}
