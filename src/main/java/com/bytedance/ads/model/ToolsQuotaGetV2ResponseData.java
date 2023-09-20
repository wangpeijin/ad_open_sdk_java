/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T12:38:33.841352661+08:00[PRC]")
public class ToolsQuotaGetV2ResponseData {
  public static final String SERIALIZED_NAME_IN_LEARNING = "in_learning";
  @SerializedName(SERIALIZED_NAME_IN_LEARNING)
  private Boolean inLearning = null;

  public static final String SERIALIZED_NAME_MAX_COST = "max_cost";
  @SerializedName(SERIALIZED_NAME_MAX_COST)
  private Double maxCost = null;

  public static final String SERIALIZED_NAME_SUM_QUOTA = "sum_quota";
  @SerializedName(SERIALIZED_NAME_SUM_QUOTA)
  private Long sumQuota = null;

  public static final String SERIALIZED_NAME_USED_QUOTA = "used_quota";
  @SerializedName(SERIALIZED_NAME_USED_QUOTA)
  private Long usedQuota = null;

  public ToolsQuotaGetV2ResponseData() {
  }

  public ToolsQuotaGetV2ResponseData inLearning(Boolean inLearning) {
    
    this.inLearning = inLearning;
    return this;
  }

   /**
   * 是否在学习期，学习期即初始期，详细规则请进入巨量广告投放平台-工具-在投计划配额界面查看
   * @return inLearning
  **/
  @javax.annotation.Nullable
  public Boolean getInLearning() {
    return inLearning;
  }


  public void setInLearning(Boolean inLearning) {
    this.inLearning = inLearning;
  }


  public ToolsQuotaGetV2ResponseData maxCost(Double maxCost) {
    
    this.maxCost = maxCost;
    return this;
  }

   /**
   * 最高月消耗
   * @return maxCost
  **/
  @javax.annotation.Nullable
  public Double getMaxCost() {
    return maxCost;
  }


  public void setMaxCost(Double maxCost) {
    this.maxCost = maxCost;
  }


  public ToolsQuotaGetV2ResponseData sumQuota(Long sumQuota) {
    
    this.sumQuota = sumQuota;
    return this;
  }

   /**
   * 在投计划配额
   * @return sumQuota
  **/
  @javax.annotation.Nullable
  public Long getSumQuota() {
    return sumQuota;
  }


  public void setSumQuota(Long sumQuota) {
    this.sumQuota = sumQuota;
  }


  public ToolsQuotaGetV2ResponseData usedQuota(Long usedQuota) {
    
    this.usedQuota = usedQuota;
    return this;
  }

   /**
   * 在投计划数
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
    ToolsQuotaGetV2ResponseData toolsQuotaGetV2ResponseData = (ToolsQuotaGetV2ResponseData) o;
    return Objects.equals(this.inLearning, toolsQuotaGetV2ResponseData.inLearning) &&
        Objects.equals(this.maxCost, toolsQuotaGetV2ResponseData.maxCost) &&
        Objects.equals(this.sumQuota, toolsQuotaGetV2ResponseData.sumQuota) &&
        Objects.equals(this.usedQuota, toolsQuotaGetV2ResponseData.usedQuota);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(inLearning, maxCost, sumQuota, usedQuota);
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
    sb.append("class ToolsQuotaGetV2ResponseData {\n");
    sb.append("    inLearning: ").append(toIndentedString(inLearning)).append("\n");
    sb.append("    maxCost: ").append(toIndentedString(maxCost)).append("\n");
    sb.append("    sumQuota: ").append(toIndentedString(sumQuota)).append("\n");
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
    openapiFields.add("in_learning");
    openapiFields.add("max_cost");
    openapiFields.add("sum_quota");
    openapiFields.add("used_quota");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsQuotaGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsQuotaGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsQuotaGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsQuotaGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsQuotaGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsQuotaGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsQuotaGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsQuotaGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsQuotaGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsQuotaGetV2ResponseData
  */
  public static ToolsQuotaGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsQuotaGetV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsQuotaGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

