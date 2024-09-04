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
 * 发券组件描述
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon {
  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private Long activityId = null;

  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon() {
  }

  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon activityId(Long activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * 活动ID，当&#x60;coupon&#x60;不为空时，有值。用户可以通过[【获取卡券列表】]（https://open.oceanengine.com/doc/index.html?key&#x3D;ad&amp;type&#x3D;api&amp;id&#x3D;1696710639364108#item-link-%E6%A6%82%E5%BF%B5%E4%BB%8B%E7%BB%8D）接口或[【青鸟线索通平台】]（https://clue.oceanengine.com/）获取活动ID。 
   * @return activityId
  **/
  @javax.annotation.Nullable
  public Long getActivityId() {
    return activityId;
  }


  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon toolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon = (ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon) o;
    return Objects.equals(this.activityId, toolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon.activityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
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
    openapiFields.add("activity_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("activity_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon>() {
           @Override
           public void write(JsonWriter out, ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon
  */
  public static ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon.class);
  }

 /**
  * Convert an instance of ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

