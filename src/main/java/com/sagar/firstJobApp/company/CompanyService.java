package com.sagar.firstJobApp.company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompany();

    void createCompany(Company company);

    boolean updateCompany(Long id, Company company);
}
