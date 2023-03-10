package com.dailycodebuffer.Springboottutorial.service;

import java.util.List;

import com.dailycodebuffer.Springboottutorial.entity.Department;

public interface DepartmentService {

  public Department saveDepartment(Department department);

  public List<Department> fetchDepartmentList();

  public Department fetchDepartmentById(Long departmentId);

  public void deleteDepartmentById(Long departmentId);
  
}
