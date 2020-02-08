package com.dck.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true) // ��ʽд��
public class Dept implements Serializable {// ʵ����
	private long depeno;
	private String dname;
	private String db_source;
	public Dept(String dname) {
		super();
		this.dname=dname;
	}
	public static void main(String[] args) {
		Dept dept = new Dept();
		dept.setDname("����").setDepeno(5555).setDb_source("1258");
		System.out.println(dept);
		}
}
