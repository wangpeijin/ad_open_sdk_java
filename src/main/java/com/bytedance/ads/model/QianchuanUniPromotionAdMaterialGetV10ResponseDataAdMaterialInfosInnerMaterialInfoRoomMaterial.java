/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial {
  public static final String SERIALIZED_NAME_AWEME_AVATAR = "aweme_avatar";
  @SerializedName(SERIALIZED_NAME_AWEME_AVATAR)
  private List<String> awemeAvatar = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private Long awemeId = null;

  public static final String SERIALIZED_NAME_AWEME_NAME = "aweme_name";
  @SerializedName(SERIALIZED_NAME_AWEME_NAME)
  private String awemeName = null;

  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial() {
  }

  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial awemeAvatar(List<String> awemeAvatar) {
    
    this.awemeAvatar = awemeAvatar;
    return this;
  }

  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial addAwemeAvatarItem(String awemeAvatarItem) {
    if (this.awemeAvatar == null) {
      this.awemeAvatar = new ArrayList<>();
    }
    this.awemeAvatar.add(awemeAvatarItem);
    return this;
  }

   /**
   * 
   * @return awemeAvatar
  **/
  @javax.annotation.Nullable
  public List<String> getAwemeAvatar() {
    return awemeAvatar;
  }


  public void setAwemeAvatar(List<String> awemeAvatar) {
    this.awemeAvatar = awemeAvatar;
  }


  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial awemeId(Long awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public Long getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(Long awemeId) {
    this.awemeId = awemeId;
  }


  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial awemeName(String awemeName) {
    
    this.awemeName = awemeName;
    return this;
  }

   /**
   * 
   * @return awemeName
  **/
  @javax.annotation.Nullable
  public String getAwemeName() {
    return awemeName;
  }


  public void setAwemeName(String awemeName) {
    this.awemeName = awemeName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial qianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial = (QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial) o;
    return Objects.equals(this.awemeAvatar, qianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial.awemeAvatar) &&
        Objects.equals(this.awemeId, qianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial.awemeId) &&
        Objects.equals(this.awemeName, qianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial.awemeName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeAvatar, awemeId, awemeName);
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
    sb.append("class QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial {\n");
    sb.append("    awemeAvatar: ").append(toIndentedString(awemeAvatar)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    awemeName: ").append(toIndentedString(awemeName)).append("\n");
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
    openapiFields.add("aweme_avatar");
    openapiFields.add("aweme_id");
    openapiFields.add("aweme_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial>() {
           @Override
           public void write(JsonWriter out, QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial
  */
  public static QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial.class);
  }

 /**
  * Convert an instance of QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

