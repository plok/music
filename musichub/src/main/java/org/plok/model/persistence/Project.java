package org.plok.model.persistence;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.plok.model.persistence.common.AbstractBaseEntity;

@Entity
public class Project extends AbstractBaseEntity {

	@Basic
	private String projectName;
	@Basic
	private Date creationDate;

	@ManyToOne
	private Musician musician;


	/**
	 * Gets the projectName for this instance.
	 * 
	 * @return The projectName.
	 */
	public String getProjectName() {
		return this.projectName;
	}

	/**
	 * Sets the projectName for this instance.
	 * 
	 * @param projectName
	 *            The projectName.
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * Gets the creationDate for this instance.
	 * 
	 * @return The creationDate.
	 */
	public Date getCreationDate() {
		return this.creationDate;
	}

	/**
	 * Sets the creationDate for this instance.
	 * 
	 * @param creationDate
	 *            The creationDate.
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * Gets the musician for this instance.
	 *
	 * @return The musician.
	 */
	public Musician getMusician()
	{
		return this.musician;
	}

	/**
	 * Sets the musician for this instance.
	 *
	 * @param musician The musician.
	 */
	public void setMusician(Musician musician)
	{
		this.musician = musician;
	}

}
