package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobPosting;

public interface JobPostingDao extends JpaRepository<JobPosting, Integer> {
	List<JobPosting> findByIsActive(boolean status);

	List<JobPosting> findByIsActiveOrderByClosedDate(boolean status);

	List<JobPosting> findByIsActiveAndEmployer_CompanyName(boolean status, String companyName);
}
