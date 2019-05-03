/**
 * JBoss, Home of Professional Open Source
 * Copyright 2016, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazon.crm.party.role.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.crm.party.role.model.PartyRole;
import com.amazon.crm.party.role.model.PartyRoleCreate;
import com.amazon.crm.party.role.model.PartyRoleUpdate;
import com.amazon.crm.party.role.repo.PartyRoleRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/amazon-crm-party-role-api")
public class PartyRoleController {

    
    @Autowired
    private PartyRoleRepository partyRoleRepository;
   
    @RequestMapping(method = RequestMethod.GET, value = "/health")
    @ApiOperation("Used to verify the health of the service")
    public String health() {
        return "I'm ok";
    }
    
    
    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/partyRoleManagement/partyRole", produces = "application/json")
    @ApiOperation("Returns the list of 'PartyRole' objects")
    public List<PartyRole> getAllPartyRoles() {
        List<PartyRole> partyRoleList = partyRoleRepository.findAllByOrderByNameAsc();
        return partyRoleList;
    }
    
    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, value = "/partyRoleManagement/partyRole", produces = "application/json")
    @ApiOperation("Creates a 'PartyRole'")
    public PartyRole addPartyRole(@RequestBody PartyRoleCreate partyRoleCreate) {
    		PartyRole mappedPartyRole = PartyRoleController.mapPartyRoleToPartyCreate(partyRoleCreate);
    		PartyRole savedPartyRole = partyRoleRepository.saveAndFlush(mappedPartyRole);
        return savedPartyRole;
    }
    
    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/partyRoleManagement/partyRole/{id}", produces = "application/json")
    @ApiOperation("Retrieves a 'PartyRole' by id")
    public PartyRole getPartyRole(@PathVariable("id") String id) {
    		PartyRole partyRole = partyRoleRepository.findById(id).get();
        return partyRole;
    }
    
    @CrossOrigin
    @RequestMapping(method = RequestMethod.PATCH, value = "/partyRoleManagement/partyRole/{id}", produces = "application/json")
    @ApiOperation("Updates partially a 'PartyRole' by id")
    public PartyRole updatePartyRole(@RequestBody PartyRoleUpdate partyRoleUpdate,@PathVariable("id") String id) {
    		Optional<PartyRole>  partyRoleOptional = partyRoleRepository.findById(id);
      	PartyRole mappedPartyRole = PartyRoleController.mapPartyRoleToPartyUpdate(partyRoleOptional.get(),partyRoleUpdate);
    		PartyRole savedIndividual = partyRoleRepository.save(mappedPartyRole,id);
        return savedIndividual;
    }
    
    @CrossOrigin
    @RequestMapping(method = RequestMethod.DELETE, value = "/partyRoleManagement/partyRole/{id}", produces = "application/json")
    @ApiOperation("Deletes a 'PartyRole' by id")
    public Boolean removePartyRole(@PathVariable("id") String id) {
    		partyRoleRepository.delete(id);
        return true;
    }
    
    
    private static PartyRole mapPartyRoleToPartyCreate(PartyRoleCreate partyRoleCreate){
    		PartyRole partyRole = new PartyRole();
    		if(partyRoleCreate != null) {
    			if(partyRoleCreate.getBaseType() != null)
    				partyRole.setBaseType(partyRoleCreate.getBaseType());
    			if(partyRoleCreate.getName() != null)
    				partyRole.setName(partyRoleCreate.getName());
    			if(partyRoleCreate.getSchemaLocation() != null)
    				partyRole.setSchemaLocation(partyRoleCreate.getSchemaLocation());
    			if(partyRoleCreate.getStatus() != null)
    				partyRole.setStatus(partyRoleCreate.getStatus());
    			if(partyRoleCreate.getStatusReason() != null)
    				partyRole.setStatusReason(partyRoleCreate.getStatusReason());
    			if(partyRoleCreate.getType2() != null)
    				partyRole.setType2(partyRoleCreate.getType2());
    			
    			if(partyRoleCreate.getAccount() != null)
    				partyRole.setAccount(partyRoleCreate.getAccount());
    			if(partyRoleCreate.getAgreement() != null)
    				partyRole.setAgreement(partyRoleCreate.getAgreement());
    			if(partyRoleCreate.getCharacteristic() != null)
    				partyRole.setCharacteristic(partyRoleCreate.getCharacteristic());
    			if(partyRoleCreate.getContactMedium() != null)
    				partyRole.setContactMedium(partyRoleCreate.getContactMedium());
    			if(partyRoleCreate.getCreditProfile() != null)
    				partyRole.setCreditProfile(partyRoleCreate.getCreditProfile());
    			if(partyRoleCreate.getEngagedParty() != null)
    				partyRole.setEngagedParty(partyRoleCreate.getEngagedParty());
    			if(partyRoleCreate.getPaymentMethod() != null)
    				partyRole.setPaymentMethod(partyRoleCreate.getPaymentMethod());
    			if(partyRoleCreate.getRelatedParty() != null)
    				partyRole.setRelatedParty(partyRoleCreate.getRelatedParty());
    			if(partyRoleCreate.getValidFor() != null)
    				partyRole.setValidFor(partyRoleCreate.getValidFor());
    			if(partyRoleCreate.getType() != null)
    				partyRole.setType(partyRoleCreate.getType());
    		}
    		return partyRole;
    }
    
    private static PartyRole mapPartyRoleToPartyUpdate(PartyRole partyRole, PartyRoleUpdate partyRoleUpdate){
		if(partyRoleUpdate != null) {
			if(partyRoleUpdate.getBaseType() != null)
				partyRole.setBaseType(partyRoleUpdate.getBaseType());
			if(partyRoleUpdate.getName() != null)
				partyRole.setName(partyRoleUpdate.getName());
			if(partyRoleUpdate.getSchemaLocation() != null)
				partyRole.setSchemaLocation(partyRoleUpdate.getSchemaLocation());
			if(partyRoleUpdate.getStatus() != null)
				partyRole.setStatus(partyRoleUpdate.getStatus());
			if(partyRoleUpdate.getStatusReason() != null)
				partyRole.setStatusReason(partyRoleUpdate.getStatusReason());
			if(partyRoleUpdate.getType2() != null)
				partyRole.setType2(partyRoleUpdate.getType2());
			
			if(partyRoleUpdate.getAccount() != null)
				partyRole.setAccount(partyRoleUpdate.getAccount());
			if(partyRoleUpdate.getAgreement() != null)
				partyRole.setAgreement(partyRoleUpdate.getAgreement());
			if(partyRoleUpdate.getCharacteristic() != null)
				partyRole.setCharacteristic(partyRoleUpdate.getCharacteristic());
			if(partyRoleUpdate.getContactMedium() != null)
				partyRole.setContactMedium(partyRoleUpdate.getContactMedium());
			if(partyRoleUpdate.getCreditProfile() != null)
				partyRole.setCreditProfile(partyRoleUpdate.getCreditProfile());
			if(partyRoleUpdate.getEngagedParty() != null)
				partyRole.setEngagedParty(partyRoleUpdate.getEngagedParty());
			if(partyRoleUpdate.getPaymentMethod() != null)
				partyRole.setPaymentMethod(partyRoleUpdate.getPaymentMethod());
			if(partyRoleUpdate.getRelatedParty() != null)
				partyRole.setRelatedParty(partyRoleUpdate.getRelatedParty());
			if(partyRoleUpdate.getValidFor() != null)
				partyRole.setValidFor(partyRoleUpdate.getValidFor());
			if(partyRoleUpdate.getType() != null)
				partyRole.setType(partyRoleUpdate.getType());
		}
		return partyRole;
}
    
}
