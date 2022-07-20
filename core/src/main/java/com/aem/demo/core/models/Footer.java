package com.aem.demo.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

import javax.inject.Inject;

@Model(adaptables= Resource.class)
public class Footer {
    @Inject @Optional
    private String logoText;

    @Inject @Optional
    private String footerColumn2Heading;

    @Inject @Optional
    private Resource footerColumn2;

    @Inject @Optional
    private String address_heading;

    @Inject @Optional
    private Resource footerColumn3;

    public String getLogoText() {
        return logoText;
    }

    public String getFooterColumn2Heading() {
        return footerColumn2Heading;
    }

    public String getAddress_heading() {
        return address_heading;
    }

    public Resource getFooterColumn2() {
        return footerColumn2;
    }

    public Resource getFooterColumn3() {
        return footerColumn3;
    }
}

