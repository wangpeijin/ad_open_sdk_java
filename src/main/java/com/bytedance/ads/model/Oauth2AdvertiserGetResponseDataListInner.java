/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.Oauth2AdvertiserGetResponseDataListInnerCompanyListInner;
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
 * Oauth2AdvertiserGetResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class Oauth2AdvertiserGetResponseDataListInner {
  public static final String SERIALIZED_NAME_ACCOUNT_ROLE = "account_role";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ROLE)
  private String accountRole = null;

  public static final String SERIALIZED_NAME_ACCOUNT_STRING_ID = "account_string_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_STRING_ID)
  private String accountStringId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_NAME = "advertiser_name";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_NAME)
  private String advertiserName = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ROLE = "advertiser_role";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ROLE)
  private Long advertiserRole = null;

  public static final String SERIALIZED_NAME_COMPANY_LIST = "company_list";
  @SerializedName(SERIALIZED_NAME_COMPANY_LIST)
  private List<Oauth2AdvertiserGetResponseDataListInnerCompanyListInner> companyList = null;

  public static final String SERIALIZED_NAME_IS_VALID = "is_valid";
  @SerializedName(SERIALIZED_NAME_IS_VALID)
  private Boolean isValid = null;

  public Oauth2AdvertiserGetResponseDataListInner() {
  }

  public Oauth2AdvertiserGetResponseDataListInner accountRole(String accountRole) {
    
    this.accountRole = accountRole;
    return this;
  }

   /**
   * 
   * @return accountRole
  **/
  @javax.annotation.Nullable
  public String getAccountRole() {
    return accountRole;
  }


  public void setAccountRole(String accountRole) {
    this.accountRole = accountRole;
  }


  public Oauth2AdvertiserGetResponseDataListInner accountStringId(String accountStringId) {
    
    this.accountStringId = accountStringId;
    return this;
  }

   /**
   * 
   * @return accountStringId
  **/
  @javax.annotation.Nullable
  public String getAccountStringId() {
    return accountStringId;
  }


  public void setAccountStringId(String accountStringId) {
    this.accountStringId = accountStringId;
  }


  public Oauth2AdvertiserGetResponseDataListInner advertiserId(Long advertiserId) {
    
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


  public Oauth2AdvertiserGetResponseDataListInner advertiserName(String advertiserName) {
    
    this.advertiserName = advertiserName;
    return this;
  }

   /**
   * 
   * @return advertiserName
  **/
  @javax.annotation.Nullable
  public String getAdvertiserName() {
    return advertiserName;
  }


  public void setAdvertiserName(String advertiserName) {
    this.advertiserName = advertiserName;
  }


  public Oauth2AdvertiserGetResponseDataListInner advertiserRole(Long advertiserRole) {
    
    this.advertiserRole = advertiserRole;
    return this;
  }

   /**
   * 
   * @return advertiserRole
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserRole() {
    return advertiserRole;
  }


  public void setAdvertiserRole(Long advertiserRole) {
    this.advertiserRole = advertiserRole;
  }


  public Oauth2AdvertiserGetResponseDataListInner companyList(List<Oauth2AdvertiserGetResponseDataListInnerCompanyListInner> companyList) {
    
    this.companyList = companyList;
    return this;
  }

  public Oauth2AdvertiserGetResponseDataListInner addCompanyListItem(Oauth2AdvertiserGetResponseDataListInnerCompanyListInner companyListItem) {
    if (this.companyList == null) {
      this.companyList = new ArrayList<>();
    }
    this.companyList.add(companyListItem);
    return this;
  }

   /**
   * 
   * @return companyList
  **/
  @javax.annotation.Nullable
  public List<Oauth2AdvertiserGetResponseDataListInnerCompanyListInner> getCompanyList() {
    return companyList;
  }


  public void setCompanyList(List<Oauth2AdvertiserGetResponseDataListInnerCompanyListInner> companyList) {
    this.companyList = companyList;
  }


  public Oauth2AdvertiserGetResponseDataListInner isValid(Boolean isValid) {
    
    this.isValid = isValid;
    return this;
  }

   /**
   * 
   * @return isValid
  **/
  @javax.annotation.Nullable
  public Boolean getIsValid() {
    return isValid;
  }


  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Oauth2AdvertiserGetResponseDataListInner oauth2AdvertiserGetResponseDataListInner = (Oauth2AdvertiserGetResponseDataListInner) o;
    return Objects.equals(this.accountRole, oauth2AdvertiserGetResponseDataListInner.accountRole) &&
        Objects.equals(this.accountStringId, oauth2AdvertiserGetResponseDataListInner.accountStringId) &&
        Objects.equals(this.advertiserId, oauth2AdvertiserGetResponseDataListInner.advertiserId) &&
        Objects.equals(this.advertiserName, oauth2AdvertiserGetResponseDataListInner.advertiserName) &&
        Objects.equals(this.advertiserRole, oauth2AdvertiserGetResponseDataListInner.advertiserRole) &&
        Objects.equals(this.companyList, oauth2AdvertiserGetResponseDataListInner.companyList) &&
        Objects.equals(this.isValid, oauth2AdvertiserGetResponseDataListInner.isValid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountRole, accountStringId, advertiserId, advertiserName, advertiserRole, companyList, isValid);
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
    sb.append("class Oauth2AdvertiserGetResponseDataListInner {\n");
    sb.append("    accountRole: ").append(toIndentedString(accountRole)).append("\n");
    sb.append("    accountStringId: ").append(toIndentedString(accountStringId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    advertiserName: ").append(toIndentedString(advertiserName)).append("\n");
    sb.append("    advertiserRole: ").append(toIndentedString(advertiserRole)).append("\n");
    sb.append("    companyList: ").append(toIndentedString(companyList)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
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
    openapiFields.add("account_role");
    openapiFields.add("account_string_id");
    openapiFields.add("advertiser_id");
    openapiFields.add("advertiser_name");
    openapiFields.add("advertiser_role");
    openapiFields.add("company_list");
    openapiFields.add("is_valid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Oauth2AdvertiserGetResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Oauth2AdvertiserGetResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Oauth2AdvertiserGetResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Oauth2AdvertiserGetResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<Oauth2AdvertiserGetResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, Oauth2AdvertiserGetResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Oauth2AdvertiserGetResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Oauth2AdvertiserGetResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Oauth2AdvertiserGetResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to Oauth2AdvertiserGetResponseDataListInner
  */
  public static Oauth2AdvertiserGetResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Oauth2AdvertiserGetResponseDataListInner.class);
  }

 /**
  * Convert an instance of Oauth2AdvertiserGetResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

