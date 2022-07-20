package com.aem.demo.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

import javax.inject.Inject;


@Model(adaptables= Resource.class)
public class StudentModel {

    @Inject @Optional
    private String student_name;

    @Inject @Optional
    private String Roll_No;

    @Inject @Optional
    private String Address;

    @Inject @Optional
    private String standard;

    @Inject @Optional
    private String section;

    @Inject @Optional
    private boolean headerInclude;


    public String getStudent_name() {
        return student_name;
    }

    public String getRoll_No() {
        return Roll_No;
    }

    public String getAddress() {
        return Address;
    }

    public String getStandard() {
        return standard;
    }

    public String getSection() {
        return section.toUpperCase();
    }

    public boolean isHeaderInclude() {
        return headerInclude;
    }
}
