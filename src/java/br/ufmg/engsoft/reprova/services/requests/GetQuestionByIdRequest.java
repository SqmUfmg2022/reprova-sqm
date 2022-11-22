package br.ufmg.engsoft.reprova.services.requests;

import br.ufmg.engsoft.reprova.services.interfaces.IUseCaseRequest;
import br.ufmg.engsoft.reprova.services.responses.GetQuestionByIdResponse;

public class GetQuestionByIdRequest implements IUseCaseRequest<GetQuestionByIdResponse> {
	
	private String id;

	public GetQuestionByIdRequest(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
