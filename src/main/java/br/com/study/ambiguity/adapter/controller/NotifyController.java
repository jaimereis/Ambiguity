package br.com.study.ambiguity.adapter.controller;

import br.com.study.ambiguity.UseCase.port.NotifyPortIn;
import br.com.study.ambiguity.adapter.controller.dto.PeopleDTO;
import br.com.study.ambiguity.adapter.controller.mapper.PeopleMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/notify")
public class NotifyController {

    private NotifyPortIn notifyPortIn;
    private PeopleMapper mapper;

    @PostMapping(consumes = {"application/json"})
    public String notify(@RequestBody PeopleDTO peopleDTO){
        return notifyPortIn.send(mapper.toDomain(peopleDTO));
    }
}
