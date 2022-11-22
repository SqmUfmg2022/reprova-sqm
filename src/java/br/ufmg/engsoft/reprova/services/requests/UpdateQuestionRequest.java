package br.ufmg.engsoft.reprova.services.requests;

import br.ufmg.engsoft.reprova.services.interfaces.IUseCaseRequest;
import br.ufmg.engsoft.reprova.services.responses.UpdateQuestionResponse;

public class UpdateQuestionRequest implements IUseCaseRequest<UpdateQuestionResponse> {

	private String id;
	private String body;

	public UpdateQuestionRequest(String id, String body) {
		this.id = id;
		this.body = body;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
}
