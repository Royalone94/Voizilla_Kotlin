/*
 * API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: v0.11.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package bednarczuk.voizilla.data.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Violation problem
 */
@ApiModel(description = "Violation problem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2018-07-22T20:17:00.244187+02:00[Europe/Warsaw]")
public class ViolationProblem {
  public static final String SERIALIZED_NAME_VIOLATIONS = "violations";
  @SerializedName(SERIALIZED_NAME_VIOLATIONS)
  private List<Violation> violations = new ArrayList<Violation>();

  public static final String SERIALIZED_NAME_HTTP_CODE = "httpCode";
  @SerializedName(SERIALIZED_NAME_HTTP_CODE)
  private Integer httpCode = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message = null;

  public static final String SERIALIZED_NAME_CODES = "codes";
  @SerializedName(SERIALIZED_NAME_CODES)
  private List<String> codes = null;

  public ViolationProblem violations(List<Violation> violations) {
    this.violations = violations;
    return this;
  }

  public ViolationProblem addViolationsItem(Violation violationsItem) {
    this.violations.add(violationsItem);
    return this;
  }

   /**
   * Violations
   * @return violations
  **/
  @ApiModelProperty(required = true, value = "Violations")
  public List<Violation> getViolations() {
    return violations;
  }

  public void setViolations(List<Violation> violations) {
    this.violations = violations;
  }

  public ViolationProblem httpCode(Integer httpCode) {
    this.httpCode = httpCode;
    return this;
  }

   /**
   * HTTP code
   * @return httpCode
  **/
  @ApiModelProperty(required = true, value = "HTTP code")
  public Integer getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(Integer httpCode) {
    this.httpCode = httpCode;
  }

  public ViolationProblem type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ViolationProblem message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Message
   * @return message
  **/
  @ApiModelProperty(required = true, value = "Message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ViolationProblem codes(List<String> codes) {
    this.codes = codes;
    return this;
  }

  public ViolationProblem addCodesItem(String codesItem) {
    if (this.codes == null) {
      this.codes = new ArrayList<String>();
    }
    this.codes.add(codesItem);
    return this;
  }

   /**
   * Codes
   * @return codes
  **/
  @ApiModelProperty(value = "Codes")
  public List<String> getCodes() {
    return codes;
  }

  public void setCodes(List<String> codes) {
    this.codes = codes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViolationProblem violationProblem = (ViolationProblem) o;
    return Objects.equals(this.violations, violationProblem.violations) &&
        Objects.equals(this.httpCode, violationProblem.httpCode) &&
        Objects.equals(this.type, violationProblem.type) &&
        Objects.equals(this.message, violationProblem.message) &&
        Objects.equals(this.codes, violationProblem.codes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(violations, httpCode, type, message, codes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViolationProblem {\n");

    sb.append("    violations: ").append(toIndentedString(violations)).append("\n");
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
