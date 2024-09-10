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
 * 权限信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission {
  public static final String SERIALIZED_NAME_CAN_DELETE = "can_delete";
  @SerializedName(SERIALIZED_NAME_CAN_DELETE)
  private Boolean canDelete = null;

  public static final String SERIALIZED_NAME_CAN_EDIT = "can_edit";
  @SerializedName(SERIALIZED_NAME_CAN_EDIT)
  private Boolean canEdit = null;

  public static final String SERIALIZED_NAME_CANT_DELETE_REASON = "cant_delete_reason";
  @SerializedName(SERIALIZED_NAME_CANT_DELETE_REASON)
  private String cantDeleteReason = null;

  public static final String SERIALIZED_NAME_CANT_EDIT_REASON = "cant_edit_reason";
  @SerializedName(SERIALIZED_NAME_CANT_EDIT_REASON)
  private String cantEditReason = null;

  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission() {
  }

  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission canDelete(Boolean canDelete) {
    
    this.canDelete = canDelete;
    return this;
  }

   /**
   * 是否支持编辑
   * @return canDelete
  **/
  @javax.annotation.Nullable
  public Boolean getCanDelete() {
    return canDelete;
  }


  public void setCanDelete(Boolean canDelete) {
    this.canDelete = canDelete;
  }


  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission canEdit(Boolean canEdit) {
    
    this.canEdit = canEdit;
    return this;
  }

   /**
   * 是否支持编辑
   * @return canEdit
  **/
  @javax.annotation.Nullable
  public Boolean getCanEdit() {
    return canEdit;
  }


  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }


  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission cantDeleteReason(String cantDeleteReason) {
    
    this.cantDeleteReason = cantDeleteReason;
    return this;
  }

   /**
   * 不支持删除的原因
   * @return cantDeleteReason
  **/
  @javax.annotation.Nullable
  public String getCantDeleteReason() {
    return cantDeleteReason;
  }


  public void setCantDeleteReason(String cantDeleteReason) {
    this.cantDeleteReason = cantDeleteReason;
  }


  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission cantEditReason(String cantEditReason) {
    
    this.cantEditReason = cantEditReason;
    return this;
  }

   /**
   * 不支持编辑的原因
   * @return cantEditReason
  **/
  @javax.annotation.Nullable
  public String getCantEditReason() {
    return cantEditReason;
  }


  public void setCantEditReason(String cantEditReason) {
    this.cantEditReason = cantEditReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission advertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission = (AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission) o;
    return Objects.equals(this.canDelete, advertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission.canDelete) &&
        Objects.equals(this.canEdit, advertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission.canEdit) &&
        Objects.equals(this.cantDeleteReason, advertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission.cantDeleteReason) &&
        Objects.equals(this.cantEditReason, advertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission.cantEditReason);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(canDelete, canEdit, cantDeleteReason, cantEditReason);
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
    sb.append("class AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission {\n");
    sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
    sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
    sb.append("    cantDeleteReason: ").append(toIndentedString(cantDeleteReason)).append("\n");
    sb.append("    cantEditReason: ").append(toIndentedString(cantEditReason)).append("\n");
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
    openapiFields.add("can_delete");
    openapiFields.add("can_edit");
    openapiFields.add("cant_delete_reason");
    openapiFields.add("cant_edit_reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("can_delete");
    openapiRequiredFields.add("can_edit");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission>() {
           @Override
           public void write(JsonWriter out, AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission
  * @throws IOException if the JSON string is invalid with respect to AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission
  */
  public static AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission.class);
  }

 /**
  * Convert an instance of AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

