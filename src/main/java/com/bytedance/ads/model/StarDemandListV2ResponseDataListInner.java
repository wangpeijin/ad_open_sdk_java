/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarDemandListV2DataListComponentType;
import com.bytedance.ads.model.StarDemandListV2DataListUniversalSettlementType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bytedance.ads.JSON;

/**
 * StarDemandListV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class StarDemandListV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_COMPONENT_TYPE = "component_type";
  @SerializedName(SERIALIZED_NAME_COMPONENT_TYPE)
  private StarDemandListV2DataListComponentType componentType = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_DEMAND_ID = "demand_id";
  @SerializedName(SERIALIZED_NAME_DEMAND_ID)
  private Long demandId = null;

  public static final String SERIALIZED_NAME_DEMAND_NAME = "demand_name";
  @SerializedName(SERIALIZED_NAME_DEMAND_NAME)
  private String demandName = null;

  public static final String SERIALIZED_NAME_UNIVERSAL_SETTLEMENT_TYPE = "universal_settlement_type";
  @SerializedName(SERIALIZED_NAME_UNIVERSAL_SETTLEMENT_TYPE)
  private StarDemandListV2DataListUniversalSettlementType universalSettlementType = null;

  public StarDemandListV2ResponseDataListInner() {
  }

  
  public StarDemandListV2ResponseDataListInner(
     String createTime
  ) {
    this();
    this.createTime = createTime;
  }

  public StarDemandListV2ResponseDataListInner componentType(StarDemandListV2DataListComponentType componentType) {
    
    this.componentType = componentType;
    return this;
  }

   /**
   * Get componentType
   * @return componentType
  **/
  @javax.annotation.Nullable
  public StarDemandListV2DataListComponentType getComponentType() {
    return componentType;
  }


  public void setComponentType(StarDemandListV2DataListComponentType componentType) {
    this.componentType = componentType;
  }


   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }




  public StarDemandListV2ResponseDataListInner demandId(Long demandId) {
    
    this.demandId = demandId;
    return this;
  }

   /**
   * 
   * @return demandId
  **/
  @javax.annotation.Nullable
  public Long getDemandId() {
    return demandId;
  }


  public void setDemandId(Long demandId) {
    this.demandId = demandId;
  }


  public StarDemandListV2ResponseDataListInner demandName(String demandName) {
    
    this.demandName = demandName;
    return this;
  }

   /**
   * 
   * @return demandName
  **/
  @javax.annotation.Nullable
  public String getDemandName() {
    return demandName;
  }


  public void setDemandName(String demandName) {
    this.demandName = demandName;
  }


  public StarDemandListV2ResponseDataListInner universalSettlementType(StarDemandListV2DataListUniversalSettlementType universalSettlementType) {
    
    this.universalSettlementType = universalSettlementType;
    return this;
  }

   /**
   * Get universalSettlementType
   * @return universalSettlementType
  **/
  @javax.annotation.Nullable
  public StarDemandListV2DataListUniversalSettlementType getUniversalSettlementType() {
    return universalSettlementType;
  }


  public void setUniversalSettlementType(StarDemandListV2DataListUniversalSettlementType universalSettlementType) {
    this.universalSettlementType = universalSettlementType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandListV2ResponseDataListInner starDemandListV2ResponseDataListInner = (StarDemandListV2ResponseDataListInner) o;
    return Objects.equals(this.componentType, starDemandListV2ResponseDataListInner.componentType) &&
        Objects.equals(this.createTime, starDemandListV2ResponseDataListInner.createTime) &&
        Objects.equals(this.demandId, starDemandListV2ResponseDataListInner.demandId) &&
        Objects.equals(this.demandName, starDemandListV2ResponseDataListInner.demandName) &&
        Objects.equals(this.universalSettlementType, starDemandListV2ResponseDataListInner.universalSettlementType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentType, createTime, demandId, demandName, universalSettlementType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandListV2ResponseDataListInner {\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    demandId: ").append(toIndentedString(demandId)).append("\n");
    sb.append("    demandName: ").append(toIndentedString(demandName)).append("\n");
    sb.append("    universalSettlementType: ").append(toIndentedString(universalSettlementType)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("component_type");
    openapiFields.add("create_time");
    openapiFields.add("demand_id");
    openapiFields.add("demand_name");
    openapiFields.add("universal_settlement_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandListV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandListV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandListV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandListV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandListV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, StarDemandListV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandListV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandListV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandListV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to StarDemandListV2ResponseDataListInner
  */
  public static StarDemandListV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandListV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of StarDemandListV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

