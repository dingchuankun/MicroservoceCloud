package com.dck.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dck.springcloud.dao.DeptDao;
import com.dck.springcloud.entities.Dept;
import com.dck.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService
{
	@Autowired
	private DeptDao dao;
	
	@Override
	public boolean add(Dept dept)
	{
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id)
	{
		return dao.findById(id);
	}

	@Override
	public List<Dept> list()
	{
		System.out.println("service实现类方法执行...");
		return dao.findAll();
	}

	@Override
	public boolean del(Long id) {
		// TODO Auto-generated method stub
		return dao.del(id);
	}

}
