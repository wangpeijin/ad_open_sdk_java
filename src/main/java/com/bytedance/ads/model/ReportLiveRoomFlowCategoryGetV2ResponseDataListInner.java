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
 * ReportLiveRoomFlowCategoryGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class ReportLiveRoomFlowCategoryGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private Object fields = null;

  public static final String SERIALIZED_NAME_FIRST_FLOW_CATEGORY = "first_flow_category";
  @SerializedName(SERIALIZED_NAME_FIRST_FLOW_CATEGORY)
  private String firstFlowCategory = null;

  public ReportLiveRoomFlowCategoryGetV2ResponseDataListInner() {
  }

  public ReportLiveRoomFlowCategoryGetV2ResponseDataListInner fields(Object fields) {
    
    this.fields = fields;
    return this;
  }

   /**
   * 
   * @return fields
  **/
  @javax.annotation.Nullable
  public Object getFields() {
    return fields;
  }


  public void setFields(Object fields) {
    this.fields = fields;
  }


  public ReportLiveRoomFlowCategoryGetV2ResponseDataListInner firstFlowCategory(String firstFlowCategory) {
    
    this.firstFlowCategory = firstFlowCategory;
    return this;
  }

   /**
   * 
   * @return firstFlowCategory
  **/
  @javax.annotation.Nullable
  public String getFirstFlowCategory() {
    return firstFlowCategory;
  }


  public void setFirstFlowCategory(String firstFlowCategory) {
    this.firstFlowCategory = firstFlowCategory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportLiveRoomFlowCategoryGetV2ResponseDataListInner reportLiveRoomFlowCategoryGetV2ResponseDataListInner = (ReportLiveRoomFlowCategoryGetV2ResponseDataListInner) o;
    return Objects.equals(this.fields, reportLiveRoomFlowCategoryGetV2ResponseDataListInner.fields) &&
        Objects.equals(this.firstFlowCategory, reportLiveRoomFlowCategoryGetV2ResponseDataListInner.firstFlowCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, firstFlowCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportLiveRoomFlowCategoryGetV2ResponseDataListInner {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    firstFlowCategory: ").append(toIndentedString(firstFlowCategory)).append("\n");
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
    openapiFields.add("fields");
    openapiFields.add("first_flow_category");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportLiveRoomFlowCategoryGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportLiveRoomFlowCategoryGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportLiveRoomFlowCategoryGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportLiveRoomFlowCategoryGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportLiveRoomFlowCategoryGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ReportLiveRoomFlowCategoryGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportLiveRoomFlowCategoryGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportLiveRoomFlowCategoryGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportLiveRoomFlowCategoryGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ReportLiveRoomFlowCategoryGetV2ResponseDataListInner
  */
  public static ReportLiveRoomFlowCategoryGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportLiveRoomFlowCategoryGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ReportLiveRoomFlowCategoryGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

