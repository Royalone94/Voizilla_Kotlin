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
import java.util.UUID;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Parking
 */
@ApiModel(description = "Parking")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2018-07-22T20:17:00.244187+02:00[Europe/Warsaw]")
public class Parking {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private GeoPoint location = null;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private MapAddress address = null;

  public static final String SERIALIZED_NAME_SPACES_COUNT = "spacesCount";
  @SerializedName(SERIALIZED_NAME_SPACES_COUNT)
  private Integer spacesCount = null;

  public static final String SERIALIZED_NAME_AVAILABLE_SPACES_COUNT = "availableSpacesCount";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_SPACES_COUNT)
  private Integer availableSpacesCount = null;

  public static final String SERIALIZED_NAME_CHARGERS = "chargers";
  @SerializedName(SERIALIZED_NAME_CHARGERS)
  private List<UUID> chargers = null;

  public Parking id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Identyfikator
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identyfikator")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Parking name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nazwa
   * @return name
  **/
  @ApiModelProperty(value = "Nazwa")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Parking description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Opis
   * @return description
  **/
  @ApiModelProperty(value = "Opis")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Parking location(GeoPoint location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public GeoPoint getLocation() {
    return location;
  }

  public void setLocation(GeoPoint location) {
    this.location = location;
  }

  public Parking address(MapAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public MapAddress getAddress() {
    return address;
  }

  public void setAddress(MapAddress address) {
    this.address = address;
  }

  public Parking spacesCount(Integer spacesCount) {
    this.spacesCount = spacesCount;
    return this;
  }

   /**
   * Liczba miejsc postojowych
   * @return spacesCount
  **/
  @ApiModelProperty(value = "Liczba miejsc postojowych")
  public Integer getSpacesCount() {
    return spacesCount;
  }

  public void setSpacesCount(Integer spacesCount) {
    this.spacesCount = spacesCount;
  }

  public Parking availableSpacesCount(Integer availableSpacesCount) {
    this.availableSpacesCount = availableSpacesCount;
    return this;
  }

   /**
   * Liczba wolnych miejsc
   * @return availableSpacesCount
  **/
  @ApiModelProperty(value = "Liczba wolnych miejsc")
  public Integer getAvailableSpacesCount() {
    return availableSpacesCount;
  }

  public void setAvailableSpacesCount(Integer availableSpacesCount) {
    this.availableSpacesCount = availableSpacesCount;
  }

  public Parking chargers(List<UUID> chargers) {
    this.chargers = chargers;
    return this;
  }

  public Parking addChargersItem(UUID chargersItem) {
    if (this.chargers == null) {
      this.chargers = new ArrayList<UUID>();
    }
    this.chargers.add(chargersItem);
    return this;
  }

   /**
   * List identyfikatorów ładowarek na parkingu
   * @return chargers
  **/
  @ApiModelProperty(value = "List identyfikatorów ładowarek na parkingu")
  public List<UUID> getChargers() {
    return chargers;
  }

  public void setChargers(List<UUID> chargers) {
    this.chargers = chargers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parking parking = (Parking) o;
    return Objects.equals(this.id, parking.id) &&
        Objects.equals(this.name, parking.name) &&
        Objects.equals(this.description, parking.description) &&
        Objects.equals(this.location, parking.location) &&
        Objects.equals(this.address, parking.address) &&
        Objects.equals(this.spacesCount, parking.spacesCount) &&
        Objects.equals(this.availableSpacesCount, parking.availableSpacesCount) &&
        Objects.equals(this.chargers, parking.chargers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, location, address, spacesCount, availableSpacesCount, chargers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parking {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    spacesCount: ").append(toIndentedString(spacesCount)).append("\n");
    sb.append("    availableSpacesCount: ").append(toIndentedString(availableSpacesCount)).append("\n");
    sb.append("    chargers: ").append(toIndentedString(chargers)).append("\n");
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

