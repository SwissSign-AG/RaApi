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



class AdditionalRecipientType(ModelSimple):
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
            'DNS_OWNER_CHECK_EMAIL_LINK': "DNS_OWNER_CHECK_EMAIL_LINK",
            'DNS_CAB': "DNS_CAB",
            'ISSUANCE': "ISSUANCE",
            'REVOCATION': "REVOCATION",
            'RENEWAL': "RENEWAL",
            'RECOVERY': "RECOVERY",
            'ISSUANCE_AUTHORIZATION': "ISSUANCE_AUTHORIZATION",
            'ISSUANCE_AUTHORIZATION_ACCEPTED': "ISSUANCE_AUTHORIZATION_ACCEPTED",
            'ISSUANCE_AUTHORIZATION_REJECTED': "ISSUANCE_AUTHORIZATION_REJECTED",
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
        """AdditionalRecipientType - a model defined in OpenAPI

        Note that value can be passed either in args or in kwargs, but not in both.

        Args:
            args[0] (str): Notification type for additional recipient.   - DNS_OWNER_CHECK_EMAIL_LINK: send notification for DNS validation (email link) to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - DNS_CAB: send notification for CAB DNS change or CAB Agreed upon to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - ISSUANCE: send notification for certificate issuance to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - REVOCATION: send notification for certificate revocation to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - RENEWAL: send notification for certificate renewal to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - RECOVERY: send notification for key recovery to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - ISSUANCE_AUTHORIZATION: send notification for certificate issuance authorization to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - ISSUANCE_AUTHORIZATION_ACCEPTED: send notification for accepted certificate issuance authorization to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - ISSUANCE_AUTHORIZATION_REJECTED: send notification for rejected certificate issuance authorization to additional recipient. Requires notification enabled for 'Additional recipient' on notification template. ., must be one of ["DNS_OWNER_CHECK_EMAIL_LINK", "DNS_CAB", "ISSUANCE", "REVOCATION", "RENEWAL", "RECOVERY", "ISSUANCE_AUTHORIZATION", "ISSUANCE_AUTHORIZATION_ACCEPTED", "ISSUANCE_AUTHORIZATION_REJECTED", ]  # noqa: E501

        Keyword Args:
            value (str): Notification type for additional recipient.   - DNS_OWNER_CHECK_EMAIL_LINK: send notification for DNS validation (email link) to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - DNS_CAB: send notification for CAB DNS change or CAB Agreed upon to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - ISSUANCE: send notification for certificate issuance to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - REVOCATION: send notification for certificate revocation to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - RENEWAL: send notification for certificate renewal to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - RECOVERY: send notification for key recovery to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - ISSUANCE_AUTHORIZATION: send notification for certificate issuance authorization to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - ISSUANCE_AUTHORIZATION_ACCEPTED: send notification for accepted certificate issuance authorization to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - ISSUANCE_AUTHORIZATION_REJECTED: send notification for rejected certificate issuance authorization to additional recipient. Requires notification enabled for 'Additional recipient' on notification template. ., must be one of ["DNS_OWNER_CHECK_EMAIL_LINK", "DNS_CAB", "ISSUANCE", "REVOCATION", "RENEWAL", "RECOVERY", "ISSUANCE_AUTHORIZATION", "ISSUANCE_AUTHORIZATION_ACCEPTED", "ISSUANCE_AUTHORIZATION_REJECTED", ]  # noqa: E501
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
        """AdditionalRecipientType - a model defined in OpenAPI

        Note that value can be passed either in args or in kwargs, but not in both.

        Args:
            args[0] (str): Notification type for additional recipient.   - DNS_OWNER_CHECK_EMAIL_LINK: send notification for DNS validation (email link) to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - DNS_CAB: send notification for CAB DNS change or CAB Agreed upon to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - ISSUANCE: send notification for certificate issuance to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - REVOCATION: send notification for certificate revocation to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - RENEWAL: send notification for certificate renewal to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - RECOVERY: send notification for key recovery to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - ISSUANCE_AUTHORIZATION: send notification for certificate issuance authorization to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - ISSUANCE_AUTHORIZATION_ACCEPTED: send notification for accepted certificate issuance authorization to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - ISSUANCE_AUTHORIZATION_REJECTED: send notification for rejected certificate issuance authorization to additional recipient. Requires notification enabled for 'Additional recipient' on notification template. ., must be one of ["DNS_OWNER_CHECK_EMAIL_LINK", "DNS_CAB", "ISSUANCE", "REVOCATION", "RENEWAL", "RECOVERY", "ISSUANCE_AUTHORIZATION", "ISSUANCE_AUTHORIZATION_ACCEPTED", "ISSUANCE_AUTHORIZATION_REJECTED", ]  # noqa: E501

        Keyword Args:
            value (str): Notification type for additional recipient.   - DNS_OWNER_CHECK_EMAIL_LINK: send notification for DNS validation (email link) to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - DNS_CAB: send notification for CAB DNS change or CAB Agreed upon to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - ISSUANCE: send notification for certificate issuance to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - REVOCATION: send notification for certificate revocation to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - RENEWAL: send notification for certificate renewal to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - RECOVERY: send notification for key recovery to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - ISSUANCE_AUTHORIZATION: send notification for certificate issuance authorization to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - ISSUANCE_AUTHORIZATION_ACCEPTED: send notification for accepted certificate issuance authorization to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - ISSUANCE_AUTHORIZATION_REJECTED: send notification for rejected certificate issuance authorization to additional recipient. Requires notification enabled for 'Additional recipient' on notification template. ., must be one of ["DNS_OWNER_CHECK_EMAIL_LINK", "DNS_CAB", "ISSUANCE", "REVOCATION", "RENEWAL", "RECOVERY", "ISSUANCE_AUTHORIZATION", "ISSUANCE_AUTHORIZATION_ACCEPTED", "ISSUANCE_AUTHORIZATION_REJECTED", ]  # noqa: E501
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
