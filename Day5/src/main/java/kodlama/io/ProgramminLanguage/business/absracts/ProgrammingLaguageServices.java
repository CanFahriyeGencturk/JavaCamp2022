package kodlama.io.ProgramminLanguage.business.absracts;

import java.util.List;

import kodlama.io.ProgramminLanguage.business.request.DeleteByIdProgramminLanguageRequest;
import kodlama.io.ProgramminLanguage.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.ProgramminLanguage.business.request.UpdateProgrammingLanguageRequest;
import kodlama.io.ProgramminLanguage.business.response.FindByNameProgrammingLanguageResponse;
import kodlama.io.ProgramminLanguage.business.response.GetAllProgrammingLanguageResponse;
import kodlama.io.ProgramminLanguage.entities.concrete.ProgrammingLanguage;

public interface ProgrammingLaguageServices {

	List<GetAllProgrammingLanguageResponse> getAll();

	ProgrammingLanguage findByName(String findName);

	void add(CreateProgrammingLanguageRequest programmingLanguageRequest) throws Exception;

	void delete(CreateProgrammingLanguageRequest deleteProgrammingLanguageRequest) throws Exception;

	void deletById(DeleteByIdProgramminLanguageRequest deleteProgramminLanguageRequestById) throws Exception;

	void updateByName(FindByNameProgrammingLanguageResponse findName, UpdateProgrammingLanguageRequest newName) throws Exception;

}
