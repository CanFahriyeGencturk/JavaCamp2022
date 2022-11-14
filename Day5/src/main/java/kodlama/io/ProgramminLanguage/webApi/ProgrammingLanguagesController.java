package kodlama.io.ProgramminLanguage.webApi;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.ProgramminLanguage.business.absracts.ProgrammingLaguageServices;
import kodlama.io.ProgramminLanguage.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.ProgramminLanguage.business.request.DeleteByIdProgramminLanguageRequest;
import kodlama.io.ProgramminLanguage.business.request.UpdateProgrammingLanguageRequest;
import kodlama.io.ProgramminLanguage.business.response.FindByNameProgrammingLanguageResponse;
import kodlama.io.ProgramminLanguage.business.response.GetAllProgrammingLanguageResponse;

@RestController
@RequestMapping("/api/programmingLanguage")
public class ProgrammingLanguagesController {
	private ProgrammingLaguageServices laguageServices;

	public ProgrammingLanguagesController(ProgrammingLaguageServices laguageServices) {
		super();
		this.laguageServices = laguageServices;
	}
	
	@GetMapping("/getall")
	public List<GetAllProgrammingLanguageResponse> getAll(){
		return laguageServices.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateProgrammingLanguageRequest programmingLanguageRequest) throws Exception {
		this.laguageServices.add(programmingLanguageRequest);
	}
	
	@DeleteMapping("/delete")
	public void delete(CreateProgrammingLanguageRequest deleteProgrammingLanguageRequest) throws Exception {
		this.laguageServices.delete(deleteProgrammingLanguageRequest);
	}
	
	@DeleteMapping("/deletById")
	public void deleteById(DeleteByIdProgramminLanguageRequest deleteProgramminLanguageRequestById) throws Exception {
		this.laguageServices.deletById(deleteProgramminLanguageRequestById);
	}
	
	@PostMapping("/updateByName")
	public void updateProgrammmingLanguageName(FindByNameProgrammingLanguageResponse findName,UpdateProgrammingLanguageRequest newName) throws Exception {
		this.laguageServices.updateByName(findName, newName);
		
	}

}
