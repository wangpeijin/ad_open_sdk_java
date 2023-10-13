/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner;
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
 * ToolsPromotionDiagnosisSuggestionAcceptV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T15:22:35.223235852+08:00[PRC]")
public class ToolsPromotionDiagnosisSuggestionAcceptV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_DIAGNOSIS_ID = "diagnosis_id";
  @SerializedName(SERIALIZED_NAME_DIAGNOSIS_ID)
  private String diagnosisId = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public static final String SERIALIZED_NAME_TOOLS = "tools";
  @SerializedName(SERIALIZED_NAME_TOOLS)
  private List<ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner> tools = null;

  public ToolsPromotionDiagnosisSuggestionAcceptV30Request() {
  }

  public ToolsPromotionDiagnosisSuggestionAcceptV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsPromotionDiagnosisSuggestionAcceptV30Request diagnosisId(String diagnosisId) {
    
    this.diagnosisId = diagnosisId;
    return this;
  }

   /**
   * 
   * @return diagnosisId
  **/
  @javax.annotation.Nullable
  public String getDiagnosisId() {
    return diagnosisId;
  }


  public void setDiagnosisId(String diagnosisId) {
    this.diagnosisId = diagnosisId;
  }


  public ToolsPromotionDiagnosisSuggestionAcceptV30Request promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 
   * @return promotionId
  **/
  @javax.annotation.Nullable
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }


  public ToolsPromotionDiagnosisSuggestionAcceptV30Request tools(List<ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner> tools) {
    
    this.tools = tools;
    return this;
  }

  public ToolsPromotionDiagnosisSuggestionAcceptV30Request addToolsItem(ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    return this;
  }

   /**
   * 
   * @return tools
  **/
  @javax.annotation.Nullable
  public List<ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner> getTools() {
    return tools;
  }


  public void setTools(List<ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner> tools) {
    this.tools = tools;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPromotionDiagnosisSuggestionAcceptV30Request toolsPromotionDiagnosisSuggestionAcceptV30Request = (ToolsPromotionDiagnosisSuggestionAcceptV30Request) o;
    return Objects.equals(this.advertiserId, toolsPromotionDiagnosisSuggestionAcceptV30Request.advertiserId) &&
        Objects.equals(this.diagnosisId, toolsPromotionDiagnosisSuggestionAcceptV30Request.diagnosisId) &&
        Objects.equals(this.promotionId, toolsPromotionDiagnosisSuggestionAcceptV30Request.promotionId) &&
        Objects.equals(this.tools, toolsPromotionDiagnosisSuggestionAcceptV30Request.tools);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, diagnosisId, promotionId, tools);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPromotionDiagnosisSuggestionAcceptV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    diagnosisId: ").append(toIndentedString(diagnosisId)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("diagnosis_id");
    openapiFields.add("promotion_id");
    openapiFields.add("tools");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPromotionDiagnosisSuggestionAcceptV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPromotionDiagnosisSuggestionAcceptV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPromotionDiagnosisSuggestionAcceptV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPromotionDiagnosisSuggestionAcceptV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPromotionDiagnosisSuggestionAcceptV30Request>() {
           @Override
           public void write(JsonWriter out, ToolsPromotionDiagnosisSuggestionAcceptV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPromotionDiagnosisSuggestionAcceptV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPromotionDiagnosisSuggestionAcceptV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPromotionDiagnosisSuggestionAcceptV30Request
  * @throws IOException if the JSON string is invalid with respect to ToolsPromotionDiagnosisSuggestionAcceptV30Request
  */
  public static ToolsPromotionDiagnosisSuggestionAcceptV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPromotionDiagnosisSuggestionAcceptV30Request.class);
  }

 /**
  * Convert an instance of ToolsPromotionDiagnosisSuggestionAcceptV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

