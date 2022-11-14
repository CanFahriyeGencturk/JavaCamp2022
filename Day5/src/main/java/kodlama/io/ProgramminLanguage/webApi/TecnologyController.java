package kodlama.io.ProgramminLanguage.webApi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.ProgramminLanguage.business.absracts.TecnologyService;
import kodlama.io.ProgramminLanguage.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.ProgramminLanguage.business.request.CreateTecnologyRequest;
import kodlama.io.ProgramminLanguage.business.request.DeleteByNameTecnologyRequest;
import kodlama.io.ProgramminLanguage.business.request.UpdateTecnnologyRequest;
import kodlama.io.ProgramminLanguage.business.response.FindByNameTecnologyResponse;
import kodlama.io.ProgramminLanguage.business.response.GetAllTecnologyResponse;

@RestController
@RequestMapping("/api/tecnology")
public class TecnologyController {
	TecnologyService tecnologyService;

	public TecnologyController(TecnologyService tecnologyService) {
		super();
		this.tecnologyService = tecnologyService;
	}

	@GetMapping("/getall")
	public List<GetAllTecnologyResponse> getAll() throws Exception {
		return tecnologyService.getAll();
	}

	@PostMapping("/add")
	public void add(CreateTecnologyRequest createTecnologyRequest) throws Exception {
		this.tecnologyService.add(createTecnologyRequest);
	}

	@PostMapping("/delete")
	public void delete(DeleteByNameTecnologyRequest deleteByNameTecnologyRequest) throws Exception {
		this.tecnologyService.deleteByName(deleteByNameTecnologyRequest);
	}

	@PostMapping("/updateNameOfTecnology")
	public void updateTecnologyByName(FindByNameTecnologyResponse findByNameTecnologyResponse,
			UpdateTecnnologyRequest updateTecnnologyRequest) throws Exception {
		this.tecnologyService.updateNameOfTecnology(findByNameTecnologyResponse, updateTecnnologyRequest);
	}

	@PostMapping("/updateTypeOfLanguage")
	public void updateTecnologyTypeOfProgrammingLanguage(FindByNameTecnologyResponse findByNameTecnologyResponse,
			CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {
		this.tecnologyService.updateTecnologyTypeOfProgrammingLanguagey(findByNameTecnologyResponse,
				createProgrammingLanguageRequest);
	}

}
