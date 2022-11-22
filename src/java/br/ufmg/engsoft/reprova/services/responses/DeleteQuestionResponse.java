package br.ufmg.engsoft.reprova.services.responses;

public class DeleteQuestionResponse {

	boolean deleted;

	public DeleteQuestionResponse(boolean deleted) {
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}
	
}
