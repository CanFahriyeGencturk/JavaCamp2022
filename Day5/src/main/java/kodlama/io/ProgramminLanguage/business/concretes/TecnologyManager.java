package kodlama.io.ProgramminLanguage.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.ProgramminLanguage.business.absracts.ProgrammingLaguageServices;
import kodlama.io.ProgramminLanguage.business.absracts.TecnologyService;
import kodlama.io.ProgramminLanguage.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.ProgramminLanguage.business.request.CreateTecnologyRequest;
import kodlama.io.ProgramminLanguage.business.request.DeleteByNameTecnologyRequest;
import kodlama.io.ProgramminLanguage.business.request.UpdateTecnnologyRequest;
import kodlama.io.ProgramminLanguage.business.response.FindByNameProgrammingLanguageResponse;
import kodlama.io.ProgramminLanguage.business.response.FindByNameTecnologyResponse;
import kodlama.io.ProgramminLanguage.business.response.GetAllTecnologyResponse;
import kodlama.io.ProgramminLanguage.dataAccess.abtracts.ProgrammingLanguageReporsitory;
import kodlama.io.ProgramminLanguage.dataAccess.abtracts.TecnologyReporsitory;
import kodlama.io.ProgramminLanguage.entities.concrete.ProgrammingLanguage;
import kodlama.io.ProgramminLanguage.entities.concrete.Tecnology;

@Service
public class TecnologyManager implements TecnologyService {

	private TecnologyReporsitory tecnologyReporsitory;
	private ProgrammingLanguageReporsitory languageReporsitory; // asıl önemli olan nokta!!
	private ProgrammingLaguageServices laguageServices;

	public TecnologyManager(TecnologyReporsitory tecnologyReporsitory,
			ProgrammingLanguageReporsitory languageReporsitory, ProgrammingLaguageServices laguageServices) {
		super();
		this.tecnologyReporsitory = tecnologyReporsitory;
		this.languageReporsitory = languageReporsitory;
		this.laguageServices = laguageServices;
	}

	@Override
	public List<GetAllTecnologyResponse> getAll() {
		List<GetAllTecnologyResponse> getAllTecnologyResponses = new ArrayList<GetAllTecnologyResponse>();
		List<Tecnology> tecnologies = this.tecnologyReporsitory.findAll();
		for (Tecnology tecnology : tecnologies) {
			GetAllTecnologyResponse response = new GetAllTecnologyResponse();
			response.setId(tecnology.getId());
			response.setTecnologyName(tecnology.getName());
			response.setLanguageName(tecnology.getLanguage().getName());
			getAllTecnologyResponses.add(response);
		}

		return getAllTecnologyResponses;
	}

	@Override
	public Tecnology findTecnologyByName(FindByNameTecnologyResponse findByNameTecnologyResponse) {
		List<Tecnology> tecnologies = tecnologyReporsitory.findAll();
		for (Tecnology tecnology : tecnologies) {
			if (tecnology.getName().toLowerCase()
					.equals(findByNameTecnologyResponse.getTecnologyName().toLowerCase())) {
				return tecnology;
			}
		}
		return null;
	}

	public boolean controlCreateTecnologyRequest(CreateTecnologyRequest createTecnologyRequest,
			ProgrammingLanguage language) throws Exception {

		FindByNameTecnologyResponse findByNameTecnologyResponse = new FindByNameTecnologyResponse();
		findByNameTecnologyResponse.setTecnologyName(createTecnologyRequest.getTecnologyName());
		Tecnology tecnology = this.findTecnologyByName(findByNameTecnologyResponse);
		if (language == null) {
			throw new Exception("Veritabanında " + createTecnologyRequest.getProgrammingName()
					+ " isimli programlama dili yoktur. Var olan bir programla dilini giriniz");
		} else if (tecnology != null) {
			throw new Exception("Veritabanında " + createTecnologyRequest.getTecnologyName()
					+ " isimli bir teknoloji var. Farklı bir teknologi ismi giriniz ");
		} else {
			return true;
		}

	}

	@Override
	public void add(CreateTecnologyRequest createTecnologyRequest) throws Exception {

		ProgrammingLanguage language = this.laguageServices.findByName(createTecnologyRequest.getProgrammingName());
		if (controlCreateTecnologyRequest(createTecnologyRequest, language)) {
			Tecnology tecnology = new Tecnology();
			tecnology.setName(createTecnologyRequest.getTecnologyName());
			tecnology.setLanguage(language);
			this.tecnologyReporsitory.save(tecnology);
		} else {
			throw new Exception("Add fonksiyonunun son aşamasında sorun yaşandı");
		}

	}

	@Override
	public void deleteByName(DeleteByNameTecnologyRequest deleteByNameTecnologyRequest) throws Exception {
		FindByNameTecnologyResponse findByNameTecnologyResponse = new FindByNameTecnologyResponse();
		findByNameTecnologyResponse.setTecnologyName(deleteByNameTecnologyRequest.getTecnologyName());
		Tecnology tecnologyIsExist = this.findTecnologyByName(findByNameTecnologyResponse);
		if (tecnologyIsExist != null) {
			this.tecnologyReporsitory.deleteById(tecnologyIsExist.getId());
		} else {
			throw new Exception("Veritabanında " + deleteByNameTecnologyRequest.getTecnologyName()
					+ " isminde bir teknoloji zaten bulunmamaktadır.");
		}

	}

	@Override
	public void updateNameOfTecnology(FindByNameTecnologyResponse findByNameTecnologyResponse,
			UpdateTecnnologyRequest updateTecnnologyRequest) throws Exception {
		Tecnology tecnology = this.findTecnologyByName(findByNameTecnologyResponse);
		if (tecnology != null) {
			tecnology.setName(updateTecnnologyRequest.getNewName());
			this.tecnologyReporsitory.save(tecnology);
		} else {
			throw new Exception("Veritabanında " + findByNameTecnologyResponse.getTecnologyName()
					+ " bu isimde teknoloji bulunmamaktadır.");
		}

	}

	public void updateTecnologyTypeOfProgrammingLanguagey(FindByNameTecnologyResponse findByNameTecnologyResponse,
			CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {

		Tecnology tecnology = new Tecnology();
		tecnology = findTecnologyByName(findByNameTecnologyResponse);

		ProgrammingLanguage language = new ProgrammingLanguage();
		if (tecnology != null) {
			if (!tecnology.getLanguage().getName().toLowerCase()
					.equals(createProgrammingLanguageRequest.getName().toLowerCase())) {
				language = this.laguageServices.findByName(createProgrammingLanguageRequest.getName());
				if (language != null) {
					tecnology.setLanguage(language);
					this.tecnologyReporsitory.save(tecnology);
				} else {
					throw new Exception("Veritabınında " + createProgrammingLanguageRequest.getName()
							+ " isimli bir programlama dili bulunmamktadır");
				}
			} else {
				throw new Exception("Aynı isimle güncellemeye çalıştınız");
			}
		} else {
			throw new Exception("Veritabanında " + findByNameTecnologyResponse.getTecnologyName()
					+ " isimli bir tekonoloji bulunmamaktadır.");
		}

	}

}
