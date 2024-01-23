package lf.facimate.api.core.vo;

import lf.facimate.api.core.model.Audit;

import java.util.Date;

public class PaymentDetailVO extends Audit {
    private long id;
    private long cmId;
    private long licId;
    private Date transDt;
    private double amount;

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

    public long getLicId() {
        return licId;
    }

    public void setLicId(long licId) {
        this.licId = licId;
    }

    public Date getTransDt() {
        return transDt;
    }

    public void setTransDt(Date transDt) {
        this.transDt = transDt;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
