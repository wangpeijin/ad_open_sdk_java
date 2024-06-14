/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class ToolsSiteReadV2ResponseData {
  public static final String SERIALIZED_NAME_BRICKS = "bricks";
  @SerializedName(SERIALIZED_NAME_BRICKS)
  private List<Object> bricks = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = null;

  public static final String SERIALIZED_NAME_SITE_TYPE = "site_type";
  @SerializedName(SERIALIZED_NAME_SITE_TYPE)
  private String siteType = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status = null;

  public static final String SERIALIZED_NAME_THUMBNAIL = "thumbnail";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL)
  private String thumbnail = null;

  public ToolsSiteReadV2ResponseData() {
  }

  public ToolsSiteReadV2ResponseData bricks(List<Object> bricks) {
    
    this.bricks = bricks;
    return this;
  }

  public ToolsSiteReadV2ResponseData addBricksItem(Object bricksItem) {
    if (this.bricks == null) {
      this.bricks = new ArrayList<>();
    }
    this.bricks.add(bricksItem);
    return this;
  }

   /**
   * 具体见返回示例业务数据（新建或更新时传递的数据）
   * @return bricks
  **/
  @javax.annotation.Nullable
  public List<Object> getBricks() {
    return bricks;
  }


  public void setBricks(List<Object> bricks) {
    this.bricks = bricks;
  }


  public ToolsSiteReadV2ResponseData id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 站点ID
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ToolsSiteReadV2ResponseData siteType(String siteType) {
    
    this.siteType = siteType;
    return this;
  }

   /**
   * 建站类型
   * @return siteType
  **/
  @javax.annotation.Nullable
  public String getSiteType() {
    return siteType;
  }


  public void setSiteType(String siteType) {
    this.siteType = siteType;
  }


  public ToolsSiteReadV2ResponseData status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 站点状态
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ToolsSiteReadV2ResponseData thumbnail(String thumbnail) {
    
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * 缩略图（只有发布的站点才会生成）
   * @return thumbnail
  **/
  @javax.annotation.Nullable
  public String getThumbnail() {
    return thumbnail;
  }


  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteReadV2ResponseData toolsSiteReadV2ResponseData = (ToolsSiteReadV2ResponseData) o;
    return Objects.equals(this.bricks, toolsSiteReadV2ResponseData.bricks) &&
        Objects.equals(this.id, toolsSiteReadV2ResponseData.id) &&
        Objects.equals(this.siteType, toolsSiteReadV2ResponseData.siteType) &&
        Objects.equals(this.status, toolsSiteReadV2ResponseData.status) &&
        Objects.equals(this.thumbnail, toolsSiteReadV2ResponseData.thumbnail);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bricks, id, siteType, status, thumbnail);
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
    sb.append("class ToolsSiteReadV2ResponseData {\n");
    sb.append("    bricks: ").append(toIndentedString(bricks)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    siteType: ").append(toIndentedString(siteType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
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
    openapiFields.add("bricks");
    openapiFields.add("id");
    openapiFields.add("site_type");
    openapiFields.add("status");
    openapiFields.add("thumbnail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteReadV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteReadV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteReadV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteReadV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteReadV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsSiteReadV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteReadV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteReadV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteReadV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteReadV2ResponseData
  */
  public static ToolsSiteReadV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteReadV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsSiteReadV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

