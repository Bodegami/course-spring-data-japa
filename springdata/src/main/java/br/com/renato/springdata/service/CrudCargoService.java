package br.com.renato.springdata.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.renato.springdata.orm.Cargo;
import br.com.renato.springdata.repository.CargoRepository;

@Service
public class CrudCargoService {

	private Boolean system = true;
	private final CargoRepository cargoRepository;

	public CrudCargoService(CargoRepository cargorepository) {
		this.cargoRepository = cargorepository;
	}

	public void inicial(Scanner sc) {
		
		while(system) {
			System.out.println("Qual acao de cargo deseja executar:");
			System.out.println("0 - Sair");
			System.out.println("1 - Salvar");
			System.out.println("2 - Atualizar");
			
			int action = sc.nextInt();
			switch (action) {
			case 1:
				salvar(sc);
				break;
			case 2:
				atualizar(sc);
				break;
			default:
				system = false;
				break;
			}
			
			
		}
		
		
	}

	private void salvar(Scanner sc) {
		System.out.println("Descricao do cargo:");
		String descricao = sc.next();
		Cargo cargo = new Cargo(descricao);
		cargoRepository.save(cargo);
		System.out.println("Cargo salvo com sucesso!");
	}

	private void atualizar(Scanner sc) {
		System.out.println("Id");
		int id = sc.nextInt();
		System.out.println("Descricao do cargo:");
		String descricao = sc.next();
		Cargo cargo = new Cargo();
		cargo.setId(id);
		cargo.setDescricao(descricao);
		cargoRepository.save(cargo);
		System.out.println("Cargo atualizado com sucesso!");
	}

}
