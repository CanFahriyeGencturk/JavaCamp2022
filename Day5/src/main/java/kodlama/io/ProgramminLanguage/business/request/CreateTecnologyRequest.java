package kodlama.io.ProgramminLanguage.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTecnologyRequest {

	private String tecnologyName;

	private String programmingName;

}
