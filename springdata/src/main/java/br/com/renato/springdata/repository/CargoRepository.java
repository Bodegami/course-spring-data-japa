package br.com.renato.springdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.renato.springdata.orm.Cargo;

@Repository
public interface CargoRepository extends CrudRepository<Cargo, Integer>{

}
