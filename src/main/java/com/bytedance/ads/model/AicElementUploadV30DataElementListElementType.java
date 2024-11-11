/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
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
@JsonAdapter(AicElementUploadV30DataElementListElementType.Adapter.class)
public enum AicElementUploadV30DataElementListElementType {
  
  FOLDER("FOLDER"),
  
  FONT("FONT"),
  
  IMAGE("IMAGE"),
  
  MUSIC("MUSIC"),
  
  VIDEO("VIDEO"),
  
  VOICE("VOICE");

  private String value;

  AicElementUploadV30DataElementListElementType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AicElementUploadV30DataElementListElementType fromValue(String value) {
    for (AicElementUploadV30DataElementListElementType b : AicElementUploadV30DataElementListElementType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AicElementUploadV30DataElementListElementType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AicElementUploadV30DataElementListElementType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AicElementUploadV30DataElementListElementType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AicElementUploadV30DataElementListElementType.fromValue(value);
    }
  }
}

