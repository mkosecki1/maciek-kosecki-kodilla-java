package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeAndCompanyFacadeTest {
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeAndCompanyFacade employeeAndCompanyFacade;

    @Test
    public void retrieveEmployeeLastname() throws Exception {
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
        List<Employee> showLastname = employeeAndCompanyFacade.retrieveEmployeeLastname("Kov");

        //Then
        Assert.assertEquals("Kovalsky", showLastname.get(0).getLastname());
        Assert.assertEquals(1, showLastname.size());

        //CleanUp
        try {
            employeeDao.delete(employeeOneId);
            employeeDao.delete(employeeTwoId);
            employeeDao.delete(employeeThreeId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void retrieveCompanyNameFirstLetters() throws Exception {
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
        List<Company> showCompanyName = employeeAndCompanyFacade.retrieveCompanyNameFirstLetters("Gre%");

        //Then
        Assert.assertEquals("Grey Matter", showCompanyName.get(0).getName());
        Assert.assertEquals(1, showCompanyName.size());

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }
}