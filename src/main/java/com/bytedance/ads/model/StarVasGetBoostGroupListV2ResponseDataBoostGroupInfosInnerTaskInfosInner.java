/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarVasGetBoostGroupListV2DataBoostGroupInfosTaskInfosAuditStatus;
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
 * StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner {
  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private StarVasGetBoostGroupListV2DataBoostGroupInfosTaskInfosAuditStatus auditStatus = null;

  public static final String SERIALIZED_NAME_AUTHOR_ID = "author_id";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private Long authorId = null;

  public static final String SERIALIZED_NAME_AUTHOR_NAME = "author_name";
  @SerializedName(SERIALIZED_NAME_AUTHOR_NAME)
  private String authorName = null;

  public static final String SERIALIZED_NAME_ITEM_NAME = "item_name";
  @SerializedName(SERIALIZED_NAME_ITEM_NAME)
  private String itemName = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_ORDER_NAME = "order_name";
  @SerializedName(SERIALIZED_NAME_ORDER_NAME)
  private String orderName = null;

  public StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner() {
  }

  public StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner auditStatus(StarVasGetBoostGroupListV2DataBoostGroupInfosTaskInfosAuditStatus auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * Get auditStatus
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public StarVasGetBoostGroupListV2DataBoostGroupInfosTaskInfosAuditStatus getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(StarVasGetBoostGroupListV2DataBoostGroupInfosTaskInfosAuditStatus auditStatus) {
    this.auditStatus = auditStatus;
  }


  public StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner authorId(Long authorId) {
    
    this.authorId = authorId;
    return this;
  }

   /**
   * 达人ID
   * @return authorId
  **/
  @javax.annotation.Nullable
  public Long getAuthorId() {
    return authorId;
  }


  public void setAuthorId(Long authorId) {
    this.authorId = authorId;
  }


  public StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner authorName(String authorName) {
    
    this.authorName = authorName;
    return this;
  }

   /**
   * 达人名称
   * @return authorName
  **/
  @javax.annotation.Nullable
  public String getAuthorName() {
    return authorName;
  }


  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }


  public StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner itemName(String itemName) {
    
    this.itemName = itemName;
    return this;
  }

   /**
   * 视频名称
   * @return itemName
  **/
  @javax.annotation.Nullable
  public String getItemName() {
    return itemName;
  }


  public void setItemName(String itemName) {
    this.itemName = itemName;
  }


  public StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 指派单ID
   * @return orderId
  **/
  @javax.annotation.Nullable
  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner orderName(String orderName) {
    
    this.orderName = orderName;
    return this;
  }

   /**
   * 指派单名称
   * @return orderName
  **/
  @javax.annotation.Nullable
  public String getOrderName() {
    return orderName;
  }


  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner starVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner = (StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner) o;
    return Objects.equals(this.auditStatus, starVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner.auditStatus) &&
        Objects.equals(this.authorId, starVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner.authorId) &&
        Objects.equals(this.authorName, starVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner.authorName) &&
        Objects.equals(this.itemName, starVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner.itemName) &&
        Objects.equals(this.orderId, starVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner.orderId) &&
        Objects.equals(this.orderName, starVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner.orderName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditStatus, authorId, authorName, itemName, orderId, orderName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner {\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderName: ").append(toIndentedString(orderName)).append("\n");
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
    openapiFields.add("audit_status");
    openapiFields.add("author_id");
    openapiFields.add("author_name");
    openapiFields.add("item_name");
    openapiFields.add("order_id");
    openapiFields.add("order_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("audit_status");
    openapiRequiredFields.add("author_id");
    openapiRequiredFields.add("author_name");
    openapiRequiredFields.add("item_name");
    openapiRequiredFields.add("order_id");
    openapiRequiredFields.add("order_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner>() {
           @Override
           public void write(JsonWriter out, StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner
  * @throws IOException if the JSON string is invalid with respect to StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner
  */
  public static StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner.class);
  }

 /**
  * Convert an instance of StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInnerTaskInfosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

