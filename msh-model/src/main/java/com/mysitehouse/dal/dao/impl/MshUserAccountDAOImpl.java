package com.mysitehouse.dal.dao.impl;

import java.util.List;
import com.mysitehouse.dal.dataobject.MshUserAccountDO;
import com.mysitehouse.dal.dao.MshUserAccountDAO;
import com.mysitehouse.dal.query.MshUserAccountQuery;
import com.mysitehouse.dal.dao.BaseDAO;

/**
 * MshUserAccountDAOImpl
 *
 * User: sanxiu
 * Date: 2016-03-27 10:09:58
 * Generate by autoDAOImpl
 * Powered by duxing@Taobao
 */

public class MshUserAccountDAOImpl extends BaseDAO implements MshUserAccountDAO{

    private static final String NAMESPACE = "MshUserAccountDAO.";

    /**
     * insert one data
     *
     * @param mshUserAccountDO object
     * @return primaryKey Long
     * @throws Exception exception
     */
     public Long insert(MshUserAccountDO mshUserAccountDO) throws Exception{
        Long id = this.getNextId("msh_user_account");
        mshUserAccountDO.setId(id);
        insert(NAMESPACE + "insert", mshUserAccountDO);
        return id;
     }

    /**
     * update data
     *
     * @param mshUserAccountDO object
     * @return update num
     * @throws Exception exception
     */
    public int update(MshUserAccountDO mshUserAccountDO) throws Exception{
        return update(NAMESPACE + "update", mshUserAccountDO);
    }
    /**
     * get an obj
     *
     * @param id key
     * @return do obj
     * @throws Exception exception
     */
    public MshUserAccountDO get(Long id) throws Exception{
        return (MshUserAccountDO) queryForObject(NAMESPACE + "select", id);
    }

    /**
     * query a list
     *
     * @param mshUserAccountQuery query
     * @return List
     * @throws Exception exception
     */
    @SuppressWarnings("unchecked")
    public List<MshUserAccountDO> getList(MshUserAccountQuery mshUserAccountQuery) throws Exception{
        return (List<MshUserAccountDO>) queryForList(NAMESPACE + "queryList", mshUserAccountQuery);
    }

    /**
     * query count
     *
     * @param mshUserAccountQuery query
     * @return Integer
     * @throws Exception exception
     */
    public Integer getCount(MshUserAccountQuery mshUserAccountQuery) throws Exception{
        return (Integer) queryForObject(NAMESPACE + "queryCount", mshUserAccountQuery);
    }

    /**
     * logically delete one line
     *
     * @param id key
     * @return delete num
     * @throws Exception exception
     */
    public int delete(Long id) throws Exception{
        return update(NAMESPACE + "delete", id);
    }

}