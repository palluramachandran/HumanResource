package com.hrms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.dao.TemplateDAO;
import com.hrms.model.Template;
@Service
public class TemplateServiceImpl implements TemplateService {
	
	public TemplateDAO templateDAO;
	@Autowired
	public void setTemplateDAO(TemplateDAO templateDAO) {
		this.templateDAO=templateDAO;
	}

	@Override
	public List<Template> getTemplates() {
		List<Template> template=templateDAO.getTemplates();
		return template;
		
	}

	@Override
	public void submitTemplate(Template template) {
		templateDAO.submitTemplate(template);

	}

	@Override
	public Template editTemplate(int id) {
		Template template=templateDAO.editTemplate(id);	
		return template;
		
	}

	@Override
	public void updateTemplate(Template template) {
		templateDAO.updateTemplate(template);

	}

	@Override
	public void deleteTemplate(int id) {
		templateDAO.deleteTemplate(id);

	}

}
