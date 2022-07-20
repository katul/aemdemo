package com.aem.demo.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

import javax.inject.Inject;
@Model(adaptables= Resource.class)
public class Testimonials {


    @Inject @Optional
    private String name;

    @Inject @Optional
    private String position;

    @Inject @Optional
    private String comment;

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getComment() {
        return comment;
    }
}
