package cn.jboa.pojo;
// Generated 2018-4-12 9:45:46 by Hibernate Tools 3.2.2.GA

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * SysEmployee generated by hbm2java
 */
@Entity
@Table(name = "sys_employee", catalog = "jboadb")
public class SysEmployee implements java.io.Serializable {

	private String sn;
	private SysPosition sysPosition;
	private SysDepartment sysDepartment;
	private String name;
	private String password;
	private String status;
	private Set<BizClaimVoucher> bizClaimVouchersForCreateSn = new HashSet<BizClaimVoucher>(0);
	private Set<BizClaimVoucher> bizClaimVouchersForNextDealSn = new HashSet<BizClaimVoucher>(0);

	public SysEmployee() {
	}

	public SysEmployee(String sn, SysPosition sysPosition, SysDepartment sysDepartment, String name, String password,
			String status) {
		this.sn = sn;
		this.sysPosition = sysPosition;
		this.sysDepartment = sysDepartment;
		this.name = name;
		this.password = password;
		this.status = status;
	}

	public SysEmployee(String sn, SysPosition sysPosition, SysDepartment sysDepartment, String name, String password,
			String status, Set<BizClaimVoucher> bizClaimVouchersForCreateSn,
			Set<BizClaimVoucher> bizClaimVouchersForNextDealSn) {
		this.sn = sn;
		this.sysPosition = sysPosition;
		this.sysDepartment = sysDepartment;
		this.name = name;
		this.password = password;
		this.status = status;
		this.bizClaimVouchersForCreateSn = bizClaimVouchersForCreateSn;
		this.bizClaimVouchersForNextDealSn = bizClaimVouchersForNextDealSn;
	}

	@Id

	@Column(name = "SN", unique = true, nullable = false, length = 50)
	public String getSn() {
		return this.sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "POSITION_ID", nullable = false)
	public SysPosition getSysPosition() {
		return this.sysPosition;
	}

	public void setSysPosition(SysPosition sysPosition) {
		this.sysPosition = sysPosition;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DEPARTMENT_ID", nullable = false)
	public SysDepartment getSysDepartment() {
		return this.sysDepartment;
	}

	public void setSysDepartment(SysDepartment sysDepartment) {
		this.sysDepartment = sysDepartment;
	}

	@Column(name = "NAME", nullable = false, length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "PASSWORD", nullable = false, length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "STATUS", nullable = false, length = 20)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "sysEmployeeByCreateSn")
	public Set<BizClaimVoucher> getBizClaimVouchersForCreateSn() {
		return this.bizClaimVouchersForCreateSn;
	}

	public void setBizClaimVouchersForCreateSn(Set<BizClaimVoucher> bizClaimVouchersForCreateSn) {
		this.bizClaimVouchersForCreateSn = bizClaimVouchersForCreateSn;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "sysEmployeeByNextDealSn")
	public Set<BizClaimVoucher> getBizClaimVouchersForNextDealSn() {
		return this.bizClaimVouchersForNextDealSn;
	}

	public void setBizClaimVouchersForNextDealSn(Set<BizClaimVoucher> bizClaimVouchersForNextDealSn) {
		this.bizClaimVouchersForNextDealSn = bizClaimVouchersForNextDealSn;
	}

}
