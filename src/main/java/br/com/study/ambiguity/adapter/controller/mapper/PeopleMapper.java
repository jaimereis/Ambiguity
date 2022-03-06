package br.com.study.ambiguity.adapter.controller.mapper;

import br.com.study.ambiguity.adapter.controller.dto.PeopleDTO;
import br.com.study.ambiguity.domain.People;
import org.springframework.stereotype.Component;

@Component
public class PeopleMapper {

    public People toDomain(PeopleDTO peopleDTO){
        return People.builder()
                .name(peopleDTO.getName())
                .channel(peopleDTO.getChannel())
                .build();
    }
}
