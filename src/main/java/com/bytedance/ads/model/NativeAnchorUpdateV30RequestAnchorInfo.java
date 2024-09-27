/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.NativeAnchorUpdateV30AnchorInfoAnchorType;
import com.bytedance.ads.model.NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor;
import com.bytedance.ads.model.NativeAnchorUpdateV30RequestAnchorInfoGameAnchor;
import com.bytedance.ads.model.NativeAnchorUpdateV30RequestAnchorInfoNetServiceAnchor;
import com.bytedance.ads.model.NativeAnchorUpdateV30RequestAnchorInfoPrivateChat;
import com.bytedance.ads.model.NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class NativeAnchorUpdateV30RequestAnchorInfo {
  public static final String SERIALIZED_NAME_ANCHOR_ID = "anchor_id";
  @SerializedName(SERIALIZED_NAME_ANCHOR_ID)
  private String anchorId = null;

  public static final String SERIALIZED_NAME_ANCHOR_TYPE = "anchor_type";
  @SerializedName(SERIALIZED_NAME_ANCHOR_TYPE)
  private NativeAnchorUpdateV30AnchorInfoAnchorType anchorType = null;

  public static final String SERIALIZED_NAME_APP_ECOMMERCE_ANCHOR = "app_ecommerce_anchor";
  @SerializedName(SERIALIZED_NAME_APP_ECOMMERCE_ANCHOR)
  private NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor appEcommerceAnchor = null;

  public static final String SERIALIZED_NAME_GAME_ANCHOR = "game_anchor";
  @SerializedName(SERIALIZED_NAME_GAME_ANCHOR)
  private NativeAnchorUpdateV30RequestAnchorInfoGameAnchor gameAnchor = null;

  public static final String SERIALIZED_NAME_NET_SERVICE_ANCHOR = "net_service_anchor";
  @SerializedName(SERIALIZED_NAME_NET_SERVICE_ANCHOR)
  private NativeAnchorUpdateV30RequestAnchorInfoNetServiceAnchor netServiceAnchor = null;

  public static final String SERIALIZED_NAME_PRIVATE_CHAT = "private_chat";
  @SerializedName(SERIALIZED_NAME_PRIVATE_CHAT)
  private NativeAnchorUpdateV30RequestAnchorInfoPrivateChat privateChat = null;

  public static final String SERIALIZED_NAME_SHOPPING_CART_ANCHOR = "shopping_cart_anchor";
  @SerializedName(SERIALIZED_NAME_SHOPPING_CART_ANCHOR)
  private NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor shoppingCartAnchor = null;

  public static final String SERIALIZED_NAME_TOOL_TITLE = "tool_title";
  @SerializedName(SERIALIZED_NAME_TOOL_TITLE)
  private String toolTitle = null;

  public NativeAnchorUpdateV30RequestAnchorInfo() {
  }

  public NativeAnchorUpdateV30RequestAnchorInfo anchorId(String anchorId) {
    
    this.anchorId = anchorId;
    return this;
  }

   /**
   * 待更新的锚点id
   * @return anchorId
  **/
  @javax.annotation.Nonnull
  public String getAnchorId() {
    return anchorId;
  }


  public void setAnchorId(String anchorId) {
    this.anchorId = anchorId;
  }


  public NativeAnchorUpdateV30RequestAnchorInfo anchorType(NativeAnchorUpdateV30AnchorInfoAnchorType anchorType) {
    
    this.anchorType = anchorType;
    return this;
  }

   /**
   * Get anchorType
   * @return anchorType
  **/
  @javax.annotation.Nonnull
  public NativeAnchorUpdateV30AnchorInfoAnchorType getAnchorType() {
    return anchorType;
  }


  public void setAnchorType(NativeAnchorUpdateV30AnchorInfoAnchorType anchorType) {
    this.anchorType = anchorType;
  }


  public NativeAnchorUpdateV30RequestAnchorInfo appEcommerceAnchor(NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor appEcommerceAnchor) {
    
    this.appEcommerceAnchor = appEcommerceAnchor;
    return this;
  }

   /**
   * Get appEcommerceAnchor
   * @return appEcommerceAnchor
  **/
  @javax.annotation.Nullable
  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor getAppEcommerceAnchor() {
    return appEcommerceAnchor;
  }


  public void setAppEcommerceAnchor(NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor appEcommerceAnchor) {
    this.appEcommerceAnchor = appEcommerceAnchor;
  }


  public NativeAnchorUpdateV30RequestAnchorInfo gameAnchor(NativeAnchorUpdateV30RequestAnchorInfoGameAnchor gameAnchor) {
    
    this.gameAnchor = gameAnchor;
    return this;
  }

   /**
   * Get gameAnchor
   * @return gameAnchor
  **/
  @javax.annotation.Nullable
  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor getGameAnchor() {
    return gameAnchor;
  }


  public void setGameAnchor(NativeAnchorUpdateV30RequestAnchorInfoGameAnchor gameAnchor) {
    this.gameAnchor = gameAnchor;
  }


  public NativeAnchorUpdateV30RequestAnchorInfo netServiceAnchor(NativeAnchorUpdateV30RequestAnchorInfoNetServiceAnchor netServiceAnchor) {
    
    this.netServiceAnchor = netServiceAnchor;
    return this;
  }

   /**
   * Get netServiceAnchor
   * @return netServiceAnchor
  **/
  @javax.annotation.Nullable
  public NativeAnchorUpdateV30RequestAnchorInfoNetServiceAnchor getNetServiceAnchor() {
    return netServiceAnchor;
  }


  public void setNetServiceAnchor(NativeAnchorUpdateV30RequestAnchorInfoNetServiceAnchor netServiceAnchor) {
    this.netServiceAnchor = netServiceAnchor;
  }


  public NativeAnchorUpdateV30RequestAnchorInfo privateChat(NativeAnchorUpdateV30RequestAnchorInfoPrivateChat privateChat) {
    
    this.privateChat = privateChat;
    return this;
  }

   /**
   * Get privateChat
   * @return privateChat
  **/
  @javax.annotation.Nullable
  public NativeAnchorUpdateV30RequestAnchorInfoPrivateChat getPrivateChat() {
    return privateChat;
  }


  public void setPrivateChat(NativeAnchorUpdateV30RequestAnchorInfoPrivateChat privateChat) {
    this.privateChat = privateChat;
  }


  public NativeAnchorUpdateV30RequestAnchorInfo shoppingCartAnchor(NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor shoppingCartAnchor) {
    
    this.shoppingCartAnchor = shoppingCartAnchor;
    return this;
  }

   /**
   * Get shoppingCartAnchor
   * @return shoppingCartAnchor
  **/
  @javax.annotation.Nullable
  public NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor getShoppingCartAnchor() {
    return shoppingCartAnchor;
  }


  public void setShoppingCartAnchor(NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor shoppingCartAnchor) {
    this.shoppingCartAnchor = shoppingCartAnchor;
  }


  public NativeAnchorUpdateV30RequestAnchorInfo toolTitle(String toolTitle) {
    
    this.toolTitle = toolTitle;
    return this;
  }

   /**
   * 锚点工具名称（内部管理展示）
   * @return toolTitle
  **/
  @javax.annotation.Nonnull
  public String getToolTitle() {
    return toolTitle;
  }


  public void setToolTitle(String toolTitle) {
    this.toolTitle = toolTitle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeAnchorUpdateV30RequestAnchorInfo nativeAnchorUpdateV30RequestAnchorInfo = (NativeAnchorUpdateV30RequestAnchorInfo) o;
    return Objects.equals(this.anchorId, nativeAnchorUpdateV30RequestAnchorInfo.anchorId) &&
        Objects.equals(this.anchorType, nativeAnchorUpdateV30RequestAnchorInfo.anchorType) &&
        Objects.equals(this.appEcommerceAnchor, nativeAnchorUpdateV30RequestAnchorInfo.appEcommerceAnchor) &&
        Objects.equals(this.gameAnchor, nativeAnchorUpdateV30RequestAnchorInfo.gameAnchor) &&
        Objects.equals(this.netServiceAnchor, nativeAnchorUpdateV30RequestAnchorInfo.netServiceAnchor) &&
        Objects.equals(this.privateChat, nativeAnchorUpdateV30RequestAnchorInfo.privateChat) &&
        Objects.equals(this.shoppingCartAnchor, nativeAnchorUpdateV30RequestAnchorInfo.shoppingCartAnchor) &&
        Objects.equals(this.toolTitle, nativeAnchorUpdateV30RequestAnchorInfo.toolTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorId, anchorType, appEcommerceAnchor, gameAnchor, netServiceAnchor, privateChat, shoppingCartAnchor, toolTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeAnchorUpdateV30RequestAnchorInfo {\n");
    sb.append("    anchorId: ").append(toIndentedString(anchorId)).append("\n");
    sb.append("    anchorType: ").append(toIndentedString(anchorType)).append("\n");
    sb.append("    appEcommerceAnchor: ").append(toIndentedString(appEcommerceAnchor)).append("\n");
    sb.append("    gameAnchor: ").append(toIndentedString(gameAnchor)).append("\n");
    sb.append("    netServiceAnchor: ").append(toIndentedString(netServiceAnchor)).append("\n");
    sb.append("    privateChat: ").append(toIndentedString(privateChat)).append("\n");
    sb.append("    shoppingCartAnchor: ").append(toIndentedString(shoppingCartAnchor)).append("\n");
    sb.append("    toolTitle: ").append(toIndentedString(toolTitle)).append("\n");
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
    openapiFields.add("anchor_id");
    openapiFields.add("anchor_type");
    openapiFields.add("app_ecommerce_anchor");
    openapiFields.add("game_anchor");
    openapiFields.add("net_service_anchor");
    openapiFields.add("private_chat");
    openapiFields.add("shopping_cart_anchor");
    openapiFields.add("tool_title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("anchor_id");
    openapiRequiredFields.add("anchor_type");
    openapiRequiredFields.add("tool_title");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorUpdateV30RequestAnchorInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorUpdateV30RequestAnchorInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorUpdateV30RequestAnchorInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorUpdateV30RequestAnchorInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorUpdateV30RequestAnchorInfo>() {
           @Override
           public void write(JsonWriter out, NativeAnchorUpdateV30RequestAnchorInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorUpdateV30RequestAnchorInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorUpdateV30RequestAnchorInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorUpdateV30RequestAnchorInfo
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorUpdateV30RequestAnchorInfo
  */
  public static NativeAnchorUpdateV30RequestAnchorInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorUpdateV30RequestAnchorInfo.class);
  }

 /**
  * Convert an instance of NativeAnchorUpdateV30RequestAnchorInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

