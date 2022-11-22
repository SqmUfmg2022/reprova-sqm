package br.ufmg.engsoft.reprova.services.responses;

import java.util.Collection;

import br.ufmg.engsoft.reprova.model.Question;

public class GetQuestionsResponse {
	
	private Collection<Question> questions;

	public GetQuestionsResponse(Collection<Question> questions) {
		this.questions = questions;
	}

	public Collection<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Collection<Question> questions) {
		this.questions = questions;
	}

}
