package lf.facimate.api.core.service;


import lf.facimate.api.core.commons.EntityConverter;
import lf.facimate.api.core.model.License;
import lf.facimate.api.core.repo.LicenseRepo;
import lf.facimate.api.core.vo.LicenseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class LicenseServ {
    private final EntityConverter entityConverter;
    private final LicenseRepo licenseRepo;
    @Autowired
    public LicenseServ(EntityConverter entityConverter, LicenseRepo licenseRepo) {
        this.entityConverter = entityConverter;
        this.licenseRepo = licenseRepo;
    }
    public void saveLicense(LicenseVO licenseVO){
        Date date = new Date();
        if (licenseVO.getId() == 0){
            licenseVO.setCreatedBy(licenseVO.getUpdatedBy());
            licenseVO.setCreatedDate(date);
        }
        licenseVO.setUpdatedDate(date);
        License license = entityConverter.convertVOToEntity(licenseVO, License.class);
        licenseRepo.save(license);
    }


}
