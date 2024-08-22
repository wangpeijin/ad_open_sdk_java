/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.EnterpriseCommentReplyV10ResponseDataErrorsInner;
import com.bytedance.ads.model.EnterpriseCommentReplyV10ResponseDataSuccessInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class EnterpriseCommentReplyV10ResponseData {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<EnterpriseCommentReplyV10ResponseDataErrorsInner> errors = null;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private List<EnterpriseCommentReplyV10ResponseDataSuccessInner> success = null;

  public EnterpriseCommentReplyV10ResponseData() {
  }

  public EnterpriseCommentReplyV10ResponseData errors(List<EnterpriseCommentReplyV10ResponseDataErrorsInner> errors) {
    
    this.errors = errors;
    return this;
  }

  public EnterpriseCommentReplyV10ResponseData addErrorsItem(EnterpriseCommentReplyV10ResponseDataErrorsInner errorsItem) {
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
  public List<EnterpriseCommentReplyV10ResponseDataErrorsInner> getErrors() {
    return errors;
  }


  public void setErrors(List<EnterpriseCommentReplyV10ResponseDataErrorsInner> errors) {
    this.errors = errors;
  }


  public EnterpriseCommentReplyV10ResponseData success(List<EnterpriseCommentReplyV10ResponseDataSuccessInner> success) {
    
    this.success = success;
    return this;
  }

  public EnterpriseCommentReplyV10ResponseData addSuccessItem(EnterpriseCommentReplyV10ResponseDataSuccessInner successItem) {
    if (this.success == null) {
      this.success = new ArrayList<>();
    }
    this.success.add(successItem);
    return this;
  }

   /**
   * 
   * @return success
  **/
  @javax.annotation.Nullable
  public List<EnterpriseCommentReplyV10ResponseDataSuccessInner> getSuccess() {
    return success;
  }


  public void setSuccess(List<EnterpriseCommentReplyV10ResponseDataSuccessInner> success) {
    this.success = success;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseCommentReplyV10ResponseData enterpriseCommentReplyV10ResponseData = (EnterpriseCommentReplyV10ResponseData) o;
    return Objects.equals(this.errors, enterpriseCommentReplyV10ResponseData.errors) &&
        Objects.equals(this.success, enterpriseCommentReplyV10ResponseData.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseCommentReplyV10ResponseData {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
    openapiFields.add("errors");
    openapiFields.add("success");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseCommentReplyV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseCommentReplyV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseCommentReplyV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseCommentReplyV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseCommentReplyV10ResponseData>() {
           @Override
           public void write(JsonWriter out, EnterpriseCommentReplyV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseCommentReplyV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseCommentReplyV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseCommentReplyV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to EnterpriseCommentReplyV10ResponseData
  */
  public static EnterpriseCommentReplyV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseCommentReplyV10ResponseData.class);
  }

 /**
  * Convert an instance of EnterpriseCommentReplyV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

