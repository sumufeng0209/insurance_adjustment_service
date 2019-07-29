package org.java.service.impl;

import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.java.dao.AdvanceAdjustmentMapper;
import org.java.entity.AdvanceAdjustment;
import org.java.service.AdvanceAdjustmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

/**
 * 垫付理算表
 */
@Service
public class AdvanceAdjustmentServiceImpl implements AdvanceAdjustmentService {

    @Autowired
    private AdvanceAdjustmentMapper advanceAdjustmentMapper;

    @Autowired
    private TaskService taskService;

    @Override
    public AdvanceAdjustment findAdvanceAdjustmentById(String id) {

        return advanceAdjustmentMapper.selectByPrimaryKey(id);
    }

    /**
     *
     * @param advanceAdjustment
     * @return
     */
    @Transactional
    @Override
    public String insertAdvanceAdjustment(AdvanceAdjustment advanceAdjustment,String taskId) {

        String adjustmentId= UUID.randomUUID().toString();
        taskService.setVariable(taskId,"advanceAdjustmentId",adjustmentId);
        advanceAdjustment.setAdjustmentId(adjustmentId);
        advanceAdjustment.setAdjustmentTime(new Date());
        Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
        String processInstanceId = task.getProcessInstanceId();
        int i = advanceAdjustmentMapper.insertSelective(advanceAdjustment);
        if(i>0){
            return processInstanceId;
        }
        return null;
    }
}
