package com.hrms.dao;

import java.util.List;

import com.hrms.model.Template;

public interface TemplateDAO {

	public List<Template> getTemplates();
	public void submitTemplate(Template template);
	public Template editTemplate(int id);
	public void updateTemplate(Template template);
	public void deleteTemplate(int id);
	
}
