package com.aem.demo.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables= Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FooterColumnModel {

    private String footerColumn2Item;

    public String getFooterColumn2Item() {
        return footerColumn2Item;
    }

    public void setFooterColumn2Item(String footerColumn2Item) {
        this.footerColumn2Item = footerColumn2Item;
    }
}
