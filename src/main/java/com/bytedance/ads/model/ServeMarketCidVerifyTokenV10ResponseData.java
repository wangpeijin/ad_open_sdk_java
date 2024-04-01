/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ServeMarketCidVerifyTokenV10DataCidCapacityStatus;
import com.bytedance.ads.model.ServeMarketCidVerifyTokenV10DataDevStatus;
import com.bytedance.ads.model.ServeMarketCidVerifyTokenV10DataFacilitatorSubStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class ServeMarketCidVerifyTokenV10ResponseData {
  public static final String SERIALIZED_NAME_APP_ACCESS_TOKEN = "app_access_token";
  @SerializedName(SERIALIZED_NAME_APP_ACCESS_TOKEN)
  private String appAccessToken = null;

  public static final String SERIALIZED_NAME_CID_CAPACITY_STATUS = "cid_capacity_status";
  @SerializedName(SERIALIZED_NAME_CID_CAPACITY_STATUS)
  private ServeMarketCidVerifyTokenV10DataCidCapacityStatus cidCapacityStatus = null;

  public static final String SERIALIZED_NAME_DEV_QUALIFICATION_NAME = "dev_qualification_name";
  @SerializedName(SERIALIZED_NAME_DEV_QUALIFICATION_NAME)
  private String devQualificationName = null;

  public static final String SERIALIZED_NAME_DEV_STATUS = "dev_status";
  @SerializedName(SERIALIZED_NAME_DEV_STATUS)
  private ServeMarketCidVerifyTokenV10DataDevStatus devStatus = null;

  public static final String SERIALIZED_NAME_FACILITATOR_SUB_STATUS = "facilitator_sub_status";
  @SerializedName(SERIALIZED_NAME_FACILITATOR_SUB_STATUS)
  private ServeMarketCidVerifyTokenV10DataFacilitatorSubStatus facilitatorSubStatus = null;

  public static final String SERIALIZED_NAME_TOKEN_IS_VALID = "token_is_valid";
  @SerializedName(SERIALIZED_NAME_TOKEN_IS_VALID)
  private Boolean tokenIsValid = null;

  public ServeMarketCidVerifyTokenV10ResponseData() {
  }

  public ServeMarketCidVerifyTokenV10ResponseData appAccessToken(String appAccessToken) {
    
    this.appAccessToken = appAccessToken;
    return this;
  }

   /**
   * 传入的app_access_token
   * @return appAccessToken
  **/
  @javax.annotation.Nullable
  public String getAppAccessToken() {
    return appAccessToken;
  }


  public void setAppAccessToken(String appAccessToken) {
    this.appAccessToken = appAccessToken;
  }


  public ServeMarketCidVerifyTokenV10ResponseData cidCapacityStatus(ServeMarketCidVerifyTokenV10DataCidCapacityStatus cidCapacityStatus) {
    
    this.cidCapacityStatus = cidCapacityStatus;
    return this;
  }

   /**
   * Get cidCapacityStatus
   * @return cidCapacityStatus
  **/
  @javax.annotation.Nullable
  public ServeMarketCidVerifyTokenV10DataCidCapacityStatus getCidCapacityStatus() {
    return cidCapacityStatus;
  }


  public void setCidCapacityStatus(ServeMarketCidVerifyTokenV10DataCidCapacityStatus cidCapacityStatus) {
    this.cidCapacityStatus = cidCapacityStatus;
  }


  public ServeMarketCidVerifyTokenV10ResponseData devQualificationName(String devQualificationName) {
    
    this.devQualificationName = devQualificationName;
    return this;
  }

   /**
   * 开放平台开发者资质名称
   * @return devQualificationName
  **/
  @javax.annotation.Nullable
  public String getDevQualificationName() {
    return devQualificationName;
  }


  public void setDevQualificationName(String devQualificationName) {
    this.devQualificationName = devQualificationName;
  }


  public ServeMarketCidVerifyTokenV10ResponseData devStatus(ServeMarketCidVerifyTokenV10DataDevStatus devStatus) {
    
    this.devStatus = devStatus;
    return this;
  }

   /**
   * Get devStatus
   * @return devStatus
  **/
  @javax.annotation.Nullable
  public ServeMarketCidVerifyTokenV10DataDevStatus getDevStatus() {
    return devStatus;
  }


  public void setDevStatus(ServeMarketCidVerifyTokenV10DataDevStatus devStatus) {
    this.devStatus = devStatus;
  }


  public ServeMarketCidVerifyTokenV10ResponseData facilitatorSubStatus(ServeMarketCidVerifyTokenV10DataFacilitatorSubStatus facilitatorSubStatus) {
    
    this.facilitatorSubStatus = facilitatorSubStatus;
    return this;
  }

   /**
   * Get facilitatorSubStatus
   * @return facilitatorSubStatus
  **/
  @javax.annotation.Nullable
  public ServeMarketCidVerifyTokenV10DataFacilitatorSubStatus getFacilitatorSubStatus() {
    return facilitatorSubStatus;
  }


  public void setFacilitatorSubStatus(ServeMarketCidVerifyTokenV10DataFacilitatorSubStatus facilitatorSubStatus) {
    this.facilitatorSubStatus = facilitatorSubStatus;
  }


  public ServeMarketCidVerifyTokenV10ResponseData tokenIsValid(Boolean tokenIsValid) {
    
    this.tokenIsValid = tokenIsValid;
    return this;
  }

   /**
   * app_access_token是否有效，如果为true，那么token回传不会因群峰未入驻阻塞
   * @return tokenIsValid
  **/
  @javax.annotation.Nullable
  public Boolean getTokenIsValid() {
    return tokenIsValid;
  }


  public void setTokenIsValid(Boolean tokenIsValid) {
    this.tokenIsValid = tokenIsValid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServeMarketCidVerifyTokenV10ResponseData serveMarketCidVerifyTokenV10ResponseData = (ServeMarketCidVerifyTokenV10ResponseData) o;
    return Objects.equals(this.appAccessToken, serveMarketCidVerifyTokenV10ResponseData.appAccessToken) &&
        Objects.equals(this.cidCapacityStatus, serveMarketCidVerifyTokenV10ResponseData.cidCapacityStatus) &&
        Objects.equals(this.devQualificationName, serveMarketCidVerifyTokenV10ResponseData.devQualificationName) &&
        Objects.equals(this.devStatus, serveMarketCidVerifyTokenV10ResponseData.devStatus) &&
        Objects.equals(this.facilitatorSubStatus, serveMarketCidVerifyTokenV10ResponseData.facilitatorSubStatus) &&
        Objects.equals(this.tokenIsValid, serveMarketCidVerifyTokenV10ResponseData.tokenIsValid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appAccessToken, cidCapacityStatus, devQualificationName, devStatus, facilitatorSubStatus, tokenIsValid);
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
    sb.append("class ServeMarketCidVerifyTokenV10ResponseData {\n");
    sb.append("    appAccessToken: ").append(toIndentedString(appAccessToken)).append("\n");
    sb.append("    cidCapacityStatus: ").append(toIndentedString(cidCapacityStatus)).append("\n");
    sb.append("    devQualificationName: ").append(toIndentedString(devQualificationName)).append("\n");
    sb.append("    devStatus: ").append(toIndentedString(devStatus)).append("\n");
    sb.append("    facilitatorSubStatus: ").append(toIndentedString(facilitatorSubStatus)).append("\n");
    sb.append("    tokenIsValid: ").append(toIndentedString(tokenIsValid)).append("\n");
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
    openapiFields.add("app_access_token");
    openapiFields.add("cid_capacity_status");
    openapiFields.add("dev_qualification_name");
    openapiFields.add("dev_status");
    openapiFields.add("facilitator_sub_status");
    openapiFields.add("token_is_valid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("app_access_token");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServeMarketCidVerifyTokenV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServeMarketCidVerifyTokenV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServeMarketCidVerifyTokenV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServeMarketCidVerifyTokenV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ServeMarketCidVerifyTokenV10ResponseData>() {
           @Override
           public void write(JsonWriter out, ServeMarketCidVerifyTokenV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ServeMarketCidVerifyTokenV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ServeMarketCidVerifyTokenV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServeMarketCidVerifyTokenV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to ServeMarketCidVerifyTokenV10ResponseData
  */
  public static ServeMarketCidVerifyTokenV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServeMarketCidVerifyTokenV10ResponseData.class);
  }

 /**
  * Convert an instance of ServeMarketCidVerifyTokenV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

