package br.ufmg.engsoft.reprova.services.responses;

public class UpdateQuestionResponse {

	boolean updated;

	public UpdateQuestionResponse(boolean updated) {
		this.updated = updated;
	}

	public boolean isUpdated() {
		return updated;
	}
	
}
