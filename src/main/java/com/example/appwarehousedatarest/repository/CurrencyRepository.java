package com.example.appwarehousedatarest.repository;

import com.example.appwarehousedatarest.projection.CustomCurrency;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency", collectionResourceRel = "list" ,excerptProjection = CustomCurrency.class)
public interface CurrencyRepository {
}
