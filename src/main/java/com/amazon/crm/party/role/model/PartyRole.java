package com.amazon.crm.party.role.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The part played by a party in a given context.
 */
@ApiModel(description = "The part played by a party in a given context.")
@Validated
@Entity
@Table(name="party_role", schema="pr_schema")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-01T13:16:10.737Z")

public class PartyRole   {
	@Id
	@GeneratedValue
	private Long tableId;
  @JsonProperty("@baseType")
  @Column(nullable = true)
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  @Column(nullable = true)
  private String schemaLocation = null;

  @JsonProperty("@type2")
  @Column(nullable = true)
  private String type2 = null;

  @JsonProperty("href")
  @Column(nullable = true)
  private String href = null;

  @JsonProperty("id")
  @Id
  @GenericGenerator(name = "id", strategy = "com.amazon.crm.party.role.model.AmazonSequenceGenerator")
  @GeneratedValue(generator = "id")  
  @Column(name="id")
  private String id = null;

  @JsonProperty("name")
  @Column(nullable = true)
  private String name = null;

  @JsonProperty("status")
  @Column(nullable = true)
  private String status = null;

  @JsonProperty("statusReason")
  @Column(nullable = true)
  private String statusReason = null;

  @JsonProperty("validFor")
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "VALIDFOR_ID")
  private TimePeriod validFor = null;

  @JsonProperty("engagedParty")
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ENGAGEDPARTY_ID")
  private PartyRef engagedParty = null;

  @JsonProperty("type")
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ROLETYPEREF_ID")
  private RoleTypeRef type = null;

  @JsonProperty("account")
  @Valid
  @OneToMany(fetch = FetchType.LAZY)
 	@JoinTable(schema = "pr_schema", name = "PR_ACCOUNT", joinColumns = {
 			@JoinColumn(name = "PARTYROLE_ID"),@JoinColumn(name = "OTHER_ID") }, inverseJoinColumns = { @JoinColumn(name = "ACCOUNT_ID") })
  private List<AccountRef> account = null;

  @JsonProperty("paymentMethod")
  @Valid
  @OneToMany(fetch = FetchType.LAZY)
 	@JoinTable(schema = "party_schema", name = "PR_PAYMENTMETHOD", joinColumns = {
 			@JoinColumn(name = "PARTYROLE_ID"),@JoinColumn(name = "OTHER_ID") }, inverseJoinColumns = { @JoinColumn(name = "PAYMENTMETHOD_ID") })
  private List<PaymentMethodRef> paymentMethod = null;

  @JsonProperty("contactMedium")
  @Valid
  @OneToMany(fetch = FetchType.LAZY)
 	@JoinTable(schema = "party_schema", name = "PR_CONTACTMEDIUM", joinColumns = {
 			@JoinColumn(name = "PARTYROLE_ID"),@JoinColumn(name = "OTHER_ID") }, inverseJoinColumns = { @JoinColumn(name = "CONTACTMEDIUM_ID") })
  private List<ContactMedium> contactMedium = null;

  @JsonProperty("characteristic")
  @Valid
  @OneToMany(fetch = FetchType.LAZY)
 	@JoinTable(schema = "party_schema", name = "PR_CHARACTERISTIC", joinColumns = {
 			@JoinColumn(name = "PARTYROLE_ID"),@JoinColumn(name = "OTHER_ID") }, inverseJoinColumns = { @JoinColumn(name = "CHARACTERISTIC_ID") })
  private List<Characteristic> characteristic = null;

  @JsonProperty("creditProfile")
  @Valid
  @OneToMany(fetch = FetchType.LAZY)
 	@JoinTable(schema = "party_schema", name = "PR_CREATEPROFILE", joinColumns = {
 			@JoinColumn(name = "PARTYROLE_ID") ,@JoinColumn(name = "OTHER_ID")}, inverseJoinColumns = { @JoinColumn(name = "CREATEPROFILE_ID") })
  private List<CreditProfile> creditProfile = null;

  @JsonProperty("agreement")
  @Valid
  @OneToMany(fetch = FetchType.LAZY)
 	@JoinTable(schema = "party_schema", name = "PR_AGREEMENT", joinColumns = {
 			@JoinColumn(name = "PARTYROLE_ID"),@JoinColumn(name = "OTHER_ID") }, inverseJoinColumns = { @JoinColumn(name = "AGREEMENT_ID") })
  private List<AgreementRef> agreement = null;

  @JsonProperty("relatedParty")
  @Valid
  @OneToMany(fetch = FetchType.LAZY)
 	@JoinTable(schema = "party_schema", name = "PR_RELATEDPARTY", joinColumns = {
 			@JoinColumn(name = "PARTYROLE_ID"),@JoinColumn(name = "OTHER_ID") }, inverseJoinColumns = { @JoinColumn(name = "RELATEDPARTY_ID") })
  private List<RelatedPartyRef> relatedParty = null;

  public PartyRole baseType(String baseType) {
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

  public PartyRole schemaLocation(String schemaLocation) {
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

  public PartyRole type2(String type2) {
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

  public void setType2(String type2) {
    this.type2 = type2;
  }

  public PartyRole href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Url used to reference the party role.
   * @return href
  **/
  @ApiModelProperty(value = "Url used to reference the party role.")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public PartyRole id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for PartyRoles
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier for PartyRoles")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PartyRole name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A word, term, or phrase by which the PartyRole is known and distinguished from other PartyRoles.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A word, term, or phrase by which the PartyRole is known and distinguished from other PartyRoles.")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PartyRole status(String status) {
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

  public PartyRole statusReason(String statusReason) {
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

  public PartyRole validFor(TimePeriod validFor) {
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

  public PartyRole engagedParty(PartyRef engagedParty) {
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

  public PartyRole type(RoleTypeRef type) {
    this.type = type;
    return this;
  }

  /**
   * The role type - useful only in the context of a partnership defining more than one role type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The role type - useful only in the context of a partnership defining more than one role type.")
  @NotNull

  @Valid

  public RoleTypeRef getType() {
    return type;
  }

  public void setType(RoleTypeRef type) {
    this.type = type;
  }

  public PartyRole account(List<AccountRef> account) {
    this.account = account;
    return this;
  }

  public PartyRole addAccountItem(AccountRef accountItem) {
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

  public PartyRole paymentMethod(List<PaymentMethodRef> paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  public PartyRole addPaymentMethodItem(PaymentMethodRef paymentMethodItem) {
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

  public PartyRole contactMedium(List<ContactMedium> contactMedium) {
    this.contactMedium = contactMedium;
    return this;
  }

  public PartyRole addContactMediumItem(ContactMedium contactMediumItem) {
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

  public PartyRole characteristic(List<Characteristic> characteristic) {
    this.characteristic = characteristic;
    return this;
  }

  public PartyRole addCharacteristicItem(Characteristic characteristicItem) {
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

  public PartyRole creditProfile(List<CreditProfile> creditProfile) {
    this.creditProfile = creditProfile;
    return this;
  }

  public PartyRole addCreditProfileItem(CreditProfile creditProfileItem) {
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

  public PartyRole agreement(List<AgreementRef> agreement) {
    this.agreement = agreement;
    return this;
  }

  public PartyRole addAgreementItem(AgreementRef agreementItem) {
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

  public PartyRole relatedParty(List<RelatedPartyRef> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public PartyRole addRelatedPartyItem(RelatedPartyRef relatedPartyItem) {
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
    PartyRole partyRole = (PartyRole) o;
    return Objects.equals(this.baseType, partyRole.baseType) &&
        Objects.equals(this.schemaLocation, partyRole.schemaLocation) &&
        Objects.equals(this.type, partyRole.type) &&
        Objects.equals(this.href, partyRole.href) &&
        Objects.equals(this.id, partyRole.id) &&
        Objects.equals(this.name, partyRole.name) &&
        Objects.equals(this.status, partyRole.status) &&
        Objects.equals(this.statusReason, partyRole.statusReason) &&
        Objects.equals(this.validFor, partyRole.validFor) &&
        Objects.equals(this.engagedParty, partyRole.engagedParty) &&
        Objects.equals(this.type, partyRole.type) &&
        Objects.equals(this.account, partyRole.account) &&
        Objects.equals(this.paymentMethod, partyRole.paymentMethod) &&
        Objects.equals(this.contactMedium, partyRole.contactMedium) &&
        Objects.equals(this.characteristic, partyRole.characteristic) &&
        Objects.equals(this.creditProfile, partyRole.creditProfile) &&
        Objects.equals(this.agreement, partyRole.agreement) &&
        Objects.equals(this.relatedParty, partyRole.relatedParty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseType, schemaLocation, type, href, id, name, status, statusReason, validFor, engagedParty, type, account, paymentMethod, contactMedium, characteristic, creditProfile, agreement, relatedParty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyRole {\n");
    
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

