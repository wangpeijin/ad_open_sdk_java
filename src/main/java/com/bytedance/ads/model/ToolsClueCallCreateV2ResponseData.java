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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class ToolsClueCallCreateV2ResponseData {
  public static final String SERIALIZED_NAME_CALL_RESULT_CODE = "call_result_code";
  @SerializedName(SERIALIZED_NAME_CALL_RESULT_CODE)
  private Integer callResultCode = null;

  public static final String SERIALIZED_NAME_CALL_RESULT_MESSAGE = "call_result_message";
  @SerializedName(SERIALIZED_NAME_CALL_RESULT_MESSAGE)
  private String callResultMessage = null;

  public static final String SERIALIZED_NAME_CONTACT_ID = "contact_id";
  @SerializedName(SERIALIZED_NAME_CONTACT_ID)
  private String contactId = null;

  public static final String SERIALIZED_NAME_VIRTUAL_NUMBER = "virtual_number";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_NUMBER)
  private String virtualNumber = null;

  public ToolsClueCallCreateV2ResponseData() {
  }

  public ToolsClueCallCreateV2ResponseData callResultCode(Integer callResultCode) {
    
    this.callResultCode = callResultCode;
    return this;
  }

   /**
   * 呼叫结果返回码。[详见“呼叫结果返回码 &amp; 呼叫结果返回信息”](https://bytedance.feishu.cn/wiki/wikcneKh4vQDeYrIN33joWdlZCd#)
   * @return callResultCode
  **/
  @javax.annotation.Nullable
  public Integer getCallResultCode() {
    return callResultCode;
  }


  public void setCallResultCode(Integer callResultCode) {
    this.callResultCode = callResultCode;
  }


  public ToolsClueCallCreateV2ResponseData callResultMessage(String callResultMessage) {
    
    this.callResultMessage = callResultMessage;
    return this;
  }

   /**
   * 呼叫结果返回信息。[详见“呼叫结果返回码 &amp; 呼叫结果返回信息”](https://bytedance.feishu.cn/wiki/wikcneKh4vQDeYrIN33joWdlZCd#)
   * @return callResultMessage
  **/
  @javax.annotation.Nullable
  public String getCallResultMessage() {
    return callResultMessage;
  }


  public void setCallResultMessage(String callResultMessage) {
    this.callResultMessage = callResultMessage;
  }


  public ToolsClueCallCreateV2ResponseData contactId(String contactId) {
    
    this.contactId = contactId;
    return this;
  }

   /**
   * 呼叫记录id, 用来标识一次外呼行为
   * @return contactId
  **/
  @javax.annotation.Nullable
  public String getContactId() {
    return contactId;
  }


  public void setContactId(String contactId) {
    this.contactId = contactId;
  }


  public ToolsClueCallCreateV2ResponseData virtualNumber(String virtualNumber) {
    
    this.virtualNumber = virtualNumber;
    return this;
  }

   /**
   * 中间号。当呼叫方式为axb时该字段有值。
   * @return virtualNumber
  **/
  @javax.annotation.Nullable
  public String getVirtualNumber() {
    return virtualNumber;
  }


  public void setVirtualNumber(String virtualNumber) {
    this.virtualNumber = virtualNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueCallCreateV2ResponseData toolsClueCallCreateV2ResponseData = (ToolsClueCallCreateV2ResponseData) o;
    return Objects.equals(this.callResultCode, toolsClueCallCreateV2ResponseData.callResultCode) &&
        Objects.equals(this.callResultMessage, toolsClueCallCreateV2ResponseData.callResultMessage) &&
        Objects.equals(this.contactId, toolsClueCallCreateV2ResponseData.contactId) &&
        Objects.equals(this.virtualNumber, toolsClueCallCreateV2ResponseData.virtualNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(callResultCode, callResultMessage, contactId, virtualNumber);
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
    sb.append("class ToolsClueCallCreateV2ResponseData {\n");
    sb.append("    callResultCode: ").append(toIndentedString(callResultCode)).append("\n");
    sb.append("    callResultMessage: ").append(toIndentedString(callResultMessage)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    virtualNumber: ").append(toIndentedString(virtualNumber)).append("\n");
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
    openapiFields.add("call_result_code");
    openapiFields.add("call_result_message");
    openapiFields.add("contact_id");
    openapiFields.add("virtual_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueCallCreateV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueCallCreateV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueCallCreateV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueCallCreateV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueCallCreateV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsClueCallCreateV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueCallCreateV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueCallCreateV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueCallCreateV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsClueCallCreateV2ResponseData
  */
  public static ToolsClueCallCreateV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueCallCreateV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsClueCallCreateV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

