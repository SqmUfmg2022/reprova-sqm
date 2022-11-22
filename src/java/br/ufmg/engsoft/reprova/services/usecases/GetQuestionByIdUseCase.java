package br.ufmg.engsoft.reprova.services.usecases;

import br.ufmg.engsoft.reprova.services.interfaces.IGetQuestionByIdUseCase;
import br.ufmg.engsoft.reprova.services.requests.GetQuestionByIdRequest;
import br.ufmg.engsoft.reprova.services.responses.GetQuestionByIdResponse;

import com.google.inject.Inject;

import br.ufmg.engsoft.reprova.database.interfaces.IQuestionRepository;
import br.ufmg.engsoft.reprova.model.Question;

public class GetQuestionByIdUseCase implements IGetQuestionByIdUseCase {

	private IQuestionRepository questionRepository;

  @Inject
  public GetQuestionByIdUseCase(IQuestionRepository questionRepository) {
    this.questionRepository = questionRepository;
  }

	@Override
	public GetQuestionByIdResponse handle(GetQuestionByIdRequest input) {
		Question question = questionRepository.get(input.getId());

    return new GetQuestionByIdResponse(question);
	}

}
