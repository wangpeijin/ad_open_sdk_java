/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
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
 * AgentRefundTransferSeqCommitV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class AgentRefundTransferSeqCommitV2Request {
  public static final String SERIALIZED_NAME_AGENT_ID = "agent_id";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private Long agentId = null;

  public static final String SERIALIZED_NAME_REFUND_SEQ = "refund_seq";
  @SerializedName(SERIALIZED_NAME_REFUND_SEQ)
  private Long refundSeq = null;

  public AgentRefundTransferSeqCommitV2Request() {
  }

  public AgentRefundTransferSeqCommitV2Request agentId(Long agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * 代理商ID
   * @return agentId
  **/
  @javax.annotation.Nonnull
  public Long getAgentId() {
    return agentId;
  }


  public void setAgentId(Long agentId) {
    this.agentId = agentId;
  }


  public AgentRefundTransferSeqCommitV2Request refundSeq(Long refundSeq) {
    
    this.refundSeq = refundSeq;
    return this;
  }

   /**
   * 退款流水号，第一步请求会返回
   * @return refundSeq
  **/
  @javax.annotation.Nonnull
  public Long getRefundSeq() {
    return refundSeq;
  }


  public void setRefundSeq(Long refundSeq) {
    this.refundSeq = refundSeq;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentRefundTransferSeqCommitV2Request agentRefundTransferSeqCommitV2Request = (AgentRefundTransferSeqCommitV2Request) o;
    return Objects.equals(this.agentId, agentRefundTransferSeqCommitV2Request.agentId) &&
        Objects.equals(this.refundSeq, agentRefundTransferSeqCommitV2Request.refundSeq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, refundSeq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentRefundTransferSeqCommitV2Request {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    refundSeq: ").append(toIndentedString(refundSeq)).append("\n");
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
    openapiFields.add("agent_id");
    openapiFields.add("refund_seq");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("agent_id");
    openapiRequiredFields.add("refund_seq");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentRefundTransferSeqCommitV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentRefundTransferSeqCommitV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentRefundTransferSeqCommitV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentRefundTransferSeqCommitV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentRefundTransferSeqCommitV2Request>() {
           @Override
           public void write(JsonWriter out, AgentRefundTransferSeqCommitV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentRefundTransferSeqCommitV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentRefundTransferSeqCommitV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentRefundTransferSeqCommitV2Request
  * @throws IOException if the JSON string is invalid with respect to AgentRefundTransferSeqCommitV2Request
  */
  public static AgentRefundTransferSeqCommitV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentRefundTransferSeqCommitV2Request.class);
  }

 /**
  * Convert an instance of AgentRefundTransferSeqCommitV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

