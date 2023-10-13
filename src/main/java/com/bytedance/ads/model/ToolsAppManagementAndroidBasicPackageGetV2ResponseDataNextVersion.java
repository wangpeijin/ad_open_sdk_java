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
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionStatus;
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
 * 待发布版本信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T15:22:35.223235852+08:00[PRC]")
public class ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion {
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
  private ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionStatus status = null;

  public static final String SERIALIZED_NAME_VERSION_CODE = "version_code";
  @SerializedName(SERIALIZED_NAME_VERSION_CODE)
  private String versionCode = null;

  public static final String SERIALIZED_NAME_VERSION_NAME = "version_name";
  @SerializedName(SERIALIZED_NAME_VERSION_NAME)
  private String versionName = null;

  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion() {
  }

  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion appName(String appName) {
    
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


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion auditId(Long auditId) {
    
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


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion auditMessage(String auditMessage) {
    
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


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion status(ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionStatus getStatus() {
    return status;
  }


  public void setStatus(ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionStatus status) {
    this.status = status;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion versionCode(String versionCode) {
    
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


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion versionName(String versionName) {
    
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
    ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion toolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion = (ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion) o;
    return Objects.equals(this.appName, toolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion.appName) &&
        Objects.equals(this.auditId, toolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion.auditId) &&
        Objects.equals(this.auditMessage, toolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion.auditMessage) &&
        Objects.equals(this.status, toolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion.status) &&
        Objects.equals(this.versionCode, toolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion.versionCode) &&
        Objects.equals(this.versionName, toolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion.versionName);
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
    sb.append("class ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion {\n");
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
       if (!ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion
  */
  public static ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion.class);
  }

 /**
  * Convert an instance of ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

