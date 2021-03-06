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

import io.swagger.annotations.ApiModelProperty;

/**
 * EventSubscription
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-01T13:16:10.737Z")
@Entity
@Table(name="event_subcription", schema="pr_schema")
@SequenceGenerator(name = "es_seq", sequenceName = "es_seq", allocationSize = 1)
public class EventSubscription   implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long tableId;
  @JsonProperty("id")
  @Column(nullable = true)
  private String id = null;

  @JsonProperty("callback")
  @Column(nullable = true)
  private String callback = null;

  @JsonProperty("query")
  @Column(nullable = true)
  private String query = null;

  public EventSubscription id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Id of the listener
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Id of the listener")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EventSubscription callback(String callback) {
    this.callback = callback;
    return this;
  }

  /**
   * The callback being registered.
   * @return callback
  **/
  @ApiModelProperty(required = true, value = "The callback being registered.")
  @NotNull


  public String getCallback() {
    return callback;
  }

  public void setCallback(String callback) {
    this.callback = callback;
  }

  public EventSubscription query(String query) {
    this.query = query;
    return this;
  }

  /**
   * additional data to be passed
   * @return query
  **/
  @ApiModelProperty(value = "additional data to be passed")


  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSubscription eventSubscription = (EventSubscription) o;
    return Objects.equals(this.id, eventSubscription.id) &&
        Objects.equals(this.callback, eventSubscription.callback) &&
        Objects.equals(this.query, eventSubscription.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, callback, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSubscription {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

