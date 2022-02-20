package com.example.appwarehousedatarest.projection;

import com.example.appwarehousedatarest.entity.Measurement;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Measurement.class)
public interface CustomMeasurement {

    Long getId();

    Boolean getActive();

    String getName();
}
