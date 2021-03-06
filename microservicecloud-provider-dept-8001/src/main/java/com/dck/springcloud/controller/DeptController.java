package com.dck.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.dck.springcloud.entities.Dept;
import com.dck.springcloud.service.DeptService;

@RestController
public class DeptController {
	@Autowired
	private DeptService deptservice;

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {

		return deptservice.add(dept);
	}
	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") long id) {

		return deptservice.get(id);
	}
	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list() {
		System.out.println("controller-list��������..............");
		return deptservice.list();
	}
	@RequestMapping(value = "/dept/del/{id}", method = RequestMethod.GET)
	public boolean del(@PathVariable("id") long id) {
		
		return deptservice.del(id);
	}
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "dlksajdkasd";
	}
}
