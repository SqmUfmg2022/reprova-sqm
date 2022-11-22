package br.ufmg.engsoft.reprova.services.responses;

import br.ufmg.engsoft.reprova.model.Question;

public class GetQuestionByIdResponse {

	private Question question;

	public GetQuestionByIdResponse(Question question) {
		this.question = question;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

}
