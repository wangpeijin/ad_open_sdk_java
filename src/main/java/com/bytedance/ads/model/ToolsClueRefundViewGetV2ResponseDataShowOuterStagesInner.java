/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail;
import com.bytedance.ads.model.ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner;
import com.bytedance.ads.model.ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner {
  public static final String SERIALIZED_NAME_CALL_COUNT_DETAIL = "call_count_detail";
  @SerializedName(SERIALIZED_NAME_CALL_COUNT_DETAIL)
  private ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail callCountDetail = null;

  public static final String SERIALIZED_NAME_REFUND_CALL_LIST = "refund_call_list";
  @SerializedName(SERIALIZED_NAME_REFUND_CALL_LIST)
  private List<ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner> refundCallList = null;

  public static final String SERIALIZED_NAME_SHOW_INNER_STAGES = "show_inner_stages";
  @SerializedName(SERIALIZED_NAME_SHOW_INNER_STAGES)
  private List<ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner> showInnerStages = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner() {
  }

  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner callCountDetail(ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail callCountDetail) {
    
    this.callCountDetail = callCountDetail;
    return this;
  }

   /**
   * Get callCountDetail
   * @return callCountDetail
  **/
  @javax.annotation.Nullable
  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail getCallCountDetail() {
    return callCountDetail;
  }


  public void setCallCountDetail(ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail callCountDetail) {
    this.callCountDetail = callCountDetail;
  }


  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner refundCallList(List<ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner> refundCallList) {
    
    this.refundCallList = refundCallList;
    return this;
  }

  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner addRefundCallListItem(ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner refundCallListItem) {
    if (this.refundCallList == null) {
      this.refundCallList = new ArrayList<>();
    }
    this.refundCallList.add(refundCallListItem);
    return this;
  }

   /**
   * 返款标签 (参与返款、支持赔付)
   * @return refundCallList
  **/
  @javax.annotation.Nullable
  public List<ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner> getRefundCallList() {
    return refundCallList;
  }


  public void setRefundCallList(List<ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerRefundCallListInner> refundCallList) {
    this.refundCallList = refundCallList;
  }


  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner showInnerStages(List<ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner> showInnerStages) {
    
    this.showInnerStages = showInnerStages;
    return this;
  }

  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner addShowInnerStagesItem(ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner showInnerStagesItem) {
    if (this.showInnerStages == null) {
      this.showInnerStages = new ArrayList<>();
    }
    this.showInnerStages.add(showInnerStagesItem);
    return this;
  }

   /**
   * 展示上面的小阶段，比如人工拨打时，第一个ShowOuterStage包含了两个小阶段（0-12小时，0-24小时）
   * @return showInnerStages
  **/
  @javax.annotation.Nullable
  public List<ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner> getShowInnerStages() {
    return showInnerStages;
  }


  public void setShowInnerStages(List<ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerShowInnerStagesInner> showInnerStages) {
    this.showInnerStages = showInnerStages;
  }


  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 线索id
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
    ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner toolsClueRefundViewGetV2ResponseDataShowOuterStagesInner = (ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner) o;
    return Objects.equals(this.callCountDetail, toolsClueRefundViewGetV2ResponseDataShowOuterStagesInner.callCountDetail) &&
        Objects.equals(this.refundCallList, toolsClueRefundViewGetV2ResponseDataShowOuterStagesInner.refundCallList) &&
        Objects.equals(this.showInnerStages, toolsClueRefundViewGetV2ResponseDataShowOuterStagesInner.showInnerStages) &&
        Objects.equals(this.title, toolsClueRefundViewGetV2ResponseDataShowOuterStagesInner.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(callCountDetail, refundCallList, showInnerStages, title);
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
    sb.append("class ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner {\n");
    sb.append("    callCountDetail: ").append(toIndentedString(callCountDetail)).append("\n");
    sb.append("    refundCallList: ").append(toIndentedString(refundCallList)).append("\n");
    sb.append("    showInnerStages: ").append(toIndentedString(showInnerStages)).append("\n");
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
    openapiFields.add("call_count_detail");
    openapiFields.add("refund_call_list");
    openapiFields.add("show_inner_stages");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner>() {
           @Override
           public void write(JsonWriter out, ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner
  * @throws IOException if the JSON string is invalid with respect to ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner
  */
  public static ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner.class);
  }

 /**
  * Convert an instance of ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

