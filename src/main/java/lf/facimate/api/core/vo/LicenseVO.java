package lf.facimate.api.core.vo;

import lf.facimate.api.core.commons.enums.LicenseType;
import lf.facimate.api.core.model.Audit;

import java.util.Date;

public class LicenseVO extends Audit {
    private long id;
    private long cmId;
    private LicenseType licenseType;
    private Date licStDt;
    private Date licEnDt;
    private long usersNo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCmId() {
        return cmId;
    }

    public void setCmId(long cmId) {
        this.cmId = cmId;
    }

    public LicenseType getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
    }

    public Date getLicStDt() {
        return licStDt;
    }

    public void setLicStDt(Date licStDt) {
        this.licStDt = licStDt;
    }

    public Date getLicEnDt() {
        return licEnDt;
    }

    public void setLicEnDt(Date licEnDt) {
        this.licEnDt = licEnDt;
    }

    public long getUsersNo() {
        return usersNo;
    }

    public void setUsersNo(long usersNo) {
        this.usersNo = usersNo;
    }
}
