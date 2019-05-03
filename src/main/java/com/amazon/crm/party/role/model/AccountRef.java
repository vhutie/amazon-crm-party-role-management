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
 * Account reference. A account may be a party account or a financial account.
 */
@ApiModel(description = "Account reference. A account may be a party account or a financial account.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-01T13:16:10.737Z")
@Entity
@Table(name="account_ref", schema="pr_schema")
@SequenceGenerator(name = "ar_seq", sequenceName = "ar_seq", allocationSize = 1)
public class AccountRef    implements Serializable {
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

  public AccountRef referredType(String referredType) {
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

  public AccountRef description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Detailed description of the account
   * @return description
  **/
  @ApiModelProperty(value = "Detailed description of the account")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AccountRef href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the account
   * @return href
  **/
  @ApiModelProperty(required = true, value = "Reference of the account")
  @NotNull


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public AccountRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the account
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the account")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AccountRef name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the account
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the account")
  @NotNull


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
    AccountRef accountRef = (AccountRef) o;
    return Objects.equals(this.referredType, accountRef.referredType) &&
        Objects.equals(this.description, accountRef.description) &&
        Objects.equals(this.href, accountRef.href) &&
        Objects.equals(this.id, accountRef.id) &&
        Objects.equals(this.name, accountRef.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referredType, description, href, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRef {\n");
    
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

