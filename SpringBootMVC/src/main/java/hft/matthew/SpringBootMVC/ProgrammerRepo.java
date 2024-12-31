package hft.matthew.SpringBootMVC;

import org.springframework.data.jpa.repository.JpaRepository;

import hft.matthew.SpringBootMVC.model.Programmer;

public interface ProgrammerRepo extends JpaRepository<Programmer,Integer>{

}
