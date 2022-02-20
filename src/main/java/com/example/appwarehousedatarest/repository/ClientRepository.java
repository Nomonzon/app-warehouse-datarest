package com.example.appwarehousedatarest.repository;

import com.example.appwarehousedatarest.entity.Client;
import com.example.appwarehousedatarest.projection.CustomClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "client", collectionResourceRel = "list", excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client, Long> {
}
