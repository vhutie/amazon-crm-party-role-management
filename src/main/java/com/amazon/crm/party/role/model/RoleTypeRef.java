package com.amazon.crm.party.role.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RoleType reference.
 */
@ApiModel(description = "RoleType reference.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-01T13:16:10.737Z")
@Entity
@Table(name="role_type_ref", schema="pr_schema")
@SequenceGenerator(name = "rtr_seq", sequenceName = "rtr_seq", allocationSize = 1)
public class RoleTypeRef    implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long tableId;
  @JsonProperty("@referredType")
  @Column(nullable = true)
  private String referredType = null;

  @JsonProperty("name")
  @Column(nullable = true)
  private String name = null;

  @JsonProperty("partnershipHref")
  @Column(nullable = true)
  private String partnershipHref = null;

  @JsonProperty("partnershipId")
  @Column(nullable = true)
  private String partnershipId = null;

  @JsonProperty("partnershipName")
  @Column(nullable = true)
  private String partnershipName = null;

  public RoleTypeRef referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

  /**
   * Generic attribute indicating the name of the class type of the referred resource entity.
   * @return referredType
  **/
  @ApiModelProperty(value = "Generic attribute indicating the name of the class type of the referred resource entity.")


  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }

  public RoleTypeRef name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the role type. It uniquely identifies the role type within the partnership type.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the role type. It uniquely identifies the role type within the partnership type.")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RoleTypeRef partnershipHref(String partnershipHref) {
    this.partnershipHref = partnershipHref;
    return this;
  }

  /**
   * Reference url of the partnership type containing the role type
   * @return partnershipHref
  **/
  @ApiModelProperty(value = "Reference url of the partnership type containing the role type")


  public String getPartnershipHref() {
    return partnershipHref;
  }

  public void setPartnershipHref(String partnershipHref) {
    this.partnershipHref = partnershipHref;
  }

  public RoleTypeRef partnershipId(String partnershipId) {
    this.partnershipId = partnershipId;
    return this;
  }

  /**
   * The identifier of the partnership type containing the role type
   * @return partnershipId
  **/
  @ApiModelProperty(value = "The identifier of the partnership type containing the role type")


  public String getPartnershipId() {
    return partnershipId;
  }

  public void setPartnershipId(String partnershipId) {
    this.partnershipId = partnershipId;
  }

  public RoleTypeRef partnershipName(String partnershipName) {
    this.partnershipName = partnershipName;
    return this;
  }

  /**
   * The name of the partnership type defining this role type
   * @return partnershipName
  **/
  @ApiModelProperty(value = "The name of the partnership type defining this role type")


  public String getPartnershipName() {
    return partnershipName;
  }

  public void setPartnershipName(String partnershipName) {
    this.partnershipName = partnershipName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleTypeRef roleTypeRef = (RoleTypeRef) o;
    return Objects.equals(this.referredType, roleTypeRef.referredType) &&
        Objects.equals(this.name, roleTypeRef.name) &&
        Objects.equals(this.partnershipHref, roleTypeRef.partnershipHref) &&
        Objects.equals(this.partnershipId, roleTypeRef.partnershipId) &&
        Objects.equals(this.partnershipName, roleTypeRef.partnershipName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referredType, name, partnershipHref, partnershipId, partnershipName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleTypeRef {\n");
    
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    partnershipHref: ").append(toIndentedString(partnershipHref)).append("\n");
    sb.append("    partnershipId: ").append(toIndentedString(partnershipId)).append("\n");
    sb.append("    partnershipName: ").append(toIndentedString(partnershipName)).append("\n");
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

