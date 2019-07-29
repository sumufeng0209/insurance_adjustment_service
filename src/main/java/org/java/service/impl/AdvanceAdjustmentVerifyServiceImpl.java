package org.java.service.impl;

import org.activiti.engine.TaskService;
import org.java.dao.AdvanceAdjustmentVerifyMapper;
import org.java.entity.AdvanceAdjustmentVerify;
import org.java.service.AdvanceAdjustmentVerifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class AdvanceAdjustmentVerifyServiceImpl implements AdvanceAdjustmentVerifyService {

    @Autowired
    private AdvanceAdjustmentVerifyMapper advanceAdjustmentVerifyMapper;

    @Autowired
    private TaskService taskService;


    /**
     * 王城垫付理算核赔任务
     * @param advanceAdjustmentVerify
     * @param taskId
     * @return
     */
    @Override
    public String insertAdvanceAdjustment(AdvanceAdjustmentVerify advanceAdjustmentVerify,String taskId) {
        advanceAdjustmentVerify.setVerifyId(UUID.randomUUID().toString());
        advanceAdjustmentVerify.setAdjustmentTime(new Date());
        String processInstanceId = taskService.createTaskQuery().taskId(taskId).singleResult().getProcessInstanceId();
        taskService.complete(taskId);
        int i = advanceAdjustmentVerifyMapper.insertSelective(advanceAdjustmentVerify);
        if (i>0){
            return processInstanceId;
        }else{
            return  null;
        }

    }

    /**
     * 根据垫付理算表的ID查询出垫付理算核赔表的信息
     * @param id
     * @return
     */
    @Override
    public AdvanceAdjustmentVerify findAdvanceAdjustmentById(String id) {
        return advanceAdjustmentVerifyMapper.selectByPrimaryKey(id);
    }
}
