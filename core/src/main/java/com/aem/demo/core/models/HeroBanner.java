package com.aem.demo.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

import javax.inject.Inject;

@Model(adaptables= Resource.class)
public class HeroBanner {
    @Inject @Optional
    private String banner_heading;

    @Inject @Optional
    private String hero_banner;

    public String getBanner_heading() {
        return banner_heading;
    }

    public String getHero_banner() {
        return hero_banner;
    }
}
