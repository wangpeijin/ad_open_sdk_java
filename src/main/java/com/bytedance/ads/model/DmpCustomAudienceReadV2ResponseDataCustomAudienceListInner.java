/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.DmpCustomAudienceReadV2DataCustomAudienceListDeliveryStatus;
import com.bytedance.ads.model.DmpCustomAudienceReadV2DataCustomAudienceListSource;
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
 * DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner {
  public static final String SERIALIZED_NAME_COVER_NUM = "cover_num";
  @SerializedName(SERIALIZED_NAME_COVER_NUM)
  private Long coverNum = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_CUSTOM_AUDIENCE_ID = "custom_audience_id";
  @SerializedName(SERIALIZED_NAME_CUSTOM_AUDIENCE_ID)
  private Long customAudienceId = null;

  public static final String SERIALIZED_NAME_DATA_SOURCE_ID = "data_source_id";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_ID)
  private String dataSourceId = null;

  public static final String SERIALIZED_NAME_DELIVERY_STATUS = "delivery_status";
  @SerializedName(SERIALIZED_NAME_DELIVERY_STATUS)
  private DmpCustomAudienceReadV2DataCustomAudienceListDeliveryStatus deliveryStatus = null;

  public static final String SERIALIZED_NAME_EXIST_PULL_OFF_TAG = "exist_pull_off_tag";
  @SerializedName(SERIALIZED_NAME_EXIST_PULL_OFF_TAG)
  private Long existPullOffTag = null;

  public static final String SERIALIZED_NAME_ISDEL = "isdel";
  @SerializedName(SERIALIZED_NAME_ISDEL)
  private Long isdel = null;

  public static final String SERIALIZED_NAME_MODIFY_TIME = "modify_time";
  @SerializedName(SERIALIZED_NAME_MODIFY_TIME)
  private String modifyTime = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PUSH_STATUS = "push_status";
  @SerializedName(SERIALIZED_NAME_PUSH_STATUS)
  private Long pushStatus = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private DmpCustomAudienceReadV2DataCustomAudienceListSource source = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Long status = null;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag = null;

  public static final String SERIALIZED_NAME_THIRD_PARTY_INFO = "third_party_info";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_INFO)
  private String thirdPartyInfo = null;

  public static final String SERIALIZED_NAME_UPLOAD_NUM = "upload_num";
  @SerializedName(SERIALIZED_NAME_UPLOAD_NUM)
  private Long uploadNum = null;

  public DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner() {
  }

  public DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner coverNum(Long coverNum) {
    
    this.coverNum = coverNum;
    return this;
  }

   /**
   * 
   * @return coverNum
  **/
  @javax.annotation.Nullable
  public Long getCoverNum() {
    return coverNum;
  }


  public void setCoverNum(Long coverNum) {
    this.coverNum = coverNum;
  }


  public DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner createTime(String createTime) {
    
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


  public DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner customAudienceId(Long customAudienceId) {
    
    this.customAudienceId = customAudienceId;
    return this;
  }

   /**
   * 
   * @return customAudienceId
  **/
  @javax.annotation.Nullable
  public Long getCustomAudienceId() {
    return customAudienceId;
  }


  public void setCustomAudienceId(Long customAudienceId) {
    this.customAudienceId = customAudienceId;
  }


  public DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner dataSourceId(String dataSourceId) {
    
    this.dataSourceId = dataSourceId;
    return this;
  }

   /**
   * 
   * @return dataSourceId
  **/
  @javax.annotation.Nullable
  public String getDataSourceId() {
    return dataSourceId;
  }


  public void setDataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
  }


  public DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner deliveryStatus(DmpCustomAudienceReadV2DataCustomAudienceListDeliveryStatus deliveryStatus) {
    
    this.deliveryStatus = deliveryStatus;
    return this;
  }

   /**
   * Get deliveryStatus
   * @return deliveryStatus
  **/
  @javax.annotation.Nullable
  public DmpCustomAudienceReadV2DataCustomAudienceListDeliveryStatus getDeliveryStatus() {
    return deliveryStatus;
  }


  public void setDeliveryStatus(DmpCustomAudienceReadV2DataCustomAudienceListDeliveryStatus deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }


  public DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner existPullOffTag(Long existPullOffTag) {
    
    this.existPullOffTag = existPullOffTag;
    return this;
  }

   /**
   * 
   * @return existPullOffTag
  **/
  @javax.annotation.Nullable
  public Long getExistPullOffTag() {
    return existPullOffTag;
  }


  public void setExistPullOffTag(Long existPullOffTag) {
    this.existPullOffTag = existPullOffTag;
  }


  public DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner isdel(Long isdel) {
    
    this.isdel = isdel;
    return this;
  }

   /**
   * 
   * @return isdel
  **/
  @javax.annotation.Nullable
  public Long getIsdel() {
    return isdel;
  }


  public void setIsdel(Long isdel) {
    this.isdel = isdel;
  }


  public DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner modifyTime(String modifyTime) {
    
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


  public DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner name(String name) {
    
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


  public DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner pushStatus(Long pushStatus) {
    
    this.pushStatus = pushStatus;
    return this;
  }

   /**
   * 
   * @return pushStatus
  **/
  @javax.annotation.Nullable
  public Long getPushStatus() {
    return pushStatus;
  }


  public void setPushStatus(Long pushStatus) {
    this.pushStatus = pushStatus;
  }


  public DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner source(DmpCustomAudienceReadV2DataCustomAudienceListSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public DmpCustomAudienceReadV2DataCustomAudienceListSource getSource() {
    return source;
  }


  public void setSource(DmpCustomAudienceReadV2DataCustomAudienceListSource source) {
    this.source = source;
  }


  public DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner status(Long status) {
    
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable
  public Long getStatus() {
    return status;
  }


  public void setStatus(Long status) {
    this.status = status;
  }


  public DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * 
   * @return tag
  **/
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  public DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner thirdPartyInfo(String thirdPartyInfo) {
    
    this.thirdPartyInfo = thirdPartyInfo;
    return this;
  }

   /**
   * 
   * @return thirdPartyInfo
  **/
  @javax.annotation.Nullable
  public String getThirdPartyInfo() {
    return thirdPartyInfo;
  }


  public void setThirdPartyInfo(String thirdPartyInfo) {
    this.thirdPartyInfo = thirdPartyInfo;
  }


  public DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner uploadNum(Long uploadNum) {
    
    this.uploadNum = uploadNum;
    return this;
  }

   /**
   * 
   * @return uploadNum
  **/
  @javax.annotation.Nullable
  public Long getUploadNum() {
    return uploadNum;
  }


  public void setUploadNum(Long uploadNum) {
    this.uploadNum = uploadNum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner dmpCustomAudienceReadV2ResponseDataCustomAudienceListInner = (DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner) o;
    return Objects.equals(this.coverNum, dmpCustomAudienceReadV2ResponseDataCustomAudienceListInner.coverNum) &&
        Objects.equals(this.createTime, dmpCustomAudienceReadV2ResponseDataCustomAudienceListInner.createTime) &&
        Objects.equals(this.customAudienceId, dmpCustomAudienceReadV2ResponseDataCustomAudienceListInner.customAudienceId) &&
        Objects.equals(this.dataSourceId, dmpCustomAudienceReadV2ResponseDataCustomAudienceListInner.dataSourceId) &&
        Objects.equals(this.deliveryStatus, dmpCustomAudienceReadV2ResponseDataCustomAudienceListInner.deliveryStatus) &&
        Objects.equals(this.existPullOffTag, dmpCustomAudienceReadV2ResponseDataCustomAudienceListInner.existPullOffTag) &&
        Objects.equals(this.isdel, dmpCustomAudienceReadV2ResponseDataCustomAudienceListInner.isdel) &&
        Objects.equals(this.modifyTime, dmpCustomAudienceReadV2ResponseDataCustomAudienceListInner.modifyTime) &&
        Objects.equals(this.name, dmpCustomAudienceReadV2ResponseDataCustomAudienceListInner.name) &&
        Objects.equals(this.pushStatus, dmpCustomAudienceReadV2ResponseDataCustomAudienceListInner.pushStatus) &&
        Objects.equals(this.source, dmpCustomAudienceReadV2ResponseDataCustomAudienceListInner.source) &&
        Objects.equals(this.status, dmpCustomAudienceReadV2ResponseDataCustomAudienceListInner.status) &&
        Objects.equals(this.tag, dmpCustomAudienceReadV2ResponseDataCustomAudienceListInner.tag) &&
        Objects.equals(this.thirdPartyInfo, dmpCustomAudienceReadV2ResponseDataCustomAudienceListInner.thirdPartyInfo) &&
        Objects.equals(this.uploadNum, dmpCustomAudienceReadV2ResponseDataCustomAudienceListInner.uploadNum);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverNum, createTime, customAudienceId, dataSourceId, deliveryStatus, existPullOffTag, isdel, modifyTime, name, pushStatus, source, status, tag, thirdPartyInfo, uploadNum);
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
    sb.append("class DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner {\n");
    sb.append("    coverNum: ").append(toIndentedString(coverNum)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    customAudienceId: ").append(toIndentedString(customAudienceId)).append("\n");
    sb.append("    dataSourceId: ").append(toIndentedString(dataSourceId)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    existPullOffTag: ").append(toIndentedString(existPullOffTag)).append("\n");
    sb.append("    isdel: ").append(toIndentedString(isdel)).append("\n");
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pushStatus: ").append(toIndentedString(pushStatus)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    thirdPartyInfo: ").append(toIndentedString(thirdPartyInfo)).append("\n");
    sb.append("    uploadNum: ").append(toIndentedString(uploadNum)).append("\n");
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
    openapiFields.add("cover_num");
    openapiFields.add("create_time");
    openapiFields.add("custom_audience_id");
    openapiFields.add("data_source_id");
    openapiFields.add("delivery_status");
    openapiFields.add("exist_pull_off_tag");
    openapiFields.add("isdel");
    openapiFields.add("modify_time");
    openapiFields.add("name");
    openapiFields.add("push_status");
    openapiFields.add("source");
    openapiFields.add("status");
    openapiFields.add("tag");
    openapiFields.add("third_party_info");
    openapiFields.add("upload_num");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner>() {
           @Override
           public void write(JsonWriter out, DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner
  * @throws IOException if the JSON string is invalid with respect to DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner
  */
  public static DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner.class);
  }

 /**
  * Convert an instance of DmpCustomAudienceReadV2ResponseDataCustomAudienceListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

