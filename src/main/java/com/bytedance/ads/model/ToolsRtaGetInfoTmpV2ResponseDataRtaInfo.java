/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
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
 * RTA策略信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class ToolsRtaGetInfoTmpV2ResponseDataRtaInfo {
  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public static final String SERIALIZED_NAME_RTA_ID = "rta_id";
  @SerializedName(SERIALIZED_NAME_RTA_ID)
  private Long rtaId = null;

  public ToolsRtaGetInfoTmpV2ResponseDataRtaInfo() {
  }

  public ToolsRtaGetInfoTmpV2ResponseDataRtaInfo remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 备注，即RTA策略描述
   * @return remark
  **/
  @javax.annotation.Nullable
  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }


  public ToolsRtaGetInfoTmpV2ResponseDataRtaInfo rtaId(Long rtaId) {
    
    this.rtaId = rtaId;
    return this;
  }

   /**
   * RTA策略ID
   * @return rtaId
  **/
  @javax.annotation.Nullable
  public Long getRtaId() {
    return rtaId;
  }


  public void setRtaId(Long rtaId) {
    this.rtaId = rtaId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsRtaGetInfoTmpV2ResponseDataRtaInfo toolsRtaGetInfoTmpV2ResponseDataRtaInfo = (ToolsRtaGetInfoTmpV2ResponseDataRtaInfo) o;
    return Objects.equals(this.remark, toolsRtaGetInfoTmpV2ResponseDataRtaInfo.remark) &&
        Objects.equals(this.rtaId, toolsRtaGetInfoTmpV2ResponseDataRtaInfo.rtaId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(remark, rtaId);
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
    sb.append("class ToolsRtaGetInfoTmpV2ResponseDataRtaInfo {\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    rtaId: ").append(toIndentedString(rtaId)).append("\n");
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
    openapiFields.add("remark");
    openapiFields.add("rta_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsRtaGetInfoTmpV2ResponseDataRtaInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsRtaGetInfoTmpV2ResponseDataRtaInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsRtaGetInfoTmpV2ResponseDataRtaInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsRtaGetInfoTmpV2ResponseDataRtaInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsRtaGetInfoTmpV2ResponseDataRtaInfo>() {
           @Override
           public void write(JsonWriter out, ToolsRtaGetInfoTmpV2ResponseDataRtaInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsRtaGetInfoTmpV2ResponseDataRtaInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsRtaGetInfoTmpV2ResponseDataRtaInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsRtaGetInfoTmpV2ResponseDataRtaInfo
  * @throws IOException if the JSON string is invalid with respect to ToolsRtaGetInfoTmpV2ResponseDataRtaInfo
  */
  public static ToolsRtaGetInfoTmpV2ResponseDataRtaInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsRtaGetInfoTmpV2ResponseDataRtaInfo.class);
  }

 /**
  * Convert an instance of ToolsRtaGetInfoTmpV2ResponseDataRtaInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

