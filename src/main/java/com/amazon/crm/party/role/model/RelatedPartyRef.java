package com.amazon.crm.party.role.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RelatedParty reference. A related party defines party or party role linked to a specific entity.
 */
@ApiModel(description = "RelatedParty reference. A related party defines party or party role linked to a specific entity.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-01T13:16:10.737Z")
@Entity
@Table(name="related_party_ref", schema="pr_schema")
@SequenceGenerator(name = "rpr_seq", sequenceName = "rpr_seq", allocationSize = 1)
public class RelatedPartyRef   {
	@Id
	@GeneratedValue
	private Long tableId;
  @JsonProperty("@referredType")
  @Column(nullable = true)
  private String referredType = null;

  @JsonProperty("href")
  @Column(nullable = true)
  private String href = null;

  @JsonProperty("id")
  @Column(nullable = true)
  private String id = null;

  @JsonProperty("name")
  @Column(nullable = true)
  private String name = null;

  @JsonProperty("role")
  @Column(nullable = true)
  private String role = null;

  public RelatedPartyRef referredType(String referredType) {
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

  public RelatedPartyRef href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the related party, could be a party reference or a party role reference
   * @return href
  **/
  @ApiModelProperty(value = "Reference of the related party, could be a party reference or a party role reference")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public RelatedPartyRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of a related party
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of a related party")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RelatedPartyRef name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the related party
   * @return name
  **/
  @ApiModelProperty(value = "Name of the related party")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RelatedPartyRef role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Role of the related party.
   * @return role
  **/
  @ApiModelProperty(value = "Role of the related party.")


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedPartyRef relatedPartyRef = (RelatedPartyRef) o;
    return Objects.equals(this.referredType, relatedPartyRef.referredType) &&
        Objects.equals(this.href, relatedPartyRef.href) &&
        Objects.equals(this.id, relatedPartyRef.id) &&
        Objects.equals(this.name, relatedPartyRef.name) &&
        Objects.equals(this.role, relatedPartyRef.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referredType, href, id, name, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedPartyRef {\n");
    
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

