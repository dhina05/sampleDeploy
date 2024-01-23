package lf.facimate.api.core.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lf.facimate.api.core.commons.enums.LicenseType;

import java.util.Date;

@Entity
public class License extends Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Community community;

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

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
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
