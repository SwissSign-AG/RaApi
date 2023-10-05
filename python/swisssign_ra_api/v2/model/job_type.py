"""
    SwissSign RA REST API

    See https://github.com/SwissSign-AG/RaApi/README.md  # noqa: E501

    The version of the OpenAPI document: 2.3.4
    Contact: ssc@swisssign.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from swisssign_ra_api.v2.model_utils import (  # noqa: F401
    ApiTypeError,
    ModelComposed,
    ModelNormal,
    ModelSimple,
    cached_property,
    change_keys_js_to_python,
    convert_js_args_to_python_args,
    date,
    datetime,
    file_type,
    none_type,
    validate_get_composed_info,
    OpenApiModel
)
from swisssign_ra_api.v2.exceptions import ApiAttributeError



class JobType(ModelSimple):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
      allowed_values (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          with a capitalized key describing the allowed value and an allowed
          value. These dicts store the allowed enum values.
      validations (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          that stores validations for max_length, min_length, max_items,
          min_items, exclusive_maximum, inclusive_maximum, exclusive_minimum,
          inclusive_minimum, and regex.
      additional_properties_type (tuple): A tuple of classes accepted
          as additional properties values.
    """

    allowed_values = {
        ('value',): {
            'ISSUE_SUBMIT_CERTIFICATE_ORDER_JOB': "ISSUE_SUBMIT_CERTIFICATE_ORDER_JOB",
            'ISSUE_CERTIFICATE_RENEWAL_VALIDATION_JOB': "ISSUE_CERTIFICATE_RENEWAL_VALIDATION_JOB",
            'ISSUE_KEY_VALIDATION_JOB': "ISSUE_KEY_VALIDATION_JOB",
            'ISSUE_PRE_VALIDATION_JOB': "ISSUE_PRE_VALIDATION_JOB",
            'ISSUE_GENERATE_TBS_JOB': "ISSUE_GENERATE_TBS_JOB",
            'ISSUE_POLICY_VALIDATION_JOB': "ISSUE_POLICY_VALIDATION_JOB",
            'ISSUE_CAA_CHECK_VALIDATION_JOB': "ISSUE_CAA_CHECK_VALIDATION_JOB",
            'ISSUE_DOMAIN_OWNER_CHECK_VALIDATION_JOB': "ISSUE_DOMAIN_OWNER_CHECK_VALIDATION_JOB",
            'ISSUE_END_USER_EMAIL_VALIDATION_JOB': "ISSUE_END_USER_EMAIL_VALIDATION_JOB",
            'ISSUE_PRE_LINTING_JOB': "ISSUE_PRE_LINTING_JOB",
            'ISSUE_PRE_ISSUE_CERTIFICATE_JOB': "ISSUE_PRE_ISSUE_CERTIFICATE_JOB",
            'ISSUE_CT_LOG_PRE_CERT_PUBLICATION_JOB': "ISSUE_CT_LOG_PRE_CERT_PUBLICATION_JOB",
            'ISSUE_ISSUE_CERTIFICATE_JOB': "ISSUE_ISSUE_CERTIFICATE_JOB",
            'ISSUE_ISSUE_SWS_CERTIFICATE_JOB': "ISSUE_ISSUE_SWS_CERTIFICATE_JOB",
            'ISSUE_POST_ISSUE_CERTIFICATE_JOB': "ISSUE_POST_ISSUE_CERTIFICATE_JOB",
            'ISSUE_FINALIZE_ISSUE_CERTIFICATE_JOB': "ISSUE_FINALIZE_ISSUE_CERTIFICATE_JOB",
            'ISSUE_POST_LINTING_CERTIFICATE_JOB': "ISSUE_POST_LINTING_CERTIFICATE_JOB",
            'ISSUE_CT_LOG_PUBLICATION_JOB': "ISSUE_CT_LOG_PUBLICATION_JOB",
            'ISSUE_AUTHORIZATION_JOB': "ISSUE_AUTHORIZATION_JOB",
            'ISSUE_NOTIFY_ISSUED_JOB': "ISSUE_NOTIFY_ISSUED_JOB",
            'ISSUE_NOTIFY_RENEWAL_JOB': "ISSUE_NOTIFY_RENEWAL_JOB",
            'ISSUE_UPDATE_RENEWAL_JOB': "ISSUE_UPDATE_RENEWAL_JOB",
            'ISSUE_REVOKE_RENEWED_CERTIFICATE_JOB': "ISSUE_REVOKE_RENEWED_CERTIFICATE_JOB",
            'ISSUE_NOTIFY_P12_RETRIEVAL_JOB': "ISSUE_NOTIFY_P12_RETRIEVAL_JOB",
            'ISSUE_NOTIFY_HSM_RETRIEVAL_JOB': "ISSUE_NOTIFY_HSM_RETRIEVAL_JOB",
            'ISSUE_SET_P12_PIN_JOB': "ISSUE_SET_P12_PIN_JOB",
            'ISSUE_SEND_P12_PIN_JOB': "ISSUE_SEND_P12_PIN_JOB",
            'PUBLISH_POST_CERTIFICATE_JOB': "PUBLISH_POST_CERTIFICATE_JOB",
            'REVOKE_CERTIFICATE_JOB': "REVOKE_CERTIFICATE_JOB",
            'PUBLISH_CERTIFICATE_ORDER_JOB': "PUBLISH_CERTIFICATE_ORDER_JOB",
            'RA_AUTHORIZE_CERT_REVOKE_JOB': "RA_AUTHORIZE_CERT_REVOKE_JOB",
            'RA_NOTIFY_AUTHORIZE_CERT_REVOKE_JOB': "RA_NOTIFY_AUTHORIZE_CERT_REVOKE_JOB",
            'SEND_EMAIL_JOB': "SEND_EMAIL_JOB",
            'RESEND_END_USER_SELF_SERVICE_VALIDATION_EMAIL_JOB': "RESEND_END_USER_SELF_SERVICE_VALIDATION_EMAIL_JOB",
            'REVOKE_SWS_CERTIFICATE_JOB': "REVOKE_SWS_CERTIFICATE_JOB",
            'MANUAL_PUBLISH_CERTIFICATE_JOB': "MANUAL_PUBLISH_CERTIFICATE_JOB",
            'MANUAL_UNPUBLISH_CERTIFICATE_JOB': "MANUAL_UNPUBLISH_CERTIFICATE_JOB",
            'SCEP_PKI_OPERATION_JOB': "SCEP_PKI_OPERATION_JOB",
            'MICROSOFT_CES_REQUEST_JOB': "MICROSOFT_CES_REQUEST_JOB",
            'MICROSOFT_CES_STATUS_JOB': "MICROSOFT_CES_STATUS_JOB",
            'MICROSOFT_ENROLMENT_POLICIES_JOB': "MICROSOFT_ENROLMENT_POLICIES_JOB",
            'MICROSOFT_CES_QUERY_STATUS_JOB': "MICROSOFT_CES_QUERY_STATUS_JOB",
            'MICROSOFT_CES_UNKNOWN_JOB': "MICROSOFT_CES_UNKNOWN_JOB",
            'SNOW_REVOKE_ALL_CLIENT_CERTIFICATES_JOB': "SNOW_REVOKE_ALL_CLIENT_CERTIFICATES_JOB",
            'SNOW_REVOKE_ALL_POLICY_MAPPING_CERTIFICATES_JOB': "SNOW_REVOKE_ALL_POLICY_MAPPING_CERTIFICATES_JOB",
        },
    }

    validations = {
    }

    additional_properties_type = None

    _nullable = False

    @cached_property
    def openapi_types():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded

        Returns
            openapi_types (dict): The key is attribute name
                and the value is attribute type.
        """
        return {
            'value': (str,),
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {}

    read_only_vars = set()

    _composed_schemas = None

    required_properties = set([
        '_data_store',
        '_check_type',
        '_spec_property_naming',
        '_path_to_item',
        '_configuration',
        '_visited_composed_classes',
    ])

    @convert_js_args_to_python_args
    def __init__(self, *args, **kwargs):
        """JobType - a model defined in OpenAPI

        Note that value can be passed either in args or in kwargs, but not in both.

        Args:
            args[0] (str): Certificate Order Task Type., must be one of ["ISSUE_SUBMIT_CERTIFICATE_ORDER_JOB", "ISSUE_CERTIFICATE_RENEWAL_VALIDATION_JOB", "ISSUE_KEY_VALIDATION_JOB", "ISSUE_PRE_VALIDATION_JOB", "ISSUE_GENERATE_TBS_JOB", "ISSUE_POLICY_VALIDATION_JOB", "ISSUE_CAA_CHECK_VALIDATION_JOB", "ISSUE_DOMAIN_OWNER_CHECK_VALIDATION_JOB", "ISSUE_END_USER_EMAIL_VALIDATION_JOB", "ISSUE_PRE_LINTING_JOB", "ISSUE_PRE_ISSUE_CERTIFICATE_JOB", "ISSUE_CT_LOG_PRE_CERT_PUBLICATION_JOB", "ISSUE_ISSUE_CERTIFICATE_JOB", "ISSUE_ISSUE_SWS_CERTIFICATE_JOB", "ISSUE_POST_ISSUE_CERTIFICATE_JOB", "ISSUE_FINALIZE_ISSUE_CERTIFICATE_JOB", "ISSUE_POST_LINTING_CERTIFICATE_JOB", "ISSUE_CT_LOG_PUBLICATION_JOB", "ISSUE_AUTHORIZATION_JOB", "ISSUE_NOTIFY_ISSUED_JOB", "ISSUE_NOTIFY_RENEWAL_JOB", "ISSUE_UPDATE_RENEWAL_JOB", "ISSUE_REVOKE_RENEWED_CERTIFICATE_JOB", "ISSUE_NOTIFY_P12_RETRIEVAL_JOB", "ISSUE_NOTIFY_HSM_RETRIEVAL_JOB", "ISSUE_SET_P12_PIN_JOB", "ISSUE_SEND_P12_PIN_JOB", "PUBLISH_POST_CERTIFICATE_JOB", "REVOKE_CERTIFICATE_JOB", "PUBLISH_CERTIFICATE_ORDER_JOB", "RA_AUTHORIZE_CERT_REVOKE_JOB", "RA_NOTIFY_AUTHORIZE_CERT_REVOKE_JOB", "SEND_EMAIL_JOB", "RESEND_END_USER_SELF_SERVICE_VALIDATION_EMAIL_JOB", "REVOKE_SWS_CERTIFICATE_JOB", "MANUAL_PUBLISH_CERTIFICATE_JOB", "MANUAL_UNPUBLISH_CERTIFICATE_JOB", "SCEP_PKI_OPERATION_JOB", "MICROSOFT_CES_REQUEST_JOB", "MICROSOFT_CES_STATUS_JOB", "MICROSOFT_ENROLMENT_POLICIES_JOB", "MICROSOFT_CES_QUERY_STATUS_JOB", "MICROSOFT_CES_UNKNOWN_JOB", "SNOW_REVOKE_ALL_CLIENT_CERTIFICATES_JOB", "SNOW_REVOKE_ALL_POLICY_MAPPING_CERTIFICATES_JOB", ]  # noqa: E501

        Keyword Args:
            value (str): Certificate Order Task Type., must be one of ["ISSUE_SUBMIT_CERTIFICATE_ORDER_JOB", "ISSUE_CERTIFICATE_RENEWAL_VALIDATION_JOB", "ISSUE_KEY_VALIDATION_JOB", "ISSUE_PRE_VALIDATION_JOB", "ISSUE_GENERATE_TBS_JOB", "ISSUE_POLICY_VALIDATION_JOB", "ISSUE_CAA_CHECK_VALIDATION_JOB", "ISSUE_DOMAIN_OWNER_CHECK_VALIDATION_JOB", "ISSUE_END_USER_EMAIL_VALIDATION_JOB", "ISSUE_PRE_LINTING_JOB", "ISSUE_PRE_ISSUE_CERTIFICATE_JOB", "ISSUE_CT_LOG_PRE_CERT_PUBLICATION_JOB", "ISSUE_ISSUE_CERTIFICATE_JOB", "ISSUE_ISSUE_SWS_CERTIFICATE_JOB", "ISSUE_POST_ISSUE_CERTIFICATE_JOB", "ISSUE_FINALIZE_ISSUE_CERTIFICATE_JOB", "ISSUE_POST_LINTING_CERTIFICATE_JOB", "ISSUE_CT_LOG_PUBLICATION_JOB", "ISSUE_AUTHORIZATION_JOB", "ISSUE_NOTIFY_ISSUED_JOB", "ISSUE_NOTIFY_RENEWAL_JOB", "ISSUE_UPDATE_RENEWAL_JOB", "ISSUE_REVOKE_RENEWED_CERTIFICATE_JOB", "ISSUE_NOTIFY_P12_RETRIEVAL_JOB", "ISSUE_NOTIFY_HSM_RETRIEVAL_JOB", "ISSUE_SET_P12_PIN_JOB", "ISSUE_SEND_P12_PIN_JOB", "PUBLISH_POST_CERTIFICATE_JOB", "REVOKE_CERTIFICATE_JOB", "PUBLISH_CERTIFICATE_ORDER_JOB", "RA_AUTHORIZE_CERT_REVOKE_JOB", "RA_NOTIFY_AUTHORIZE_CERT_REVOKE_JOB", "SEND_EMAIL_JOB", "RESEND_END_USER_SELF_SERVICE_VALIDATION_EMAIL_JOB", "REVOKE_SWS_CERTIFICATE_JOB", "MANUAL_PUBLISH_CERTIFICATE_JOB", "MANUAL_UNPUBLISH_CERTIFICATE_JOB", "SCEP_PKI_OPERATION_JOB", "MICROSOFT_CES_REQUEST_JOB", "MICROSOFT_CES_STATUS_JOB", "MICROSOFT_ENROLMENT_POLICIES_JOB", "MICROSOFT_CES_QUERY_STATUS_JOB", "MICROSOFT_CES_UNKNOWN_JOB", "SNOW_REVOKE_ALL_CLIENT_CERTIFICATES_JOB", "SNOW_REVOKE_ALL_POLICY_MAPPING_CERTIFICATES_JOB", ]  # noqa: E501
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
        """
        # required up here when default value is not given
        _path_to_item = kwargs.pop('_path_to_item', ())

        if 'value' in kwargs:
            value = kwargs.pop('value')
        elif args:
            args = list(args)
            value = args.pop(0)
        else:
            raise ApiTypeError(
                "value is required, but not passed in args or kwargs and doesn't have default",
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        if args:
            for arg in args:
                if isinstance(arg, dict):
                    kwargs.update(arg)
                else:
                    raise ApiTypeError(
                        "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                            args,
                            self.__class__.__name__,
                        ),
                        path_to_item=_path_to_item,
                        valid_classes=(self.__class__,),
                    )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)
        self.value = value
        if kwargs:
            raise ApiTypeError(
                "Invalid named arguments=%s passed to %s. Remove those invalid named arguments." % (
                    kwargs,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):
        """JobType - a model defined in OpenAPI

        Note that value can be passed either in args or in kwargs, but not in both.

        Args:
            args[0] (str): Certificate Order Task Type., must be one of ["ISSUE_SUBMIT_CERTIFICATE_ORDER_JOB", "ISSUE_CERTIFICATE_RENEWAL_VALIDATION_JOB", "ISSUE_KEY_VALIDATION_JOB", "ISSUE_PRE_VALIDATION_JOB", "ISSUE_GENERATE_TBS_JOB", "ISSUE_POLICY_VALIDATION_JOB", "ISSUE_CAA_CHECK_VALIDATION_JOB", "ISSUE_DOMAIN_OWNER_CHECK_VALIDATION_JOB", "ISSUE_END_USER_EMAIL_VALIDATION_JOB", "ISSUE_PRE_LINTING_JOB", "ISSUE_PRE_ISSUE_CERTIFICATE_JOB", "ISSUE_CT_LOG_PRE_CERT_PUBLICATION_JOB", "ISSUE_ISSUE_CERTIFICATE_JOB", "ISSUE_ISSUE_SWS_CERTIFICATE_JOB", "ISSUE_POST_ISSUE_CERTIFICATE_JOB", "ISSUE_FINALIZE_ISSUE_CERTIFICATE_JOB", "ISSUE_POST_LINTING_CERTIFICATE_JOB", "ISSUE_CT_LOG_PUBLICATION_JOB", "ISSUE_AUTHORIZATION_JOB", "ISSUE_NOTIFY_ISSUED_JOB", "ISSUE_NOTIFY_RENEWAL_JOB", "ISSUE_UPDATE_RENEWAL_JOB", "ISSUE_REVOKE_RENEWED_CERTIFICATE_JOB", "ISSUE_NOTIFY_P12_RETRIEVAL_JOB", "ISSUE_NOTIFY_HSM_RETRIEVAL_JOB", "ISSUE_SET_P12_PIN_JOB", "ISSUE_SEND_P12_PIN_JOB", "PUBLISH_POST_CERTIFICATE_JOB", "REVOKE_CERTIFICATE_JOB", "PUBLISH_CERTIFICATE_ORDER_JOB", "RA_AUTHORIZE_CERT_REVOKE_JOB", "RA_NOTIFY_AUTHORIZE_CERT_REVOKE_JOB", "SEND_EMAIL_JOB", "RESEND_END_USER_SELF_SERVICE_VALIDATION_EMAIL_JOB", "REVOKE_SWS_CERTIFICATE_JOB", "MANUAL_PUBLISH_CERTIFICATE_JOB", "MANUAL_UNPUBLISH_CERTIFICATE_JOB", "SCEP_PKI_OPERATION_JOB", "MICROSOFT_CES_REQUEST_JOB", "MICROSOFT_CES_STATUS_JOB", "MICROSOFT_ENROLMENT_POLICIES_JOB", "MICROSOFT_CES_QUERY_STATUS_JOB", "MICROSOFT_CES_UNKNOWN_JOB", "SNOW_REVOKE_ALL_CLIENT_CERTIFICATES_JOB", "SNOW_REVOKE_ALL_POLICY_MAPPING_CERTIFICATES_JOB", ]  # noqa: E501

        Keyword Args:
            value (str): Certificate Order Task Type., must be one of ["ISSUE_SUBMIT_CERTIFICATE_ORDER_JOB", "ISSUE_CERTIFICATE_RENEWAL_VALIDATION_JOB", "ISSUE_KEY_VALIDATION_JOB", "ISSUE_PRE_VALIDATION_JOB", "ISSUE_GENERATE_TBS_JOB", "ISSUE_POLICY_VALIDATION_JOB", "ISSUE_CAA_CHECK_VALIDATION_JOB", "ISSUE_DOMAIN_OWNER_CHECK_VALIDATION_JOB", "ISSUE_END_USER_EMAIL_VALIDATION_JOB", "ISSUE_PRE_LINTING_JOB", "ISSUE_PRE_ISSUE_CERTIFICATE_JOB", "ISSUE_CT_LOG_PRE_CERT_PUBLICATION_JOB", "ISSUE_ISSUE_CERTIFICATE_JOB", "ISSUE_ISSUE_SWS_CERTIFICATE_JOB", "ISSUE_POST_ISSUE_CERTIFICATE_JOB", "ISSUE_FINALIZE_ISSUE_CERTIFICATE_JOB", "ISSUE_POST_LINTING_CERTIFICATE_JOB", "ISSUE_CT_LOG_PUBLICATION_JOB", "ISSUE_AUTHORIZATION_JOB", "ISSUE_NOTIFY_ISSUED_JOB", "ISSUE_NOTIFY_RENEWAL_JOB", "ISSUE_UPDATE_RENEWAL_JOB", "ISSUE_REVOKE_RENEWED_CERTIFICATE_JOB", "ISSUE_NOTIFY_P12_RETRIEVAL_JOB", "ISSUE_NOTIFY_HSM_RETRIEVAL_JOB", "ISSUE_SET_P12_PIN_JOB", "ISSUE_SEND_P12_PIN_JOB", "PUBLISH_POST_CERTIFICATE_JOB", "REVOKE_CERTIFICATE_JOB", "PUBLISH_CERTIFICATE_ORDER_JOB", "RA_AUTHORIZE_CERT_REVOKE_JOB", "RA_NOTIFY_AUTHORIZE_CERT_REVOKE_JOB", "SEND_EMAIL_JOB", "RESEND_END_USER_SELF_SERVICE_VALIDATION_EMAIL_JOB", "REVOKE_SWS_CERTIFICATE_JOB", "MANUAL_PUBLISH_CERTIFICATE_JOB", "MANUAL_UNPUBLISH_CERTIFICATE_JOB", "SCEP_PKI_OPERATION_JOB", "MICROSOFT_CES_REQUEST_JOB", "MICROSOFT_CES_STATUS_JOB", "MICROSOFT_ENROLMENT_POLICIES_JOB", "MICROSOFT_CES_QUERY_STATUS_JOB", "MICROSOFT_CES_UNKNOWN_JOB", "SNOW_REVOKE_ALL_CLIENT_CERTIFICATES_JOB", "SNOW_REVOKE_ALL_POLICY_MAPPING_CERTIFICATES_JOB", ]  # noqa: E501
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
        """
        # required up here when default value is not given
        _path_to_item = kwargs.pop('_path_to_item', ())

        self = super(OpenApiModel, cls).__new__(cls)

        if 'value' in kwargs:
            value = kwargs.pop('value')
        elif args:
            args = list(args)
            value = args.pop(0)
        else:
            raise ApiTypeError(
                "value is required, but not passed in args or kwargs and doesn't have default",
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        if args:
            for arg in args:
                if isinstance(arg, dict):
                    kwargs.update(arg)
                else:
                    raise ApiTypeError(
                        "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                            args,
                            self.__class__.__name__,
                        ),
                        path_to_item=_path_to_item,
                        valid_classes=(self.__class__,),
                    )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)
        self.value = value
        if kwargs:
            raise ApiTypeError(
                "Invalid named arguments=%s passed to %s. Remove those invalid named arguments." % (
                    kwargs,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        return self
