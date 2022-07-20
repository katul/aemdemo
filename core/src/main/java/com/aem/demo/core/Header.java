package com.aem.demo.core;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

import javax.inject.Inject;

@Model(adaptables= Resource.class)
public class Header {


    @Inject @Optional
    private String logoText;
    @Inject @Optional
    public Resource navigation;

   public String getLogoText() {

       return logoText;
    }

}
