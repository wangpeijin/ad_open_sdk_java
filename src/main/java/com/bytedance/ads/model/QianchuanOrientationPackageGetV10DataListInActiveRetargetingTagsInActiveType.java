/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(QianchuanOrientationPackageGetV10DataListInActiveRetargetingTagsInActiveType.Adapter.class)
public enum QianchuanOrientationPackageGetV10DataListInActiveRetargetingTagsInActiveType {
  
  EXPIRE("EXPIRE"),
  
  TAG_OFFLINE("TAG_OFFLINE"),
  
  MANUAL_OFFLINE("MANUAL_OFFLINE");

  private String value;

  QianchuanOrientationPackageGetV10DataListInActiveRetargetingTagsInActiveType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanOrientationPackageGetV10DataListInActiveRetargetingTagsInActiveType fromValue(String value) {
    for (QianchuanOrientationPackageGetV10DataListInActiveRetargetingTagsInActiveType b : QianchuanOrientationPackageGetV10DataListInActiveRetargetingTagsInActiveType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanOrientationPackageGetV10DataListInActiveRetargetingTagsInActiveType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanOrientationPackageGetV10DataListInActiveRetargetingTagsInActiveType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanOrientationPackageGetV10DataListInActiveRetargetingTagsInActiveType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanOrientationPackageGetV10DataListInActiveRetargetingTagsInActiveType.fromValue(value);
    }
  }
}

