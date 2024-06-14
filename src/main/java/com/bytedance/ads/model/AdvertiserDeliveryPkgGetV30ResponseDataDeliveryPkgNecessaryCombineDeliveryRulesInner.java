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
import com.bytedance.ads.model.AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner {
  public static final String SERIALIZED_NAME_DELIVERIES = "deliveries";
  @SerializedName(SERIALIZED_NAME_DELIVERIES)
  private List<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner> deliveries = null;

  public static final String SERIALIZED_NAME_RULE_ID = "rule_id";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private Long ruleId = null;

  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner() {
  }

  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner deliveries(List<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner> deliveries) {
    
    this.deliveries = deliveries;
    return this;
  }

  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner addDeliveriesItem(AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner deliveriesItem) {
    if (this.deliveries == null) {
      this.deliveries = new ArrayList<>();
    }
    this.deliveries.add(deliveriesItem);
    return this;
  }

   /**
   * 资质的具体信息
   * @return deliveries
  **/
  @javax.annotation.Nullable
  public List<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner> getDeliveries() {
    return deliveries;
  }


  public void setDeliveries(List<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner> deliveries) {
    this.deliveries = deliveries;
  }


  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner ruleId(Long ruleId) {
    
    this.ruleId = ruleId;
    return this;
  }

   /**
   * 原子规则id
   * @return ruleId
  **/
  @javax.annotation.Nullable
  public Long getRuleId() {
    return ruleId;
  }


  public void setRuleId(Long ruleId) {
    this.ruleId = ruleId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner advertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner = (AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner) o;
    return Objects.equals(this.deliveries, advertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner.deliveries) &&
        Objects.equals(this.ruleId, advertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner.ruleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveries, ruleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner {\n");
    sb.append("    deliveries: ").append(toIndentedString(deliveries)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
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
    openapiFields.add("deliveries");
    openapiFields.add("rule_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("deliveries");
    openapiRequiredFields.add("rule_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner>() {
           @Override
           public void write(JsonWriter out, AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner
  * @throws IOException if the JSON string is invalid with respect to AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner
  */
  public static AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner.class);
  }

 /**
  * Convert an instance of AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

