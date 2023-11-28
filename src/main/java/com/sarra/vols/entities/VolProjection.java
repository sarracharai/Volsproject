package com.sarra.vols.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "destV", types = { Vol.class })
public interface VolProjection {

	public String getdestinationV();

}
