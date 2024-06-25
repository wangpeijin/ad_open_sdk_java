/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.NativeAnchorGetDetailV30DataListAnchorType;
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor;
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor;
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor;
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor;
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor;
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor;
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
 * NativeAnchorGetDetailV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class NativeAnchorGetDetailV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ANCHOR_ID = "anchor_id";
  @SerializedName(SERIALIZED_NAME_ANCHOR_ID)
  private String anchorId = null;

  public static final String SERIALIZED_NAME_ANCHOR_TYPE = "anchor_type";
  @SerializedName(SERIALIZED_NAME_ANCHOR_TYPE)
  private NativeAnchorGetDetailV30DataListAnchorType anchorType = null;

  public static final String SERIALIZED_NAME_APP_ECOMMERCE_ANCHOR = "app_ecommerce_anchor";
  @SerializedName(SERIALIZED_NAME_APP_ECOMMERCE_ANCHOR)
  private NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor appEcommerceAnchor = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_GAME_ANCHOR = "game_anchor";
  @SerializedName(SERIALIZED_NAME_GAME_ANCHOR)
  private NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor gameAnchor = null;

  public static final String SERIALIZED_NAME_INSURANCE_ENTERPRISE_ANCHOR = "insurance_enterprise_anchor";
  @SerializedName(SERIALIZED_NAME_INSURANCE_ENTERPRISE_ANCHOR)
  private NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor insuranceEnterpriseAnchor = null;

  public static final String SERIALIZED_NAME_MODIFY_TIME = "modify_time";
  @SerializedName(SERIALIZED_NAME_MODIFY_TIME)
  private String modifyTime = null;

  public static final String SERIALIZED_NAME_NET_SERVICE_ANCHOR = "net_service_anchor";
  @SerializedName(SERIALIZED_NAME_NET_SERVICE_ANCHOR)
  private NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor netServiceAnchor = null;

  public static final String SERIALIZED_NAME_PRIVATE_CHAT_ANCHOR = "private_chat_anchor";
  @SerializedName(SERIALIZED_NAME_PRIVATE_CHAT_ANCHOR)
  private NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor privateChatAnchor = null;

  public static final String SERIALIZED_NAME_SHOPPING_CART_ANCHOR = "shopping_cart_anchor";
  @SerializedName(SERIALIZED_NAME_SHOPPING_CART_ANCHOR)
  private NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor shoppingCartAnchor = null;

  public static final String SERIALIZED_NAME_TOOL_TITLE = "tool_title";
  @SerializedName(SERIALIZED_NAME_TOOL_TITLE)
  private String toolTitle = null;

  public NativeAnchorGetDetailV30ResponseDataListInner() {
  }

  public NativeAnchorGetDetailV30ResponseDataListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public NativeAnchorGetDetailV30ResponseDataListInner anchorId(String anchorId) {
    
    this.anchorId = anchorId;
    return this;
  }

   /**
   * 
   * @return anchorId
  **/
  @javax.annotation.Nullable
  public String getAnchorId() {
    return anchorId;
  }


  public void setAnchorId(String anchorId) {
    this.anchorId = anchorId;
  }


  public NativeAnchorGetDetailV30ResponseDataListInner anchorType(NativeAnchorGetDetailV30DataListAnchorType anchorType) {
    
    this.anchorType = anchorType;
    return this;
  }

   /**
   * Get anchorType
   * @return anchorType
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetDetailV30DataListAnchorType getAnchorType() {
    return anchorType;
  }


  public void setAnchorType(NativeAnchorGetDetailV30DataListAnchorType anchorType) {
    this.anchorType = anchorType;
  }


  public NativeAnchorGetDetailV30ResponseDataListInner appEcommerceAnchor(NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor appEcommerceAnchor) {
    
    this.appEcommerceAnchor = appEcommerceAnchor;
    return this;
  }

   /**
   * Get appEcommerceAnchor
   * @return appEcommerceAnchor
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor getAppEcommerceAnchor() {
    return appEcommerceAnchor;
  }


  public void setAppEcommerceAnchor(NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor appEcommerceAnchor) {
    this.appEcommerceAnchor = appEcommerceAnchor;
  }


  public NativeAnchorGetDetailV30ResponseDataListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public NativeAnchorGetDetailV30ResponseDataListInner gameAnchor(NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor gameAnchor) {
    
    this.gameAnchor = gameAnchor;
    return this;
  }

   /**
   * Get gameAnchor
   * @return gameAnchor
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor getGameAnchor() {
    return gameAnchor;
  }


  public void setGameAnchor(NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor gameAnchor) {
    this.gameAnchor = gameAnchor;
  }


  public NativeAnchorGetDetailV30ResponseDataListInner insuranceEnterpriseAnchor(NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor insuranceEnterpriseAnchor) {
    
    this.insuranceEnterpriseAnchor = insuranceEnterpriseAnchor;
    return this;
  }

   /**
   * Get insuranceEnterpriseAnchor
   * @return insuranceEnterpriseAnchor
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor getInsuranceEnterpriseAnchor() {
    return insuranceEnterpriseAnchor;
  }


  public void setInsuranceEnterpriseAnchor(NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor insuranceEnterpriseAnchor) {
    this.insuranceEnterpriseAnchor = insuranceEnterpriseAnchor;
  }


  public NativeAnchorGetDetailV30ResponseDataListInner modifyTime(String modifyTime) {
    
    this.modifyTime = modifyTime;
    return this;
  }

   /**
   * 
   * @return modifyTime
  **/
  @javax.annotation.Nullable
  public String getModifyTime() {
    return modifyTime;
  }


  public void setModifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
  }


  public NativeAnchorGetDetailV30ResponseDataListInner netServiceAnchor(NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor netServiceAnchor) {
    
    this.netServiceAnchor = netServiceAnchor;
    return this;
  }

   /**
   * Get netServiceAnchor
   * @return netServiceAnchor
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor getNetServiceAnchor() {
    return netServiceAnchor;
  }


  public void setNetServiceAnchor(NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor netServiceAnchor) {
    this.netServiceAnchor = netServiceAnchor;
  }


  public NativeAnchorGetDetailV30ResponseDataListInner privateChatAnchor(NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor privateChatAnchor) {
    
    this.privateChatAnchor = privateChatAnchor;
    return this;
  }

   /**
   * Get privateChatAnchor
   * @return privateChatAnchor
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor getPrivateChatAnchor() {
    return privateChatAnchor;
  }


  public void setPrivateChatAnchor(NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor privateChatAnchor) {
    this.privateChatAnchor = privateChatAnchor;
  }


  public NativeAnchorGetDetailV30ResponseDataListInner shoppingCartAnchor(NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor shoppingCartAnchor) {
    
    this.shoppingCartAnchor = shoppingCartAnchor;
    return this;
  }

   /**
   * Get shoppingCartAnchor
   * @return shoppingCartAnchor
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor getShoppingCartAnchor() {
    return shoppingCartAnchor;
  }


  public void setShoppingCartAnchor(NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor shoppingCartAnchor) {
    this.shoppingCartAnchor = shoppingCartAnchor;
  }


  public NativeAnchorGetDetailV30ResponseDataListInner toolTitle(String toolTitle) {
    
    this.toolTitle = toolTitle;
    return this;
  }

   /**
   * 
   * @return toolTitle
  **/
  @javax.annotation.Nullable
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
    NativeAnchorGetDetailV30ResponseDataListInner nativeAnchorGetDetailV30ResponseDataListInner = (NativeAnchorGetDetailV30ResponseDataListInner) o;
    return Objects.equals(this.advertiserId, nativeAnchorGetDetailV30ResponseDataListInner.advertiserId) &&
        Objects.equals(this.anchorId, nativeAnchorGetDetailV30ResponseDataListInner.anchorId) &&
        Objects.equals(this.anchorType, nativeAnchorGetDetailV30ResponseDataListInner.anchorType) &&
        Objects.equals(this.appEcommerceAnchor, nativeAnchorGetDetailV30ResponseDataListInner.appEcommerceAnchor) &&
        Objects.equals(this.createTime, nativeAnchorGetDetailV30ResponseDataListInner.createTime) &&
        Objects.equals(this.gameAnchor, nativeAnchorGetDetailV30ResponseDataListInner.gameAnchor) &&
        Objects.equals(this.insuranceEnterpriseAnchor, nativeAnchorGetDetailV30ResponseDataListInner.insuranceEnterpriseAnchor) &&
        Objects.equals(this.modifyTime, nativeAnchorGetDetailV30ResponseDataListInner.modifyTime) &&
        Objects.equals(this.netServiceAnchor, nativeAnchorGetDetailV30ResponseDataListInner.netServiceAnchor) &&
        Objects.equals(this.privateChatAnchor, nativeAnchorGetDetailV30ResponseDataListInner.privateChatAnchor) &&
        Objects.equals(this.shoppingCartAnchor, nativeAnchorGetDetailV30ResponseDataListInner.shoppingCartAnchor) &&
        Objects.equals(this.toolTitle, nativeAnchorGetDetailV30ResponseDataListInner.toolTitle);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, anchorId, anchorType, appEcommerceAnchor, createTime, gameAnchor, insuranceEnterpriseAnchor, modifyTime, netServiceAnchor, privateChatAnchor, shoppingCartAnchor, toolTitle);
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
    sb.append("class NativeAnchorGetDetailV30ResponseDataListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    anchorId: ").append(toIndentedString(anchorId)).append("\n");
    sb.append("    anchorType: ").append(toIndentedString(anchorType)).append("\n");
    sb.append("    appEcommerceAnchor: ").append(toIndentedString(appEcommerceAnchor)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    gameAnchor: ").append(toIndentedString(gameAnchor)).append("\n");
    sb.append("    insuranceEnterpriseAnchor: ").append(toIndentedString(insuranceEnterpriseAnchor)).append("\n");
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
    sb.append("    netServiceAnchor: ").append(toIndentedString(netServiceAnchor)).append("\n");
    sb.append("    privateChatAnchor: ").append(toIndentedString(privateChatAnchor)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("anchor_id");
    openapiFields.add("anchor_type");
    openapiFields.add("app_ecommerce_anchor");
    openapiFields.add("create_time");
    openapiFields.add("game_anchor");
    openapiFields.add("insurance_enterprise_anchor");
    openapiFields.add("modify_time");
    openapiFields.add("net_service_anchor");
    openapiFields.add("private_chat_anchor");
    openapiFields.add("shopping_cart_anchor");
    openapiFields.add("tool_title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorGetDetailV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorGetDetailV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorGetDetailV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorGetDetailV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorGetDetailV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, NativeAnchorGetDetailV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorGetDetailV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorGetDetailV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorGetDetailV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorGetDetailV30ResponseDataListInner
  */
  public static NativeAnchorGetDetailV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorGetDetailV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of NativeAnchorGetDetailV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

