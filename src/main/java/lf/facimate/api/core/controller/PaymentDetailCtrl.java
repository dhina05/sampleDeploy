package lf.facimate.api.core.controller;

import lf.facimate.api.core.service.PaymentDetailServ;
import lf.facimate.api.core.vo.LicenseVO;
import lf.facimate.api.core.vo.PaymentDetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/payment")
public class PaymentDetailCtrl {

    private final PaymentDetailServ paymentDetailServ;

    @Autowired
    public PaymentDetailCtrl(PaymentDetailServ paymentDetailServ){
        this.paymentDetailServ = paymentDetailServ;
    }

    @PostMapping
    public ResponseEntity<Object> addOrUpdate(@RequestHeader("CLIENT_KEY") String clientKey,
                                              @RequestBody PaymentDetailVO paymentDetailVO){
        try {
            paymentDetailServ.savePayment(paymentDetailVO);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
