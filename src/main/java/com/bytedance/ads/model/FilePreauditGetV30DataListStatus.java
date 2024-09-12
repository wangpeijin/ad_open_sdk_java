/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
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
@JsonAdapter(FilePreauditGetV30DataListStatus.Adapter.class)
public enum FilePreauditGetV30DataListStatus {
  
  AUDITING("AUDITING"),
  
  AUDIT_ACCEPTED("AUDIT_ACCEPTED"),
  
  AUDIT_FAILED("AUDIT_FAILED"),
  
  AUDIT_REJECT("AUDIT_REJECT"),
  
  AUDIT_SUBMIT("AUDIT_SUBMIT"),
  
  AUDIT_TIMEOUT("AUDIT_TIMEOUT");

  private String value;

  FilePreauditGetV30DataListStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FilePreauditGetV30DataListStatus fromValue(String value) {
    for (FilePreauditGetV30DataListStatus b : FilePreauditGetV30DataListStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<FilePreauditGetV30DataListStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final FilePreauditGetV30DataListStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FilePreauditGetV30DataListStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FilePreauditGetV30DataListStatus.fromValue(value);
    }
  }
}

