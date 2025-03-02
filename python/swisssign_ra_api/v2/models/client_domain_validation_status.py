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


class ClientDomainValidationStatus(str, Enum):
    """
    Status of the domain pre validation
    """

    """
    allowed enum values
    """
    PENDING = 'PENDING'
    EXPIRED = 'EXPIRED'
    VALID = 'VALID'
    NOT_VALIDATED = 'NOT_VALIDATED'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of ClientDomainValidationStatus from a JSON string"""
        return cls(json.loads(json_str))


