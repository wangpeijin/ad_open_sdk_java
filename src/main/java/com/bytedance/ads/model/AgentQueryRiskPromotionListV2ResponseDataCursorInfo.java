/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
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
 * 分页信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class AgentQueryRiskPromotionListV2ResponseDataCursorInfo {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Long count = null;

  public static final String SERIALIZED_NAME_CURSOR = "cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private Long cursor = null;

  public static final String SERIALIZED_NAME_HAS_MORE = "has_more";
  @SerializedName(SERIALIZED_NAME_HAS_MORE)
  private Boolean hasMore = null;

  public static final String SERIALIZED_NAME_TOTAL_NUMBER = "total_number";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUMBER)
  private Long totalNumber = null;

  public AgentQueryRiskPromotionListV2ResponseDataCursorInfo() {
  }

  public AgentQueryRiskPromotionListV2ResponseDataCursorInfo count(Long count) {
    
    this.count = count;
    return this;
  }

   /**
   * 页码游标值
   * @return count
  **/
  @javax.annotation.Nullable
  public Long getCount() {
    return count;
  }


  public void setCount(Long count) {
    this.count = count;
  }


  public AgentQueryRiskPromotionListV2ResponseDataCursorInfo cursor(Long cursor) {
    
    this.cursor = cursor;
    return this;
  }

   /**
   * 页码游标值
   * @return cursor
  **/
  @javax.annotation.Nullable
  public Long getCursor() {
    return cursor;
  }


  public void setCursor(Long cursor) {
    this.cursor = cursor;
  }


  public AgentQueryRiskPromotionListV2ResponseDataCursorInfo hasMore(Boolean hasMore) {
    
    this.hasMore = hasMore;
    return this;
  }

   /**
   * 是否有下一页
   * @return hasMore
  **/
  @javax.annotation.Nullable
  public Boolean getHasMore() {
    return hasMore;
  }


  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }


  public AgentQueryRiskPromotionListV2ResponseDataCursorInfo totalNumber(Long totalNumber) {
    
    this.totalNumber = totalNumber;
    return this;
  }

   /**
   * 总数
   * @return totalNumber
  **/
  @javax.annotation.Nullable
  public Long getTotalNumber() {
    return totalNumber;
  }


  public void setTotalNumber(Long totalNumber) {
    this.totalNumber = totalNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentQueryRiskPromotionListV2ResponseDataCursorInfo agentQueryRiskPromotionListV2ResponseDataCursorInfo = (AgentQueryRiskPromotionListV2ResponseDataCursorInfo) o;
    return Objects.equals(this.count, agentQueryRiskPromotionListV2ResponseDataCursorInfo.count) &&
        Objects.equals(this.cursor, agentQueryRiskPromotionListV2ResponseDataCursorInfo.cursor) &&
        Objects.equals(this.hasMore, agentQueryRiskPromotionListV2ResponseDataCursorInfo.hasMore) &&
        Objects.equals(this.totalNumber, agentQueryRiskPromotionListV2ResponseDataCursorInfo.totalNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, cursor, hasMore, totalNumber);
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
    sb.append("class AgentQueryRiskPromotionListV2ResponseDataCursorInfo {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
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
    openapiFields.add("count");
    openapiFields.add("cursor");
    openapiFields.add("has_more");
    openapiFields.add("total_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentQueryRiskPromotionListV2ResponseDataCursorInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentQueryRiskPromotionListV2ResponseDataCursorInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentQueryRiskPromotionListV2ResponseDataCursorInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentQueryRiskPromotionListV2ResponseDataCursorInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentQueryRiskPromotionListV2ResponseDataCursorInfo>() {
           @Override
           public void write(JsonWriter out, AgentQueryRiskPromotionListV2ResponseDataCursorInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentQueryRiskPromotionListV2ResponseDataCursorInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentQueryRiskPromotionListV2ResponseDataCursorInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentQueryRiskPromotionListV2ResponseDataCursorInfo
  * @throws IOException if the JSON string is invalid with respect to AgentQueryRiskPromotionListV2ResponseDataCursorInfo
  */
  public static AgentQueryRiskPromotionListV2ResponseDataCursorInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentQueryRiskPromotionListV2ResponseDataCursorInfo.class);
  }

 /**
  * Convert an instance of AgentQueryRiskPromotionListV2ResponseDataCursorInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

