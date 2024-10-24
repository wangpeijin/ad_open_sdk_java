/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class StarInfoV2ResponseDataInfoListInnerSecondInfo {
  public static final String SERIALIZED_NAME_INDUSTRY_ID = "industry_id";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_ID)
  private Long industryId = null;

  public static final String SERIALIZED_NAME_INDUSTRY_NAME = "industry_name";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_NAME)
  private String industryName = null;

  public StarInfoV2ResponseDataInfoListInnerSecondInfo() {
  }

  public StarInfoV2ResponseDataInfoListInnerSecondInfo industryId(Long industryId) {
    
    this.industryId = industryId;
    return this;
  }

   /**
   * 
   * @return industryId
  **/
  @javax.annotation.Nullable
  public Long getIndustryId() {
    return industryId;
  }


  public void setIndustryId(Long industryId) {
    this.industryId = industryId;
  }


  public StarInfoV2ResponseDataInfoListInnerSecondInfo industryName(String industryName) {
    
    this.industryName = industryName;
    return this;
  }

   /**
   * 
   * @return industryName
  **/
  @javax.annotation.Nullable
  public String getIndustryName() {
    return industryName;
  }


  public void setIndustryName(String industryName) {
    this.industryName = industryName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarInfoV2ResponseDataInfoListInnerSecondInfo starInfoV2ResponseDataInfoListInnerSecondInfo = (StarInfoV2ResponseDataInfoListInnerSecondInfo) o;
    return Objects.equals(this.industryId, starInfoV2ResponseDataInfoListInnerSecondInfo.industryId) &&
        Objects.equals(this.industryName, starInfoV2ResponseDataInfoListInnerSecondInfo.industryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(industryId, industryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarInfoV2ResponseDataInfoListInnerSecondInfo {\n");
    sb.append("    industryId: ").append(toIndentedString(industryId)).append("\n");
    sb.append("    industryName: ").append(toIndentedString(industryName)).append("\n");
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
    openapiFields.add("industry_id");
    openapiFields.add("industry_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("industry_id");
    openapiRequiredFields.add("industry_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarInfoV2ResponseDataInfoListInnerSecondInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarInfoV2ResponseDataInfoListInnerSecondInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarInfoV2ResponseDataInfoListInnerSecondInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarInfoV2ResponseDataInfoListInnerSecondInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarInfoV2ResponseDataInfoListInnerSecondInfo>() {
           @Override
           public void write(JsonWriter out, StarInfoV2ResponseDataInfoListInnerSecondInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarInfoV2ResponseDataInfoListInnerSecondInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarInfoV2ResponseDataInfoListInnerSecondInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarInfoV2ResponseDataInfoListInnerSecondInfo
  * @throws IOException if the JSON string is invalid with respect to StarInfoV2ResponseDataInfoListInnerSecondInfo
  */
  public static StarInfoV2ResponseDataInfoListInnerSecondInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarInfoV2ResponseDataInfoListInnerSecondInfo.class);
  }

 /**
  * Convert an instance of StarInfoV2ResponseDataInfoListInnerSecondInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

