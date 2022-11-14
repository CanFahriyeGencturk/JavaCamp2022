package kodlama.io.ProgramminLanguage.business.response;

import kodlama.io.ProgramminLanguage.entities.concrete.ProgrammingLanguage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTecnologyResponse {
	private int id;
	private String tecnologyName;
	private String languageName;

}
