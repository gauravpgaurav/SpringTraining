package com.training.daos;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.training.entity.Invoice;
import com.training.ifaces.MyDAO;

public class InvoiceDaoImpl extends JdbcDaoSupport implements MyDAO<Invoice> {

	@Override
	public boolean add(Invoice t) {

		String sql = "insert into Invoice2016 values (?,?,?)";

		int rowInserted = getJdbcTemplate().update(sql, t.getInvoiceNumber(), t.getCustomerName(), t.getAmount());

		if (rowInserted > 0) {
			return true;
		}

		return false;
	}

}
