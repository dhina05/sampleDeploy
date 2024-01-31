package lf.facimate.api.core.controller;

import lf.facimate.api.core.service.LicenseServ;
import lf.facimate.api.core.vo.LicenseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/license")
public class LicenseCtrl {

    private final LicenseServ licenseServ;

    @Autowired
    public LicenseCtrl(LicenseServ licenseServ) {
        this.licenseServ = licenseServ;
    }
    @PostMapping
    public ResponseEntity<Object> addOrUpdate(@RequestHeader("CLIENT_KEY") String clientKey,
                                              @RequestBody LicenseVO licenseVO){
        try {
            licenseServ.saveLicense(licenseVO);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
