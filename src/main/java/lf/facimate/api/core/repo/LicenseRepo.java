package lf.facimate.api.core.repo;

import lf.facimate.api.core.model.License;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LicenseRepo extends JpaRepository<License,Long>, PagingAndSortingRepository<License,Long> {
}
