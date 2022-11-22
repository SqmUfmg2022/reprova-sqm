package br.ufmg.engsoft.reprova.services.usecases;

import com.google.inject.Inject;

import br.ufmg.engsoft.reprova.database.interfaces.IQuestionRepository;
import br.ufmg.engsoft.reprova.services.interfaces.IDeleteQuestionUseCase;
import br.ufmg.engsoft.reprova.services.requests.DeleteQuestionRequest;
import br.ufmg.engsoft.reprova.services.responses.DeleteQuestionResponse;

public class DeleteQuestionUseCase implements IDeleteQuestionUseCase {

	private IQuestionRepository questionRepository;

  @Inject
  public DeleteQuestionUseCase(IQuestionRepository questionRepository) {
    this.questionRepository = questionRepository;
  }

	@Override
	public DeleteQuestionResponse handle(DeleteQuestionRequest input) {
		boolean deleted = questionRepository.remove(input.getId());
		
    return new DeleteQuestionResponse(deleted);
	}
	
}
