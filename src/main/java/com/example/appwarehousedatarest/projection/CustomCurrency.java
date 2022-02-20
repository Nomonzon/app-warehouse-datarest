package com.example.appwarehousedatarest.projection;

import com.example.appwarehousedatarest.entity.Currency;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Currency.class)
public interface CustomCurrency {
    Long getId();
    String getName();
    Boolean getActive();

}
