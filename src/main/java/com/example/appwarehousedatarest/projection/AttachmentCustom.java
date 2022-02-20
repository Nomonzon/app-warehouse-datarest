package com.example.appwarehousedatarest.projection;

import com.example.appwarehousedatarest.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Attachment.class)
public interface AttachmentCustom {

    Long getId();

    String getName();

    String getSize();

}
