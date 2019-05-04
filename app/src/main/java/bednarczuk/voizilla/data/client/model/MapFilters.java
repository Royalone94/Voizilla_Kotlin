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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Filtry wyszukiwania obiektów na mapie.
 */
@ApiModel(description = "Filtry wyszukiwania obiektów na mapie.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2018-07-22T20:17:00.244187+02:00[Europe/Warsaw]")
public class MapFilters {
  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private Map<String, Map<String, String>> filters = null;

  public MapFilters filters(Map<String, Map<String, String>> filters) {
    this.filters = filters;
    return this;
  }

  public MapFilters putFiltersItem(String key, Map<String, String> filtersItem) {
    if (this.filters == null) {
      this.filters = new HashMap<String, Map<String, String>>();
    }
    this.filters.put(key, filtersItem);
    return this;
  }

   /**
   * Mapa filtrów. Dla każdego klucza dostępny słwonik (id, name).
   * @return filters
  **/
  @ApiModelProperty(value = "Mapa filtrów. Dla każdego klucza dostępny słwonik (id, name).")
  public Map<String, Map<String, String>> getFilters() {
    return filters;
  }

  public void setFilters(Map<String, Map<String, String>> filters) {
    this.filters = filters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MapFilters mapFilters = (MapFilters) o;
    return Objects.equals(this.filters, mapFilters.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapFilters {\n");

    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

