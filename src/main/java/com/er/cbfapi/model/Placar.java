package com.er.cbfapi.model;

import javax.persistence.Embeddable;

@Embeddable
public class Placar {

    private Integer golsTimeCasa;
    private Integer golsTimeVisitante;

    public Integer getGolsTimeCasa() {
        return golsTimeCasa;
    }

    public void setGolsTimeCasa(Integer golsTimeCasa) {
        this.golsTimeCasa = golsTimeCasa;
    }

    public Integer getGolsTimeVisitante() {
        return golsTimeVisitante;
    }

    public void setGolsTimeVisitante(Integer golsTimeVisitante) {
        this.golsTimeVisitante = golsTimeVisitante;
    }
}
