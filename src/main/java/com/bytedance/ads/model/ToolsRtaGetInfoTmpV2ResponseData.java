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
import com.bytedance.ads.model.ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo;
import com.bytedance.ads.model.ToolsRtaGetInfoTmpV2ResponseDataRtaInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class ToolsRtaGetInfoTmpV2ResponseData {
  public static final String SERIALIZED_NAME_INTERFACE_INFO = "interface_info";
  @SerializedName(SERIALIZED_NAME_INTERFACE_INFO)
  private ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo interfaceInfo = null;

  public static final String SERIALIZED_NAME_RTA_INFO = "rta_info";
  @SerializedName(SERIALIZED_NAME_RTA_INFO)
  private ToolsRtaGetInfoTmpV2ResponseDataRtaInfo rtaInfo = null;

  public ToolsRtaGetInfoTmpV2ResponseData() {
  }

  public ToolsRtaGetInfoTmpV2ResponseData interfaceInfo(ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo interfaceInfo) {
    
    this.interfaceInfo = interfaceInfo;
    return this;
  }

   /**
   * Get interfaceInfo
   * @return interfaceInfo
  **/
  @javax.annotation.Nullable
  public ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo getInterfaceInfo() {
    return interfaceInfo;
  }


  public void setInterfaceInfo(ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo interfaceInfo) {
    this.interfaceInfo = interfaceInfo;
  }


  public ToolsRtaGetInfoTmpV2ResponseData rtaInfo(ToolsRtaGetInfoTmpV2ResponseDataRtaInfo rtaInfo) {
    
    this.rtaInfo = rtaInfo;
    return this;
  }

   /**
   * Get rtaInfo
   * @return rtaInfo
  **/
  @javax.annotation.Nullable
  public ToolsRtaGetInfoTmpV2ResponseDataRtaInfo getRtaInfo() {
    return rtaInfo;
  }


  public void setRtaInfo(ToolsRtaGetInfoTmpV2ResponseDataRtaInfo rtaInfo) {
    this.rtaInfo = rtaInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsRtaGetInfoTmpV2ResponseData toolsRtaGetInfoTmpV2ResponseData = (ToolsRtaGetInfoTmpV2ResponseData) o;
    return Objects.equals(this.interfaceInfo, toolsRtaGetInfoTmpV2ResponseData.interfaceInfo) &&
        Objects.equals(this.rtaInfo, toolsRtaGetInfoTmpV2ResponseData.rtaInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(interfaceInfo, rtaInfo);
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
    sb.append("class ToolsRtaGetInfoTmpV2ResponseData {\n");
    sb.append("    interfaceInfo: ").append(toIndentedString(interfaceInfo)).append("\n");
    sb.append("    rtaInfo: ").append(toIndentedString(rtaInfo)).append("\n");
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
    openapiFields.add("interface_info");
    openapiFields.add("rta_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsRtaGetInfoTmpV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsRtaGetInfoTmpV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsRtaGetInfoTmpV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsRtaGetInfoTmpV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsRtaGetInfoTmpV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsRtaGetInfoTmpV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsRtaGetInfoTmpV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsRtaGetInfoTmpV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsRtaGetInfoTmpV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsRtaGetInfoTmpV2ResponseData
  */
  public static ToolsRtaGetInfoTmpV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsRtaGetInfoTmpV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsRtaGetInfoTmpV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

