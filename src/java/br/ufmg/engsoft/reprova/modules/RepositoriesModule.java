package br.ufmg.engsoft.reprova.modules;

import com.google.inject.AbstractModule;

import br.ufmg.engsoft.reprova.database.interfaces.*;
import br.ufmg.engsoft.reprova.database.repositories.*;

public class RepositoriesModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IQuestionRepository.class).to(QuestionRepository.class);
	}

}