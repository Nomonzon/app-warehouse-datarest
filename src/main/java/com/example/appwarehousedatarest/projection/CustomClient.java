package com.example.appwarehousedatarest.projection;

import com.example.appwarehousedatarest.entity.Client;
import org.apache.tomcat.jni.Address;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Client.class)
public interface CustomClient {

    Long getId();

    String getName();

    String getPhoneNumber();

}
