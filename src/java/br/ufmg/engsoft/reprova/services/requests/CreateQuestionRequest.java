package br.ufmg.engsoft.reprova.services.requests;

import br.ufmg.engsoft.reprova.services.interfaces.IUseCaseRequest;
import br.ufmg.engsoft.reprova.services.responses.CreateQuestionResponse;

public class CreateQuestionRequest implements IUseCaseRequest<CreateQuestionResponse> {
	
	private String body;

	public CreateQuestionRequest(String body) {
		this.body = body;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
}
