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
from pydantic import BaseModel, ConfigDict, Field, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from typing_extensions import Annotated
from swisssign_ra_api.v2.models.job_status import JobStatus
from swisssign_ra_api.v2.models.job_type import JobType
from typing import Optional, Set
from typing_extensions import Self

class CertificateOrderTask(BaseModel):
    """
    CertificateOrderTask
    """ # noqa: E501
    uuid: Annotated[str, Field(strict=True)] = Field(description="Certificate Order Task reference")
    time_created: Optional[datetime] = Field(default=None, description="Certificate Order creation date time", alias="timeCreated")
    time_scheduled: Optional[datetime] = Field(default=None, description="Scheduled date time", alias="timeScheduled")
    time_started: Optional[datetime] = Field(default=None, description="Started date time", alias="timeStarted")
    time_finished: Optional[datetime] = Field(default=None, description="Finished date time", alias="timeFinished")
    status: JobStatus
    type: JobType
    number_of_executions: Annotated[int, Field(strict=True, ge=0)] = Field(description="Number of executions", alias="numberOfExecutions")
    response: Optional[StrictStr] = Field(default=None, description="Response")
    error: Optional[StrictStr] = Field(default=None, description="Error message")
    __properties: ClassVar[List[str]] = ["uuid", "timeCreated", "timeScheduled", "timeStarted", "timeFinished", "status", "type", "numberOfExecutions", "response", "error"]

    @field_validator('uuid')
    def uuid_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if not re.match(r"job-[0-9a-f-]{36}", value):
            raise ValueError(r"must validate the regular expression /job-[0-9a-f-]{36}/")
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
        """Create an instance of CertificateOrderTask from a JSON string"""
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
        """
        excluded_fields: Set[str] = set([
            "uuid",
            "time_created",
            "time_scheduled",
            "time_started",
            "time_finished",
            "number_of_executions",
            "response",
            "error",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CertificateOrderTask from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "uuid": obj.get("uuid"),
            "timeCreated": obj.get("timeCreated"),
            "timeScheduled": obj.get("timeScheduled"),
            "timeStarted": obj.get("timeStarted"),
            "timeFinished": obj.get("timeFinished"),
            "status": obj.get("status"),
            "type": obj.get("type"),
            "numberOfExecutions": obj.get("numberOfExecutions"),
            "response": obj.get("response"),
            "error": obj.get("error")
        })
        return _obj


