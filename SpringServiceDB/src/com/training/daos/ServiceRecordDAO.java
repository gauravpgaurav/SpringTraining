package com.training.daos;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.training.entity.ServiceRecord;
import com.training.ifaces.DAO;

public class ServiceRecordDAO extends JdbcDaoSupport implements DAO<ServiceRecord> {

	@Override
	public int add(ServiceRecord recordObj) {

		String sql = "insert into ServiceRecord values (?,?,?,?,?,?)";
		int rowAdded = getJdbcTemplate().update(sql, recordObj.getServiceId(), recordObj.getCustomerName(),
				recordObj.getHandPhone(), recordObj.getProductId(), recordObj.getProductType(),
				recordObj.getServiceDesc());

		return rowAdded;
	}

	@Override
	public ServiceRecord find(String key) {

		String sql = "select * from ServiceRecord where serviceId = ?";

		ServiceRecord rec = getJdbcTemplate().queryForObject(sql,
				new BeanPropertyRowMapper<ServiceRecord>(ServiceRecord.class), key);

		return rec;
	}

	@Override
	public List<ServiceRecord> findAll() {

		String sql = "select * from ServiceRecord";

		List<ServiceRecord> recList = getJdbcTemplate().query(sql,
				new BeanPropertyRowMapper<ServiceRecord>(ServiceRecord.class));

		return recList;
	}

}
