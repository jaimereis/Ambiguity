package br.com.study.ambiguity.UseCase.exception;

import br.com.study.ambiguity.domain.Channel;

public class NoSuchNotifierException extends RuntimeException {
    public NoSuchNotifierException(Channel channel) {
        super(String.format("No notify for %s channel", channel));
    }
}
