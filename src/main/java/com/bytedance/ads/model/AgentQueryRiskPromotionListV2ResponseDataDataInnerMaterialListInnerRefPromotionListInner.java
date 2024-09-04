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
 * AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AGENT_ID = "agent_id";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private Long agentId = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner() {
  }

  public AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 同代理商账户下的其他关联广告ID所属的广告主账户ID
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner agentId(Long agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * 同代理商账户下的其他关联广告ID所属的代理商账户ID
   * @return agentId
  **/
  @javax.annotation.Nullable
  public Long getAgentId() {
    return agentId;
  }


  public void setAgentId(Long agentId) {
    this.agentId = agentId;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 同代理商账户下的其他关联广告ID
   * @return promotionId
  **/
  @javax.annotation.Nullable
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner agentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner = (AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner) o;
    return Objects.equals(this.advertiserId, agentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner.advertiserId) &&
        Objects.equals(this.agentId, agentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner.agentId) &&
        Objects.equals(this.promotionId, agentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner.promotionId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, agentId, promotionId);
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
    sb.append("class AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
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
    openapiFields.add("agent_id");
    openapiFields.add("promotion_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner>() {
           @Override
           public void write(JsonWriter out, AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner
  * @throws IOException if the JSON string is invalid with respect to AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner
  */
  public static AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner.class);
  }

 /**
  * Convert an instance of AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

