/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BusinessPlatformCompanyInfoGetV30DataCompanyInfoStatus;
import com.bytedance.ads.model.BusinessPlatformCompanyInfoGetV30DataCompanyInfoType;
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
 * BusinessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T17:19:23.525018957+08:00[PRC]")
public class BusinessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner {
  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Long companyId = null;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private BusinessPlatformCompanyInfoGetV30DataCompanyInfoStatus status = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private BusinessPlatformCompanyInfoGetV30DataCompanyInfoType type = null;

  public BusinessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner() {
  }

  public BusinessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner companyId(Long companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * 
   * @return companyId
  **/
  @javax.annotation.Nullable
  public Long getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Long companyId) {
    this.companyId = companyId;
  }


  public BusinessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * 
   * @return companyName
  **/
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public BusinessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner status(BusinessPlatformCompanyInfoGetV30DataCompanyInfoStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public BusinessPlatformCompanyInfoGetV30DataCompanyInfoStatus getStatus() {
    return status;
  }


  public void setStatus(BusinessPlatformCompanyInfoGetV30DataCompanyInfoStatus status) {
    this.status = status;
  }


  public BusinessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner type(BusinessPlatformCompanyInfoGetV30DataCompanyInfoType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public BusinessPlatformCompanyInfoGetV30DataCompanyInfoType getType() {
    return type;
  }


  public void setType(BusinessPlatformCompanyInfoGetV30DataCompanyInfoType type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner businessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner = (BusinessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner) o;
    return Objects.equals(this.companyId, businessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner.companyId) &&
        Objects.equals(this.companyName, businessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner.companyName) &&
        Objects.equals(this.status, businessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner.status) &&
        Objects.equals(this.type, businessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, companyName, status, type);
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
    sb.append("class BusinessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner {\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("company_id");
    openapiFields.add("company_name");
    openapiFields.add("status");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner>() {
           @Override
           public void write(JsonWriter out, BusinessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner
  * @throws IOException if the JSON string is invalid with respect to BusinessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner
  */
  public static BusinessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner.class);
  }

 /**
  * Convert an instance of BusinessPlatformCompanyInfoGetV30ResponseDataCompanyInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

