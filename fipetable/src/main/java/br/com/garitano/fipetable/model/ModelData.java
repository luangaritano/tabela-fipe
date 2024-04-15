package br.com.garitano.fipetable.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ModelData(@JsonAlias("codigo") String code,
                        @JsonAlias("nome") String model) {
}
