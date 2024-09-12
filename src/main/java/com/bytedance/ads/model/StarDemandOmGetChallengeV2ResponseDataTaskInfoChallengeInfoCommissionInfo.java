/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo {
  public static final String SERIALIZED_NAME_AD_COMMISSION_RATE = "ad_commission_rate";
  @SerializedName(SERIALIZED_NAME_AD_COMMISSION_RATE)
  private Long adCommissionRate = null;

  public static final String SERIALIZED_NAME_PAY_COMMISSION_RATE = "pay_commission_rate";
  @SerializedName(SERIALIZED_NAME_PAY_COMMISSION_RATE)
  private Long payCommissionRate = null;

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo() {
  }

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo adCommissionRate(Long adCommissionRate) {
    
    this.adCommissionRate = adCommissionRate;
    return this;
  }

   /**
   * 
   * @return adCommissionRate
  **/
  @javax.annotation.Nullable
  public Long getAdCommissionRate() {
    return adCommissionRate;
  }


  public void setAdCommissionRate(Long adCommissionRate) {
    this.adCommissionRate = adCommissionRate;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo payCommissionRate(Long payCommissionRate) {
    
    this.payCommissionRate = payCommissionRate;
    return this;
  }

   /**
   * 
   * @return payCommissionRate
  **/
  @javax.annotation.Nullable
  public Long getPayCommissionRate() {
    return payCommissionRate;
  }


  public void setPayCommissionRate(Long payCommissionRate) {
    this.payCommissionRate = payCommissionRate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo = (StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo) o;
    return Objects.equals(this.adCommissionRate, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo.adCommissionRate) &&
        Objects.equals(this.payCommissionRate, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo.payCommissionRate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adCommissionRate, payCommissionRate);
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
    sb.append("class StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo {\n");
    sb.append("    adCommissionRate: ").append(toIndentedString(adCommissionRate)).append("\n");
    sb.append("    payCommissionRate: ").append(toIndentedString(payCommissionRate)).append("\n");
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
    openapiFields.add("ad_commission_rate");
    openapiFields.add("pay_commission_rate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo>() {
           @Override
           public void write(JsonWriter out, StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo
  */
  public static StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo.class);
  }

 /**
  * Convert an instance of StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

