package com.ismayilov.spring.mvc.controller;

import com.ismayilov.spring.mvc.controller.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "minimum 2 symbols")
    @Size(max = 8, message = "maximum 8 symbols")
    private String name;

    @NotNull(message = "@NotNull validation")
//    @NotEmpty(message = "@NotEmpty validation")
//    @NotBlank(message = "@NotBlank validation")
    private String surname;
    @Min(value = 300, message = "great than 300")
    @Max(value = 5000, message = "least than 500")
    private int salary;

    //* \\
    @Pattern(
            regexp = "\\d{3}-\\d{3}-\\d{2}-\\d{2}",
            message = "Please use pattern XXX-XX-XX"
    )
    private String phoneNumber;

    @CheckEmail(value = "@test.com", message = "email must be ends with @test.com")
    private String email;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages = new String[]{"English"};

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Audi", "Audi");
        carBrands.put("Mercedes", "Mercedes");

//        languages = new String[]{"English"};
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
