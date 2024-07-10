/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarDemandOmExpandChallengeV2OmParticipateAuthorRangeOperationType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange {
  public static final String SERIALIZED_NAME_ADD_OR_CANCEL_AUTHOR_UIDS_ARRAY = "add_or_cancel_author_uids_array";
  @SerializedName(SERIALIZED_NAME_ADD_OR_CANCEL_AUTHOR_UIDS_ARRAY)
  private List<String> addOrCancelAuthorUidsArray = null;

  public static final String SERIALIZED_NAME_OPERATION_TYPE = "operation_type";
  @SerializedName(SERIALIZED_NAME_OPERATION_TYPE)
  private StarDemandOmExpandChallengeV2OmParticipateAuthorRangeOperationType operationType = null;

  public StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange() {
  }

  public StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange addOrCancelAuthorUidsArray(List<String> addOrCancelAuthorUidsArray) {
    
    this.addOrCancelAuthorUidsArray = addOrCancelAuthorUidsArray;
    return this;
  }

  public StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange addAddOrCancelAuthorUidsArrayItem(String addOrCancelAuthorUidsArrayItem) {
    if (this.addOrCancelAuthorUidsArray == null) {
      this.addOrCancelAuthorUidsArray = new ArrayList<>();
    }
    this.addOrCancelAuthorUidsArray.add(addOrCancelAuthorUidsArrayItem);
    return this;
  }

   /**
   * 增派达人抖音号 专属任务，list，最多200
   * @return addOrCancelAuthorUidsArray
  **/
  @javax.annotation.Nonnull
  public List<String> getAddOrCancelAuthorUidsArray() {
    return addOrCancelAuthorUidsArray;
  }


  public void setAddOrCancelAuthorUidsArray(List<String> addOrCancelAuthorUidsArray) {
    this.addOrCancelAuthorUidsArray = addOrCancelAuthorUidsArray;
  }


  public StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange operationType(StarDemandOmExpandChallengeV2OmParticipateAuthorRangeOperationType operationType) {
    
    this.operationType = operationType;
    return this;
  }

   /**
   * Get operationType
   * @return operationType
  **/
  @javax.annotation.Nonnull
  public StarDemandOmExpandChallengeV2OmParticipateAuthorRangeOperationType getOperationType() {
    return operationType;
  }


  public void setOperationType(StarDemandOmExpandChallengeV2OmParticipateAuthorRangeOperationType operationType) {
    this.operationType = operationType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange starDemandOmExpandChallengeV2RequestOmParticipateAuthorRange = (StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange) o;
    return Objects.equals(this.addOrCancelAuthorUidsArray, starDemandOmExpandChallengeV2RequestOmParticipateAuthorRange.addOrCancelAuthorUidsArray) &&
        Objects.equals(this.operationType, starDemandOmExpandChallengeV2RequestOmParticipateAuthorRange.operationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addOrCancelAuthorUidsArray, operationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange {\n");
    sb.append("    addOrCancelAuthorUidsArray: ").append(toIndentedString(addOrCancelAuthorUidsArray)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
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
    openapiFields.add("add_or_cancel_author_uids_array");
    openapiFields.add("operation_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("add_or_cancel_author_uids_array");
    openapiRequiredFields.add("operation_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange>() {
           @Override
           public void write(JsonWriter out, StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange
  */
  public static StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange.class);
  }

 /**
  * Convert an instance of StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

