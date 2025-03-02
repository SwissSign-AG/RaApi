# coding: utf-8

"""
    SwissSign RA REST API

    See https://github.com/SwissSign-AG/RaApi/README.md

    The version of the OpenAPI document: 3.4.4
    Contact: ssc@swisssign.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from typing_extensions import Annotated
from swisssign_ra_api.v2.models.key_type import KeyType
from swisssign_ra_api.v2.models.product_validity import ProductValidity
from typing import Optional, Set
from typing_extensions import Self

class Product(BaseModel):
    """
    Product
    """ # noqa: E501
    uuid: Annotated[str, Field(strict=True)] = Field(description="Product UUID reference")
    product_name: Optional[StrictStr] = Field(default=None, description="Certificate product name", alias="productName")
    product_description: Optional[StrictStr] = Field(default=None, description="Product additional description", alias="productDescription")
    key_generation_type: StrictStr = Field(description="Key generation protocol", alias="keyGenerationType")
    key_type: KeyType = Field(alias="keyType")
    issuance_notification: StrictBool = Field(description="Indicate if the certificate sends a notification on issuance", alias="issuanceNotification")
    revocation_notification: StrictBool = Field(description="Indicate if the certificate sends a notification on revocation", alias="revocationNotification")
    authorization: StrictBool = Field(description="Indicate if the certificate requires an authorization on issuance/revocation")
    renewal_rule: StrictBool = Field(description="Indicate if the certificate sends a notification for renewal", alias="renewalRule")
    publish_certificate: StrictBool = Field(description="Indicate if the certificate is published to the public LDAP after issuance", alias="publishCertificate")
    client_publish_certificate_override: StrictBool = Field(description="Indicate if the certificate publication can be overridden", alias="clientPublishCertificateOverride")
    client_publish_certificate_override_default: StrictBool = Field(description="Indicate the default value if publication override is enabled", alias="clientPublishCertificateOverrideDefault")
    expiration_date: Optional[datetime] = Field(default=None, description="Indicate if the certificate product has an expiration date", alias="expirationDate")
    allow_additional_issuance_notification_recipients: StrictBool = Field(description="When enabled, additional certificate issuance notification recipients can be added to the certificate order. Additional recipients are skipped when disabled.", alias="allowAdditionalIssuanceNotificationRecipients")
    allow_additional_revocation_notification_recipients: StrictBool = Field(description="When enabled, additional certificate revocation notification recipients can be added to the certificate order. Additional recipients are skipped when disabled.", alias="allowAdditionalRevocationNotificationRecipients")
    allow_additional_renewal_notification_recipients: StrictBool = Field(description="When enabled, additional certificate renewal notification recipients can be added to the certificate order. Additional recipients are skipped when disabled.", alias="allowAdditionalRenewalNotificationRecipients")
    allow_additional_authorization_notification_recipients: StrictBool = Field(description="When enabled, additional authorization notification recipients can be added to the certificate order. Additional recipients are skipped when disabled.", alias="allowAdditionalAuthorizationNotificationRecipients")
    allow_additional_authorization_accepted_notification_recipients: StrictBool = Field(description="When enabled, additional authorization notification recipients (for accepted requests) can be added to the certificate order. Additional recipients are skipped when disabled.", alias="allowAdditionalAuthorizationAcceptedNotificationRecipients")
    allow_additional_authorization_rejected_notification_recipients: StrictBool = Field(description="When enabled, additional authorization notification recipients (for rejected requests) can be added to the certificate order. Additional recipients are skipped when disabled.", alias="allowAdditionalAuthorizationRejectedNotificationRecipients")
    is_cabdns_validation_required: StrictBool = Field(description="When enabled, indicates CAB DNS or HTTP domain validation is required.", alias="isCABDNSValidationRequired")
    allow_additional_cabdns_notification_recipients: StrictBool = Field(description="When enabled, indicates that additional notification recipients can be added to the certificate order. Additional recipients are skipped when disabled.", alias="allowAdditionalCABDNSNotificationRecipients")
    is_cabdns_email_link_validation_required: StrictBool = Field(description="When enabled, indicates CAB DNS via constructed email link to domain owner is required.", alias="isCABDNSEmailLinkValidationRequired")
    is_email_box_validation_required: StrictBool = Field(description="When enabled, indicates that the recipient must validate the email box via a link.", alias="isEmailBoxValidationRequired")
    requires_registration_documents: StrictBool = Field(description="When enabled, registration documents must provided with the certificate order. Documents are skipped when disabled.", alias="requiresRegistrationDocuments")
    requires_registration_documents_on_register: StrictBool = Field(description="When enabled, registration documents must provided when submitting the certificate order. When disabled, documents can be added to the certificate order at a later time via the RA UI.", alias="requiresRegistrationDocumentsOnRegister")
    allow_registration_documents_pdf: StrictBool = Field(description="PDF registration document are allowed.", alias="allowRegistrationDocumentsPDF")
    allow_registration_documents_jpg: StrictBool = Field(description="JPG/PNG registration images are allowed.", alias="allowRegistrationDocumentsJPG")
    is_generate_revocation_code: StrictBool = Field(description="Indicates if a revocation code is issued for the recipient (link to self service revocation).", alias="isGenerateRevocationCode")
    product_validity: Optional[ProductValidity] = Field(default=None, alias="productValidity")
    __properties: ClassVar[List[str]] = ["uuid", "productName", "productDescription", "keyGenerationType", "keyType", "issuanceNotification", "revocationNotification", "authorization", "renewalRule", "publishCertificate", "clientPublishCertificateOverride", "clientPublishCertificateOverrideDefault", "expirationDate", "allowAdditionalIssuanceNotificationRecipients", "allowAdditionalRevocationNotificationRecipients", "allowAdditionalRenewalNotificationRecipients", "allowAdditionalAuthorizationNotificationRecipients", "allowAdditionalAuthorizationAcceptedNotificationRecipients", "allowAdditionalAuthorizationRejectedNotificationRecipients", "isCABDNSValidationRequired", "allowAdditionalCABDNSNotificationRecipients", "isCABDNSEmailLinkValidationRequired", "isEmailBoxValidationRequired", "requiresRegistrationDocuments", "requiresRegistrationDocumentsOnRegister", "allowRegistrationDocumentsPDF", "allowRegistrationDocumentsJPG", "isGenerateRevocationCode", "productValidity"]

    @field_validator('uuid')
    def uuid_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if not re.match(r"pma-[0-9a-f-]{36}", value):
            raise ValueError(r"must validate the regular expression /pma-[0-9a-f-]{36}/")
        return value

    @field_validator('key_generation_type')
    def key_generation_type_validate_enum(cls, value):
        """Validates the enum"""
        if value not in set(['PKCS10', 'PKCS12', 'PKCS12withPIN', 'PKCS12withCAPIN', 'PKCS10or12withPIN', 'PKCS10or12withCAPIN', 'HSM', 'CNG']):
            raise ValueError("must be one of enum values ('PKCS10', 'PKCS12', 'PKCS12withPIN', 'PKCS12withCAPIN', 'PKCS10or12withPIN', 'PKCS10or12withCAPIN', 'HSM', 'CNG')")
        return value

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of Product from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        """
        excluded_fields: Set[str] = set([
            "uuid",
            "product_name",
            "product_description",
            "key_generation_type",
            "issuance_notification",
            "revocation_notification",
            "authorization",
            "renewal_rule",
            "publish_certificate",
            "client_publish_certificate_override",
            "client_publish_certificate_override_default",
            "expiration_date",
            "allow_additional_issuance_notification_recipients",
            "allow_additional_revocation_notification_recipients",
            "allow_additional_renewal_notification_recipients",
            "allow_additional_authorization_notification_recipients",
            "allow_additional_authorization_accepted_notification_recipients",
            "allow_additional_authorization_rejected_notification_recipients",
            "is_cabdns_validation_required",
            "allow_additional_cabdns_notification_recipients",
            "is_cabdns_email_link_validation_required",
            "is_email_box_validation_required",
            "requires_registration_documents",
            "requires_registration_documents_on_register",
            "allow_registration_documents_pdf",
            "allow_registration_documents_jpg",
            "is_generate_revocation_code",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of product_validity
        if self.product_validity:
            _dict['productValidity'] = self.product_validity.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Product from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "uuid": obj.get("uuid"),
            "productName": obj.get("productName"),
            "productDescription": obj.get("productDescription"),
            "keyGenerationType": obj.get("keyGenerationType"),
            "keyType": obj.get("keyType"),
            "issuanceNotification": obj.get("issuanceNotification"),
            "revocationNotification": obj.get("revocationNotification"),
            "authorization": obj.get("authorization"),
            "renewalRule": obj.get("renewalRule"),
            "publishCertificate": obj.get("publishCertificate"),
            "clientPublishCertificateOverride": obj.get("clientPublishCertificateOverride"),
            "clientPublishCertificateOverrideDefault": obj.get("clientPublishCertificateOverrideDefault"),
            "expirationDate": obj.get("expirationDate"),
            "allowAdditionalIssuanceNotificationRecipients": obj.get("allowAdditionalIssuanceNotificationRecipients"),
            "allowAdditionalRevocationNotificationRecipients": obj.get("allowAdditionalRevocationNotificationRecipients"),
            "allowAdditionalRenewalNotificationRecipients": obj.get("allowAdditionalRenewalNotificationRecipients"),
            "allowAdditionalAuthorizationNotificationRecipients": obj.get("allowAdditionalAuthorizationNotificationRecipients"),
            "allowAdditionalAuthorizationAcceptedNotificationRecipients": obj.get("allowAdditionalAuthorizationAcceptedNotificationRecipients"),
            "allowAdditionalAuthorizationRejectedNotificationRecipients": obj.get("allowAdditionalAuthorizationRejectedNotificationRecipients"),
            "isCABDNSValidationRequired": obj.get("isCABDNSValidationRequired"),
            "allowAdditionalCABDNSNotificationRecipients": obj.get("allowAdditionalCABDNSNotificationRecipients"),
            "isCABDNSEmailLinkValidationRequired": obj.get("isCABDNSEmailLinkValidationRequired"),
            "isEmailBoxValidationRequired": obj.get("isEmailBoxValidationRequired"),
            "requiresRegistrationDocuments": obj.get("requiresRegistrationDocuments"),
            "requiresRegistrationDocumentsOnRegister": obj.get("requiresRegistrationDocumentsOnRegister"),
            "allowRegistrationDocumentsPDF": obj.get("allowRegistrationDocumentsPDF"),
            "allowRegistrationDocumentsJPG": obj.get("allowRegistrationDocumentsJPG"),
            "isGenerateRevocationCode": obj.get("isGenerateRevocationCode"),
            "productValidity": ProductValidity.from_dict(obj["productValidity"]) if obj.get("productValidity") is not None else None
        })
        return _obj


