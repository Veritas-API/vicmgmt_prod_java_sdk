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

/**
 * A JSONPatch document as defined by RFC 6902
 */
@ApiModel(description = "A JSONPatch document as defined by RFC 6902")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-12T23:16:03.318Z")
public class JsonPatchDocument {
  /**
   * The operation to be performed
   */
  public enum OpEnum {
    @SerializedName("add")
    ADD("add"),
    
    @SerializedName("remove")
    REMOVE("remove"),
    
    @SerializedName("replace")
    REPLACE("replace"),
    
    @SerializedName("move")
    MOVE("move"),
    
    @SerializedName("copy")
    COPY("copy"),
    
    @SerializedName("test")
    TEST("test");

    private String value;

    OpEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("op")
  private OpEnum op = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("value")
  private Object value = null;

  @SerializedName("from")
  private String from = null;

  public JsonPatchDocument op(OpEnum op) {
    this.op = op;
    return this;
  }

   /**
   * The operation to be performed
   * @return op
  **/
  @ApiModelProperty(example = "null", required = true, value = "The operation to be performed")
  public OpEnum getOp() {
    return op;
  }

  public void setOp(OpEnum op) {
    this.op = op;
  }

  public JsonPatchDocument path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Path of the value to operate on
   * @return path
  **/
  @ApiModelProperty(example = "null", required = true, value = "Path of the value to operate on")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public JsonPatchDocument value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * The value for the operation.
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "The value for the operation.")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public JsonPatchDocument from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonPatchDocument jsonPatchDocument = (JsonPatchDocument) o;
    return Objects.equals(this.op, jsonPatchDocument.op) &&
        Objects.equals(this.path, jsonPatchDocument.path) &&
        Objects.equals(this.value, jsonPatchDocument.value) &&
        Objects.equals(this.from, jsonPatchDocument.from);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, path, value, from);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonPatchDocument {\n");
    
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
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

