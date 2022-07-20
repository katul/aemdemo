package com.aem.demo.core.components.content;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

import javax.inject.Inject;


@Model(adaptables= Resource.class)
public class StudentModel {

    @Inject @Optional
    private String student_name;

    @Inject
    private String Roll_No;

    @Inject
    private String Address;

    @Inject
    private String Class;

    @Inject
    private String section;
}
