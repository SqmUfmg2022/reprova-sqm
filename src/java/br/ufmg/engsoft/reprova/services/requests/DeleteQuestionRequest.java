package br.ufmg.engsoft.reprova.services.requests;

import br.ufmg.engsoft.reprova.services.interfaces.IUseCaseRequest;
import br.ufmg.engsoft.reprova.services.responses.DeleteQuestionResponse;

public class DeleteQuestionRequest implements IUseCaseRequest<DeleteQuestionResponse> {
	
	private String id;

	public DeleteQuestionRequest(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
