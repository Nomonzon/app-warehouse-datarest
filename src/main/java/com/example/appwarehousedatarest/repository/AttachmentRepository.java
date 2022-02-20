package com.example.appwarehousedatarest.repository;


import com.example.appwarehousedatarest.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment", collectionResourceRel = "list", excerptProjection = Attachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
