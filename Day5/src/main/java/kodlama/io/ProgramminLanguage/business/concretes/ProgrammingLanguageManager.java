package kodlama.io.ProgramminLanguage.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.ProgramminLanguage.business.absracts.ProgrammingLaguageServices;
import kodlama.io.ProgramminLanguage.business.request.DeleteByIdProgramminLanguageRequest;
import kodlama.io.ProgramminLanguage.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.ProgramminLanguage.business.request.UpdateProgrammingLanguageRequest;
import kodlama.io.ProgramminLanguage.business.response.FindByNameProgrammingLanguageResponse;
import kodlama.io.ProgramminLanguage.business.response.GetAllProgrammingLanguageResponse;
import kodlama.io.ProgramminLanguage.dataAccess.abtracts.ProgrammingLanguageReporsitory;
import kodlama.io.ProgramminLanguage.entities.concrete.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLaguageServices {

	private ProgrammingLanguageReporsitory programmingLanguageReporsitory;

	public ProgrammingLanguageManager(ProgrammingLanguageReporsitory programmingLanguageReporsitory) {
		super();
		this.programmingLanguageReporsitory = programmingLanguageReporsitory;
	}

	@Override
	public List<GetAllProgrammingLanguageResponse> getAll() {

		List<ProgrammingLanguage> programmingLanguages = programmingLanguageReporsitory.findAll();

		List<GetAllProgrammingLanguageResponse> programmingLanguageResponses = new ArrayList<GetAllProgrammingLanguageResponse>();

		for (ProgrammingLanguage language : programmingLanguages) {
			GetAllProgrammingLanguageResponse response = new GetAllProgrammingLanguageResponse();
			response.setId(language.getId());
			response.setName(language.getName());
			programmingLanguageResponses.add(response);

		}
		return programmingLanguageResponses;
	}

	@Override
	public ProgrammingLanguage findByName(String findName) {
		List<ProgrammingLanguage> programmingLanguages = programmingLanguageReporsitory.findAll();
		for (ProgrammingLanguage language : programmingLanguages) {
			if (language.getName().toLowerCase().equals(findName.toLowerCase())) {
				return language;
			}
		}
		return null;
	}

	@Override
	public void add(CreateProgrammingLanguageRequest programmingLanguageRequest) throws Exception {

		ProgrammingLanguage languageControl = findByName(programmingLanguageRequest.getName());
		if (languageControl == null) {
			ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
			programmingLanguage.setName(programmingLanguageRequest.getName());
			this.programmingLanguageReporsitory.save(programmingLanguage);
		} else {
			throw new Exception("Veri tabanında " + programmingLanguageRequest.getName()
					+ " isimli bir programlama dili bulunmaktadır");
		}

	}

	@Override
	public void delete(CreateProgrammingLanguageRequest deleteProgrammingLanguageRequest) throws Exception {

		ProgrammingLanguage language = this.findByName(deleteProgrammingLanguageRequest.getName());
		if (!language.equals(null)) {
			this.programmingLanguageReporsitory.deleteById(language.getId());
		} else {
			throw new Exception("Veritabınında " + deleteProgrammingLanguageRequest.getName()
					+ " isimli bir programlama dili zaten bulunmamktadır.  ");
		}
	}

	@Override
	public void deletById(DeleteByIdProgramminLanguageRequest deleteProgramminLanguageRequestById) throws Exception {
		try {
			this.programmingLanguageReporsitory.deleteById(deleteProgramminLanguageRequestById.getId());

		} catch (Exception e) {
			System.err.println(deleteProgramminLanguageRequestById.getId() + " nolu id'ye sahip veri bulunmamaktadır.");
			throw new Exception(
					deleteProgramminLanguageRequestById.getId() + " nolu id'ye sahip veri bulunmamaktadır.");
		}

	}

	public void updateByName(FindByNameProgrammingLanguageResponse findName, UpdateProgrammingLanguageRequest newName)
			throws Exception {

		ProgrammingLanguage language = this.findByName(findName.getProgrammingLanguageName());
		try {
			if (!language.equals(null)) {
				language.setName(newName.getNewName());
				this.programmingLanguageReporsitory.save(language);
			}
		} catch (Exception e) {
			System.err.println(findName.getProgrammingLanguageName() + " nolu id'ye sahip veri bulunmamaktadır.");
			throw new Exception("Veritabınında " + findName.getProgrammingLanguageName()
					+ " isimli bir programlama dili bulunmamaktadır.  ");
		}

	}

}
