package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0,softwareMachineId);
        Assert.assertNotEquals(0,dataMaestersId);
        Assert.assertNotEquals(0,greyMatterId);

        //CleanUp

        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }

    }

    @Test
    public void testEmployeeNamedQuery(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        int employeeOneId = johnSmith.getId();
        employeeDao.save(stephanieClarckson);
        int employeeTwoId = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int employeeThreeId = lindaKovalsky.getId();

        //when
        List<Employee> showLastname = employeeDao.retrieveEmployeeLastname("Kovalsky");

        //Then
        Assert.assertEquals("Kovalsky", lindaKovalsky.getLastname());
        Assert.assertEquals(1, showLastname.size());

        //CleanUp
        employeeDao.delete(employeeOneId);
        employeeDao.delete(employeeTwoId);
        employeeDao.delete(employeeThreeId);
    }

    @Test
    public void testCompanyNamedNativeQuery(){
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //When
        List<Company> showCompanyName = companyDao.retrieveCompanyNameFirstLetters("Gre%");

        //Then
        //Assert.assertEquals("Grey Matter", showCompanyName.get(0).getName());
        Assert.assertEquals(1, showCompanyName.size());

        //CleanUp
        companyDao.delete(softwareMachineId);
        companyDao.delete(dataMaestersId);
        companyDao.delete(greyMatterId);
    }
}
