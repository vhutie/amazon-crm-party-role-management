package com.amazon.crm.party.role.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amazon.crm.party.role.model.PartyRole;


public interface PartyRoleRepository  extends JpaRepository<PartyRole, String>{
	
	public List<PartyRole> findAllByOrderByNameAsc();
	public Optional<PartyRole> findById(String id);
	public void delete(String id);
//	public PartyRole save(PartyRole partyRole,String id);
}
