/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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
 * QianchuanShopAdvertiserListV10ResponseDataAdvIdListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T12:38:33.841352661+08:00[PRC]")
public class QianchuanShopAdvertiserListV10ResponseDataAdvIdListInner {
  public static final String SERIALIZED_NAME_ADV_ID = "adv_id";
  @SerializedName(SERIALIZED_NAME_ADV_ID)
  private Long advId = null;

  public static final String SERIALIZED_NAME_EXTRA_PERMISSION = "extra_permission";
  @SerializedName(SERIALIZED_NAME_EXTRA_PERMISSION)
  private List<String> extraPermission = null;

  public QianchuanShopAdvertiserListV10ResponseDataAdvIdListInner() {
  }

  public QianchuanShopAdvertiserListV10ResponseDataAdvIdListInner advId(Long advId) {
    
    this.advId = advId;
    return this;
  }

   /**
   * 
   * @return advId
  **/
  @javax.annotation.Nullable
  public Long getAdvId() {
    return advId;
  }


  public void setAdvId(Long advId) {
    this.advId = advId;
  }


  public QianchuanShopAdvertiserListV10ResponseDataAdvIdListInner extraPermission(List<String> extraPermission) {
    
    this.extraPermission = extraPermission;
    return this;
  }

  public QianchuanShopAdvertiserListV10ResponseDataAdvIdListInner addExtraPermissionItem(String extraPermissionItem) {
    if (this.extraPermission == null) {
      this.extraPermission = new ArrayList<>();
    }
    this.extraPermission.add(extraPermissionItem);
    return this;
  }

   /**
   * 
   * @return extraPermission
  **/
  @javax.annotation.Nullable
  public List<String> getExtraPermission() {
    return extraPermission;
  }


  public void setExtraPermission(List<String> extraPermission) {
    this.extraPermission = extraPermission;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanShopAdvertiserListV10ResponseDataAdvIdListInner qianchuanShopAdvertiserListV10ResponseDataAdvIdListInner = (QianchuanShopAdvertiserListV10ResponseDataAdvIdListInner) o;
    return Objects.equals(this.advId, qianchuanShopAdvertiserListV10ResponseDataAdvIdListInner.advId) &&
        Objects.equals(this.extraPermission, qianchuanShopAdvertiserListV10ResponseDataAdvIdListInner.extraPermission);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advId, extraPermission);
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
    sb.append("class QianchuanShopAdvertiserListV10ResponseDataAdvIdListInner {\n");
    sb.append("    advId: ").append(toIndentedString(advId)).append("\n");
    sb.append("    extraPermission: ").append(toIndentedString(extraPermission)).append("\n");
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
    openapiFields.add("adv_id");
    openapiFields.add("extra_permission");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanShopAdvertiserListV10ResponseDataAdvIdListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanShopAdvertiserListV10ResponseDataAdvIdListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanShopAdvertiserListV10ResponseDataAdvIdListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanShopAdvertiserListV10ResponseDataAdvIdListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanShopAdvertiserListV10ResponseDataAdvIdListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanShopAdvertiserListV10ResponseDataAdvIdListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanShopAdvertiserListV10ResponseDataAdvIdListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanShopAdvertiserListV10ResponseDataAdvIdListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanShopAdvertiserListV10ResponseDataAdvIdListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanShopAdvertiserListV10ResponseDataAdvIdListInner
  */
  public static QianchuanShopAdvertiserListV10ResponseDataAdvIdListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanShopAdvertiserListV10ResponseDataAdvIdListInner.class);
  }

 /**
  * Convert an instance of QianchuanShopAdvertiserListV10ResponseDataAdvIdListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

