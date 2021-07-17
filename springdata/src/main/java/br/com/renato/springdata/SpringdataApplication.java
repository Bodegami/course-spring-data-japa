package br.com.renato.springdata;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.renato.springdata.orm.Cargo;
import br.com.renato.springdata.repository.CargoRepository;
import br.com.renato.springdata.service.CrudCargoService;

@SpringBootApplication
public class SpringdataApplication implements CommandLineRunner {

	private final CrudCargoService cargoService;

	private boolean system = true;

	public SpringdataApplication(CrudCargoService cargoService) {
		this.cargoService = cargoService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringdataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);

		while (system) {
			System.out.println("Qual acao voce quer executar?");
			System.out.println("0 - Sair");
			System.out.println("1 - Cargo");

			int action = sc.nextInt();
			if (action == 1) {
				cargoService.inicial(sc);
			} else {
				system = false;
			}
		}
	}
}
