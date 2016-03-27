package com.mysitehouse.dal.dao;

import java.util.List;
import com.mysitehouse.dal.dataobject.MshUserAccountDO;
import com.mysitehouse.dal.query.MshUserAccountQuery;

/**
 * MshUserAccountDAO
 *
 * User: sanxiu
 * Date: 2016-03-27 10:09:58
 * Generate by autoDAO
 * Powered by duxing@Taobao
 */

public interface MshUserAccountDAO{


    /**
     * insert one data
     *
     * @param mshUserAccountDO object
     * @return primaryKey Long
     * @throws Exception exception
     */
     public Long insert(MshUserAccountDO mshUserAccountDO) throws Exception;

    /**
     * update data
     *
     * @param mshUserAccountDO object
     * @return update num
     * @throws Exception exception
     */
    public int update(MshUserAccountDO mshUserAccountDO) throws Exception;

    /**
     * get an obj
     *
     * @param id key
     * @return obj obj
     * @throws Exception exception
     */
    public MshUserAccountDO get(Long id) throws Exception;

    /**
     * query a list
     *
     * @param mshUserAccountQuery query
     * @return List
     * @throws Exception exception
     */
    public List<MshUserAccountDO> getList(MshUserAccountQuery mshUserAccountQuery) throws Exception;

    /**
     * query count
     *
     * @param mshUserAccountQuery query
     * @return Integer
     * @throws Exception exception
     */
    public Integer getCount(MshUserAccountQuery mshUserAccountQuery) throws Exception;

    /**
     * logically delete one line
     *
     * @param id key
     * @return delete num
     * @throws Exception exception
     */
    public int delete(Long id) throws Exception;

}