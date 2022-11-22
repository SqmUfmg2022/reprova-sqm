package br.ufmg.engsoft.reprova.modules;

import com.google.inject.AbstractModule;

import br.ufmg.engsoft.reprova.services.interfaces.*;
import br.ufmg.engsoft.reprova.services.usecases.*;

public class UseCasesModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(ICreateQuestionUseCase.class).to(CreateQuestionUseCase.class);
		bind(IGetQuestionByIdUseCase.class).to(GetQuestionByIdUseCase.class);
		bind(IGetQuestionsUseCase.class).to(GetQuestionsUseCase.class);
		bind(IUpdateQuestionUseCase.class).to(UpdateQuestionUseCase.class);
		bind(IDeleteQuestionUseCase.class).to(DeleteQuestionUseCase.class);
	}

}
