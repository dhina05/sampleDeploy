package lf.facimate.api.core.service;

import lf.facimate.api.core.commons.EntityConverter;
import lf.facimate.api.core.model.PaymentDetail;
import lf.facimate.api.core.repo.PaymentDetailRepo;
import lf.facimate.api.core.vo.PaymentDetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PaymentDetailServ {

    private final PaymentDetailRepo paymentDetailRepo;
    private final EntityConverter entityConverter;

    @Autowired
    public PaymentDetailServ(PaymentDetailRepo paymentDetailRepo,EntityConverter entityConverter){
        this.paymentDetailRepo = paymentDetailRepo;
        this.entityConverter = entityConverter;
    }

    public void savePayment(PaymentDetailVO paymentDetailVO){
        Date date = new Date();
        if (paymentDetailVO.getId() == 0){
            paymentDetailVO.setCreatedBy(paymentDetailVO.getUpdatedBy());
            paymentDetailVO.setCreatedDate(date);
        }
        paymentDetailVO.setUpdatedDate(date);
        PaymentDetail pd = entityConverter.convertVOToEntity(paymentDetailVO, PaymentDetail.class);
        paymentDetailRepo.save(pd);
    }

}
