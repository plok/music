package org.plok.model.persistence.facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.plok.model.persistence.Project;

public class ProjectFacade extends AbstractFacade<Project> {


	@PersistenceContext(unitName = "musichub_pu")
	private EntityManager em;
	
	
	public ProjectFacade() {
		super(Project.class);
	}
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

