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
import com.bytedance.ads.model.SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner;
import com.bytedance.ads.model.SecurityScoreViolationEventGetV30ResponseDataPageInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
public class SecurityScoreViolationEventGetV30ResponseData {
  public static final String SERIALIZED_NAME_ADV_SCORE_EVENT = "adv_score_event";
  @SerializedName(SERIALIZED_NAME_ADV_SCORE_EVENT)
  private List<SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner> advScoreEvent = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private SecurityScoreViolationEventGetV30ResponseDataPageInfo pageInfo = null;

  public SecurityScoreViolationEventGetV30ResponseData() {
  }

  public SecurityScoreViolationEventGetV30ResponseData advScoreEvent(List<SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner> advScoreEvent) {
    
    this.advScoreEvent = advScoreEvent;
    return this;
  }

  public SecurityScoreViolationEventGetV30ResponseData addAdvScoreEventItem(SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner advScoreEventItem) {
    if (this.advScoreEvent == null) {
      this.advScoreEvent = new ArrayList<>();
    }
    this.advScoreEvent.add(advScoreEventItem);
    return this;
  }

   /**
   * 分页信息
   * @return advScoreEvent
  **/
  @javax.annotation.Nullable
  public List<SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner> getAdvScoreEvent() {
    return advScoreEvent;
  }


  public void setAdvScoreEvent(List<SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner> advScoreEvent) {
    this.advScoreEvent = advScoreEvent;
  }


  public SecurityScoreViolationEventGetV30ResponseData pageInfo(SecurityScoreViolationEventGetV30ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public SecurityScoreViolationEventGetV30ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(SecurityScoreViolationEventGetV30ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityScoreViolationEventGetV30ResponseData securityScoreViolationEventGetV30ResponseData = (SecurityScoreViolationEventGetV30ResponseData) o;
    return Objects.equals(this.advScoreEvent, securityScoreViolationEventGetV30ResponseData.advScoreEvent) &&
        Objects.equals(this.pageInfo, securityScoreViolationEventGetV30ResponseData.pageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advScoreEvent, pageInfo);
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
    sb.append("class SecurityScoreViolationEventGetV30ResponseData {\n");
    sb.append("    advScoreEvent: ").append(toIndentedString(advScoreEvent)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
    openapiFields.add("adv_score_event");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SecurityScoreViolationEventGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SecurityScoreViolationEventGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SecurityScoreViolationEventGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SecurityScoreViolationEventGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<SecurityScoreViolationEventGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, SecurityScoreViolationEventGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SecurityScoreViolationEventGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SecurityScoreViolationEventGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SecurityScoreViolationEventGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to SecurityScoreViolationEventGetV30ResponseData
  */
  public static SecurityScoreViolationEventGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SecurityScoreViolationEventGetV30ResponseData.class);
  }

 /**
  * Convert an instance of SecurityScoreViolationEventGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

