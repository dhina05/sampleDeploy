package lf.facimate.api.core.repo;


import lf.facimate.api.core.model.Community;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CommunityRepo extends JpaRepository<Community,Long>, PagingAndSortingRepository<Community,Long> {

}
