package com.amazon.crm.party.role.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The part played by a party in a given context. Skipped properties: id,href,id,href
 */
@ApiModel(description = "The part played by a party in a given context. Skipped properties: id,href,id,href")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-01T13:16:10.737Z")

public class PartyRoleUpdate   implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type2")
  private String type2 = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("statusReason")
  private String statusReason = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  @JsonProperty("engagedParty")
  private PartyRef engagedParty = null;

  @JsonProperty("type")
  private RoleTypeRef type = null;

  @JsonProperty("account")
  @Valid
  private List<AccountRef> account = null;

  @JsonProperty("paymentMethod")
  @Valid
  private List<PaymentMethodRef> paymentMethod = null;

  @JsonProperty("contactMedium")
  @Valid
  private List<ContactMedium> contactMedium = null;

  @JsonProperty("characteristic")
  @Valid
  private List<Characteristic> characteristic = null;

  @JsonProperty("creditProfile")
  @Valid
  private List<CreditProfile> creditProfile = null;

  @JsonProperty("agreement")
  @Valid
  private List<AgreementRef> agreement = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedPartyRef> relatedParty = null;

  public PartyRoleUpdate baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * Generic attribute indicating the base class type of the extension class of the current object. Useful only when the class type of the current  object is unknown to the implementation.
   * @return baseType
  **/
  @ApiModelProperty(value = "Generic attribute indicating the base class type of the extension class of the current object. Useful only when the class type of the current  object is unknown to the implementation.")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public PartyRoleUpdate schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * Generic attribute containing the link to the schema that defines the structure of the class type of the current object.
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "Generic attribute containing the link to the schema that defines the structure of the class type of the current object.")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public PartyRoleUpdate type2(String type2) {
    this.type2 = type2;
    return this;
  }

  /**
   * Generic attribute containing the name of the resource class type
   * @return type
  **/
  @ApiModelProperty(value = "Generic attribute containing the name of the resource class type")


  public String getType2() {
    return type2;
  }

  public void setType(String type2) {
    this.type2 = type2;
  }

  public PartyRoleUpdate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A word, term, or phrase by which the PartyRole is known and distinguished from other PartyRoles.
   * @return name
  **/
  @ApiModelProperty(value = "A word, term, or phrase by which the PartyRole is known and distinguished from other PartyRoles.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PartyRoleUpdate status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Used to track the lifecycle status of the party role.
   * @return status
  **/
  @ApiModelProperty(value = "Used to track the lifecycle status of the party role.")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PartyRoleUpdate statusReason(String statusReason) {
    this.statusReason = statusReason;
    return this;
  }

  /**
   * A string providing an explanation on the value of the status lifecycle. For instance if the status is Rejected, statusReason will provide the reason for rejection.
   * @return statusReason
  **/
  @ApiModelProperty(value = "A string providing an explanation on the value of the status lifecycle. For instance if the status is Rejected, statusReason will provide the reason for rejection.")


  public String getStatusReason() {
    return statusReason;
  }

  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }

  public PartyRoleUpdate validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The time period that the PartyRole is valid for.
   * @return validFor
  **/
  @ApiModelProperty(value = "The time period that the PartyRole is valid for.")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public PartyRoleUpdate engagedParty(PartyRef engagedParty) {
    this.engagedParty = engagedParty;
    return this;
  }

  /**
   * Get engagedParty
   * @return engagedParty
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PartyRef getEngagedParty() {
    return engagedParty;
  }

  public void setEngagedParty(PartyRef engagedParty) {
    this.engagedParty = engagedParty;
  }

  public PartyRoleUpdate type(RoleTypeRef type) {
    this.type = type;
    return this;
  }

  /**
   * The role type - useful only in the context of a partnership defining more than one role type.
   * @return type
  **/
  @ApiModelProperty(value = "The role type - useful only in the context of a partnership defining more than one role type.")

  @Valid

  public RoleTypeRef getType() {
    return type;
  }

  public void setType(RoleTypeRef type) {
    this.type = type;
  }

  public PartyRoleUpdate account(List<AccountRef> account) {
    this.account = account;
    return this;
  }

  public PartyRoleUpdate addAccountItem(AccountRef accountItem) {
    if (this.account == null) {
      this.account = new ArrayList<AccountRef>();
    }
    this.account.add(accountItem);
    return this;
  }

  /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AccountRef> getAccount() {
    return account;
  }

  public void setAccount(List<AccountRef> account) {
    this.account = account;
  }

  public PartyRoleUpdate paymentMethod(List<PaymentMethodRef> paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  public PartyRoleUpdate addPaymentMethodItem(PaymentMethodRef paymentMethodItem) {
    if (this.paymentMethod == null) {
      this.paymentMethod = new ArrayList<PaymentMethodRef>();
    }
    this.paymentMethod.add(paymentMethodItem);
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<PaymentMethodRef> getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(List<PaymentMethodRef> paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PartyRoleUpdate contactMedium(List<ContactMedium> contactMedium) {
    this.contactMedium = contactMedium;
    return this;
  }

  public PartyRoleUpdate addContactMediumItem(ContactMedium contactMediumItem) {
    if (this.contactMedium == null) {
      this.contactMedium = new ArrayList<ContactMedium>();
    }
    this.contactMedium.add(contactMediumItem);
    return this;
  }

  /**
   * Get contactMedium
   * @return contactMedium
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ContactMedium> getContactMedium() {
    return contactMedium;
  }

  public void setContactMedium(List<ContactMedium> contactMedium) {
    this.contactMedium = contactMedium;
  }

  public PartyRoleUpdate characteristic(List<Characteristic> characteristic) {
    this.characteristic = characteristic;
    return this;
  }

  public PartyRoleUpdate addCharacteristicItem(Characteristic characteristicItem) {
    if (this.characteristic == null) {
      this.characteristic = new ArrayList<Characteristic>();
    }
    this.characteristic.add(characteristicItem);
    return this;
  }

  /**
   * Describes the characteristic of a party role.
   * @return characteristic
  **/
  @ApiModelProperty(value = "Describes the characteristic of a party role.")

  @Valid

  public List<Characteristic> getCharacteristic() {
    return characteristic;
  }

  public void setCharacteristic(List<Characteristic> characteristic) {
    this.characteristic = characteristic;
  }

  public PartyRoleUpdate creditProfile(List<CreditProfile> creditProfile) {
    this.creditProfile = creditProfile;
    return this;
  }

  public PartyRoleUpdate addCreditProfileItem(CreditProfile creditProfileItem) {
    if (this.creditProfile == null) {
      this.creditProfile = new ArrayList<CreditProfile>();
    }
    this.creditProfile.add(creditProfileItem);
    return this;
  }

  /**
   * Get creditProfile
   * @return creditProfile
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CreditProfile> getCreditProfile() {
    return creditProfile;
  }

  public void setCreditProfile(List<CreditProfile> creditProfile) {
    this.creditProfile = creditProfile;
  }

  public PartyRoleUpdate agreement(List<AgreementRef> agreement) {
    this.agreement = agreement;
    return this;
  }

  public PartyRoleUpdate addAgreementItem(AgreementRef agreementItem) {
    if (this.agreement == null) {
      this.agreement = new ArrayList<AgreementRef>();
    }
    this.agreement.add(agreementItem);
    return this;
  }

  /**
   * Get agreement
   * @return agreement
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AgreementRef> getAgreement() {
    return agreement;
  }

  public void setAgreement(List<AgreementRef> agreement) {
    this.agreement = agreement;
  }

  public PartyRoleUpdate relatedParty(List<RelatedPartyRef> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public PartyRoleUpdate addRelatedPartyItem(RelatedPartyRef relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedPartyRef>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * Get relatedParty
   * @return relatedParty
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RelatedPartyRef> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyRef> relatedParty) {
    this.relatedParty = relatedParty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyRoleUpdate partyRoleUpdate = (PartyRoleUpdate) o;
    return Objects.equals(this.baseType, partyRoleUpdate.baseType) &&
        Objects.equals(this.schemaLocation, partyRoleUpdate.schemaLocation) &&
        Objects.equals(this.type, partyRoleUpdate.type) &&
        Objects.equals(this.name, partyRoleUpdate.name) &&
        Objects.equals(this.status, partyRoleUpdate.status) &&
        Objects.equals(this.statusReason, partyRoleUpdate.statusReason) &&
        Objects.equals(this.validFor, partyRoleUpdate.validFor) &&
        Objects.equals(this.engagedParty, partyRoleUpdate.engagedParty) &&
        Objects.equals(this.type, partyRoleUpdate.type) &&
        Objects.equals(this.account, partyRoleUpdate.account) &&
        Objects.equals(this.paymentMethod, partyRoleUpdate.paymentMethod) &&
        Objects.equals(this.contactMedium, partyRoleUpdate.contactMedium) &&
        Objects.equals(this.characteristic, partyRoleUpdate.characteristic) &&
        Objects.equals(this.creditProfile, partyRoleUpdate.creditProfile) &&
        Objects.equals(this.agreement, partyRoleUpdate.agreement) &&
        Objects.equals(this.relatedParty, partyRoleUpdate.relatedParty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseType, schemaLocation, type, name, status, statusReason, validFor, engagedParty, type, account, paymentMethod, contactMedium, characteristic, creditProfile, agreement, relatedParty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyRoleUpdate {\n");
    
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    engagedParty: ").append(toIndentedString(engagedParty)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    contactMedium: ").append(toIndentedString(contactMedium)).append("\n");
    sb.append("    characteristic: ").append(toIndentedString(characteristic)).append("\n");
    sb.append("    creditProfile: ").append(toIndentedString(creditProfile)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

