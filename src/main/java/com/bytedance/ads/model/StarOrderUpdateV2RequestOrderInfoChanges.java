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
 * 任务信息变动
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class StarOrderUpdateV2RequestOrderInfoChanges {
  public static final String SERIALIZED_NAME_COMPONENT_CLICK_MONITOR_URL = "component_click_monitor_url";
  @SerializedName(SERIALIZED_NAME_COMPONENT_CLICK_MONITOR_URL)
  private String componentClickMonitorUrl = null;

  public static final String SERIALIZED_NAME_ITEM_SHOW_MONITOR_URL = "item_show_monitor_url";
  @SerializedName(SERIALIZED_NAME_ITEM_SHOW_MONITOR_URL)
  private String itemShowMonitorUrl = null;

  public static final String SERIALIZED_NAME_LINK_COMPONENT_IDS = "link_component_ids";
  @SerializedName(SERIALIZED_NAME_LINK_COMPONENT_IDS)
  private List<Long> linkComponentIds = null;

  public StarOrderUpdateV2RequestOrderInfoChanges() {
  }

  public StarOrderUpdateV2RequestOrderInfoChanges componentClickMonitorUrl(String componentClickMonitorUrl) {
    
    this.componentClickMonitorUrl = componentClickMonitorUrl;
    return this;
  }

   /**
   * 组件点击监测链接
   * @return componentClickMonitorUrl
  **/
  @javax.annotation.Nullable
  public String getComponentClickMonitorUrl() {
    return componentClickMonitorUrl;
  }


  public void setComponentClickMonitorUrl(String componentClickMonitorUrl) {
    this.componentClickMonitorUrl = componentClickMonitorUrl;
  }


  public StarOrderUpdateV2RequestOrderInfoChanges itemShowMonitorUrl(String itemShowMonitorUrl) {
    
    this.itemShowMonitorUrl = itemShowMonitorUrl;
    return this;
  }

   /**
   * 视频曝光监测链接
   * @return itemShowMonitorUrl
  **/
  @javax.annotation.Nullable
  public String getItemShowMonitorUrl() {
    return itemShowMonitorUrl;
  }


  public void setItemShowMonitorUrl(String itemShowMonitorUrl) {
    this.itemShowMonitorUrl = itemShowMonitorUrl;
  }


  public StarOrderUpdateV2RequestOrderInfoChanges linkComponentIds(List<Long> linkComponentIds) {
    
    this.linkComponentIds = linkComponentIds;
    return this;
  }

  public StarOrderUpdateV2RequestOrderInfoChanges addLinkComponentIdsItem(Long linkComponentIdsItem) {
    if (this.linkComponentIds == null) {
      this.linkComponentIds = new ArrayList<>();
    }
    this.linkComponentIds.add(linkComponentIdsItem);
    return this;
  }

   /**
   * 常规组件ID列表（最多一个）
   * @return linkComponentIds
  **/
  @javax.annotation.Nullable
  public List<Long> getLinkComponentIds() {
    return linkComponentIds;
  }


  public void setLinkComponentIds(List<Long> linkComponentIds) {
    this.linkComponentIds = linkComponentIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarOrderUpdateV2RequestOrderInfoChanges starOrderUpdateV2RequestOrderInfoChanges = (StarOrderUpdateV2RequestOrderInfoChanges) o;
    return Objects.equals(this.componentClickMonitorUrl, starOrderUpdateV2RequestOrderInfoChanges.componentClickMonitorUrl) &&
        Objects.equals(this.itemShowMonitorUrl, starOrderUpdateV2RequestOrderInfoChanges.itemShowMonitorUrl) &&
        Objects.equals(this.linkComponentIds, starOrderUpdateV2RequestOrderInfoChanges.linkComponentIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentClickMonitorUrl, itemShowMonitorUrl, linkComponentIds);
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
    sb.append("class StarOrderUpdateV2RequestOrderInfoChanges {\n");
    sb.append("    componentClickMonitorUrl: ").append(toIndentedString(componentClickMonitorUrl)).append("\n");
    sb.append("    itemShowMonitorUrl: ").append(toIndentedString(itemShowMonitorUrl)).append("\n");
    sb.append("    linkComponentIds: ").append(toIndentedString(linkComponentIds)).append("\n");
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
    openapiFields.add("component_click_monitor_url");
    openapiFields.add("item_show_monitor_url");
    openapiFields.add("link_component_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderUpdateV2RequestOrderInfoChanges.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderUpdateV2RequestOrderInfoChanges' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderUpdateV2RequestOrderInfoChanges> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderUpdateV2RequestOrderInfoChanges.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderUpdateV2RequestOrderInfoChanges>() {
           @Override
           public void write(JsonWriter out, StarOrderUpdateV2RequestOrderInfoChanges value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderUpdateV2RequestOrderInfoChanges read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderUpdateV2RequestOrderInfoChanges given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderUpdateV2RequestOrderInfoChanges
  * @throws IOException if the JSON string is invalid with respect to StarOrderUpdateV2RequestOrderInfoChanges
  */
  public static StarOrderUpdateV2RequestOrderInfoChanges fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderUpdateV2RequestOrderInfoChanges.class);
  }

 /**
  * Convert an instance of StarOrderUpdateV2RequestOrderInfoChanges to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

