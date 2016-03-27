package com.mysitehouse.core.manager.impl;

package

import com.mysitehouse.core.bo.MshUserAccountBO;
import com.mysitehouse.core.dal.dao.MshUserAccountDAO;
import com.mysitehouse.core.dal.query.MshUserAccountQuery;
import com.mysitehouse.core.manager.MshUserAccountManager;
import com.mysitehouse.core.transfer.MshUserAccountTransfer;

.manager.impl;

import java.util.List;
import .manager.MshUserAccountManager;
import .dal.dao.MshUserAccountDAO;
import .dal.query.MshUserAccountQuery;
import .bo.MshUserAccountBO;
import .transfer.MshUserAccountTransfer;

/**
 * MshUserAccountManagerImpl
 *
 * User: sanxiu
 * Date: 2016-03-27 09:22:54
 * Generate by autoManagerImpl
 * Powered by duxing@Taobao
 */

public class MshUserAccountManagerImpl implements MshUserAccountManager {

    private MshUserAccountDAO mshUserAccountDAO;

    public void setMshUserAccountDAO(MshUserAccountDAO mshUserAccountDAO) {
        this.mshUserAccountDAO = mshUserAccountDAO;
    }

    /**
     * insert one data
     *
     * @param mshUserAccountBO object
     * @return primaryKey Long
     * @throws Exception exception
     */
    public Long insert(MshUserAccountBO mshUserAccountBO) throws Exception{
        return mshUserAccountDAO.insert(MshUserAccountTransfer.toDO(mshUserAccountBO));
    }

    /**
     * update data
     *
     * @param mshUserAccountBO object
     * @return update num
     * @throws Exception exception
     */
    public int update(MshUserAccountBO mshUserAccountBO) throws Exception{
        return mshUserAccountDAO.update(MshUserAccountTransfer.toDO(mshUserAccountBO));
    }

    /**
     * get an obj
     *
     * @param id key
     * @return do obj
     * @throws Exception exception
     */
    public MshUserAccountBO get(Long id) throws Exception{
        return MshUserAccountTransfer.toBO(mshUserAccountDAO.get(id));
    }

    /**
     * query a list
     *
     * @param mshUserAccountQuery query
     * @return List
     * @throws Exception exception
     */
    public List<MshUserAccountBO> getList(MshUserAccountQuery mshUserAccountQuery) throws Exception{
        return MshUserAccountTransfer.toBOList(mshUserAccountDAO.getList(mshUserAccountQuery));
    }

    /**
     * query count
     *
     * @param mshUserAccountQuery query
     * @return Integer
     * @throws Exception exception
     */
    public Integer getCount(MshUserAccountQuery mshUserAccountQuery) throws Exception{
        return mshUserAccountDAO.getCount(mshUserAccountQuery);
    }

    /**
     * logic delete one line
     *
     * @param id key
     * @return delete num
     * @throws Exception exception
     */
    public int delete(Long id) throws Exception{
        return mshUserAccountDAO.delete(id);
    }

}