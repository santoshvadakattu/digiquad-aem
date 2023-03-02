package com.aem.digiquad.site.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MultifieldChildResourceList {

	@ValueMapValue
	private String pagetitle;

	
	@ValueMapValue
	private String description;

	public String getpagetitle() {
		return pagetitle;
	}

	public String getDescription() {
		return description;
	}

}

