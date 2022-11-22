package br.ufmg.engsoft.reprova.services.requests;

import br.ufmg.engsoft.reprova.services.interfaces.IUseCaseRequest;
import br.ufmg.engsoft.reprova.services.responses.GetQuestionsResponse;

public class GetQuestionsRequest implements IUseCaseRequest<GetQuestionsResponse> {

	private boolean auth;

	public GetQuestionsRequest(boolean auth) {
		this.auth = auth;
	}

	public boolean getAuth() {
		return auth;
	}

	public void setAuth(boolean auth) {
		this.auth = auth;
	}

}
