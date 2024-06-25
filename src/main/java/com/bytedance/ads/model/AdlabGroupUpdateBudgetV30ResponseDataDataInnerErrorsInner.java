/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
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
 * AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner {
  public static final String SERIALIZED_NAME_FAILED_REASON = "failed_reason";
  @SerializedName(SERIALIZED_NAME_FAILED_REASON)
  private String failedReason = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner() {
  }

  public AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner failedReason(String failedReason) {
    
    this.failedReason = failedReason;
    return this;
  }

   /**
   * 错误信息
   * @return failedReason
  **/
  @javax.annotation.Nullable
  public String getFailedReason() {
    return failedReason;
  }


  public void setFailedReason(String failedReason) {
    this.failedReason = failedReason;
  }


  public AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 项目id
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner adlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner = (AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner) o;
    return Objects.equals(this.failedReason, adlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner.failedReason) &&
        Objects.equals(this.id, adlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner.id);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(failedReason, id);
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
    sb.append("class AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner {\n");
    sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("failed_reason");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner>() {
           @Override
           public void write(JsonWriter out, AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner
  */
  public static AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner.class);
  }

 /**
  * Convert an instance of AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

