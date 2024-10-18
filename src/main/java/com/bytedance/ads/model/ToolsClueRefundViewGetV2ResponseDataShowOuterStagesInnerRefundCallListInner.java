/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
 * ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner {
  public static final String SERIALIZED_NAME_BILL_STATE_TEXT = "bill_state_text";
  @SerializedName(SERIALIZED_NAME_BILL_STATE_TEXT)
  private String billStateText = null;

  public static final String SERIALIZED_NAME_CALL_ID = "call_id";
  @SerializedName(SERIALIZED_NAME_CALL_ID)
  private String callId = null;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color = null;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason = null;

  public static final String SERIALIZED_NAME_REFUND_CHECK_RESULT = "refund_check_result";
  @SerializedName(SERIALIZED_NAME_REFUND_CHECK_RESULT)
  private Long refundCheckResult = null;

  public static final String SERIALIZED_NAME_REFUND_CHECK_RESULT_TEXT = "refund_check_result_text";
  @SerializedName(SERIALIZED_NAME_REFUND_CHECK_RESULT_TEXT)
  private String refundCheckResultText = null;

  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner() {
  }

  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner billStateText(String billStateText) {
    
    this.billStateText = billStateText;
    return this;
  }

   /**
   * 通话状态
   * @return billStateText
  **/
  @javax.annotation.Nullable
  public String getBillStateText() {
    return billStateText;
  }


  public void setBillStateText(String billStateText) {
    this.billStateText = billStateText;
  }


  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner callId(String callId) {
    
    this.callId = callId;
    return this;
  }

   /**
   * 通话id, 和话单一一对应
   * @return callId
  **/
  @javax.annotation.Nullable
  public String getCallId() {
    return callId;
  }


  public void setCallId(String callId) {
    this.callId = callId;
  }


  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * UI颜色，飞鱼SDK前端所需字段，传入即可
   * @return color
  **/
  @javax.annotation.Nullable
  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    this.color = color;
  }


  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * 不满足原因，, 仅在不满足要求时展示&lt;br&gt;例如：\&quot;原因： 未打够35s\&quot;
   * @return reason
  **/
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner refundCheckResult(Long refundCheckResult) {
    
    this.refundCheckResult = refundCheckResult;
    return this;
  }

   /**
   * 0,1,2 
   * @return refundCheckResult
  **/
  @javax.annotation.Nullable
  public Long getRefundCheckResult() {
    return refundCheckResult;
  }


  public void setRefundCheckResult(Long refundCheckResult) {
    this.refundCheckResult = refundCheckResult;
  }


  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner refundCheckResultText(String refundCheckResultText) {
    
    this.refundCheckResultText = refundCheckResultText;
    return this;
  }

   /**
   * 满足要求 | 不满足要求 | 已接通
   * @return refundCheckResultText
  **/
  @javax.annotation.Nullable
  public String getRefundCheckResultText() {
    return refundCheckResultText;
  }


  public void setRefundCheckResultText(String refundCheckResultText) {
    this.refundCheckResultText = refundCheckResultText;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner toolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner = (ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner) o;
    return Objects.equals(this.billStateText, toolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner.billStateText) &&
        Objects.equals(this.callId, toolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner.callId) &&
        Objects.equals(this.color, toolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner.color) &&
        Objects.equals(this.reason, toolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner.reason) &&
        Objects.equals(this.refundCheckResult, toolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner.refundCheckResult) &&
        Objects.equals(this.refundCheckResultText, toolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner.refundCheckResultText);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(billStateText, callId, color, reason, refundCheckResult, refundCheckResultText);
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
    sb.append("class ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner {\n");
    sb.append("    billStateText: ").append(toIndentedString(billStateText)).append("\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    refundCheckResult: ").append(toIndentedString(refundCheckResult)).append("\n");
    sb.append("    refundCheckResultText: ").append(toIndentedString(refundCheckResultText)).append("\n");
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
    openapiFields.add("bill_state_text");
    openapiFields.add("call_id");
    openapiFields.add("color");
    openapiFields.add("reason");
    openapiFields.add("refund_check_result");
    openapiFields.add("refund_check_result_text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner>() {
           @Override
           public void write(JsonWriter out, ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner
  */
  public static ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner.class);
  }

 /**
  * Convert an instance of ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

