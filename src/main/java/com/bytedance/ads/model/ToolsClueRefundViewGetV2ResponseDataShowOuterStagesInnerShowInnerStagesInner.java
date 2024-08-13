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
import com.bytedance.ads.model.ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInnerShowTimeDetails;
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
 * ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner {
  public static final String SERIALIZED_NAME_INNER_REFUND_STATUS = "inner_refund_status";
  @SerializedName(SERIALIZED_NAME_INNER_REFUND_STATUS)
  private Long innerRefundStatus = null;

  public static final String SERIALIZED_NAME_INNER_REFUND_STATUS_TEXT = "inner_refund_status_text";
  @SerializedName(SERIALIZED_NAME_INNER_REFUND_STATUS_TEXT)
  private String innerRefundStatusText = null;

  public static final String SERIALIZED_NAME_SHOW_TIME_DETAILS = "show_time_details";
  @SerializedName(SERIALIZED_NAME_SHOW_TIME_DETAILS)
  private ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInnerShowTimeDetails showTimeDetails = null;

  public static final String SERIALIZED_NAME_SHOW_TIP = "show_tip";
  @SerializedName(SERIALIZED_NAME_SHOW_TIP)
  private Boolean showTip = null;

  public static final String SERIALIZED_NAME_SHOW_TIP_CONTENT = "show_tip_content";
  @SerializedName(SERIALIZED_NAME_SHOW_TIP_CONTENT)
  private String showTipContent = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner() {
  }

  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner innerRefundStatus(Long innerRefundStatus) {
    
    this.innerRefundStatus = innerRefundStatus;
    return this;
  }

   /**
   * 是否符合: 0 不符合, 1 符合
   * @return innerRefundStatus
  **/
  @javax.annotation.Nullable
  public Long getInnerRefundStatus() {
    return innerRefundStatus;
  }


  public void setInnerRefundStatus(Long innerRefundStatus) {
    this.innerRefundStatus = innerRefundStatus;
  }


  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner innerRefundStatusText(String innerRefundStatusText) {
    
    this.innerRefundStatusText = innerRefundStatusText;
    return this;
  }

   /**
   * \&quot;符合\&quot; ｜ \&quot;未符合\&quot;
   * @return innerRefundStatusText
  **/
  @javax.annotation.Nullable
  public String getInnerRefundStatusText() {
    return innerRefundStatusText;
  }


  public void setInnerRefundStatusText(String innerRefundStatusText) {
    this.innerRefundStatusText = innerRefundStatusText;
  }


  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner showTimeDetails(ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInnerShowTimeDetails showTimeDetails) {
    
    this.showTimeDetails = showTimeDetails;
    return this;
  }

   /**
   * Get showTimeDetails
   * @return showTimeDetails
  **/
  @javax.annotation.Nullable
  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInnerShowTimeDetails getShowTimeDetails() {
    return showTimeDetails;
  }


  public void setShowTimeDetails(ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInnerShowTimeDetails showTimeDetails) {
    this.showTimeDetails = showTimeDetails;
  }


  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner showTip(Boolean showTip) {
    
    this.showTip = showTip;
    return this;
  }

   /**
   * true | false,是否显示小问号，飞鱼SDK前端所需字段，传入即可
   * @return showTip
  **/
  @javax.annotation.Nullable
  public Boolean getShowTip() {
    return showTip;
  }


  public void setShowTip(Boolean showTip) {
    this.showTip = showTip;
  }


  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner showTipContent(String showTipContent) {
    
    this.showTipContent = showTipContent;
    return this;
  }

   /**
   * \&quot;为保证首次跟进时间充裕，首通的12小时为可外呼时间段（7:00!23:00）的完整12小时\&quot; ，飞鱼SDK前端所需字段，传入即可
   * @return showTipContent
  **/
  @javax.annotation.Nullable
  public String getShowTipContent() {
    return showTipContent;
  }


  public void setShowTipContent(String showTipContent) {
    this.showTipContent = showTipContent;
  }


  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 在 0-12小时内 拨打电话为未接通 | 在 0-24小时内 拨打 3 次 电话为未接通
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner toolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner = (ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner) o;
    return Objects.equals(this.innerRefundStatus, toolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner.innerRefundStatus) &&
        Objects.equals(this.innerRefundStatusText, toolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner.innerRefundStatusText) &&
        Objects.equals(this.showTimeDetails, toolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner.showTimeDetails) &&
        Objects.equals(this.showTip, toolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner.showTip) &&
        Objects.equals(this.showTipContent, toolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner.showTipContent) &&
        Objects.equals(this.title, toolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(innerRefundStatus, innerRefundStatusText, showTimeDetails, showTip, showTipContent, title);
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
    sb.append("class ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner {\n");
    sb.append("    innerRefundStatus: ").append(toIndentedString(innerRefundStatus)).append("\n");
    sb.append("    innerRefundStatusText: ").append(toIndentedString(innerRefundStatusText)).append("\n");
    sb.append("    showTimeDetails: ").append(toIndentedString(showTimeDetails)).append("\n");
    sb.append("    showTip: ").append(toIndentedString(showTip)).append("\n");
    sb.append("    showTipContent: ").append(toIndentedString(showTipContent)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("inner_refund_status");
    openapiFields.add("inner_refund_status_text");
    openapiFields.add("show_time_details");
    openapiFields.add("show_tip");
    openapiFields.add("show_tip_content");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner>() {
           @Override
           public void write(JsonWriter out, ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner
  * @throws IOException if the JSON string is invalid with respect to ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner
  */
  public static ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner.class);
  }

 /**
  * Convert an instance of ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

