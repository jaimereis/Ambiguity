package br.com.study.ambiguity.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class People {

    private String name;
    private Channel channel;
}
