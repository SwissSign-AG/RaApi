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
import json
from enum import Enum
from typing_extensions import Self


class CertificateOrderStatus(str, Enum):
    """
    Status of the certificate Order
    """

    """
    allowed enum values
    """
    NEW = 'NEW'
    KEY_VALIDATION = 'KEY_VALIDATION'
    PRE_VALIDATION = 'PRE_VALIDATION'
    GENERATE_TBS = 'GENERATE_TBS'
    PENDING_AUTH = 'PENDING_AUTH'
    PRE_ISSUE = 'PRE_ISSUE'
    ISSUE = 'ISSUE'
    POST_VALIDATION = 'POST_VALIDATION'
    FINALIZE_ISSUANCE = 'FINALIZE_ISSUANCE'
    ISSUED = 'ISSUED'
    REVOKED = 'REVOKED'
    FAILED = 'FAILED'
    REJECTED = 'REJECTED'
    PENDING_CSR_RENEWAL = 'PENDING_CSR_RENEWAL'
    UNKNOWN = 'UNKNOWN'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of CertificateOrderStatus from a JSON string"""
        return cls(json.loads(json_str))


