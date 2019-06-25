package com.hrms.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hrms.model.Template;
import com.hrms.util.IbatisUtil;

@Repository
public class TemplateDAOImpl implements TemplateDAO {
	
	

	@Override
	public List<Template> getTemplates() {
		SqlSession session = IbatisUtil.getSqlSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<Template> template = session.selectList("getTemplate");
        session.commit();
        session.close();
        return template;	
        }

	@Override
	public void submitTemplate(Template template) {
		SqlSession session = IbatisUtil.getSqlSessionFactory().openSession();
       
        String workDaysString=String.join(",",template.getWorkDays());
        template.setWorkDaysString(workDaysString);
        session.insert("submitTemplate",template);
        session.commit();
        session.close();
        

	}

	@Override
	public Template editTemplate(int id) {
		SqlSession session = IbatisUtil.getSqlSessionFactory().openSession();
		
	   Template template= (Template) session.selectOne("editTemplate",id);
	  String[] workDays=template.getWorkDaysString().split(",");
	  template.setWorkDays(workDays);
        session.commit();
        session.close();
		return template;
       
	}

	@Override
	public void updateTemplate(Template template) {
		 SqlSession session = IbatisUtil.getSqlSessionFactory().openSession();
		 String workDaysString=String.join(",",template.getWorkDays());
	        template.setWorkDaysString(workDaysString);
	        session.update("updateTemplate", template);
	       	session.commit();
	        session.close();

	}

	@Override
	public void deleteTemplate(int id) {
		SqlSession session = IbatisUtil.getSqlSessionFactory().openSession();
		session.delete("deleteTemplate",id);
        session.commit();
        session.close();
	}

}
