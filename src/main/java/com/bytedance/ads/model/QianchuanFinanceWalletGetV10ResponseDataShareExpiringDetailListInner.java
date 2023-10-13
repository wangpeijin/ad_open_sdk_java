/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanFinanceWalletGetV10DataShareExpiringDetailListCategory;
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
 * QianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T17:19:23.525018957+08:00[PRC]")
public class QianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount = null;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private QianchuanFinanceWalletGetV10DataShareExpiringDetailListCategory category = null;

  public static final String SERIALIZED_NAME_EXPIRE_TIME = "expire_time";
  @SerializedName(SERIALIZED_NAME_EXPIRE_TIME)
  private Long expireTime = null;

  public QianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner() {
  }

  public QianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 金额
   * @return amount
  **/
  @javax.annotation.Nullable
  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public QianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner category(QianchuanFinanceWalletGetV10DataShareExpiringDetailListCategory category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  public QianchuanFinanceWalletGetV10DataShareExpiringDetailListCategory getCategory() {
    return category;
  }


  public void setCategory(QianchuanFinanceWalletGetV10DataShareExpiringDetailListCategory category) {
    this.category = category;
  }


  public QianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner expireTime(Long expireTime) {
    
    this.expireTime = expireTime;
    return this;
  }

   /**
   * 到期时间
   * @return expireTime
  **/
  @javax.annotation.Nullable
  public Long getExpireTime() {
    return expireTime;
  }


  public void setExpireTime(Long expireTime) {
    this.expireTime = expireTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner qianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner = (QianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner) o;
    return Objects.equals(this.amount, qianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner.amount) &&
        Objects.equals(this.category, qianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner.category) &&
        Objects.equals(this.expireTime, qianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner.expireTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, category, expireTime);
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
    sb.append("class QianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("category");
    openapiFields.add("expire_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner
  */
  public static QianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner.class);
  }

 /**
  * Convert an instance of QianchuanFinanceWalletGetV10ResponseDataShareExpiringDetailListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

