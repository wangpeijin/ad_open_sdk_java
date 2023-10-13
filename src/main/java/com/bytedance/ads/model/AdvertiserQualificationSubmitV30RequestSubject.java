/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdvertiserQualificationSubmitV30SubjectCheckType;
import com.bytedance.ads.model.AdvertiserQualificationSubmitV30SubjectCompanyType;
import com.bytedance.ads.model.AdvertiserQualificationSubmitV30SubjectQualificationType;
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
 * 主体资质，相关字段见下: 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T15:22:35.223235852+08:00[PRC]")
public class AdvertiserQualificationSubmitV30RequestSubject {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address = null;

  public static final String SERIALIZED_NAME_ATTACHMENT_ID = "attachment_id";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_ID)
  private String attachmentId = null;

  public static final String SERIALIZED_NAME_CHECK_TYPE = "check_type";
  @SerializedName(SERIALIZED_NAME_CHECK_TYPE)
  private AdvertiserQualificationSubmitV30SubjectCheckType checkType = null;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName = null;

  public static final String SERIALIZED_NAME_COMPANY_TYPE = "company_type";
  @SerializedName(SERIALIZED_NAME_COMPANY_TYPE)
  private AdvertiserQualificationSubmitV30SubjectCompanyType companyType = null;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effective_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  private String effectiveDate = null;

  public static final String SERIALIZED_NAME_HAS_EFFECTIVE_DATE = "has_effective_date";
  @SerializedName(SERIALIZED_NAME_HAS_EFFECTIVE_DATE)
  private Boolean hasEffectiveDate = null;

  public static final String SERIALIZED_NAME_PROPRIETOR_NAME = "proprietor_name";
  @SerializedName(SERIALIZED_NAME_PROPRIETOR_NAME)
  private String proprietorName = null;

  public static final String SERIALIZED_NAME_QUALIFICATION_CODE = "qualification_code";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_CODE)
  private String qualificationCode = null;

  public static final String SERIALIZED_NAME_QUALIFICATION_ID = "qualification_id";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_ID)
  private Long qualificationId = null;

  public static final String SERIALIZED_NAME_QUALIFICATION_TYPE = "qualification_type";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_TYPE)
  private AdvertiserQualificationSubmitV30SubjectQualificationType qualificationType = null;

  public static final String SERIALIZED_NAME_REGISTERED_CITY_NAME = "registered_city_name";
  @SerializedName(SERIALIZED_NAME_REGISTERED_CITY_NAME)
  private String registeredCityName = null;

  public static final String SERIALIZED_NAME_REGISTERED_NATION_NAME = "registered_nation_name";
  @SerializedName(SERIALIZED_NAME_REGISTERED_NATION_NAME)
  private String registeredNationName = null;

  public static final String SERIALIZED_NAME_REGISTERED_PROVINCE_NAME = "registered_province_name";
  @SerializedName(SERIALIZED_NAME_REGISTERED_PROVINCE_NAME)
  private String registeredProvinceName = null;

  public AdvertiserQualificationSubmitV30RequestSubject() {
  }

  public AdvertiserQualificationSubmitV30RequestSubject address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 详细地址 
   * @return address
  **/
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AdvertiserQualificationSubmitV30RequestSubject attachmentId(String attachmentId) {
    
    this.attachmentId = attachmentId;
    return this;
  }

   /**
   * 资质图片附件id 
   * @return attachmentId
  **/
  @javax.annotation.Nullable
  public String getAttachmentId() {
    return attachmentId;
  }


  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }


  public AdvertiserQualificationSubmitV30RequestSubject checkType(AdvertiserQualificationSubmitV30SubjectCheckType checkType) {
    
    this.checkType = checkType;
    return this;
  }

   /**
   * Get checkType
   * @return checkType
  **/
  @javax.annotation.Nonnull
  public AdvertiserQualificationSubmitV30SubjectCheckType getCheckType() {
    return checkType;
  }


  public void setCheckType(AdvertiserQualificationSubmitV30SubjectCheckType checkType) {
    this.checkType = checkType;
  }


  public AdvertiserQualificationSubmitV30RequestSubject companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * 公司名称 
   * @return companyName
  **/
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public AdvertiserQualificationSubmitV30RequestSubject companyType(AdvertiserQualificationSubmitV30SubjectCompanyType companyType) {
    
    this.companyType = companyType;
    return this;
  }

   /**
   * Get companyType
   * @return companyType
  **/
  @javax.annotation.Nonnull
  public AdvertiserQualificationSubmitV30SubjectCompanyType getCompanyType() {
    return companyType;
  }


  public void setCompanyType(AdvertiserQualificationSubmitV30SubjectCompanyType companyType) {
    this.companyType = companyType;
  }


  public AdvertiserQualificationSubmitV30RequestSubject effectiveDate(String effectiveDate) {
    
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * 过期时间，格式yyyy-mm-dd 
   * @return effectiveDate
  **/
  @javax.annotation.Nullable
  public String getEffectiveDate() {
    return effectiveDate;
  }


  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }


  public AdvertiserQualificationSubmitV30RequestSubject hasEffectiveDate(Boolean hasEffectiveDate) {
    
    this.hasEffectiveDate = hasEffectiveDate;
    return this;
  }

   /**
   * 是否有有效日期 
   * @return hasEffectiveDate
  **/
  @javax.annotation.Nonnull
  public Boolean getHasEffectiveDate() {
    return hasEffectiveDate;
  }


  public void setHasEffectiveDate(Boolean hasEffectiveDate) {
    this.hasEffectiveDate = hasEffectiveDate;
  }


  public AdvertiserQualificationSubmitV30RequestSubject proprietorName(String proprietorName) {
    
    this.proprietorName = proprietorName;
    return this;
  }

   /**
   * 法人 
   * @return proprietorName
  **/
  @javax.annotation.Nullable
  public String getProprietorName() {
    return proprietorName;
  }


  public void setProprietorName(String proprietorName) {
    this.proprietorName = proprietorName;
  }


  public AdvertiserQualificationSubmitV30RequestSubject qualificationCode(String qualificationCode) {
    
    this.qualificationCode = qualificationCode;
    return this;
  }

   /**
   * 资质编号 
   * @return qualificationCode
  **/
  @javax.annotation.Nullable
  public String getQualificationCode() {
    return qualificationCode;
  }


  public void setQualificationCode(String qualificationCode) {
    this.qualificationCode = qualificationCode;
  }


  public AdvertiserQualificationSubmitV30RequestSubject qualificationId(Long qualificationId) {
    
    this.qualificationId = qualificationId;
    return this;
  }

   /**
   * 资质id 
   * @return qualificationId
  **/
  @javax.annotation.Nullable
  public Long getQualificationId() {
    return qualificationId;
  }


  public void setQualificationId(Long qualificationId) {
    this.qualificationId = qualificationId;
  }


  public AdvertiserQualificationSubmitV30RequestSubject qualificationType(AdvertiserQualificationSubmitV30SubjectQualificationType qualificationType) {
    
    this.qualificationType = qualificationType;
    return this;
  }

   /**
   * Get qualificationType
   * @return qualificationType
  **/
  @javax.annotation.Nonnull
  public AdvertiserQualificationSubmitV30SubjectQualificationType getQualificationType() {
    return qualificationType;
  }


  public void setQualificationType(AdvertiserQualificationSubmitV30SubjectQualificationType qualificationType) {
    this.qualificationType = qualificationType;
  }


  public AdvertiserQualificationSubmitV30RequestSubject registeredCityName(String registeredCityName) {
    
    this.registeredCityName = registeredCityName;
    return this;
  }

   /**
   * 注册城市
   * @return registeredCityName
  **/
  @javax.annotation.Nullable
  public String getRegisteredCityName() {
    return registeredCityName;
  }


  public void setRegisteredCityName(String registeredCityName) {
    this.registeredCityName = registeredCityName;
  }


  public AdvertiserQualificationSubmitV30RequestSubject registeredNationName(String registeredNationName) {
    
    this.registeredNationName = registeredNationName;
    return this;
  }

   /**
   * 注册国家 
   * @return registeredNationName
  **/
  @javax.annotation.Nullable
  public String getRegisteredNationName() {
    return registeredNationName;
  }


  public void setRegisteredNationName(String registeredNationName) {
    this.registeredNationName = registeredNationName;
  }


  public AdvertiserQualificationSubmitV30RequestSubject registeredProvinceName(String registeredProvinceName) {
    
    this.registeredProvinceName = registeredProvinceName;
    return this;
  }

   /**
   * 注册省份
   * @return registeredProvinceName
  **/
  @javax.annotation.Nullable
  public String getRegisteredProvinceName() {
    return registeredProvinceName;
  }


  public void setRegisteredProvinceName(String registeredProvinceName) {
    this.registeredProvinceName = registeredProvinceName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserQualificationSubmitV30RequestSubject advertiserQualificationSubmitV30RequestSubject = (AdvertiserQualificationSubmitV30RequestSubject) o;
    return Objects.equals(this.address, advertiserQualificationSubmitV30RequestSubject.address) &&
        Objects.equals(this.attachmentId, advertiserQualificationSubmitV30RequestSubject.attachmentId) &&
        Objects.equals(this.checkType, advertiserQualificationSubmitV30RequestSubject.checkType) &&
        Objects.equals(this.companyName, advertiserQualificationSubmitV30RequestSubject.companyName) &&
        Objects.equals(this.companyType, advertiserQualificationSubmitV30RequestSubject.companyType) &&
        Objects.equals(this.effectiveDate, advertiserQualificationSubmitV30RequestSubject.effectiveDate) &&
        Objects.equals(this.hasEffectiveDate, advertiserQualificationSubmitV30RequestSubject.hasEffectiveDate) &&
        Objects.equals(this.proprietorName, advertiserQualificationSubmitV30RequestSubject.proprietorName) &&
        Objects.equals(this.qualificationCode, advertiserQualificationSubmitV30RequestSubject.qualificationCode) &&
        Objects.equals(this.qualificationId, advertiserQualificationSubmitV30RequestSubject.qualificationId) &&
        Objects.equals(this.qualificationType, advertiserQualificationSubmitV30RequestSubject.qualificationType) &&
        Objects.equals(this.registeredCityName, advertiserQualificationSubmitV30RequestSubject.registeredCityName) &&
        Objects.equals(this.registeredNationName, advertiserQualificationSubmitV30RequestSubject.registeredNationName) &&
        Objects.equals(this.registeredProvinceName, advertiserQualificationSubmitV30RequestSubject.registeredProvinceName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, attachmentId, checkType, companyName, companyType, effectiveDate, hasEffectiveDate, proprietorName, qualificationCode, qualificationId, qualificationType, registeredCityName, registeredNationName, registeredProvinceName);
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
    sb.append("class AdvertiserQualificationSubmitV30RequestSubject {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    companyType: ").append(toIndentedString(companyType)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    hasEffectiveDate: ").append(toIndentedString(hasEffectiveDate)).append("\n");
    sb.append("    proprietorName: ").append(toIndentedString(proprietorName)).append("\n");
    sb.append("    qualificationCode: ").append(toIndentedString(qualificationCode)).append("\n");
    sb.append("    qualificationId: ").append(toIndentedString(qualificationId)).append("\n");
    sb.append("    qualificationType: ").append(toIndentedString(qualificationType)).append("\n");
    sb.append("    registeredCityName: ").append(toIndentedString(registeredCityName)).append("\n");
    sb.append("    registeredNationName: ").append(toIndentedString(registeredNationName)).append("\n");
    sb.append("    registeredProvinceName: ").append(toIndentedString(registeredProvinceName)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("attachment_id");
    openapiFields.add("check_type");
    openapiFields.add("company_name");
    openapiFields.add("company_type");
    openapiFields.add("effective_date");
    openapiFields.add("has_effective_date");
    openapiFields.add("proprietor_name");
    openapiFields.add("qualification_code");
    openapiFields.add("qualification_id");
    openapiFields.add("qualification_type");
    openapiFields.add("registered_city_name");
    openapiFields.add("registered_nation_name");
    openapiFields.add("registered_province_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("attachment_id");
    openapiRequiredFields.add("check_type");
    openapiRequiredFields.add("company_name");
    openapiRequiredFields.add("company_type");
    openapiRequiredFields.add("has_effective_date");
    openapiRequiredFields.add("proprietor_name");
    openapiRequiredFields.add("qualification_code");
    openapiRequiredFields.add("qualification_type");
    openapiRequiredFields.add("registered_nation_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserQualificationSubmitV30RequestSubject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserQualificationSubmitV30RequestSubject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserQualificationSubmitV30RequestSubject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserQualificationSubmitV30RequestSubject.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserQualificationSubmitV30RequestSubject>() {
           @Override
           public void write(JsonWriter out, AdvertiserQualificationSubmitV30RequestSubject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserQualificationSubmitV30RequestSubject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserQualificationSubmitV30RequestSubject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserQualificationSubmitV30RequestSubject
  * @throws IOException if the JSON string is invalid with respect to AdvertiserQualificationSubmitV30RequestSubject
  */
  public static AdvertiserQualificationSubmitV30RequestSubject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserQualificationSubmitV30RequestSubject.class);
  }

 /**
  * Convert an instance of AdvertiserQualificationSubmitV30RequestSubject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

