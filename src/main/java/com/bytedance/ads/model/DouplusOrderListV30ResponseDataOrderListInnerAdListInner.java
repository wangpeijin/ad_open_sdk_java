/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 0.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.DouplusOrderListV30DataOrderListAdListAdStatus;
import com.bytedance.ads.model.DouplusOrderListV30DataOrderListAdListBidMode;
import com.bytedance.ads.model.DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * DouplusOrderListV30ResponseDataOrderListInnerAdListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-08-01T18:09:26.254+08:00[Asia/Shanghai]")
public class DouplusOrderListV30ResponseDataOrderListInnerAdListInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_AD_STATUS = "ad_status";
  @SerializedName(SERIALIZED_NAME_AD_STATUS)
  private DouplusOrderListV30DataOrderListAdListAdStatus adStatus = null;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience audience = null;

  public static final String SERIALIZED_NAME_BID_MODE = "bid_mode";
  @SerializedName(SERIALIZED_NAME_BID_MODE)
  private DouplusOrderListV30DataOrderListAdListBidMode bidMode = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Long budget = null;

  public static final String SERIALIZED_NAME_CPA_BID = "cpa_bid";
  @SerializedName(SERIALIZED_NAME_CPA_BID)
  private Long cpaBid = null;

  public static final String SERIALIZED_NAME_DELIVERY_TIME = "delivery_time";
  @SerializedName(SERIALIZED_NAME_DELIVERY_TIME)
  private Double deliveryTime = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private Long externalAction = null;

  public static final String SERIALIZED_NAME_IS_FANS = "is_fans";
  @SerializedName(SERIALIZED_NAME_IS_FANS)
  private Boolean isFans = null;

  public DouplusOrderListV30ResponseDataOrderListInnerAdListInner() {
  }

  public DouplusOrderListV30ResponseDataOrderListInnerAdListInner adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerAdListInner adStatus(DouplusOrderListV30DataOrderListAdListAdStatus adStatus) {
    
    this.adStatus = adStatus;
    return this;
  }

   /**
   * Get adStatus
   * @return adStatus
  **/
  @javax.annotation.Nullable
  public DouplusOrderListV30DataOrderListAdListAdStatus getAdStatus() {
    return adStatus;
  }


  public void setAdStatus(DouplusOrderListV30DataOrderListAdListAdStatus adStatus) {
    this.adStatus = adStatus;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerAdListInner audience(DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @javax.annotation.Nullable
  public DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience getAudience() {
    return audience;
  }


  public void setAudience(DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience audience) {
    this.audience = audience;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerAdListInner bidMode(DouplusOrderListV30DataOrderListAdListBidMode bidMode) {
    
    this.bidMode = bidMode;
    return this;
  }

   /**
   * Get bidMode
   * @return bidMode
  **/
  @javax.annotation.Nullable
  public DouplusOrderListV30DataOrderListAdListBidMode getBidMode() {
    return bidMode;
  }


  public void setBidMode(DouplusOrderListV30DataOrderListAdListBidMode bidMode) {
    this.bidMode = bidMode;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerAdListInner budget(Long budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 
   * @return budget
  **/
  @javax.annotation.Nullable
  public Long getBudget() {
    return budget;
  }


  public void setBudget(Long budget) {
    this.budget = budget;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerAdListInner cpaBid(Long cpaBid) {
    
    this.cpaBid = cpaBid;
    return this;
  }

   /**
   * 
   * @return cpaBid
  **/
  @javax.annotation.Nullable
  public Long getCpaBid() {
    return cpaBid;
  }


  public void setCpaBid(Long cpaBid) {
    this.cpaBid = cpaBid;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerAdListInner deliveryTime(Double deliveryTime) {
    
    this.deliveryTime = deliveryTime;
    return this;
  }

   /**
   * 
   * @return deliveryTime
  **/
  @javax.annotation.Nullable
  public Double getDeliveryTime() {
    return deliveryTime;
  }


  public void setDeliveryTime(Double deliveryTime) {
    this.deliveryTime = deliveryTime;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerAdListInner externalAction(Long externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * 
   * @return externalAction
  **/
  @javax.annotation.Nullable
  public Long getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(Long externalAction) {
    this.externalAction = externalAction;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerAdListInner isFans(Boolean isFans) {
    
    this.isFans = isFans;
    return this;
  }

   /**
   * 
   * @return isFans
  **/
  @javax.annotation.Nullable
  public Boolean getIsFans() {
    return isFans;
  }


  public void setIsFans(Boolean isFans) {
    this.isFans = isFans;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DouplusOrderListV30ResponseDataOrderListInnerAdListInner douplusOrderListV30ResponseDataOrderListInnerAdListInner = (DouplusOrderListV30ResponseDataOrderListInnerAdListInner) o;
    return Objects.equals(this.adId, douplusOrderListV30ResponseDataOrderListInnerAdListInner.adId) &&
        Objects.equals(this.adStatus, douplusOrderListV30ResponseDataOrderListInnerAdListInner.adStatus) &&
        Objects.equals(this.audience, douplusOrderListV30ResponseDataOrderListInnerAdListInner.audience) &&
        Objects.equals(this.bidMode, douplusOrderListV30ResponseDataOrderListInnerAdListInner.bidMode) &&
        Objects.equals(this.budget, douplusOrderListV30ResponseDataOrderListInnerAdListInner.budget) &&
        Objects.equals(this.cpaBid, douplusOrderListV30ResponseDataOrderListInnerAdListInner.cpaBid) &&
        Objects.equals(this.deliveryTime, douplusOrderListV30ResponseDataOrderListInnerAdListInner.deliveryTime) &&
        Objects.equals(this.externalAction, douplusOrderListV30ResponseDataOrderListInnerAdListInner.externalAction) &&
        Objects.equals(this.isFans, douplusOrderListV30ResponseDataOrderListInnerAdListInner.isFans);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, adStatus, audience, bidMode, budget, cpaBid, deliveryTime, externalAction, isFans);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DouplusOrderListV30ResponseDataOrderListInnerAdListInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    adStatus: ").append(toIndentedString(adStatus)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    bidMode: ").append(toIndentedString(bidMode)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    cpaBid: ").append(toIndentedString(cpaBid)).append("\n");
    sb.append("    deliveryTime: ").append(toIndentedString(deliveryTime)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    isFans: ").append(toIndentedString(isFans)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("ad_status");
    openapiFields.add("audience");
    openapiFields.add("bid_mode");
    openapiFields.add("budget");
    openapiFields.add("cpa_bid");
    openapiFields.add("delivery_time");
    openapiFields.add("external_action");
    openapiFields.add("is_fans");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DouplusOrderListV30ResponseDataOrderListInnerAdListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DouplusOrderListV30ResponseDataOrderListInnerAdListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DouplusOrderListV30ResponseDataOrderListInnerAdListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DouplusOrderListV30ResponseDataOrderListInnerAdListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DouplusOrderListV30ResponseDataOrderListInnerAdListInner>() {
           @Override
           public void write(JsonWriter out, DouplusOrderListV30ResponseDataOrderListInnerAdListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DouplusOrderListV30ResponseDataOrderListInnerAdListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DouplusOrderListV30ResponseDataOrderListInnerAdListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DouplusOrderListV30ResponseDataOrderListInnerAdListInner
  * @throws IOException if the JSON string is invalid with respect to DouplusOrderListV30ResponseDataOrderListInnerAdListInner
  */
  public static DouplusOrderListV30ResponseDataOrderListInnerAdListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DouplusOrderListV30ResponseDataOrderListInnerAdListInner.class);
  }

 /**
  * Convert an instance of DouplusOrderListV30ResponseDataOrderListInnerAdListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

