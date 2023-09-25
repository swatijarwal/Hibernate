package com.rays.junit;

import static org.junit.Assert.fail;

import org.junit.Test;

public class TestFail {
	
	@Test
	public void testAdd() throws Exception {

		UserBean bean = new UserBean();
		bean.setId(3);
		bean.setName("rohit");
		bean.setSalary(6000);

		UserModel.add(bean);
		bean = UserModel.findByPk(2);

		if (bean == null) {

			fail("Record is not added...!!!");

		} else {
			System.out.println("record is added..!!!");
		}

	}

}
