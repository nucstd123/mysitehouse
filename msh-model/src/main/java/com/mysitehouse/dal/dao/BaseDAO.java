package com.mysitehouse.dal.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;


/**
 * BaseDAO
 * Date: 2016-03-27 09:23:40
 * Generate by autoBaseDAO
 * Powered by duxing@Taobao
 */
public class BaseDAO implements InitializingBean {

    SqlSessionTemplate sqlSessionTemplate;

    protected JdbcTemplate jdbcTemplate;

    @Override
    public void afterPropertiesSet() throws Exception {
        if (sqlSessionTemplate == null)
            throw new Exception("BaseDAO initilize fail,check related spring's configuration file");
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * 此处有个约定, sequence 的配置需要是 表名_sequence 作为sequenceTable的 key
     */
    protected Long getNextId(String idKey) throws Exception {
        return null;
    }

    public int update(String statementName, Object parameterObject) throws Exception {
        try {
            return sqlSessionTemplate.update(statementName, parameterObject);
        } catch (DataAccessException e) {
            throw new Exception("[BaseDAO-update]", e);
        }
    }

    public Object insert(String statementName, Object parameterObject) throws Exception {
        try {
            return sqlSessionTemplate.insert(statementName, parameterObject);
        } catch (DataAccessException e) {
            throw new Exception("[BaseDAO-insert]", e);
        }
    }

    public int delete(String statementName, Object parameterObject) throws Exception {
        try {
            return sqlSessionTemplate.delete(statementName, parameterObject);
        } catch (DataAccessException e) {
            throw new Exception("[BaseDAO-delete]", e);
        }
    }

    public Object queryForObject(String statementName, Object parameterObject) throws Exception {
        try {
            return sqlSessionTemplate.selectList(statementName, parameterObject);
        } catch (DataAccessException e) {
            throw new Exception("[BaseDAO-queryForObject]", e);
        }
    }

    public List<?> queryForList(String statementName, Object parameterObject) throws Exception {
        try {
            return sqlSessionTemplate.selectList(statementName, parameterObject);
        } catch (DataAccessException e) {
            throw new Exception("[BaseDAO-queryForList]", e);
        }
    }


    public Map<?, ?> queryForMap(String statementName, Object parameterObject, String keyProperty) throws Exception {
        try {
            return sqlSessionTemplate.selectMap(statementName, parameterObject, keyProperty);
        } catch (DataAccessException e) {
            throw new Exception("[BaseDAO-queryForMap]", e);
        }
    }

}