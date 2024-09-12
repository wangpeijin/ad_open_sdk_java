/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
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
import java.util.HashMap;
import java.util.Map;

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
 * StarMcnContractChallengeV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class StarMcnContractChallengeV2Request {
  public static final String SERIALIZED_NAME_DEMAND_ID = "demand_id";
  @SerializedName(SERIALIZED_NAME_DEMAND_ID)
  private Long demandId = null;

  public static final String SERIALIZED_NAME_DEVELOPER_ID = "developer_id";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_ID)
  private Long developerId = null;

  public static final String SERIALIZED_NAME_MCN_PROFIT_RATE = "mcn_profit_rate";
  @SerializedName(SERIALIZED_NAME_MCN_PROFIT_RATE)
  private Integer mcnProfitRate = null;

  public static final String SERIALIZED_NAME_PROFIT_RATE_CHANNEL = "profit_rate_channel";
  @SerializedName(SERIALIZED_NAME_PROFIT_RATE_CHANNEL)
  private Map<String, Integer> profitRateChannel = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public StarMcnContractChallengeV2Request() {
  }

  public StarMcnContractChallengeV2Request demandId(Long demandId) {
    
    this.demandId = demandId;
    return this;
  }

   /**
   * 
   * @return demandId
  **/
  @javax.annotation.Nonnull
  public Long getDemandId() {
    return demandId;
  }


  public void setDemandId(Long demandId) {
    this.demandId = demandId;
  }


  public StarMcnContractChallengeV2Request developerId(Long developerId) {
    
    this.developerId = developerId;
    return this;
  }

   /**
   * 
   * @return developerId
  **/
  @javax.annotation.Nullable
  public Long getDeveloperId() {
    return developerId;
  }


  public void setDeveloperId(Long developerId) {
    this.developerId = developerId;
  }


  public StarMcnContractChallengeV2Request mcnProfitRate(Integer mcnProfitRate) {
    
    this.mcnProfitRate = mcnProfitRate;
    return this;
  }

   /**
   * 
   * minimum: 0
   * maximum: 1000
   * @return mcnProfitRate
  **/
  @javax.annotation.Nonnull
  public Integer getMcnProfitRate() {
    return mcnProfitRate;
  }


  public void setMcnProfitRate(Integer mcnProfitRate) {
    this.mcnProfitRate = mcnProfitRate;
  }


  public StarMcnContractChallengeV2Request profitRateChannel(Map<String, Integer> profitRateChannel) {
    
    this.profitRateChannel = profitRateChannel;
    return this;
  }

  public StarMcnContractChallengeV2Request putProfitRateChannelItem(String key, Integer profitRateChannelItem) {
    if (this.profitRateChannel == null) {
      this.profitRateChannel = new HashMap<>();
    }
    this.profitRateChannel.put(key, profitRateChannelItem);
    return this;
  }

   /**
   * 
   * @return profitRateChannel
  **/
  @javax.annotation.Nullable
  public Map<String, Integer> getProfitRateChannel() {
    return profitRateChannel;
  }


  public void setProfitRateChannel(Map<String, Integer> profitRateChannel) {
    this.profitRateChannel = profitRateChannel;
  }


  public StarMcnContractChallengeV2Request starId(Long starId) {
    
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
    StarMcnContractChallengeV2Request starMcnContractChallengeV2Request = (StarMcnContractChallengeV2Request) o;
    return Objects.equals(this.demandId, starMcnContractChallengeV2Request.demandId) &&
        Objects.equals(this.developerId, starMcnContractChallengeV2Request.developerId) &&
        Objects.equals(this.mcnProfitRate, starMcnContractChallengeV2Request.mcnProfitRate) &&
        Objects.equals(this.profitRateChannel, starMcnContractChallengeV2Request.profitRateChannel) &&
        Objects.equals(this.starId, starMcnContractChallengeV2Request.starId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(demandId, developerId, mcnProfitRate, profitRateChannel, starId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarMcnContractChallengeV2Request {\n");
    sb.append("    demandId: ").append(toIndentedString(demandId)).append("\n");
    sb.append("    developerId: ").append(toIndentedString(developerId)).append("\n");
    sb.append("    mcnProfitRate: ").append(toIndentedString(mcnProfitRate)).append("\n");
    sb.append("    profitRateChannel: ").append(toIndentedString(profitRateChannel)).append("\n");
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
    openapiFields.add("demand_id");
    openapiFields.add("developer_id");
    openapiFields.add("mcn_profit_rate");
    openapiFields.add("profit_rate_channel");
    openapiFields.add("star_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("demand_id");
    openapiRequiredFields.add("mcn_profit_rate");
    openapiRequiredFields.add("star_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarMcnContractChallengeV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarMcnContractChallengeV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarMcnContractChallengeV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarMcnContractChallengeV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StarMcnContractChallengeV2Request>() {
           @Override
           public void write(JsonWriter out, StarMcnContractChallengeV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarMcnContractChallengeV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarMcnContractChallengeV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarMcnContractChallengeV2Request
  * @throws IOException if the JSON string is invalid with respect to StarMcnContractChallengeV2Request
  */
  public static StarMcnContractChallengeV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarMcnContractChallengeV2Request.class);
  }

 /**
  * Convert an instance of StarMcnContractChallengeV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

