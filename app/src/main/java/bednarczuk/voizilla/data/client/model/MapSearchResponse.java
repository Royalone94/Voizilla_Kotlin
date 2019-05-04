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
 * Map search response
 */
@ApiModel(description = "Map search response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2018-07-22T20:17:00.244187+02:00[Europe/Warsaw]")
public class MapSearchResponse {
  public static final String SERIALIZED_NAME_ZONES = "zones";
  @SerializedName(SERIALIZED_NAME_ZONES)
  private List<Zone> zones = null;

  public static final String SERIALIZED_NAME_PARKING = "parking";
  @SerializedName(SERIALIZED_NAME_PARKING)
  private List<Parking> parking = null;

  public static final String SERIALIZED_NAME_VEHICLES = "vehicles";
  @SerializedName(SERIALIZED_NAME_VEHICLES)
  private List<Vehicle> vehicles = null;

  public static final String SERIALIZED_NAME_CHARGERS = "chargers";
  @SerializedName(SERIALIZED_NAME_CHARGERS)
  private List<Charger> chargers = null;

  public static final String SERIALIZED_NAME_POI = "poi";
  @SerializedName(SERIALIZED_NAME_POI)
  private List<POI> poi = null;

  public MapSearchResponse zones(List<Zone> zones) {
    this.zones = zones;
    return this;
  }

  public MapSearchResponse addZonesItem(Zone zonesItem) {
    if (this.zones == null) {
      this.zones = new ArrayList<Zone>();
    }
    this.zones.add(zonesItem);
    return this;
  }

   /**
   * Strefy
   * @return zones
  **/
  @ApiModelProperty(value = "Strefy")
  public List<Zone> getZones() {
    return zones;
  }

  public void setZones(List<Zone> zones) {
    this.zones = zones;
  }

  public MapSearchResponse parking(List<Parking> parking) {
    this.parking = parking;
    return this;
  }

  public MapSearchResponse addParkingItem(Parking parkingItem) {
    if (this.parking == null) {
      this.parking = new ArrayList<Parking>();
    }
    this.parking.add(parkingItem);
    return this;
  }

   /**
   * Parkingi
   * @return parking
  **/
  @ApiModelProperty(value = "Parkingi")
  public List<Parking> getParking() {
    return parking;
  }

  public void setParking(List<Parking> parking) {
    this.parking = parking;
  }

  public MapSearchResponse vehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public MapSearchResponse addVehiclesItem(Vehicle vehiclesItem) {
    if (this.vehicles == null) {
      this.vehicles = new ArrayList<Vehicle>();
    }
    this.vehicles.add(vehiclesItem);
    return this;
  }

   /**
   * Pojazdy
   * @return vehicles
  **/
  @ApiModelProperty(value = "Pojazdy")
  public List<Vehicle> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }

  public MapSearchResponse chargers(List<Charger> chargers) {
    this.chargers = chargers;
    return this;
  }

  public MapSearchResponse addChargersItem(Charger chargersItem) {
    if (this.chargers == null) {
      this.chargers = new ArrayList<Charger>();
    }
    this.chargers.add(chargersItem);
    return this;
  }

   /**
   * Ładowarki
   * @return chargers
  **/
  @ApiModelProperty(value = "Ładowarki")
  public List<Charger> getChargers() {
    return chargers;
  }

  public void setChargers(List<Charger> chargers) {
    this.chargers = chargers;
  }

  public MapSearchResponse poi(List<POI> poi) {
    this.poi = poi;
    return this;
  }

  public MapSearchResponse addPoiItem(POI poiItem) {
    if (this.poi == null) {
      this.poi = new ArrayList<POI>();
    }
    this.poi.add(poiItem);
    return this;
  }

   /**
   * POI
   * @return poi
  **/
  @ApiModelProperty(value = "POI")
  public List<POI> getPoi() {
    return poi;
  }

  public void setPoi(List<POI> poi) {
    this.poi = poi;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MapSearchResponse mapSearchResponse = (MapSearchResponse) o;
    return Objects.equals(this.zones, mapSearchResponse.zones) &&
        Objects.equals(this.parking, mapSearchResponse.parking) &&
        Objects.equals(this.vehicles, mapSearchResponse.vehicles) &&
        Objects.equals(this.chargers, mapSearchResponse.chargers) &&
        Objects.equals(this.poi, mapSearchResponse.poi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zones, parking, vehicles, chargers, poi);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapSearchResponse {\n");

    sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
    sb.append("    parking: ").append(toIndentedString(parking)).append("\n");
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
    sb.append("    chargers: ").append(toIndentedString(chargers)).append("\n");
    sb.append("    poi: ").append(toIndentedString(poi)).append("\n");
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

