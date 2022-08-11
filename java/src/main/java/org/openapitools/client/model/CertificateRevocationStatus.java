/*
 * SwissSign RA REST API
 * See https://github.com/SwissSign-AG/RaApi/README.md
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: opensource@swisssign.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import org.openapitools.client.model.NullType;
import org.openapitools.client.model.RevocationReason;
import org.openapitools.client.model.RevocationStatus;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-11T11:26:13.812533Z[Etc/UTC]")
public class CertificateRevocationStatus extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CertificateRevocationStatus.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CertificateRevocationStatus.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CertificateRevocationStatus' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<NullType> adapterNullType = gson.getDelegateAdapter(this, TypeToken.get(NullType.class));
            final TypeAdapter<RevocationStatus> adapterRevocationStatus = gson.getDelegateAdapter(this, TypeToken.get(RevocationStatus.class));

            return (TypeAdapter<T>) new TypeAdapter<CertificateRevocationStatus>() {
                @Override
                public void write(JsonWriter out, CertificateRevocationStatus value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `NullType`
                    if (value.getActualInstance() instanceof NullType) {
                        JsonObject obj = adapterNullType.toJsonTree((NullType)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `RevocationStatus`
                    if (value.getActualInstance() instanceof RevocationStatus) {
                        JsonObject obj = adapterRevocationStatus.toJsonTree((RevocationStatus)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: NullType, RevocationStatus");
                }

                @Override
                public CertificateRevocationStatus read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize NullType
                    try {
                        // validate the JSON object to see if any exception is thrown
                        NullType.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'NullType'");
                        CertificateRevocationStatus ret = new CertificateRevocationStatus();
                        ret.setActualInstance(adapterNullType.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'NullType'", e);
                    }

                    // deserialize RevocationStatus
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RevocationStatus.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'RevocationStatus'");
                        CertificateRevocationStatus ret = new CertificateRevocationStatus();
                        ret.setActualInstance(adapterRevocationStatus.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'RevocationStatus'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for CertificateRevocationStatus: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public CertificateRevocationStatus() {
        super("anyOf", Boolean.FALSE);
    }

    public CertificateRevocationStatus(NullType o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CertificateRevocationStatus(RevocationStatus o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("NullType", new GenericType<NullType>() {
        });
        schemas.put("RevocationStatus", new GenericType<RevocationStatus>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return CertificateRevocationStatus.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * NullType, RevocationStatus
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof NullType) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RevocationStatus) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be NullType, RevocationStatus");
    }

    /**
     * Get the actual instance, which can be the following:
     * NullType, RevocationStatus
     *
     * @return The actual instance (NullType, RevocationStatus)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `NullType`. If the actual instance is not `NullType`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `NullType`
     * @throws ClassCastException if the instance is not `NullType`
     */
    public NullType getNullType() throws ClassCastException {
        return (NullType)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RevocationStatus`. If the actual instance is not `RevocationStatus`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RevocationStatus`
     * @throws ClassCastException if the instance is not `RevocationStatus`
     */
    public RevocationStatus getRevocationStatus() throws ClassCastException {
        return (RevocationStatus)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CertificateRevocationStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with NullType
    try {
      NullType.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with RevocationStatus
    try {
      RevocationStatus.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for CertificateRevocationStatus with anyOf schemas: NullType, RevocationStatus. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of CertificateRevocationStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CertificateRevocationStatus
  * @throws IOException if the JSON string is invalid with respect to CertificateRevocationStatus
  */
  public static CertificateRevocationStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CertificateRevocationStatus.class);
  }

 /**
  * Convert an instance of CertificateRevocationStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

