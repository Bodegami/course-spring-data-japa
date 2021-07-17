package br.com.renato.springdata.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.renato.springdata.orm.Cargo;
import br.com.renato.springdata.repository.CargoRepository;

@Service
public class CrudCargoService {

	private final CargoRepository cargoRepository;
	
	public CrudCargoService(CargoRepository cargorepository) {
		this.cargoRepository = cargorepository;
	}
	
	
	public void inicial(Scanner sc) {
		salvar(sc);
	}
	
	private void salvar(Scanner sc) {
		System.out.println("Descricao do cargo:");
		String descricao = sc.next();
		Cargo cargo = new Cargo(descricao);
		cargoRepository.save(cargo);
		System.out.println("Salvo com sucesso!");
		
	}
	
	
}
