package lf.facimate.api.core.repo;

import lf.facimate.api.core.model.PaymentDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PaymentDetailRepo extends JpaRepository<PaymentDetail,Long>, PagingAndSortingRepository<PaymentDetail,Long> {
}
