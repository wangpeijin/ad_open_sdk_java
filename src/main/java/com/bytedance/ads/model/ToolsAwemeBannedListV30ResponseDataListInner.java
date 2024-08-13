/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAwemeBannedListV30DataListBannedType;
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
 * ToolsAwemeBannedListV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class ToolsAwemeBannedListV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_AWEME_NAME = "aweme_name";
  @SerializedName(SERIALIZED_NAME_AWEME_NAME)
  private String awemeName = null;

  public static final String SERIALIZED_NAME_AWEME_USER_ID = "aweme_user_id";
  @SerializedName(SERIALIZED_NAME_AWEME_USER_ID)
  private String awemeUserId = null;

  public static final String SERIALIZED_NAME_BANNED_TYPE = "banned_type";
  @SerializedName(SERIALIZED_NAME_BANNED_TYPE)
  private ToolsAwemeBannedListV30DataListBannedType bannedType = null;

  public static final String SERIALIZED_NAME_NICKNAME_KEYWORD = "nickname_keyword";
  @SerializedName(SERIALIZED_NAME_NICKNAME_KEYWORD)
  private String nicknameKeyword = null;

  public ToolsAwemeBannedListV30ResponseDataListInner() {
  }

  public ToolsAwemeBannedListV30ResponseDataListInner awemeName(String awemeName) {
    
    this.awemeName = awemeName;
    return this;
  }

   /**
   * 抖音昵称
   * @return awemeName
  **/
  @javax.annotation.Nullable
  public String getAwemeName() {
    return awemeName;
  }


  public void setAwemeName(String awemeName) {
    this.awemeName = awemeName;
  }


  public ToolsAwemeBannedListV30ResponseDataListInner awemeUserId(String awemeUserId) {
    
    this.awemeUserId = awemeUserId;
    return this;
  }

   /**
   * 抖音用户id
   * @return awemeUserId
  **/
  @javax.annotation.Nullable
  public String getAwemeUserId() {
    return awemeUserId;
  }


  public void setAwemeUserId(String awemeUserId) {
    this.awemeUserId = awemeUserId;
  }


  public ToolsAwemeBannedListV30ResponseDataListInner bannedType(ToolsAwemeBannedListV30DataListBannedType bannedType) {
    
    this.bannedType = bannedType;
    return this;
  }

   /**
   * Get bannedType
   * @return bannedType
  **/
  @javax.annotation.Nullable
  public ToolsAwemeBannedListV30DataListBannedType getBannedType() {
    return bannedType;
  }


  public void setBannedType(ToolsAwemeBannedListV30DataListBannedType bannedType) {
    this.bannedType = bannedType;
  }


  public ToolsAwemeBannedListV30ResponseDataListInner nicknameKeyword(String nicknameKeyword) {
    
    this.nicknameKeyword = nicknameKeyword;
    return this;
  }

   /**
   * 昵称关键词
   * @return nicknameKeyword
  **/
  @javax.annotation.Nullable
  public String getNicknameKeyword() {
    return nicknameKeyword;
  }


  public void setNicknameKeyword(String nicknameKeyword) {
    this.nicknameKeyword = nicknameKeyword;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAwemeBannedListV30ResponseDataListInner toolsAwemeBannedListV30ResponseDataListInner = (ToolsAwemeBannedListV30ResponseDataListInner) o;
    return Objects.equals(this.awemeName, toolsAwemeBannedListV30ResponseDataListInner.awemeName) &&
        Objects.equals(this.awemeUserId, toolsAwemeBannedListV30ResponseDataListInner.awemeUserId) &&
        Objects.equals(this.bannedType, toolsAwemeBannedListV30ResponseDataListInner.bannedType) &&
        Objects.equals(this.nicknameKeyword, toolsAwemeBannedListV30ResponseDataListInner.nicknameKeyword);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeName, awemeUserId, bannedType, nicknameKeyword);
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
    sb.append("class ToolsAwemeBannedListV30ResponseDataListInner {\n");
    sb.append("    awemeName: ").append(toIndentedString(awemeName)).append("\n");
    sb.append("    awemeUserId: ").append(toIndentedString(awemeUserId)).append("\n");
    sb.append("    bannedType: ").append(toIndentedString(bannedType)).append("\n");
    sb.append("    nicknameKeyword: ").append(toIndentedString(nicknameKeyword)).append("\n");
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
    openapiFields.add("aweme_name");
    openapiFields.add("aweme_user_id");
    openapiFields.add("banned_type");
    openapiFields.add("nickname_keyword");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAwemeBannedListV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAwemeBannedListV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAwemeBannedListV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAwemeBannedListV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAwemeBannedListV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsAwemeBannedListV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAwemeBannedListV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAwemeBannedListV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAwemeBannedListV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAwemeBannedListV30ResponseDataListInner
  */
  public static ToolsAwemeBannedListV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAwemeBannedListV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsAwemeBannedListV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

