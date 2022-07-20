package com.aem.demo.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

import javax.inject.Inject;

@Model(adaptables= Resource.class)
public class About {
    @Inject @Optional
    private String aboutus_heading;

    @Inject @Optional
    private String about_content;

    public String getAboutus_heading() {
        return aboutus_heading;
    }

    public String getAbout_content() {
        return about_content;
    }
}
