package com.aem.digiquad.site.core.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MultifieldThorwChildResource{

	@ValueMapValue
	private String pagetitle;
	
	@ValueMapValue
	private List<String> description;
	
	
	
	@ChildResource
	private final List<MultifieldChildResourceList> links = new ArrayList<>();

	public List<MultifieldChildResourceList> getLinks() {
		return links;
	}

		
	public String getPageTitle(){
		return pagetitle;
	}

	public List<String> getDescripton() {
		return description;
	}
}