package kodlama.io.ProgramminLanguage.dataAccess.abtracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.ProgramminLanguage.entities.concrete.Tecnology;

public interface TecnologyReporsitory extends JpaRepository<Tecnology, Integer>{

}
