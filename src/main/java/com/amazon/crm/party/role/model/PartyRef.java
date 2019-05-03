package com.amazon.crm.party.role.model;

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
 * Party reference. A party represents an organization or an individual.
 */
@ApiModel(description = "Party reference. A party represents an organization or an individual.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-01T13:16:10.737Z")
@Entity
@Table(name="party_ref", schema="pr_schema")
@SequenceGenerator(name = "pr_seq", sequenceName = "pr_seq", allocationSize = 1)
public class PartyRef   {
	@Id
	@GeneratedValue
	private Long tableId;
  @JsonProperty("@referredType")
  @Column(nullable = true)
  private String referredType = null;

  @JsonProperty("description")
  @Column(nullable = true)
  private String description = null;

  @JsonProperty("href")
  @Column(nullable = true)
  private String href = null;

  @JsonProperty("id")
  @Column(nullable = true)
  private String id = null;

  @JsonProperty("name")
  @Column(nullable = true)
  private String name = null;

  public PartyRef referredType(String referredType) {
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

  public PartyRef description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Text describing the referred party
   * @return description
  **/
  @ApiModelProperty(value = "Text describing the referred party")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PartyRef href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the referred party (such as a partner or any other party role).
   * @return href
  **/
  @ApiModelProperty(required = true, value = "Reference of the referred party (such as a partner or any other party role).")
  @NotNull


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public PartyRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the referred party
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the referred party")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PartyRef name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the referred party (such as a partner or any other party role)
   * @return name
  **/
  @ApiModelProperty(value = "Name of the referred party (such as a partner or any other party role)")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyRef partyRef = (PartyRef) o;
    return Objects.equals(this.referredType, partyRef.referredType) &&
        Objects.equals(this.description, partyRef.description) &&
        Objects.equals(this.href, partyRef.href) &&
        Objects.equals(this.id, partyRef.id) &&
        Objects.equals(this.name, partyRef.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referredType, description, href, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyRef {\n");
    
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

