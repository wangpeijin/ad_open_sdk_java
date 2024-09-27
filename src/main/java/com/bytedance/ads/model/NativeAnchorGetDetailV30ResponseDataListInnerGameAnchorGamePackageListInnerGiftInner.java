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
import com.bytedance.ads.model.NativeAnchorGetDetailV30DataListGameAnchorGamePackageListGiftGiftUnit;
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
 * NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner {
  public static final String SERIALIZED_NAME_GIFT_AMOUNT = "gift_amount";
  @SerializedName(SERIALIZED_NAME_GIFT_AMOUNT)
  private Long giftAmount = null;

  public static final String SERIALIZED_NAME_GIFT_IMAGE_URL = "gift_image_url";
  @SerializedName(SERIALIZED_NAME_GIFT_IMAGE_URL)
  private String giftImageUrl = null;

  public static final String SERIALIZED_NAME_GIFT_NAME = "gift_name";
  @SerializedName(SERIALIZED_NAME_GIFT_NAME)
  private String giftName = null;

  public static final String SERIALIZED_NAME_GIFT_UNIT = "gift_unit";
  @SerializedName(SERIALIZED_NAME_GIFT_UNIT)
  private NativeAnchorGetDetailV30DataListGameAnchorGamePackageListGiftGiftUnit giftUnit = null;

  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner() {
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner giftAmount(Long giftAmount) {
    
    this.giftAmount = giftAmount;
    return this;
  }

   /**
   * 
   * @return giftAmount
  **/
  @javax.annotation.Nullable
  public Long getGiftAmount() {
    return giftAmount;
  }


  public void setGiftAmount(Long giftAmount) {
    this.giftAmount = giftAmount;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner giftImageUrl(String giftImageUrl) {
    
    this.giftImageUrl = giftImageUrl;
    return this;
  }

   /**
   * 
   * @return giftImageUrl
  **/
  @javax.annotation.Nullable
  public String getGiftImageUrl() {
    return giftImageUrl;
  }


  public void setGiftImageUrl(String giftImageUrl) {
    this.giftImageUrl = giftImageUrl;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner giftName(String giftName) {
    
    this.giftName = giftName;
    return this;
  }

   /**
   * 
   * @return giftName
  **/
  @javax.annotation.Nullable
  public String getGiftName() {
    return giftName;
  }


  public void setGiftName(String giftName) {
    this.giftName = giftName;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner giftUnit(NativeAnchorGetDetailV30DataListGameAnchorGamePackageListGiftGiftUnit giftUnit) {
    
    this.giftUnit = giftUnit;
    return this;
  }

   /**
   * Get giftUnit
   * @return giftUnit
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetDetailV30DataListGameAnchorGamePackageListGiftGiftUnit getGiftUnit() {
    return giftUnit;
  }


  public void setGiftUnit(NativeAnchorGetDetailV30DataListGameAnchorGamePackageListGiftGiftUnit giftUnit) {
    this.giftUnit = giftUnit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner nativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner = (NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner) o;
    return Objects.equals(this.giftAmount, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner.giftAmount) &&
        Objects.equals(this.giftImageUrl, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner.giftImageUrl) &&
        Objects.equals(this.giftName, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner.giftName) &&
        Objects.equals(this.giftUnit, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner.giftUnit);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(giftAmount, giftImageUrl, giftName, giftUnit);
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
    sb.append("class NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner {\n");
    sb.append("    giftAmount: ").append(toIndentedString(giftAmount)).append("\n");
    sb.append("    giftImageUrl: ").append(toIndentedString(giftImageUrl)).append("\n");
    sb.append("    giftName: ").append(toIndentedString(giftName)).append("\n");
    sb.append("    giftUnit: ").append(toIndentedString(giftUnit)).append("\n");
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
    openapiFields.add("gift_amount");
    openapiFields.add("gift_image_url");
    openapiFields.add("gift_name");
    openapiFields.add("gift_unit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner>() {
           @Override
           public void write(JsonWriter out, NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner
  */
  public static NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner.class);
  }

 /**
  * Convert an instance of NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInnerGiftInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

