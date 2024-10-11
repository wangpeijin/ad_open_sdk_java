/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class AgentFundTransferSeqCreateV2ResponseData {
  public static final String SERIALIZED_NAME_TRANSFER_SEQ = "transfer_seq";
  @SerializedName(SERIALIZED_NAME_TRANSFER_SEQ)
  private Long transferSeq = null;

  public AgentFundTransferSeqCreateV2ResponseData() {
  }

  public AgentFundTransferSeqCreateV2ResponseData transferSeq(Long transferSeq) {
    
    this.transferSeq = transferSeq;
    return this;
  }

   /**
   * 转账序列号，第二步提交操作需要
   * @return transferSeq
  **/
  @javax.annotation.Nullable
  public Long getTransferSeq() {
    return transferSeq;
  }


  public void setTransferSeq(Long transferSeq) {
    this.transferSeq = transferSeq;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentFundTransferSeqCreateV2ResponseData agentFundTransferSeqCreateV2ResponseData = (AgentFundTransferSeqCreateV2ResponseData) o;
    return Objects.equals(this.transferSeq, agentFundTransferSeqCreateV2ResponseData.transferSeq);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferSeq);
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
    sb.append("class AgentFundTransferSeqCreateV2ResponseData {\n");
    sb.append("    transferSeq: ").append(toIndentedString(transferSeq)).append("\n");
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
    openapiFields.add("transfer_seq");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentFundTransferSeqCreateV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentFundTransferSeqCreateV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentFundTransferSeqCreateV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentFundTransferSeqCreateV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentFundTransferSeqCreateV2ResponseData>() {
           @Override
           public void write(JsonWriter out, AgentFundTransferSeqCreateV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentFundTransferSeqCreateV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentFundTransferSeqCreateV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentFundTransferSeqCreateV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to AgentFundTransferSeqCreateV2ResponseData
  */
  public static AgentFundTransferSeqCreateV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentFundTransferSeqCreateV2ResponseData.class);
  }

 /**
  * Convert an instance of AgentFundTransferSeqCreateV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

