package kodlama.io.ProgramminLanguage.business.absracts;

import java.util.List;

import kodlama.io.ProgramminLanguage.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.ProgramminLanguage.business.request.CreateTecnologyRequest;
import kodlama.io.ProgramminLanguage.business.request.DeleteByNameTecnologyRequest;
import kodlama.io.ProgramminLanguage.business.request.UpdateTecnnologyRequest;
import kodlama.io.ProgramminLanguage.business.response.FindByNameTecnologyResponse;
import kodlama.io.ProgramminLanguage.business.response.GetAllTecnologyResponse;
import kodlama.io.ProgramminLanguage.entities.concrete.Tecnology;

public interface TecnologyService {

	List<GetAllTecnologyResponse> getAll();

	void add(CreateTecnologyRequest createTecnologyRequest) throws Exception;

	Tecnology findTecnologyByName(FindByNameTecnologyResponse findByNameTecnologyResponse);

	void deleteByName(DeleteByNameTecnologyRequest deleteByNameTecnologyRequest) throws Exception;

	public void updateNameOfTecnology(FindByNameTecnologyResponse findByNameTecnologyResponse,
			UpdateTecnnologyRequest updateTecnnologyRequest) throws Exception;
	
	public void updateTecnologyTypeOfProgrammingLanguagey(FindByNameTecnologyResponse findByNameTecnologyResponse,
			CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception;
}
