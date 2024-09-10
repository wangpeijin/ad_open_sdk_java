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
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner;
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
 * NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner {
  public static final String SERIALIZED_NAME_ANDROID_PACKAGE_CODE = "android_package_code";
  @SerializedName(SERIALIZED_NAME_ANDROID_PACKAGE_CODE)
  private String androidPackageCode = null;

  public static final String SERIALIZED_NAME_GAME_GIFT_REGULATION = "game_gift_regulation";
  @SerializedName(SERIALIZED_NAME_GAME_GIFT_REGULATION)
  private String gameGiftRegulation = null;

  public static final String SERIALIZED_NAME_GAME_PACKAGE_NAME = "game_package_name";
  @SerializedName(SERIALIZED_NAME_GAME_PACKAGE_NAME)
  private String gamePackageName = null;

  public static final String SERIALIZED_NAME_GIFT = "gift";
  @SerializedName(SERIALIZED_NAME_GIFT)
  private List<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner> gift = null;

  public static final String SERIALIZED_NAME_GIFT_END_DATE = "gift_end_date";
  @SerializedName(SERIALIZED_NAME_GIFT_END_DATE)
  private String giftEndDate = null;

  public static final String SERIALIZED_NAME_GIFT_START_DATE = "gift_start_date";
  @SerializedName(SERIALIZED_NAME_GIFT_START_DATE)
  private String giftStartDate = null;

  public static final String SERIALIZED_NAME_IOS_PACKAGE_CODE = "ios_package_code";
  @SerializedName(SERIALIZED_NAME_IOS_PACKAGE_CODE)
  private String iosPackageCode = null;

  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner() {
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner androidPackageCode(String androidPackageCode) {
    
    this.androidPackageCode = androidPackageCode;
    return this;
  }

   /**
   * 
   * @return androidPackageCode
  **/
  @javax.annotation.Nullable
  public String getAndroidPackageCode() {
    return androidPackageCode;
  }


  public void setAndroidPackageCode(String androidPackageCode) {
    this.androidPackageCode = androidPackageCode;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner gameGiftRegulation(String gameGiftRegulation) {
    
    this.gameGiftRegulation = gameGiftRegulation;
    return this;
  }

   /**
   * 
   * @return gameGiftRegulation
  **/
  @javax.annotation.Nullable
  public String getGameGiftRegulation() {
    return gameGiftRegulation;
  }


  public void setGameGiftRegulation(String gameGiftRegulation) {
    this.gameGiftRegulation = gameGiftRegulation;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner gamePackageName(String gamePackageName) {
    
    this.gamePackageName = gamePackageName;
    return this;
  }

   /**
   * 
   * @return gamePackageName
  **/
  @javax.annotation.Nullable
  public String getGamePackageName() {
    return gamePackageName;
  }


  public void setGamePackageName(String gamePackageName) {
    this.gamePackageName = gamePackageName;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner gift(List<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner> gift) {
    
    this.gift = gift;
    return this;
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner addGiftItem(NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner giftItem) {
    if (this.gift == null) {
      this.gift = new ArrayList<>();
    }
    this.gift.add(giftItem);
    return this;
  }

   /**
   * 
   * @return gift
  **/
  @javax.annotation.Nullable
  public List<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner> getGift() {
    return gift;
  }


  public void setGift(List<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner> gift) {
    this.gift = gift;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner giftEndDate(String giftEndDate) {
    
    this.giftEndDate = giftEndDate;
    return this;
  }

   /**
   * 
   * @return giftEndDate
  **/
  @javax.annotation.Nullable
  public String getGiftEndDate() {
    return giftEndDate;
  }


  public void setGiftEndDate(String giftEndDate) {
    this.giftEndDate = giftEndDate;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner giftStartDate(String giftStartDate) {
    
    this.giftStartDate = giftStartDate;
    return this;
  }

   /**
   * 
   * @return giftStartDate
  **/
  @javax.annotation.Nullable
  public String getGiftStartDate() {
    return giftStartDate;
  }


  public void setGiftStartDate(String giftStartDate) {
    this.giftStartDate = giftStartDate;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner iosPackageCode(String iosPackageCode) {
    
    this.iosPackageCode = iosPackageCode;
    return this;
  }

   /**
   * 
   * @return iosPackageCode
  **/
  @javax.annotation.Nullable
  public String getIosPackageCode() {
    return iosPackageCode;
  }


  public void setIosPackageCode(String iosPackageCode) {
    this.iosPackageCode = iosPackageCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner nativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner = (NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner) o;
    return Objects.equals(this.androidPackageCode, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner.androidPackageCode) &&
        Objects.equals(this.gameGiftRegulation, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner.gameGiftRegulation) &&
        Objects.equals(this.gamePackageName, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner.gamePackageName) &&
        Objects.equals(this.gift, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner.gift) &&
        Objects.equals(this.giftEndDate, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner.giftEndDate) &&
        Objects.equals(this.giftStartDate, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner.giftStartDate) &&
        Objects.equals(this.iosPackageCode, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner.iosPackageCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidPackageCode, gameGiftRegulation, gamePackageName, gift, giftEndDate, giftStartDate, iosPackageCode);
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
    sb.append("class NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner {\n");
    sb.append("    androidPackageCode: ").append(toIndentedString(androidPackageCode)).append("\n");
    sb.append("    gameGiftRegulation: ").append(toIndentedString(gameGiftRegulation)).append("\n");
    sb.append("    gamePackageName: ").append(toIndentedString(gamePackageName)).append("\n");
    sb.append("    gift: ").append(toIndentedString(gift)).append("\n");
    sb.append("    giftEndDate: ").append(toIndentedString(giftEndDate)).append("\n");
    sb.append("    giftStartDate: ").append(toIndentedString(giftStartDate)).append("\n");
    sb.append("    iosPackageCode: ").append(toIndentedString(iosPackageCode)).append("\n");
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
    openapiFields.add("android_package_code");
    openapiFields.add("game_gift_regulation");
    openapiFields.add("game_package_name");
    openapiFields.add("gift");
    openapiFields.add("gift_end_date");
    openapiFields.add("gift_start_date");
    openapiFields.add("ios_package_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("game_package_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner>() {
           @Override
           public void write(JsonWriter out, NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner
  */
  public static NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner.class);
  }

 /**
  * Convert an instance of NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

