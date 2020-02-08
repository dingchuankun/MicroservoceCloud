package com.dck.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dck.springcloud.entities.Dept;

@Mapper
public interface DeptDao {
	public boolean addDept(Dept dept);
	public Dept findById(long id);
	public List<Dept> findAll();
}
