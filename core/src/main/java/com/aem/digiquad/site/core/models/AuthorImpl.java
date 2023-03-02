package com.aem.digiquad.site.core.models;


import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Required;

@Model(adaptables = Resource.class,
        adapters = Author.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)

public class AuthorImpl implements Author{
   
	
	
	@Inject 
	@Default (values = "AEM")
	@Required
	String fname;
	
	@Inject
	@Default (values = "GEEKS")
	String lname;
	
	@Inject
	boolean professor;
	
	
   
    @Override
    public String getFirstName() {
        return fname;
    }

    @Override
    public String getLastName() {
        return lname;
    }

    @Override
    public boolean getIsProfessor() {
        return professor;
    }



}
