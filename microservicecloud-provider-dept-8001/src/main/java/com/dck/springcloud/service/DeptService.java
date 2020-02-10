package com.dck.springcloud.service;

import java.util.List;

import com.dck.springcloud.entities.Dept;

public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();

	public boolean del(Long id);
}
