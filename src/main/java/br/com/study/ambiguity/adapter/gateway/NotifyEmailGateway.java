package br.com.study.ambiguity.adapter.gateway;

import br.com.study.ambiguity.UseCase.port.NotifyPortOut;
import br.com.study.ambiguity.domain.Channel;
import br.com.study.ambiguity.domain.People;
import org.springframework.stereotype.Service;

@Service
public class NotifyEmailGateway implements NotifyPortOut {

    @Override
    public String send(People people) {
        return String.format("Enviando mensagem via %s para o cliente %s", people.getChannel().toString().toUpperCase(), people.getName().toUpperCase());
    }

    @Override
    public Channel getChannel() {
        return Channel.EMAIL;
    }
}
