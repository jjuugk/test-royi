package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.StuStudent;
import com.ruoyi.system.mapper.StuStudentMapper;
import com.ruoyi.system.service.IStuStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 学生信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-02-23
 */
@Service
public class StuStudentServiceImpl implements IStuStudentService 
{
    @Autowired
    private StuStudentMapper stuStudentMapper;

    /**
     * 查询学生信息
     * 
     * @param studentId 学生信息主键
     * @return 学生信息
     */
    @Override
    public StuStudent selectStuStudentByStudentId(Long studentId)
    {
        return stuStudentMapper.selectStuStudentByStudentId(studentId);
    }

    /**
     * 查询学生信息列表
     * 
     * @param stuStudent 学生信息
     * @return 学生信息
     */
    @Override
    public List<StuStudent> selectStuStudentList(StuStudent stuStudent)
    {
        return stuStudentMapper.selectStuStudentList(stuStudent);
    }

    /**
     * 新增学生信息
     * 
     * @param stuStudent 学生信息
     * @return 结果
     */
    @Override
    public int insertStuStudent(StuStudent stuStudent)
    {
        return stuStudentMapper.insertStuStudent(stuStudent);
    }

    /**
     * 修改学生信息
     * 
     * @param stuStudent 学生信息
     * @return 结果
     */
    @Override
    public int updateStuStudent(StuStudent stuStudent)
    {
        return stuStudentMapper.updateStuStudent(stuStudent);
    }

    /**
     * 批量删除学生信息
     * 
     * @param studentIds 需要删除的学生信息主键
     * @return 结果
     */
    @Override
    public int deleteStuStudentByStudentIds(Long[] studentIds)
    {
        return stuStudentMapper.deleteStuStudentByStudentIds(studentIds);
    }

    /**
     * 删除学生信息信息
     * 
     * @param studentId 学生信息主键
     * @return 结果
     */
    @Override
    public int deleteStuStudentByStudentId(Long studentId)
    {
        return stuStudentMapper.deleteStuStudentByStudentId(studentId);
    }
}
