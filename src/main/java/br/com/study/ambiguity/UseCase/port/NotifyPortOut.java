package br.com.study.ambiguity.UseCase.port;

import br.com.study.ambiguity.domain.Channel;
import br.com.study.ambiguity.domain.People;

public interface NotifyPortOut {

    String send(People people);
    Channel getChannel();
}
