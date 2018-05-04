package org.fornever.java.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@MappedSuperclass
public class KoalaBaseEntity {

	/**
	 * instance created date
	 * <p>
	 * 创建时间
	 */
	@Column
	private Date koalaCreateDate;
	/**
	 * instance updated date
	 * <p>
	 * 更新时间
	 */
	@Column
	private Date koalaUpdateDate;
	/**
	 * <p>
	 * 重试次数
	 */
	@Column
	private Integer koalaPersistRetryCount;

	/**
	 * wether this entity persisted to remote system
	 * 
	 * <p>
	 * when update, check this flag firstly
	 */
	@Column
	private Boolean remotePersisted;

	/**
	 * @return the koalaCreateDate
	 */
	public Date getKoalaCreateDate() {
		return koalaCreateDate;
	}

	/**
	 * @param koalaCreateDate
	 *            the koalaCreateDate to set
	 */
	public void setKoalaCreateDate(Date koalaCreateDate) {
		this.koalaCreateDate = koalaCreateDate;
	}

	/**
	 * @return the koalaUpdateDate
	 */
	public Date getKoalaUpdateDate() {
		return koalaUpdateDate;
	}

	/**
	 * @param koalaUpdateDate
	 *            the koalaUpdateDate to set
	 */
	public void setKoalaUpdateDate(Date koalaUpdateDate) {
		this.koalaUpdateDate = koalaUpdateDate;
	}

	/**
	 * @return the koalaRetryCount
	 */
	public Integer getKoalaRetryCount() {
		return koalaPersistRetryCount;
	}

	/**
	 * @param koalaRetryCount
	 *            the koalaRetryCount to set
	 */
	public void setKoalaRetryCount(Integer koalaRetryCount) {
		this.koalaPersistRetryCount = koalaRetryCount;
	}

	@PrePersist
	protected void onCreate() {
		this.koalaCreateDate = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.koalaUpdateDate = new Date();
	}

}
