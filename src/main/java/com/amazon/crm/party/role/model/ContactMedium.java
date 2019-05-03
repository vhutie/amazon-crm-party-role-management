package com.amazon.crm.party.role.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Indicates the contact medium that could be used to contact the party.
 */
@ApiModel(description = "Indicates the contact medium that could be used to contact the party.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-01T13:16:10.737Z")
@Entity
@Table(name="contact_medium", schema="pr_schema")
@SequenceGenerator(name = "cm_seq", sequenceName = "cm_seq", allocationSize = 1)
public class ContactMedium   {
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

  @JsonProperty("preferred")
  @Column(nullable = true)
  private Boolean preferred = null;

  @JsonProperty("type")
  @Column(nullable = true)
  private String type = null;

  @JsonProperty("validFor")
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "VALIDFOR_ID")
  private TimePeriod validFor = null;

  @JsonProperty("characteristic")
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "CHARACTERISTIC_ID")
  private MediumCharacteristic characteristic = null;

  public ContactMedium baseType(String baseType) {
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

  public ContactMedium schemaLocation(String schemaLocation) {
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

  public ContactMedium type2(String type2) {
    this.type2 = type2;
    return this;
  }

  /**
   * Generic attribute containing the name of the resource class type
   * @return type
  **/
  @ApiModelProperty(value = "Generic attribute containing the name of the resource class type")


  public String getType2() {
    return type;
  }

  public void setType2(String type2) {
    this.type2 = type2;
  }

  public ContactMedium preferred(Boolean preferred) {
    this.preferred = preferred;
    return this;
  }

  /**
   * If true, indicates that is the preferred contact medium
   * @return preferred
  **/
  @ApiModelProperty(value = "If true, indicates that is the preferred contact medium")


  public Boolean isPreferred() {
    return preferred;
  }

  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }

  public ContactMedium type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the contact medium, such as: email address, telephone number, postal address
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of the contact medium, such as: email address, telephone number, postal address")
  @NotNull


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ContactMedium validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The time period that the contact medium is valid for
   * @return validFor
  **/
  @ApiModelProperty(value = "The time period that the contact medium is valid for")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public ContactMedium characteristic(MediumCharacteristic characteristic) {
    this.characteristic = characteristic;
    return this;
  }

  /**
   * Get characteristic
   * @return characteristic
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public MediumCharacteristic getCharacteristic() {
    return characteristic;
  }

  public void setCharacteristic(MediumCharacteristic characteristic) {
    this.characteristic = characteristic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactMedium contactMedium = (ContactMedium) o;
    return Objects.equals(this.baseType, contactMedium.baseType) &&
        Objects.equals(this.schemaLocation, contactMedium.schemaLocation) &&
        Objects.equals(this.type, contactMedium.type) &&
        Objects.equals(this.preferred, contactMedium.preferred) &&
        Objects.equals(this.type, contactMedium.type) &&
        Objects.equals(this.validFor, contactMedium.validFor) &&
        Objects.equals(this.characteristic, contactMedium.characteristic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseType, schemaLocation, type, preferred, type, validFor, characteristic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactMedium {\n");
    
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    characteristic: ").append(toIndentedString(characteristic)).append("\n");
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

