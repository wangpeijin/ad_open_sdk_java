/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanCreativeStatusUpdateV10ResponseDataErrorsInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class QianchuanCreativeStatusUpdateV10ResponseData {
  public static final String SERIALIZED_NAME_CREATIVE_IDS = "creative_ids";
  @SerializedName(SERIALIZED_NAME_CREATIVE_IDS)
  private List<Long> creativeIds = null;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<QianchuanCreativeStatusUpdateV10ResponseDataErrorsInner> errors = null;

  public QianchuanCreativeStatusUpdateV10ResponseData() {
  }

  public QianchuanCreativeStatusUpdateV10ResponseData creativeIds(List<Long> creativeIds) {
    
    this.creativeIds = creativeIds;
    return this;
  }

  public QianchuanCreativeStatusUpdateV10ResponseData addCreativeIdsItem(Long creativeIdsItem) {
    if (this.creativeIds == null) {
      this.creativeIds = new ArrayList<>();
    }
    this.creativeIds.add(creativeIdsItem);
    return this;
  }

   /**
   * 
   * @return creativeIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCreativeIds() {
    return creativeIds;
  }


  public void setCreativeIds(List<Long> creativeIds) {
    this.creativeIds = creativeIds;
  }


  public QianchuanCreativeStatusUpdateV10ResponseData errors(List<QianchuanCreativeStatusUpdateV10ResponseDataErrorsInner> errors) {
    
    this.errors = errors;
    return this;
  }

  public QianchuanCreativeStatusUpdateV10ResponseData addErrorsItem(QianchuanCreativeStatusUpdateV10ResponseDataErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * 
   * @return errors
  **/
  @javax.annotation.Nullable
  public List<QianchuanCreativeStatusUpdateV10ResponseDataErrorsInner> getErrors() {
    return errors;
  }


  public void setErrors(List<QianchuanCreativeStatusUpdateV10ResponseDataErrorsInner> errors) {
    this.errors = errors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanCreativeStatusUpdateV10ResponseData qianchuanCreativeStatusUpdateV10ResponseData = (QianchuanCreativeStatusUpdateV10ResponseData) o;
    return Objects.equals(this.creativeIds, qianchuanCreativeStatusUpdateV10ResponseData.creativeIds) &&
        Objects.equals(this.errors, qianchuanCreativeStatusUpdateV10ResponseData.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeIds, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanCreativeStatusUpdateV10ResponseData {\n");
    sb.append("    creativeIds: ").append(toIndentedString(creativeIds)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
    openapiFields.add("creative_ids");
    openapiFields.add("errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanCreativeStatusUpdateV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanCreativeStatusUpdateV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanCreativeStatusUpdateV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanCreativeStatusUpdateV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanCreativeStatusUpdateV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanCreativeStatusUpdateV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanCreativeStatusUpdateV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanCreativeStatusUpdateV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanCreativeStatusUpdateV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanCreativeStatusUpdateV10ResponseData
  */
  public static QianchuanCreativeStatusUpdateV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanCreativeStatusUpdateV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanCreativeStatusUpdateV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

