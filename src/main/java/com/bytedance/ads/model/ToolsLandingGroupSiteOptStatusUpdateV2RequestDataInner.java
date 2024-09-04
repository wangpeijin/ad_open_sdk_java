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
 * ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner {
  public static final String SERIALIZED_NAME_MEMBER_ID = "member_id";
  @SerializedName(SERIALIZED_NAME_MEMBER_ID)
  private Long memberId = null;

  public static final String SERIALIZED_NAME_SITE_OPT_STATUS = "site_opt_status";
  @SerializedName(SERIALIZED_NAME_SITE_OPT_STATUS)
  private String siteOptStatus = null;

  public ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner() {
  }

  public ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner memberId(Long memberId) {
    
    this.memberId = memberId;
    return this;
  }

   /**
   * 成员 ID，即站点在落地页组中的唯一标识
   * @return memberId
  **/
  @javax.annotation.Nonnull
  public Long getMemberId() {
    return memberId;
  }


  public void setMemberId(Long memberId) {
    this.memberId = memberId;
  }


  public ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner siteOptStatus(String siteOptStatus) {
    
    this.siteOptStatus = siteOptStatus;
    return this;
  }

   /**
   * 站点启用状态，详见【附录-枚举值】，可选值: SITE_OPT_STATUS_DISABLE,SITE_OPT_STATUS_ENABLE
   * @return siteOptStatus
  **/
  @javax.annotation.Nonnull
  public String getSiteOptStatus() {
    return siteOptStatus;
  }


  public void setSiteOptStatus(String siteOptStatus) {
    this.siteOptStatus = siteOptStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner toolsLandingGroupSiteOptStatusUpdateV2RequestDataInner = (ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner) o;
    return Objects.equals(this.memberId, toolsLandingGroupSiteOptStatusUpdateV2RequestDataInner.memberId) &&
        Objects.equals(this.siteOptStatus, toolsLandingGroupSiteOptStatusUpdateV2RequestDataInner.siteOptStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, siteOptStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner {\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    siteOptStatus: ").append(toIndentedString(siteOptStatus)).append("\n");
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
    openapiFields.add("member_id");
    openapiFields.add("site_opt_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("member_id");
    openapiRequiredFields.add("site_opt_status");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner>() {
           @Override
           public void write(JsonWriter out, ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner
  * @throws IOException if the JSON string is invalid with respect to ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner
  */
  public static ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner.class);
  }

 /**
  * Convert an instance of ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

