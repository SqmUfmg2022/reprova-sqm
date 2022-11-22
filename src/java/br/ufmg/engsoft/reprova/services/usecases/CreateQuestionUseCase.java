package br.ufmg.engsoft.reprova.services.usecases;

import com.google.inject.Inject;

import br.ufmg.engsoft.reprova.database.interfaces.IQuestionRepository;
import br.ufmg.engsoft.reprova.mime.json.Json;
import br.ufmg.engsoft.reprova.model.Question;
import br.ufmg.engsoft.reprova.services.interfaces.ICreateQuestionUseCase;
import br.ufmg.engsoft.reprova.services.requests.CreateQuestionRequest;
import br.ufmg.engsoft.reprova.services.responses.CreateQuestionResponse;

public class CreateQuestionUseCase implements ICreateQuestionUseCase {

  private IQuestionRepository questionRepository;

  @Inject
  public CreateQuestionUseCase(IQuestionRepository questionRepository) {
    this.questionRepository = questionRepository;
  }

	@Override
	public CreateQuestionResponse handle(CreateQuestionRequest input) {
		Question question;
    try {
      question = new Json()
      .parse(input.getBody(), Question.Builder.class)
      .build();
      
      if(System.getenv("MULTIPLE_CHOICE") == "false" 
      && question.type.equals("multiple_choice")
      ) {
        throw new Error("Suas configurações não te dão acesso a esta funcionalidade.");
      }
      if(System.getenv("OPEN") == "false"
        && question.type.equals("open")
      ) {
        throw new Error("Suas configurações não te dão acesso a esta funcionalidade.");
      }
    }
    catch (Exception e) {
      throw new Error(e);
    }
    boolean created = questionRepository.add(question);
		
		return new CreateQuestionResponse(created);
	}
	
}
