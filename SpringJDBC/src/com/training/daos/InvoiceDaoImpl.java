package com.training.daos;

import java.util.List;

//import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.training.entity.Invoice;
import com.training.ifaces.MyDAO;
import com.training.utils.InvoiceRowMapper;

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

	@Override
	public Invoice find(int key) {

		String sql = "select * from Invoice2016 where invoiceNumber = ?";

		// Invoice inv = getJdbcTemplate().queryForObject(sql, new
		// BeanPropertyRowMapper<Invoice>(Invoice.class), key);

		Invoice inv = getJdbcTemplate().queryForObject(sql, new InvoiceRowMapper(), key);

		return inv;
	}

	@Override
	public List<Invoice> findAll() {

		String sql = "select * from Invoice2016";
		List<Invoice> invList = getJdbcTemplate().query(sql, new InvoiceRowMapper());

		return invList;
	}

	@Override
	public boolean delete(int key) {

		String sql = "delete from Invoice2016 where invoiceNumber = ?";

		int rowDeleted = getJdbcTemplate().update(sql, key);

		if (rowDeleted > 0) {
			return true;
		}

		return false;
	}

}
