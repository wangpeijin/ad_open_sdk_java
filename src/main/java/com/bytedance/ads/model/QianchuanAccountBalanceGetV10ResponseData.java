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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class QianchuanAccountBalanceGetV10ResponseData {
  public static final String SERIALIZED_NAME_ACCOUNT_BIDDING_FROZEN = "account_bidding_frozen";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_BIDDING_FROZEN)
  private Long accountBiddingFrozen = null;

  public static final String SERIALIZED_NAME_ACCOUNT_BIDDING_TOTAL = "account_bidding_total";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_BIDDING_TOTAL)
  private Long accountBiddingTotal = null;

  public static final String SERIALIZED_NAME_ACCOUNT_BIDDING_VALID = "account_bidding_valid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_BIDDING_VALID)
  private Long accountBiddingValid = null;

  public static final String SERIALIZED_NAME_ACCOUNT_BRAND_FROZEN = "account_brand_frozen";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_BRAND_FROZEN)
  private Long accountBrandFrozen = null;

  public static final String SERIALIZED_NAME_ACCOUNT_BRAND_TOTAL = "account_brand_total";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_BRAND_TOTAL)
  private Long accountBrandTotal = null;

  public static final String SERIALIZED_NAME_ACCOUNT_BRAND_VALID = "account_brand_valid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_BRAND_VALID)
  private Long accountBrandValid = null;

  public static final String SERIALIZED_NAME_ACCOUNT_FROZEN = "account_frozen";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_FROZEN)
  private Long accountFrozen = null;

  public static final String SERIALIZED_NAME_ACCOUNT_GENERAL_FROZEN = "account_general_frozen";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_GENERAL_FROZEN)
  private Long accountGeneralFrozen = null;

  public static final String SERIALIZED_NAME_ACCOUNT_GENERAL_TOTAL = "account_general_total";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_GENERAL_TOTAL)
  private Long accountGeneralTotal = null;

  public static final String SERIALIZED_NAME_ACCOUNT_GENERAL_VALID = "account_general_valid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_GENERAL_VALID)
  private Long accountGeneralValid = null;

  public static final String SERIALIZED_NAME_ACCOUNT_TOTAL = "account_total";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TOTAL)
  private Long accountTotal = null;

  public static final String SERIALIZED_NAME_ACCOUNT_VALID = "account_valid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_VALID)
  private Long accountValid = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_SHARE_GRANT_TOTAL = "share_grant_total";
  @SerializedName(SERIALIZED_NAME_SHARE_GRANT_TOTAL)
  private Long shareGrantTotal = null;

  public static final String SERIALIZED_NAME_SHARE_WALLET_BIDDING_VALID = "share_wallet_bidding_valid";
  @SerializedName(SERIALIZED_NAME_SHARE_WALLET_BIDDING_VALID)
  private Long shareWalletBiddingValid = null;

  public static final String SERIALIZED_NAME_SHARE_WALLET_BRAND_VALID = "share_wallet_brand_valid";
  @SerializedName(SERIALIZED_NAME_SHARE_WALLET_BRAND_VALID)
  private Long shareWalletBrandValid = null;

  public static final String SERIALIZED_NAME_SHARE_WALLET_GENERAL_VALID = "share_wallet_general_valid";
  @SerializedName(SERIALIZED_NAME_SHARE_WALLET_GENERAL_VALID)
  private Long shareWalletGeneralValid = null;

  public static final String SERIALIZED_NAME_SHARE_WALLET_ID = "share_wallet_id";
  @SerializedName(SERIALIZED_NAME_SHARE_WALLET_ID)
  private String shareWalletId = null;

  public static final String SERIALIZED_NAME_SHARE_WALLET_NAME = "share_wallet_name";
  @SerializedName(SERIALIZED_NAME_SHARE_WALLET_NAME)
  private String shareWalletName = null;

  public static final String SERIALIZED_NAME_SHARE_WALLET_TOTAL = "share_wallet_total";
  @SerializedName(SERIALIZED_NAME_SHARE_WALLET_TOTAL)
  private Long shareWalletTotal = null;

  public QianchuanAccountBalanceGetV10ResponseData() {
  }

  public QianchuanAccountBalanceGetV10ResponseData accountBiddingFrozen(Long accountBiddingFrozen) {
    
    this.accountBiddingFrozen = accountBiddingFrozen;
    return this;
  }

   /**
   * 竞价不可用总余额
   * @return accountBiddingFrozen
  **/
  @javax.annotation.Nullable
  public Long getAccountBiddingFrozen() {
    return accountBiddingFrozen;
  }


  public void setAccountBiddingFrozen(Long accountBiddingFrozen) {
    this.accountBiddingFrozen = accountBiddingFrozen;
  }


  public QianchuanAccountBalanceGetV10ResponseData accountBiddingTotal(Long accountBiddingTotal) {
    
    this.accountBiddingTotal = accountBiddingTotal;
    return this;
  }

   /**
   * 竞价总余额
   * @return accountBiddingTotal
  **/
  @javax.annotation.Nullable
  public Long getAccountBiddingTotal() {
    return accountBiddingTotal;
  }


  public void setAccountBiddingTotal(Long accountBiddingTotal) {
    this.accountBiddingTotal = accountBiddingTotal;
  }


  public QianchuanAccountBalanceGetV10ResponseData accountBiddingValid(Long accountBiddingValid) {
    
    this.accountBiddingValid = accountBiddingValid;
    return this;
  }

   /**
   * 竞价可用总余额
   * @return accountBiddingValid
  **/
  @javax.annotation.Nullable
  public Long getAccountBiddingValid() {
    return accountBiddingValid;
  }


  public void setAccountBiddingValid(Long accountBiddingValid) {
    this.accountBiddingValid = accountBiddingValid;
  }


  public QianchuanAccountBalanceGetV10ResponseData accountBrandFrozen(Long accountBrandFrozen) {
    
    this.accountBrandFrozen = accountBrandFrozen;
    return this;
  }

   /**
   * 账户品牌冻结余额
   * @return accountBrandFrozen
  **/
  @javax.annotation.Nullable
  public Long getAccountBrandFrozen() {
    return accountBrandFrozen;
  }


  public void setAccountBrandFrozen(Long accountBrandFrozen) {
    this.accountBrandFrozen = accountBrandFrozen;
  }


  public QianchuanAccountBalanceGetV10ResponseData accountBrandTotal(Long accountBrandTotal) {
    
    this.accountBrandTotal = accountBrandTotal;
    return this;
  }

   /**
   * 账户品牌总余额
   * @return accountBrandTotal
  **/
  @javax.annotation.Nullable
  public Long getAccountBrandTotal() {
    return accountBrandTotal;
  }


  public void setAccountBrandTotal(Long accountBrandTotal) {
    this.accountBrandTotal = accountBrandTotal;
  }


  public QianchuanAccountBalanceGetV10ResponseData accountBrandValid(Long accountBrandValid) {
    
    this.accountBrandValid = accountBrandValid;
    return this;
  }

   /**
   * 账户品牌可用余额
   * @return accountBrandValid
  **/
  @javax.annotation.Nullable
  public Long getAccountBrandValid() {
    return accountBrandValid;
  }


  public void setAccountBrandValid(Long accountBrandValid) {
    this.accountBrandValid = accountBrandValid;
  }


  public QianchuanAccountBalanceGetV10ResponseData accountFrozen(Long accountFrozen) {
    
    this.accountFrozen = accountFrozen;
    return this;
  }

   /**
   * 账户不可用总余额
   * @return accountFrozen
  **/
  @javax.annotation.Nullable
  public Long getAccountFrozen() {
    return accountFrozen;
  }


  public void setAccountFrozen(Long accountFrozen) {
    this.accountFrozen = accountFrozen;
  }


  public QianchuanAccountBalanceGetV10ResponseData accountGeneralFrozen(Long accountGeneralFrozen) {
    
    this.accountGeneralFrozen = accountGeneralFrozen;
    return this;
  }

   /**
   * 通用不可用总余额
   * @return accountGeneralFrozen
  **/
  @javax.annotation.Nullable
  public Long getAccountGeneralFrozen() {
    return accountGeneralFrozen;
  }


  public void setAccountGeneralFrozen(Long accountGeneralFrozen) {
    this.accountGeneralFrozen = accountGeneralFrozen;
  }


  public QianchuanAccountBalanceGetV10ResponseData accountGeneralTotal(Long accountGeneralTotal) {
    
    this.accountGeneralTotal = accountGeneralTotal;
    return this;
  }

   /**
   * 通用总余额
   * @return accountGeneralTotal
  **/
  @javax.annotation.Nullable
  public Long getAccountGeneralTotal() {
    return accountGeneralTotal;
  }


  public void setAccountGeneralTotal(Long accountGeneralTotal) {
    this.accountGeneralTotal = accountGeneralTotal;
  }


  public QianchuanAccountBalanceGetV10ResponseData accountGeneralValid(Long accountGeneralValid) {
    
    this.accountGeneralValid = accountGeneralValid;
    return this;
  }

   /**
   * 通用可用总余额
   * @return accountGeneralValid
  **/
  @javax.annotation.Nullable
  public Long getAccountGeneralValid() {
    return accountGeneralValid;
  }


  public void setAccountGeneralValid(Long accountGeneralValid) {
    this.accountGeneralValid = accountGeneralValid;
  }


  public QianchuanAccountBalanceGetV10ResponseData accountTotal(Long accountTotal) {
    
    this.accountTotal = accountTotal;
    return this;
  }

   /**
   * 账户总余额
   * @return accountTotal
  **/
  @javax.annotation.Nullable
  public Long getAccountTotal() {
    return accountTotal;
  }


  public void setAccountTotal(Long accountTotal) {
    this.accountTotal = accountTotal;
  }


  public QianchuanAccountBalanceGetV10ResponseData accountValid(Long accountValid) {
    
    this.accountValid = accountValid;
    return this;
  }

   /**
   * 账户可用总余额
   * @return accountValid
  **/
  @javax.annotation.Nullable
  public Long getAccountValid() {
    return accountValid;
  }


  public void setAccountValid(Long accountValid) {
    this.accountValid = accountValid;
  }


  public QianchuanAccountBalanceGetV10ResponseData advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID或代理商ID
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public QianchuanAccountBalanceGetV10ResponseData shareGrantTotal(Long shareGrantTotal) {
    
    this.shareGrantTotal = shareGrantTotal;
    return this;
  }

   /**
   * 总共享赠款
   * @return shareGrantTotal
  **/
  @javax.annotation.Nullable
  public Long getShareGrantTotal() {
    return shareGrantTotal;
  }


  public void setShareGrantTotal(Long shareGrantTotal) {
    this.shareGrantTotal = shareGrantTotal;
  }


  public QianchuanAccountBalanceGetV10ResponseData shareWalletBiddingValid(Long shareWalletBiddingValid) {
    
    this.shareWalletBiddingValid = shareWalletBiddingValid;
    return this;
  }

   /**
   * 共享钱包竞价可用余额
   * @return shareWalletBiddingValid
  **/
  @javax.annotation.Nullable
  public Long getShareWalletBiddingValid() {
    return shareWalletBiddingValid;
  }


  public void setShareWalletBiddingValid(Long shareWalletBiddingValid) {
    this.shareWalletBiddingValid = shareWalletBiddingValid;
  }


  public QianchuanAccountBalanceGetV10ResponseData shareWalletBrandValid(Long shareWalletBrandValid) {
    
    this.shareWalletBrandValid = shareWalletBrandValid;
    return this;
  }

   /**
   * 共享钱包品牌可用余额
   * @return shareWalletBrandValid
  **/
  @javax.annotation.Nullable
  public Long getShareWalletBrandValid() {
    return shareWalletBrandValid;
  }


  public void setShareWalletBrandValid(Long shareWalletBrandValid) {
    this.shareWalletBrandValid = shareWalletBrandValid;
  }


  public QianchuanAccountBalanceGetV10ResponseData shareWalletGeneralValid(Long shareWalletGeneralValid) {
    
    this.shareWalletGeneralValid = shareWalletGeneralValid;
    return this;
  }

   /**
   * 共享钱包通用可用余额
   * @return shareWalletGeneralValid
  **/
  @javax.annotation.Nullable
  public Long getShareWalletGeneralValid() {
    return shareWalletGeneralValid;
  }


  public void setShareWalletGeneralValid(Long shareWalletGeneralValid) {
    this.shareWalletGeneralValid = shareWalletGeneralValid;
  }


  public QianchuanAccountBalanceGetV10ResponseData shareWalletId(String shareWalletId) {
    
    this.shareWalletId = shareWalletId;
    return this;
  }

   /**
   * 共享钱包id
   * @return shareWalletId
  **/
  @javax.annotation.Nullable
  public String getShareWalletId() {
    return shareWalletId;
  }


  public void setShareWalletId(String shareWalletId) {
    this.shareWalletId = shareWalletId;
  }


  public QianchuanAccountBalanceGetV10ResponseData shareWalletName(String shareWalletName) {
    
    this.shareWalletName = shareWalletName;
    return this;
  }

   /**
   * 共享钱包名称
   * @return shareWalletName
  **/
  @javax.annotation.Nullable
  public String getShareWalletName() {
    return shareWalletName;
  }


  public void setShareWalletName(String shareWalletName) {
    this.shareWalletName = shareWalletName;
  }


  public QianchuanAccountBalanceGetV10ResponseData shareWalletTotal(Long shareWalletTotal) {
    
    this.shareWalletTotal = shareWalletTotal;
    return this;
  }

   /**
   * 
   * @return shareWalletTotal
  **/
  @javax.annotation.Nullable
  public Long getShareWalletTotal() {
    return shareWalletTotal;
  }


  public void setShareWalletTotal(Long shareWalletTotal) {
    this.shareWalletTotal = shareWalletTotal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAccountBalanceGetV10ResponseData qianchuanAccountBalanceGetV10ResponseData = (QianchuanAccountBalanceGetV10ResponseData) o;
    return Objects.equals(this.accountBiddingFrozen, qianchuanAccountBalanceGetV10ResponseData.accountBiddingFrozen) &&
        Objects.equals(this.accountBiddingTotal, qianchuanAccountBalanceGetV10ResponseData.accountBiddingTotal) &&
        Objects.equals(this.accountBiddingValid, qianchuanAccountBalanceGetV10ResponseData.accountBiddingValid) &&
        Objects.equals(this.accountBrandFrozen, qianchuanAccountBalanceGetV10ResponseData.accountBrandFrozen) &&
        Objects.equals(this.accountBrandTotal, qianchuanAccountBalanceGetV10ResponseData.accountBrandTotal) &&
        Objects.equals(this.accountBrandValid, qianchuanAccountBalanceGetV10ResponseData.accountBrandValid) &&
        Objects.equals(this.accountFrozen, qianchuanAccountBalanceGetV10ResponseData.accountFrozen) &&
        Objects.equals(this.accountGeneralFrozen, qianchuanAccountBalanceGetV10ResponseData.accountGeneralFrozen) &&
        Objects.equals(this.accountGeneralTotal, qianchuanAccountBalanceGetV10ResponseData.accountGeneralTotal) &&
        Objects.equals(this.accountGeneralValid, qianchuanAccountBalanceGetV10ResponseData.accountGeneralValid) &&
        Objects.equals(this.accountTotal, qianchuanAccountBalanceGetV10ResponseData.accountTotal) &&
        Objects.equals(this.accountValid, qianchuanAccountBalanceGetV10ResponseData.accountValid) &&
        Objects.equals(this.advertiserId, qianchuanAccountBalanceGetV10ResponseData.advertiserId) &&
        Objects.equals(this.shareGrantTotal, qianchuanAccountBalanceGetV10ResponseData.shareGrantTotal) &&
        Objects.equals(this.shareWalletBiddingValid, qianchuanAccountBalanceGetV10ResponseData.shareWalletBiddingValid) &&
        Objects.equals(this.shareWalletBrandValid, qianchuanAccountBalanceGetV10ResponseData.shareWalletBrandValid) &&
        Objects.equals(this.shareWalletGeneralValid, qianchuanAccountBalanceGetV10ResponseData.shareWalletGeneralValid) &&
        Objects.equals(this.shareWalletId, qianchuanAccountBalanceGetV10ResponseData.shareWalletId) &&
        Objects.equals(this.shareWalletName, qianchuanAccountBalanceGetV10ResponseData.shareWalletName) &&
        Objects.equals(this.shareWalletTotal, qianchuanAccountBalanceGetV10ResponseData.shareWalletTotal);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountBiddingFrozen, accountBiddingTotal, accountBiddingValid, accountBrandFrozen, accountBrandTotal, accountBrandValid, accountFrozen, accountGeneralFrozen, accountGeneralTotal, accountGeneralValid, accountTotal, accountValid, advertiserId, shareGrantTotal, shareWalletBiddingValid, shareWalletBrandValid, shareWalletGeneralValid, shareWalletId, shareWalletName, shareWalletTotal);
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
    sb.append("class QianchuanAccountBalanceGetV10ResponseData {\n");
    sb.append("    accountBiddingFrozen: ").append(toIndentedString(accountBiddingFrozen)).append("\n");
    sb.append("    accountBiddingTotal: ").append(toIndentedString(accountBiddingTotal)).append("\n");
    sb.append("    accountBiddingValid: ").append(toIndentedString(accountBiddingValid)).append("\n");
    sb.append("    accountBrandFrozen: ").append(toIndentedString(accountBrandFrozen)).append("\n");
    sb.append("    accountBrandTotal: ").append(toIndentedString(accountBrandTotal)).append("\n");
    sb.append("    accountBrandValid: ").append(toIndentedString(accountBrandValid)).append("\n");
    sb.append("    accountFrozen: ").append(toIndentedString(accountFrozen)).append("\n");
    sb.append("    accountGeneralFrozen: ").append(toIndentedString(accountGeneralFrozen)).append("\n");
    sb.append("    accountGeneralTotal: ").append(toIndentedString(accountGeneralTotal)).append("\n");
    sb.append("    accountGeneralValid: ").append(toIndentedString(accountGeneralValid)).append("\n");
    sb.append("    accountTotal: ").append(toIndentedString(accountTotal)).append("\n");
    sb.append("    accountValid: ").append(toIndentedString(accountValid)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    shareGrantTotal: ").append(toIndentedString(shareGrantTotal)).append("\n");
    sb.append("    shareWalletBiddingValid: ").append(toIndentedString(shareWalletBiddingValid)).append("\n");
    sb.append("    shareWalletBrandValid: ").append(toIndentedString(shareWalletBrandValid)).append("\n");
    sb.append("    shareWalletGeneralValid: ").append(toIndentedString(shareWalletGeneralValid)).append("\n");
    sb.append("    shareWalletId: ").append(toIndentedString(shareWalletId)).append("\n");
    sb.append("    shareWalletName: ").append(toIndentedString(shareWalletName)).append("\n");
    sb.append("    shareWalletTotal: ").append(toIndentedString(shareWalletTotal)).append("\n");
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
    openapiFields.add("account_bidding_frozen");
    openapiFields.add("account_bidding_total");
    openapiFields.add("account_bidding_valid");
    openapiFields.add("account_brand_frozen");
    openapiFields.add("account_brand_total");
    openapiFields.add("account_brand_valid");
    openapiFields.add("account_frozen");
    openapiFields.add("account_general_frozen");
    openapiFields.add("account_general_total");
    openapiFields.add("account_general_valid");
    openapiFields.add("account_total");
    openapiFields.add("account_valid");
    openapiFields.add("advertiser_id");
    openapiFields.add("share_grant_total");
    openapiFields.add("share_wallet_bidding_valid");
    openapiFields.add("share_wallet_brand_valid");
    openapiFields.add("share_wallet_general_valid");
    openapiFields.add("share_wallet_id");
    openapiFields.add("share_wallet_name");
    openapiFields.add("share_wallet_total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAccountBalanceGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAccountBalanceGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAccountBalanceGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAccountBalanceGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAccountBalanceGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanAccountBalanceGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAccountBalanceGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAccountBalanceGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAccountBalanceGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanAccountBalanceGetV10ResponseData
  */
  public static QianchuanAccountBalanceGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAccountBalanceGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanAccountBalanceGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

