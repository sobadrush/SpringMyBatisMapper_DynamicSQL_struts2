package com.ctbc.controller.actions;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.ctbc.model.dao.DeptDAO_Mapper;
import com.ctbc.model.vo.DeptVO;
import com.opensymphony.xwork2.ActionSupport;

@ParentPackage(value = "struts-default")
@Namespace(value = "/deptNS")
@Results(value = { @Result(name = "/getAllDepts", location = "/WEB-INF/jsp/success.jsp", type = "dispatcher") })
//@Controller
//@Scope(scopeName = BeanDefinition.SCOPE_PROTOTYPE)
public class DeptAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Autowired
	private DeptDAO_Mapper deptDAO;

	private List<DeptVO> deptList;

	@Action(value = "getAll", results = { @Result(name = "success", location = "/WEB-INF/jsp/listDepts.jsp", type = "dispatcher") })
	public String getAllDepts() {
		System.out.println("QQQQQQQQQQQQQQQQQQQQQQQQ");
		System.out.println(deptDAO);
		deptList = deptDAO.getAllByMapperAnnotation();
		System.err.println("deptList - " + deptList);
		return SUCCESS;
	}

	public List<DeptVO> getDeptList() {
		return deptList;
	}

	public void setDeptList(List<DeptVO> deptList) {
		this.deptList = deptList;
	}

}
