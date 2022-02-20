package com.example.appwarehousedatarest.repository;

import com.example.appwarehousedatarest.projection.CustomSupplier;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier", collectionResourceRel = "list", excerptProjection = CustomSupplier.class)
public interface SupplierRepository {
}
