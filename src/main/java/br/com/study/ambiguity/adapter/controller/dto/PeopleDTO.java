package br.com.study.ambiguity.adapter.controller.dto;

import br.com.study.ambiguity.domain.Channel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class PeopleDTO {

    private String name;
    private Channel channel;

}
