package cn.jboa.pojo;
// Generated 2018-4-12 9:45:46 by Hibernate Tools 3.2.2.GA

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * BizClaimVoucherDetail generated by hbm2java
 */
@Entity
@Table(name = "biz_claim_voucher_detail", catalog = "jboadb")
public class BizClaimVoucherDetail implements java.io.Serializable {

	private long id;
	private BizClaimVoucher bizClaimVoucher;
	private String item;
	private BigDecimal account;
	private String des;

	public BizClaimVoucherDetail() {
	}

	public BizClaimVoucherDetail(long id, BizClaimVoucher bizClaimVoucher, String item, BigDecimal account,
			String des) {
		this.id = id;
		this.bizClaimVoucher = bizClaimVoucher;
		this.item = item;
		this.account = account;
		this.des = des;
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAIN_ID", nullable = false)
	public BizClaimVoucher getBizClaimVoucher() {
		return this.bizClaimVoucher;
	}

	public void setBizClaimVoucher(BizClaimVoucher bizClaimVoucher) {
		this.bizClaimVoucher = bizClaimVoucher;
	}

	@Column(name = "ITEM", nullable = false, length = 20)
	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@Column(name = "ACCOUNT", nullable = false, precision = 20)
	public BigDecimal getAccount() {
		return this.account;
	}

	public void setAccount(BigDecimal account) {
		this.account = account;
	}

	@Column(name = "DES", nullable = false, length = 200)
	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	@Override
	public String toString() {
		return "BizClaimVoucherDetail [id=" + id + ", bizClaimVoucher=" + bizClaimVoucher + ", item=" + item
				+ ", account=" + account + ", des=" + des + "]";
	}

}