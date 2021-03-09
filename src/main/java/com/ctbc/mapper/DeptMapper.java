package com.ctbc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.ctbc.model.vo.DeptVO;

/**
 * (1)
 * org.mybatis.'spring'.annotation.@MapperScan 掃描
 * 
 * @Mapper 所在的包
 *         (2)
 *         映射xml中，<mapper namespace="com.ctbc.mapper.DeptMapper">
 *         namespace 要指到 Mapper介面
 *         (3)
 *         Mapper介面的抽象方法名稱 ooo，要與映射xml中 <select id="ooo" ...> 一致
 *         (4)
 * @Param(value = "ggg") vs XML中的 #{ggg}
 */
@Mapper
public interface DeptMapper {

	//@Select("SELECT * FROM dept_TB10")
	public abstract List<DeptVO> getDept();

	@Select("SELECT * FROM dept_TB10")
	@Results(value = {
					// https://www.tutorialspoint.com/mybatis/mybatis_annotations.htm
					@Result(property = "deptNo", column = "deptno"),
					@Result(property = "deptName", column = "dname"),
					@Result(property = "deptLoc", column = "loc"),
	})
	public abstract List<DeptVO> getAllByMapperAnnotation();

	public abstract DeptVO getDept(@Param(value = "deptNoGGG") Integer deptNo);

	public abstract List<DeptVO> getDeptsInMulitId(@Param(value = "deptNoInArr") int[] deptNos);

	public abstract int addDept(@Param(value = "deptVOgg") DeptVO deptVO);

	public abstract int updateDept(@Param(value = "deptVOgg") DeptVO deptVO);

	public abstract int updateDeptUseSetTag(@Param(value = "deptVOgg") DeptVO deptVO);

	public abstract int delDept(@Param(value = "deptNumber") Integer deptNNN);

}
