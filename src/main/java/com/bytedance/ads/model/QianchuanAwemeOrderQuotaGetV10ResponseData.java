/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class QianchuanAwemeOrderQuotaGetV10ResponseData {
  public static final String SERIALIZED_NAME_MAX_COST = "max_cost";
  @SerializedName(SERIALIZED_NAME_MAX_COST)
  private Double maxCost = null;

  public static final String SERIALIZED_NAME_QUOTA_GEAR = "quota_gear";
  @SerializedName(SERIALIZED_NAME_QUOTA_GEAR)
  private Long quotaGear = null;

  public static final String SERIALIZED_NAME_SUM_QUOTA = "sum_quota";
  @SerializedName(SERIALIZED_NAME_SUM_QUOTA)
  private Long sumQuota = null;

  public static final String SERIALIZED_NAME_TERMINATE_QUOTA_INFO = "terminate_quota_info";
  @SerializedName(SERIALIZED_NAME_TERMINATE_QUOTA_INFO)
  private QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo terminateQuotaInfo = null;

  public static final String SERIALIZED_NAME_USED_QUOTA = "used_quota";
  @SerializedName(SERIALIZED_NAME_USED_QUOTA)
  private Long usedQuota = null;

  public QianchuanAwemeOrderQuotaGetV10ResponseData() {
  }

  public QianchuanAwemeOrderQuotaGetV10ResponseData maxCost(Double maxCost) {
    
    this.maxCost = maxCost;
    return this;
  }

   /**
   * 
   * @return maxCost
  **/
  @javax.annotation.Nullable
  public Double getMaxCost() {
    return maxCost;
  }


  public void setMaxCost(Double maxCost) {
    this.maxCost = maxCost;
  }


  public QianchuanAwemeOrderQuotaGetV10ResponseData quotaGear(Long quotaGear) {
    
    this.quotaGear = quotaGear;
    return this;
  }

   /**
   * 
   * @return quotaGear
  **/
  @javax.annotation.Nullable
  public Long getQuotaGear() {
    return quotaGear;
  }


  public void setQuotaGear(Long quotaGear) {
    this.quotaGear = quotaGear;
  }


  public QianchuanAwemeOrderQuotaGetV10ResponseData sumQuota(Long sumQuota) {
    
    this.sumQuota = sumQuota;
    return this;
  }

   /**
   * 
   * @return sumQuota
  **/
  @javax.annotation.Nullable
  public Long getSumQuota() {
    return sumQuota;
  }


  public void setSumQuota(Long sumQuota) {
    this.sumQuota = sumQuota;
  }


  public QianchuanAwemeOrderQuotaGetV10ResponseData terminateQuotaInfo(QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo terminateQuotaInfo) {
    
    this.terminateQuotaInfo = terminateQuotaInfo;
    return this;
  }

   /**
   * Get terminateQuotaInfo
   * @return terminateQuotaInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo getTerminateQuotaInfo() {
    return terminateQuotaInfo;
  }


  public void setTerminateQuotaInfo(QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo terminateQuotaInfo) {
    this.terminateQuotaInfo = terminateQuotaInfo;
  }


  public QianchuanAwemeOrderQuotaGetV10ResponseData usedQuota(Long usedQuota) {
    
    this.usedQuota = usedQuota;
    return this;
  }

   /**
   * 
   * @return usedQuota
  **/
  @javax.annotation.Nullable
  public Long getUsedQuota() {
    return usedQuota;
  }


  public void setUsedQuota(Long usedQuota) {
    this.usedQuota = usedQuota;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeOrderQuotaGetV10ResponseData qianchuanAwemeOrderQuotaGetV10ResponseData = (QianchuanAwemeOrderQuotaGetV10ResponseData) o;
    return Objects.equals(this.maxCost, qianchuanAwemeOrderQuotaGetV10ResponseData.maxCost) &&
        Objects.equals(this.quotaGear, qianchuanAwemeOrderQuotaGetV10ResponseData.quotaGear) &&
        Objects.equals(this.sumQuota, qianchuanAwemeOrderQuotaGetV10ResponseData.sumQuota) &&
        Objects.equals(this.terminateQuotaInfo, qianchuanAwemeOrderQuotaGetV10ResponseData.terminateQuotaInfo) &&
        Objects.equals(this.usedQuota, qianchuanAwemeOrderQuotaGetV10ResponseData.usedQuota);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCost, quotaGear, sumQuota, terminateQuotaInfo, usedQuota);
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
    sb.append("class QianchuanAwemeOrderQuotaGetV10ResponseData {\n");
    sb.append("    maxCost: ").append(toIndentedString(maxCost)).append("\n");
    sb.append("    quotaGear: ").append(toIndentedString(quotaGear)).append("\n");
    sb.append("    sumQuota: ").append(toIndentedString(sumQuota)).append("\n");
    sb.append("    terminateQuotaInfo: ").append(toIndentedString(terminateQuotaInfo)).append("\n");
    sb.append("    usedQuota: ").append(toIndentedString(usedQuota)).append("\n");
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
    openapiFields.add("max_cost");
    openapiFields.add("quota_gear");
    openapiFields.add("sum_quota");
    openapiFields.add("terminate_quota_info");
    openapiFields.add("used_quota");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeOrderQuotaGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeOrderQuotaGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeOrderQuotaGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeOrderQuotaGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeOrderQuotaGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeOrderQuotaGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeOrderQuotaGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeOrderQuotaGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeOrderQuotaGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeOrderQuotaGetV10ResponseData
  */
  public static QianchuanAwemeOrderQuotaGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeOrderQuotaGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanAwemeOrderQuotaGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

