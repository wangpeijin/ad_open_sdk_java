/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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
 * ToolsIndustryGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class ToolsIndustryGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_FIRST_INDUSTRY_ID = "first_industry_id";
  @SerializedName(SERIALIZED_NAME_FIRST_INDUSTRY_ID)
  private Long firstIndustryId = null;

  public static final String SERIALIZED_NAME_FIRST_INDUSTRY_NAME = "first_industry_name";
  @SerializedName(SERIALIZED_NAME_FIRST_INDUSTRY_NAME)
  private String firstIndustryName = null;

  public static final String SERIALIZED_NAME_INDUSTRY_ID = "industry_id";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_ID)
  private Long industryId = null;

  public static final String SERIALIZED_NAME_INDUSTRY_NAME = "industry_name";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_NAME)
  private String industryName = null;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private Long level = null;

  public static final String SERIALIZED_NAME_SECOND_INDUSTRY_ID = "second_industry_id";
  @SerializedName(SERIALIZED_NAME_SECOND_INDUSTRY_ID)
  private Long secondIndustryId = null;

  public static final String SERIALIZED_NAME_SECOND_INDUSTRY_NAME = "second_industry_name";
  @SerializedName(SERIALIZED_NAME_SECOND_INDUSTRY_NAME)
  private String secondIndustryName = null;

  public static final String SERIALIZED_NAME_THIRD_INDUSTRY_ID = "third_industry_id";
  @SerializedName(SERIALIZED_NAME_THIRD_INDUSTRY_ID)
  private Long thirdIndustryId = null;

  public static final String SERIALIZED_NAME_THIRD_INDUSTRY_NAME = "third_industry_name";
  @SerializedName(SERIALIZED_NAME_THIRD_INDUSTRY_NAME)
  private String thirdIndustryName = null;

  public ToolsIndustryGetV2ResponseDataListInner() {
  }

  public ToolsIndustryGetV2ResponseDataListInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ToolsIndustryGetV2ResponseDataListInner firstIndustryId(Long firstIndustryId) {
    
    this.firstIndustryId = firstIndustryId;
    return this;
  }

   /**
   * 
   * @return firstIndustryId
  **/
  @javax.annotation.Nullable
  public Long getFirstIndustryId() {
    return firstIndustryId;
  }


  public void setFirstIndustryId(Long firstIndustryId) {
    this.firstIndustryId = firstIndustryId;
  }


  public ToolsIndustryGetV2ResponseDataListInner firstIndustryName(String firstIndustryName) {
    
    this.firstIndustryName = firstIndustryName;
    return this;
  }

   /**
   * 
   * @return firstIndustryName
  **/
  @javax.annotation.Nullable
  public String getFirstIndustryName() {
    return firstIndustryName;
  }


  public void setFirstIndustryName(String firstIndustryName) {
    this.firstIndustryName = firstIndustryName;
  }


  public ToolsIndustryGetV2ResponseDataListInner industryId(Long industryId) {
    
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


  public ToolsIndustryGetV2ResponseDataListInner industryName(String industryName) {
    
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


  public ToolsIndustryGetV2ResponseDataListInner level(Long level) {
    
    this.level = level;
    return this;
  }

   /**
   * 
   * @return level
  **/
  @javax.annotation.Nullable
  public Long getLevel() {
    return level;
  }


  public void setLevel(Long level) {
    this.level = level;
  }


  public ToolsIndustryGetV2ResponseDataListInner secondIndustryId(Long secondIndustryId) {
    
    this.secondIndustryId = secondIndustryId;
    return this;
  }

   /**
   * 
   * @return secondIndustryId
  **/
  @javax.annotation.Nullable
  public Long getSecondIndustryId() {
    return secondIndustryId;
  }


  public void setSecondIndustryId(Long secondIndustryId) {
    this.secondIndustryId = secondIndustryId;
  }


  public ToolsIndustryGetV2ResponseDataListInner secondIndustryName(String secondIndustryName) {
    
    this.secondIndustryName = secondIndustryName;
    return this;
  }

   /**
   * 
   * @return secondIndustryName
  **/
  @javax.annotation.Nullable
  public String getSecondIndustryName() {
    return secondIndustryName;
  }


  public void setSecondIndustryName(String secondIndustryName) {
    this.secondIndustryName = secondIndustryName;
  }


  public ToolsIndustryGetV2ResponseDataListInner thirdIndustryId(Long thirdIndustryId) {
    
    this.thirdIndustryId = thirdIndustryId;
    return this;
  }

   /**
   * 
   * @return thirdIndustryId
  **/
  @javax.annotation.Nullable
  public Long getThirdIndustryId() {
    return thirdIndustryId;
  }


  public void setThirdIndustryId(Long thirdIndustryId) {
    this.thirdIndustryId = thirdIndustryId;
  }


  public ToolsIndustryGetV2ResponseDataListInner thirdIndustryName(String thirdIndustryName) {
    
    this.thirdIndustryName = thirdIndustryName;
    return this;
  }

   /**
   * 
   * @return thirdIndustryName
  **/
  @javax.annotation.Nullable
  public String getThirdIndustryName() {
    return thirdIndustryName;
  }


  public void setThirdIndustryName(String thirdIndustryName) {
    this.thirdIndustryName = thirdIndustryName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsIndustryGetV2ResponseDataListInner toolsIndustryGetV2ResponseDataListInner = (ToolsIndustryGetV2ResponseDataListInner) o;
    return Objects.equals(this.description, toolsIndustryGetV2ResponseDataListInner.description) &&
        Objects.equals(this.firstIndustryId, toolsIndustryGetV2ResponseDataListInner.firstIndustryId) &&
        Objects.equals(this.firstIndustryName, toolsIndustryGetV2ResponseDataListInner.firstIndustryName) &&
        Objects.equals(this.industryId, toolsIndustryGetV2ResponseDataListInner.industryId) &&
        Objects.equals(this.industryName, toolsIndustryGetV2ResponseDataListInner.industryName) &&
        Objects.equals(this.level, toolsIndustryGetV2ResponseDataListInner.level) &&
        Objects.equals(this.secondIndustryId, toolsIndustryGetV2ResponseDataListInner.secondIndustryId) &&
        Objects.equals(this.secondIndustryName, toolsIndustryGetV2ResponseDataListInner.secondIndustryName) &&
        Objects.equals(this.thirdIndustryId, toolsIndustryGetV2ResponseDataListInner.thirdIndustryId) &&
        Objects.equals(this.thirdIndustryName, toolsIndustryGetV2ResponseDataListInner.thirdIndustryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, firstIndustryId, firstIndustryName, industryId, industryName, level, secondIndustryId, secondIndustryName, thirdIndustryId, thirdIndustryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsIndustryGetV2ResponseDataListInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    firstIndustryId: ").append(toIndentedString(firstIndustryId)).append("\n");
    sb.append("    firstIndustryName: ").append(toIndentedString(firstIndustryName)).append("\n");
    sb.append("    industryId: ").append(toIndentedString(industryId)).append("\n");
    sb.append("    industryName: ").append(toIndentedString(industryName)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    secondIndustryId: ").append(toIndentedString(secondIndustryId)).append("\n");
    sb.append("    secondIndustryName: ").append(toIndentedString(secondIndustryName)).append("\n");
    sb.append("    thirdIndustryId: ").append(toIndentedString(thirdIndustryId)).append("\n");
    sb.append("    thirdIndustryName: ").append(toIndentedString(thirdIndustryName)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("first_industry_id");
    openapiFields.add("first_industry_name");
    openapiFields.add("industry_id");
    openapiFields.add("industry_name");
    openapiFields.add("level");
    openapiFields.add("second_industry_id");
    openapiFields.add("second_industry_name");
    openapiFields.add("third_industry_id");
    openapiFields.add("third_industry_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsIndustryGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsIndustryGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsIndustryGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsIndustryGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsIndustryGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsIndustryGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsIndustryGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsIndustryGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsIndustryGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsIndustryGetV2ResponseDataListInner
  */
  public static ToolsIndustryGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsIndustryGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsIndustryGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

