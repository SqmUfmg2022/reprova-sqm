package br.ufmg.engsoft.reprova.services.usecases;

import java.util.Collection;

import com.google.inject.Inject;

import br.ufmg.engsoft.reprova.database.interfaces.IQuestionRepository;
import br.ufmg.engsoft.reprova.model.Question;
import br.ufmg.engsoft.reprova.services.interfaces.IGetQuestionsUseCase;
import br.ufmg.engsoft.reprova.services.requests.GetQuestionsRequest;
import br.ufmg.engsoft.reprova.services.responses.GetQuestionsResponse;

public class GetQuestionsUseCase implements IGetQuestionsUseCase {

	private IQuestionRepository questionRepository;

  @Inject
  public GetQuestionsUseCase(IQuestionRepository questionRepository) {
    this.questionRepository = questionRepository;
  }

	@Override
	public GetQuestionsResponse handle(GetQuestionsRequest input) {
		Collection<Question> questions = questionRepository.list(null, input.getAuth() ? null : false);

    return new GetQuestionsResponse(questions);
	}
	
}
