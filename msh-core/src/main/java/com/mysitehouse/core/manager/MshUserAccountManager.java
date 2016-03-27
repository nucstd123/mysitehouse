package com.mysitehouse.core.manager;

import com.mysitehouse.common.bo.MshUserAccountBO;
import com.mysitehouse.dal.query.MshUserAccountQuery;

import java.util.List;

/**
 * MshUserAccountManager
 * <p>
 * User: sanxiu
 * Date: 2016-03-27 09:22:54
 * Generate by autoManager
 * Powered by duxing@Taobao
 */

public interface MshUserAccountManager {

    /**
     * insert one data
     *
     * @param mshUserAccountBO object
     * @return primaryKey Long
     * @throws Exception exception
     */
    public Long insert(MshUserAccountBO mshUserAccountBO) throws Exception;

    /**
     * update data
     *
     * @param mshUserAccountBO object
     * @return update num
     * @throws Exception exception
     */
    public int update(MshUserAccountBO mshUserAccountBO) throws Exception;

    /**
     * get an obj
     *
     * @param id key
     * @return obj obj
     * @throws Exception exception
     */
    public MshUserAccountBO get(Long id) throws Exception;

    /**
     * query a list
     *
     * @param mshUserAccountQuery query
     * @return List
     * @throws Exception exception
     */
    public List<MshUserAccountBO> getList(MshUserAccountQuery mshUserAccountQuery) throws Exception;

    /**
     * query count
     *
     * @param mshUserAccountQuery query
     * @return Integer
     * @throws Exception exception
     */
    public Integer getCount(MshUserAccountQuery mshUserAccountQuery) throws Exception;

    /**
     * logic delete one line
     *
     * @param id key
     * @return delete num
     * @throws Exception exception
     */
    public int delete(Long id) throws Exception;

}