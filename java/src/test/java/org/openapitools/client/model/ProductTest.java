/*
 * SwissSign RA REST API
 * See https://github.com/SwissSign-AG/RaApi/README.md
 *
 * The version of the OpenAPI document: 2.3.4
 * Contact: ssc@swisssign.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import org.openapitools.client.model.KeyType;
import org.openapitools.client.model.ProductValidity;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for Product
 */
public class ProductTest {
    private final Product model = new Product();

    /**
     * Model tests for Product
     */
    @Test
    public void testProduct() {
        // TODO: test Product
    }

    /**
     * Test the property 'uuid'
     */
    @Test
    public void uuidTest() {
        // TODO: test uuid
    }

    /**
     * Test the property 'productName'
     */
    @Test
    public void productNameTest() {
        // TODO: test productName
    }

    /**
     * Test the property 'productDescription'
     */
    @Test
    public void productDescriptionTest() {
        // TODO: test productDescription
    }

    /**
     * Test the property 'keyGenerationType'
     */
    @Test
    public void keyGenerationTypeTest() {
        // TODO: test keyGenerationType
    }

    /**
     * Test the property 'keyType'
     */
    @Test
    public void keyTypeTest() {
        // TODO: test keyType
    }

    /**
     * Test the property 'issuanceNotification'
     */
    @Test
    public void issuanceNotificationTest() {
        // TODO: test issuanceNotification
    }

    /**
     * Test the property 'revocationNotification'
     */
    @Test
    public void revocationNotificationTest() {
        // TODO: test revocationNotification
    }

    /**
     * Test the property 'authorization'
     */
    @Test
    public void authorizationTest() {
        // TODO: test authorization
    }

    /**
     * Test the property 'renewalRule'
     */
    @Test
    public void renewalRuleTest() {
        // TODO: test renewalRule
    }

    /**
     * Test the property 'publishCertificate'
     */
    @Test
    public void publishCertificateTest() {
        // TODO: test publishCertificate
    }

    /**
     * Test the property 'clientPublishCertificateOverride'
     */
    @Test
    public void clientPublishCertificateOverrideTest() {
        // TODO: test clientPublishCertificateOverride
    }

    /**
     * Test the property 'clientPublishCertificateOverrideDefault'
     */
    @Test
    public void clientPublishCertificateOverrideDefaultTest() {
        // TODO: test clientPublishCertificateOverrideDefault
    }

    /**
     * Test the property 'expirationDate'
     */
    @Test
    public void expirationDateTest() {
        // TODO: test expirationDate
    }

    /**
     * Test the property 'allowAdditionalIssuanceNotificationRecipients'
     */
    @Test
    public void allowAdditionalIssuanceNotificationRecipientsTest() {
        // TODO: test allowAdditionalIssuanceNotificationRecipients
    }

    /**
     * Test the property 'allowAdditionalRevocationNotificationRecipients'
     */
    @Test
    public void allowAdditionalRevocationNotificationRecipientsTest() {
        // TODO: test allowAdditionalRevocationNotificationRecipients
    }

    /**
     * Test the property 'allowAdditionalRenewalNotificationRecipients'
     */
    @Test
    public void allowAdditionalRenewalNotificationRecipientsTest() {
        // TODO: test allowAdditionalRenewalNotificationRecipients
    }

    /**
     * Test the property 'allowAdditionalAuthorizationNotificationRecipients'
     */
    @Test
    public void allowAdditionalAuthorizationNotificationRecipientsTest() {
        // TODO: test allowAdditionalAuthorizationNotificationRecipients
    }

    /**
     * Test the property 'allowAdditionalAuthorizationAcceptedNotificationRecipients'
     */
    @Test
    public void allowAdditionalAuthorizationAcceptedNotificationRecipientsTest() {
        // TODO: test allowAdditionalAuthorizationAcceptedNotificationRecipients
    }

    /**
     * Test the property 'allowAdditionalAuthorizationRejectedNotificationRecipients'
     */
    @Test
    public void allowAdditionalAuthorizationRejectedNotificationRecipientsTest() {
        // TODO: test allowAdditionalAuthorizationRejectedNotificationRecipients
    }

    /**
     * Test the property 'isCABDNSValidationRequired'
     */
    @Test
    public void isCABDNSValidationRequiredTest() {
        // TODO: test isCABDNSValidationRequired
    }

    /**
     * Test the property 'allowAdditionalCABDNSNotificationRecipients'
     */
    @Test
    public void allowAdditionalCABDNSNotificationRecipientsTest() {
        // TODO: test allowAdditionalCABDNSNotificationRecipients
    }

    /**
     * Test the property 'isCABDNSEmailLinkValidationRequired'
     */
    @Test
    public void isCABDNSEmailLinkValidationRequiredTest() {
        // TODO: test isCABDNSEmailLinkValidationRequired
    }

    /**
     * Test the property 'isEmailBoxValidationRequired'
     */
    @Test
    public void isEmailBoxValidationRequiredTest() {
        // TODO: test isEmailBoxValidationRequired
    }

    /**
     * Test the property 'requiresRegistrationDocuments'
     */
    @Test
    public void requiresRegistrationDocumentsTest() {
        // TODO: test requiresRegistrationDocuments
    }

    /**
     * Test the property 'requiresRegistrationDocumentsOnRegister'
     */
    @Test
    public void requiresRegistrationDocumentsOnRegisterTest() {
        // TODO: test requiresRegistrationDocumentsOnRegister
    }

    /**
     * Test the property 'allowRegistrationDocumentsPDF'
     */
    @Test
    public void allowRegistrationDocumentsPDFTest() {
        // TODO: test allowRegistrationDocumentsPDF
    }

    /**
     * Test the property 'allowRegistrationDocumentsJPG'
     */
    @Test
    public void allowRegistrationDocumentsJPGTest() {
        // TODO: test allowRegistrationDocumentsJPG
    }

    /**
     * Test the property 'isGenerateRevocationCode'
     */
    @Test
    public void isGenerateRevocationCodeTest() {
        // TODO: test isGenerateRevocationCode
    }

    /**
     * Test the property 'productValidity'
     */
    @Test
    public void productValidityTest() {
        // TODO: test productValidity
    }

}
