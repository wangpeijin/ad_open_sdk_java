/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange;
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
 * StarDemandOmExpandChallengeProviderV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class StarDemandOmExpandChallengeProviderV2Request {
  public static final String SERIALIZED_NAME_CHALLENGE_TASK_ID = "challenge_task_id";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_TASK_ID)
  private Long challengeTaskId = null;

  public static final String SERIALIZED_NAME_OM_PARTICIPATE_PROVIDER_RANGE = "om_participate_provider_range";
  @SerializedName(SERIALIZED_NAME_OM_PARTICIPATE_PROVIDER_RANGE)
  private StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange omParticipateProviderRange = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public StarDemandOmExpandChallengeProviderV2Request() {
  }

  public StarDemandOmExpandChallengeProviderV2Request challengeTaskId(Long challengeTaskId) {
    
    this.challengeTaskId = challengeTaskId;
    return this;
  }

   /**
   * 
   * @return challengeTaskId
  **/
  @javax.annotation.Nonnull
  public Long getChallengeTaskId() {
    return challengeTaskId;
  }


  public void setChallengeTaskId(Long challengeTaskId) {
    this.challengeTaskId = challengeTaskId;
  }


  public StarDemandOmExpandChallengeProviderV2Request omParticipateProviderRange(StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange omParticipateProviderRange) {
    
    this.omParticipateProviderRange = omParticipateProviderRange;
    return this;
  }

   /**
   * Get omParticipateProviderRange
   * @return omParticipateProviderRange
  **/
  @javax.annotation.Nullable
  public StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange getOmParticipateProviderRange() {
    return omParticipateProviderRange;
  }


  public void setOmParticipateProviderRange(StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange omParticipateProviderRange) {
    this.omParticipateProviderRange = omParticipateProviderRange;
  }


  public StarDemandOmExpandChallengeProviderV2Request starId(Long starId) {
    
    this.starId = starId;
    return this;
  }

   /**
   * 
   * @return starId
  **/
  @javax.annotation.Nonnull
  public Long getStarId() {
    return starId;
  }


  public void setStarId(Long starId) {
    this.starId = starId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandOmExpandChallengeProviderV2Request starDemandOmExpandChallengeProviderV2Request = (StarDemandOmExpandChallengeProviderV2Request) o;
    return Objects.equals(this.challengeTaskId, starDemandOmExpandChallengeProviderV2Request.challengeTaskId) &&
        Objects.equals(this.omParticipateProviderRange, starDemandOmExpandChallengeProviderV2Request.omParticipateProviderRange) &&
        Objects.equals(this.starId, starDemandOmExpandChallengeProviderV2Request.starId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challengeTaskId, omParticipateProviderRange, starId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandOmExpandChallengeProviderV2Request {\n");
    sb.append("    challengeTaskId: ").append(toIndentedString(challengeTaskId)).append("\n");
    sb.append("    omParticipateProviderRange: ").append(toIndentedString(omParticipateProviderRange)).append("\n");
    sb.append("    starId: ").append(toIndentedString(starId)).append("\n");
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
    openapiFields.add("challenge_task_id");
    openapiFields.add("om_participate_provider_range");
    openapiFields.add("star_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("challenge_task_id");
    openapiRequiredFields.add("star_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmExpandChallengeProviderV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmExpandChallengeProviderV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmExpandChallengeProviderV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmExpandChallengeProviderV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmExpandChallengeProviderV2Request>() {
           @Override
           public void write(JsonWriter out, StarDemandOmExpandChallengeProviderV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmExpandChallengeProviderV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmExpandChallengeProviderV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmExpandChallengeProviderV2Request
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmExpandChallengeProviderV2Request
  */
  public static StarDemandOmExpandChallengeProviderV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmExpandChallengeProviderV2Request.class);
  }

 /**
  * Convert an instance of StarDemandOmExpandChallengeProviderV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

