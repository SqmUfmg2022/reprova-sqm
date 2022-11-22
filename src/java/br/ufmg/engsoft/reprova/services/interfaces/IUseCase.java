package br.ufmg.engsoft.reprova.services.interfaces;

import an.awesome.pipelinr.Command;

public interface IUseCase<TRequest extends IUseCaseRequest<TResponse>,TResponse> extends Command.Handler<TRequest, TResponse> {

}
