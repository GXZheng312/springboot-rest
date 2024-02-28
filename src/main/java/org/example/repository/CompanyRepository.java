package org.example.repository;


import org.example.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource()
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
