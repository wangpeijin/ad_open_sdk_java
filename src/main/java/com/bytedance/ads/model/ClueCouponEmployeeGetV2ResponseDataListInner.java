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
import com.bytedance.ads.model.ClueCouponEmployeeGetV2DataListUserType;
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
 * ClueCouponEmployeeGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class ClueCouponEmployeeGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_STORE_ID = "store_id";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private Long storeId = null;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId = null;

  public static final String SERIALIZED_NAME_USER_TYPE = "user_type";
  @SerializedName(SERIALIZED_NAME_USER_TYPE)
  private ClueCouponEmployeeGetV2DataListUserType userType = null;

  public ClueCouponEmployeeGetV2ResponseDataListInner() {
  }

  public ClueCouponEmployeeGetV2ResponseDataListInner storeId(Long storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * 
   * @return storeId
  **/
  @javax.annotation.Nullable
  public Long getStoreId() {
    return storeId;
  }


  public void setStoreId(Long storeId) {
    this.storeId = storeId;
  }


  public ClueCouponEmployeeGetV2ResponseDataListInner userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 
   * @return userId
  **/
  @javax.annotation.Nullable
  public Long getUserId() {
    return userId;
  }


  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public ClueCouponEmployeeGetV2ResponseDataListInner userType(ClueCouponEmployeeGetV2DataListUserType userType) {
    
    this.userType = userType;
    return this;
  }

   /**
   * Get userType
   * @return userType
  **/
  @javax.annotation.Nullable
  public ClueCouponEmployeeGetV2DataListUserType getUserType() {
    return userType;
  }


  public void setUserType(ClueCouponEmployeeGetV2DataListUserType userType) {
    this.userType = userType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueCouponEmployeeGetV2ResponseDataListInner clueCouponEmployeeGetV2ResponseDataListInner = (ClueCouponEmployeeGetV2ResponseDataListInner) o;
    return Objects.equals(this.storeId, clueCouponEmployeeGetV2ResponseDataListInner.storeId) &&
        Objects.equals(this.userId, clueCouponEmployeeGetV2ResponseDataListInner.userId) &&
        Objects.equals(this.userType, clueCouponEmployeeGetV2ResponseDataListInner.userType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, userId, userType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueCouponEmployeeGetV2ResponseDataListInner {\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
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
    openapiFields.add("store_id");
    openapiFields.add("user_id");
    openapiFields.add("user_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCouponEmployeeGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponEmployeeGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponEmployeeGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponEmployeeGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponEmployeeGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ClueCouponEmployeeGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponEmployeeGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponEmployeeGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponEmployeeGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ClueCouponEmployeeGetV2ResponseDataListInner
  */
  public static ClueCouponEmployeeGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponEmployeeGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ClueCouponEmployeeGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

