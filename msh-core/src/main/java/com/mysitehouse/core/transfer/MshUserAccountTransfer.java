package com.mysitehouse.core.transfer;

import com.mysitehouse.common.bo.MshUserAccountBO;
import com.mysitehouse.dal.dataobject.MshUserAccountDO;

import java.util.List;
import java.util.ArrayList;

/**
 * MshUserAccountTransfer
 * <p>
 * User: sanxiu
 * Date: 2016-03-27 09:22:54
 * Generate by autoTransfer
 * Powered by duxing@Taobao
 */

public class MshUserAccountTransfer {

    public static MshUserAccountBO toBO(MshUserAccountDO d) {
        if (d == null) return null;
        MshUserAccountBO bo = new MshUserAccountBO();
        bo.setId(d.getId());
        bo.setGmtCreate(d.getGmtCreate());
        bo.setGmtModified(d.getGmtModified());
        bo.setAccount(d.getAccount());
        bo.setPassword(d.getPassword());
        bo.setStatus(d.getStatus());
        bo.setFeature(d.getFeature());
        bo.setRemark(d.getRemark());
        return bo;
    }

    public static MshUserAccountDO toDO(MshUserAccountBO bo) {
        if (bo == null) return null;
        MshUserAccountDO d = new MshUserAccountDO();
        d.setId(bo.getId());
        d.setGmtCreate(bo.getGmtCreate());
        d.setGmtModified(bo.getGmtModified());
        d.setAccount(bo.getAccount());
        d.setPassword(bo.getPassword());
        d.setStatus(bo.getStatus());
        d.setFeature(bo.getFeature());
        d.setRemark(bo.getRemark());
        return d;
    }

    public static List<MshUserAccountBO> toBOList(List<MshUserAccountDO> doList) {
        if (doList == null) {
            return new ArrayList<MshUserAccountBO>();
        }
        List<MshUserAccountBO> boList = new ArrayList<MshUserAccountBO>();
        for (MshUserAccountDO d : doList) {
            if (d != null) {
                boList.add(MshUserAccountTransfer.toBO(d));
            }
        }
        return boList;
    }

    public static List<MshUserAccountDO> toDOList(List<MshUserAccountBO> boList) {
        if (boList == null) {
            return new ArrayList<MshUserAccountDO>();
        }
        List<MshUserAccountDO> doList = new ArrayList<MshUserAccountDO>();
        for (MshUserAccountBO bo : boList) {
            if (bo != null) {
                doList.add(MshUserAccountTransfer.toDO(bo));
            }
        }
        return doList;
    }

}