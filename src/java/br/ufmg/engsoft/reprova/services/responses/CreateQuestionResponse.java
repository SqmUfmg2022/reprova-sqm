package br.ufmg.engsoft.reprova.services.responses;

public class CreateQuestionResponse {
	
	boolean created;

	public CreateQuestionResponse(boolean created) {
		this.created = created;
	}

	public boolean isCreated() {
		return created;
	}

}
