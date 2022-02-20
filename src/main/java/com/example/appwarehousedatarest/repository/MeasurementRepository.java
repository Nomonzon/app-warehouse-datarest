package com.example.appwarehousedatarest.repository;


import com.example.appwarehousedatarest.projection.CustomMeasurement;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "measurement",
        collectionResourceRel = "list",
        excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository {
}
