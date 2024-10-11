/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionStatus;
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
 * 当前线上版本信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion {
  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName = null;

  public static final String SERIALIZED_NAME_AUDIT_ID = "audit_id";
  @SerializedName(SERIALIZED_NAME_AUDIT_ID)
  private Long auditId = null;

  public static final String SERIALIZED_NAME_AUDIT_MESSAGE = "audit_message";
  @SerializedName(SERIALIZED_NAME_AUDIT_MESSAGE)
  private String auditMessage = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionStatus status = null;

  public static final String SERIALIZED_NAME_VERSION_CODE = "version_code";
  @SerializedName(SERIALIZED_NAME_VERSION_CODE)
  private String versionCode = null;

  public static final String SERIALIZED_NAME_VERSION_NAME = "version_name";
  @SerializedName(SERIALIZED_NAME_VERSION_NAME)
  private String versionName = null;

  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion() {
  }

  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 应用名
   * @return appName
  **/
  @javax.annotation.Nullable
  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion auditId(Long auditId) {
    
    this.auditId = auditId;
    return this;
  }

   /**
   * 审核id，审核通过时id显示为0
   * @return auditId
  **/
  @javax.annotation.Nullable
  public Long getAuditId() {
    return auditId;
  }


  public void setAuditId(Long auditId) {
    this.auditId = auditId;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion auditMessage(String auditMessage) {
    
    this.auditMessage = auditMessage;
    return this;
  }

   /**
   * 审核失败信息，审核通过显示空
   * @return auditMessage
  **/
  @javax.annotation.Nullable
  public String getAuditMessage() {
    return auditMessage;
  }


  public void setAuditMessage(String auditMessage) {
    this.auditMessage = auditMessage;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion status(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionStatus getStatus() {
    return status;
  }


  public void setStatus(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionStatus status) {
    this.status = status;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion versionCode(String versionCode) {
    
    this.versionCode = versionCode;
    return this;
  }

   /**
   * 版本编码
   * @return versionCode
  **/
  @javax.annotation.Nullable
  public String getVersionCode() {
    return versionCode;
  }


  public void setVersionCode(String versionCode) {
    this.versionCode = versionCode;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion versionName(String versionName) {
    
    this.versionName = versionName;
    return this;
  }

   /**
   * 版本名
   * @return versionName
  **/
  @javax.annotation.Nullable
  public String getVersionName() {
    return versionName;
  }


  public void setVersionName(String versionName) {
    this.versionName = versionName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion = (ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion) o;
    return Objects.equals(this.appName, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.appName) &&
        Objects.equals(this.auditId, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.auditId) &&
        Objects.equals(this.auditMessage, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.auditMessage) &&
        Objects.equals(this.status, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.status) &&
        Objects.equals(this.versionCode, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.versionCode) &&
        Objects.equals(this.versionName, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.versionName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, auditId, auditMessage, status, versionCode, versionName);
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
    sb.append("class ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion {\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    auditId: ").append(toIndentedString(auditId)).append("\n");
    sb.append("    auditMessage: ").append(toIndentedString(auditMessage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    versionCode: ").append(toIndentedString(versionCode)).append("\n");
    sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
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
    openapiFields.add("app_name");
    openapiFields.add("audit_id");
    openapiFields.add("audit_message");
    openapiFields.add("status");
    openapiFields.add("version_code");
    openapiFields.add("version_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion
  */
  public static ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.class);
  }

 /**
  * Convert an instance of ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

