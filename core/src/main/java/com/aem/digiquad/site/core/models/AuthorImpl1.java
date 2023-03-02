package com.aem.digiquad.site.core.models;

import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Required;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.day.cq.wcm.api.Page;

@Model(adaptables = SlingHttpServletRequest.class, adapters = Author1.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AuthorImpl1 implements Author1 {
	private static final Logger LOG = LoggerFactory.getLogger(AuthorImpl1.class);

	@ScriptVariable
	Page currentPage;

	String pageTitle;

	@Inject
	//https://www.youtube.com/watch?v=kzv8_NN0N2s
	// value Resource ki insted of SlingHttpServletRequest undi so we use @Via annatation
	@Via("resource")
	@Default(values = "AEM")
	@Required
	String fname;

	@ValueMapValue
	// via Resource insted of ValueMapValue Annotation...
	@Default(values = "GEEKS")
	String lname;

	@ValueMapValue
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

	@Override
	public String getPageTitle() {
		LOG.debug("isnide thee get pae title method : " + currentPage.getTitle());
		return currentPage.getTitle();
	}

}
