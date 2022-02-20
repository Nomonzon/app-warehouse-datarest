package com.example.appwarehousedatarest.projection;

import com.example.appwarehousedatarest.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface CustomSupplier {

    Long getId();
    String getName();
    Boolean getActive();
    String getPhoneNumber();


}
