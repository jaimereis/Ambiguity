package br.com.study.ambiguity.UseCase;

import br.com.study.ambiguity.UseCase.exception.NoSuchNotifierException;
import br.com.study.ambiguity.UseCase.port.NotifyPortIn;
import br.com.study.ambiguity.UseCase.port.NotifyPortOut;
import br.com.study.ambiguity.domain.People;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class NotifyUseCase implements NotifyPortIn {

    private List<NotifyPortOut> notifyPortOut;

    @Override
    public String send(People people) {
        return resolveNotifier(people).send(people);
    }

    public NotifyPortOut resolveNotifier(People people) {
        return notifyPortOut.stream()
                .filter(notifier -> notifier.getChannel().equals(people.getChannel()))
                .findFirst()
                .orElseThrow(() -> new NoSuchNotifierException(people.getChannel()));
    }
}
