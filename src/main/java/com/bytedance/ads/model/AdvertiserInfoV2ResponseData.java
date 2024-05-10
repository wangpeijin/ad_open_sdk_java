/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdvertiserInfoV2DataRole;
import com.bytedance.ads.model.AdvertiserInfoV2DataStatus;
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
 * AdvertiserInfoV2ResponseData
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class AdvertiserInfoV2ResponseData {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address = null;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand = null;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_FIRST_INDUSTRY_NAME = "first_industry_name";
  @SerializedName(SERIALIZED_NAME_FIRST_INDUSTRY_NAME)
  private String firstIndustryName = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_INDUSTRY = "industry";
  @SerializedName(SERIALIZED_NAME_INDUSTRY)
  private String industry = null;

  public static final String SERIALIZED_NAME_LICENSE_CITY = "license_city";
  @SerializedName(SERIALIZED_NAME_LICENSE_CITY)
  private String licenseCity = null;

  public static final String SERIALIZED_NAME_LICENSE_NO = "license_no";
  @SerializedName(SERIALIZED_NAME_LICENSE_NO)
  private String licenseNo = null;

  public static final String SERIALIZED_NAME_LICENSE_PROVINCE = "license_province";
  @SerializedName(SERIALIZED_NAME_LICENSE_PROVINCE)
  private String licenseProvince = null;

  public static final String SERIALIZED_NAME_LICENSE_URL = "license_url";
  @SerializedName(SERIALIZED_NAME_LICENSE_URL)
  private String licenseUrl = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note = null;

  public static final String SERIALIZED_NAME_PROMOTION_AREA = "promotion_area";
  @SerializedName(SERIALIZED_NAME_PROMOTION_AREA)
  private String promotionArea = null;

  public static final String SERIALIZED_NAME_PROMOTION_CENTER_CITY = "promotion_center_city";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CENTER_CITY)
  private String promotionCenterCity = null;

  public static final String SERIALIZED_NAME_PROMOTION_CENTER_PROVINCE = "promotion_center_province";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CENTER_PROVINCE)
  private String promotionCenterProvince = null;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason = null;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private AdvertiserInfoV2DataRole role = null;

  public static final String SERIALIZED_NAME_SECOND_INDUSTRY_NAME = "second_industry_name";
  @SerializedName(SERIALIZED_NAME_SECOND_INDUSTRY_NAME)
  private String secondIndustryName = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AdvertiserInfoV2DataStatus status = null;

  public AdvertiserInfoV2ResponseData() {
  }

  public AdvertiserInfoV2ResponseData address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 
   * @return address
  **/
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AdvertiserInfoV2ResponseData brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * 
   * @return brand
  **/
  @javax.annotation.Nullable
  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  public AdvertiserInfoV2ResponseData company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * 
   * @return company
  **/
  @javax.annotation.Nullable
  public String getCompany() {
    return company;
  }


  public void setCompany(String company) {
    this.company = company;
  }


  public AdvertiserInfoV2ResponseData createTime(String createTime) {
    
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


  public AdvertiserInfoV2ResponseData firstIndustryName(String firstIndustryName) {
    
    this.firstIndustryName = firstIndustryName;
    return this;
  }

   /**
   * 
   * @return firstIndustryName
  **/
  @javax.annotation.Nullable
  public String getFirstIndustryName() {
    return firstIndustryName;
  }


  public void setFirstIndustryName(String firstIndustryName) {
    this.firstIndustryName = firstIndustryName;
  }


  public AdvertiserInfoV2ResponseData id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public AdvertiserInfoV2ResponseData industry(String industry) {
    
    this.industry = industry;
    return this;
  }

   /**
   * 
   * @return industry
  **/
  @javax.annotation.Nullable
  public String getIndustry() {
    return industry;
  }


  public void setIndustry(String industry) {
    this.industry = industry;
  }


  public AdvertiserInfoV2ResponseData licenseCity(String licenseCity) {
    
    this.licenseCity = licenseCity;
    return this;
  }

   /**
   * 
   * @return licenseCity
  **/
  @javax.annotation.Nullable
  public String getLicenseCity() {
    return licenseCity;
  }


  public void setLicenseCity(String licenseCity) {
    this.licenseCity = licenseCity;
  }


  public AdvertiserInfoV2ResponseData licenseNo(String licenseNo) {
    
    this.licenseNo = licenseNo;
    return this;
  }

   /**
   * 
   * @return licenseNo
  **/
  @javax.annotation.Nullable
  public String getLicenseNo() {
    return licenseNo;
  }


  public void setLicenseNo(String licenseNo) {
    this.licenseNo = licenseNo;
  }


  public AdvertiserInfoV2ResponseData licenseProvince(String licenseProvince) {
    
    this.licenseProvince = licenseProvince;
    return this;
  }

   /**
   * 
   * @return licenseProvince
  **/
  @javax.annotation.Nullable
  public String getLicenseProvince() {
    return licenseProvince;
  }


  public void setLicenseProvince(String licenseProvince) {
    this.licenseProvince = licenseProvince;
  }


  public AdvertiserInfoV2ResponseData licenseUrl(String licenseUrl) {
    
    this.licenseUrl = licenseUrl;
    return this;
  }

   /**
   * 
   * @return licenseUrl
  **/
  @javax.annotation.Nullable
  public String getLicenseUrl() {
    return licenseUrl;
  }


  public void setLicenseUrl(String licenseUrl) {
    this.licenseUrl = licenseUrl;
  }


  public AdvertiserInfoV2ResponseData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AdvertiserInfoV2ResponseData note(String note) {
    
    this.note = note;
    return this;
  }

   /**
   * 
   * @return note
  **/
  @javax.annotation.Nullable
  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    this.note = note;
  }


  public AdvertiserInfoV2ResponseData promotionArea(String promotionArea) {
    
    this.promotionArea = promotionArea;
    return this;
  }

   /**
   * 
   * @return promotionArea
  **/
  @javax.annotation.Nullable
  public String getPromotionArea() {
    return promotionArea;
  }


  public void setPromotionArea(String promotionArea) {
    this.promotionArea = promotionArea;
  }


  public AdvertiserInfoV2ResponseData promotionCenterCity(String promotionCenterCity) {
    
    this.promotionCenterCity = promotionCenterCity;
    return this;
  }

   /**
   * 
   * @return promotionCenterCity
  **/
  @javax.annotation.Nullable
  public String getPromotionCenterCity() {
    return promotionCenterCity;
  }


  public void setPromotionCenterCity(String promotionCenterCity) {
    this.promotionCenterCity = promotionCenterCity;
  }


  public AdvertiserInfoV2ResponseData promotionCenterProvince(String promotionCenterProvince) {
    
    this.promotionCenterProvince = promotionCenterProvince;
    return this;
  }

   /**
   * 
   * @return promotionCenterProvince
  **/
  @javax.annotation.Nullable
  public String getPromotionCenterProvince() {
    return promotionCenterProvince;
  }


  public void setPromotionCenterProvince(String promotionCenterProvince) {
    this.promotionCenterProvince = promotionCenterProvince;
  }


  public AdvertiserInfoV2ResponseData reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * 
   * @return reason
  **/
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public AdvertiserInfoV2ResponseData role(AdvertiserInfoV2DataRole role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable
  public AdvertiserInfoV2DataRole getRole() {
    return role;
  }


  public void setRole(AdvertiserInfoV2DataRole role) {
    this.role = role;
  }


  public AdvertiserInfoV2ResponseData secondIndustryName(String secondIndustryName) {
    
    this.secondIndustryName = secondIndustryName;
    return this;
  }

   /**
   * 
   * @return secondIndustryName
  **/
  @javax.annotation.Nullable
  public String getSecondIndustryName() {
    return secondIndustryName;
  }


  public void setSecondIndustryName(String secondIndustryName) {
    this.secondIndustryName = secondIndustryName;
  }


  public AdvertiserInfoV2ResponseData status(AdvertiserInfoV2DataStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public AdvertiserInfoV2DataStatus getStatus() {
    return status;
  }


  public void setStatus(AdvertiserInfoV2DataStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserInfoV2ResponseData advertiserInfoV2ResponseData = (AdvertiserInfoV2ResponseData) o;
    return Objects.equals(this.address, advertiserInfoV2ResponseData.address) &&
        Objects.equals(this.brand, advertiserInfoV2ResponseData.brand) &&
        Objects.equals(this.company, advertiserInfoV2ResponseData.company) &&
        Objects.equals(this.createTime, advertiserInfoV2ResponseData.createTime) &&
        Objects.equals(this.firstIndustryName, advertiserInfoV2ResponseData.firstIndustryName) &&
        Objects.equals(this.id, advertiserInfoV2ResponseData.id) &&
        Objects.equals(this.industry, advertiserInfoV2ResponseData.industry) &&
        Objects.equals(this.licenseCity, advertiserInfoV2ResponseData.licenseCity) &&
        Objects.equals(this.licenseNo, advertiserInfoV2ResponseData.licenseNo) &&
        Objects.equals(this.licenseProvince, advertiserInfoV2ResponseData.licenseProvince) &&
        Objects.equals(this.licenseUrl, advertiserInfoV2ResponseData.licenseUrl) &&
        Objects.equals(this.name, advertiserInfoV2ResponseData.name) &&
        Objects.equals(this.note, advertiserInfoV2ResponseData.note) &&
        Objects.equals(this.promotionArea, advertiserInfoV2ResponseData.promotionArea) &&
        Objects.equals(this.promotionCenterCity, advertiserInfoV2ResponseData.promotionCenterCity) &&
        Objects.equals(this.promotionCenterProvince, advertiserInfoV2ResponseData.promotionCenterProvince) &&
        Objects.equals(this.reason, advertiserInfoV2ResponseData.reason) &&
        Objects.equals(this.role, advertiserInfoV2ResponseData.role) &&
        Objects.equals(this.secondIndustryName, advertiserInfoV2ResponseData.secondIndustryName) &&
        Objects.equals(this.status, advertiserInfoV2ResponseData.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, brand, company, createTime, firstIndustryName, id, industry, licenseCity, licenseNo, licenseProvince, licenseUrl, name, note, promotionArea, promotionCenterCity, promotionCenterProvince, reason, role, secondIndustryName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserInfoV2ResponseData {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    firstIndustryName: ").append(toIndentedString(firstIndustryName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    licenseCity: ").append(toIndentedString(licenseCity)).append("\n");
    sb.append("    licenseNo: ").append(toIndentedString(licenseNo)).append("\n");
    sb.append("    licenseProvince: ").append(toIndentedString(licenseProvince)).append("\n");
    sb.append("    licenseUrl: ").append(toIndentedString(licenseUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    promotionArea: ").append(toIndentedString(promotionArea)).append("\n");
    sb.append("    promotionCenterCity: ").append(toIndentedString(promotionCenterCity)).append("\n");
    sb.append("    promotionCenterProvince: ").append(toIndentedString(promotionCenterProvince)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    secondIndustryName: ").append(toIndentedString(secondIndustryName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("brand");
    openapiFields.add("company");
    openapiFields.add("create_time");
    openapiFields.add("first_industry_name");
    openapiFields.add("id");
    openapiFields.add("industry");
    openapiFields.add("license_city");
    openapiFields.add("license_no");
    openapiFields.add("license_province");
    openapiFields.add("license_url");
    openapiFields.add("name");
    openapiFields.add("note");
    openapiFields.add("promotion_area");
    openapiFields.add("promotion_center_city");
    openapiFields.add("promotion_center_province");
    openapiFields.add("reason");
    openapiFields.add("role");
    openapiFields.add("second_industry_name");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserInfoV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserInfoV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserInfoV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserInfoV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserInfoV2ResponseData>() {
           @Override
           public void write(JsonWriter out, AdvertiserInfoV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserInfoV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserInfoV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserInfoV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to AdvertiserInfoV2ResponseData
  */
  public static AdvertiserInfoV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserInfoV2ResponseData.class);
  }

 /**
  * Convert an instance of AdvertiserInfoV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

