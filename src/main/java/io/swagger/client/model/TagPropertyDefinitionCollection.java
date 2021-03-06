/*
 * Veritas Information Classifier (VIC)
 * APIs
 *
 * OpenAPI spec version: Resource Specific
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.TagPropertyDefinition;
import java.util.ArrayList;
import java.util.List;

/**
 * TagPropertyDefinitionCollection
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-12T23:16:03.318Z")
public class TagPropertyDefinitionCollection {
  @SerializedName("totalItems")
  private Integer totalItems = null;

  @SerializedName("items")
  private List<TagPropertyDefinition> items = new ArrayList<TagPropertyDefinition>();

  public TagPropertyDefinitionCollection totalItems(Integer totalItems) {
    this.totalItems = totalItems;
    return this;
  }

   /**
   * Get totalItems
   * @return totalItems
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }

  public TagPropertyDefinitionCollection items(List<TagPropertyDefinition> items) {
    this.items = items;
    return this;
  }

  public TagPropertyDefinitionCollection addItemsItem(TagPropertyDefinition itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<TagPropertyDefinition> getItems() {
    return items;
  }

  public void setItems(List<TagPropertyDefinition> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagPropertyDefinitionCollection tagPropertyDefinitionCollection = (TagPropertyDefinitionCollection) o;
    return Objects.equals(this.totalItems, tagPropertyDefinitionCollection.totalItems) &&
        Objects.equals(this.items, tagPropertyDefinitionCollection.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalItems, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagPropertyDefinitionCollection {\n");
    
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

