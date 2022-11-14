package kodlama.io.ProgramminLanguage.dataAccess.abtracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.ProgramminLanguage.entities.concrete.ProgrammingLanguage;

public interface ProgrammingLanguageReporsitory extends JpaRepository<ProgrammingLanguage, Integer> {

}
