"""
    SwissSign RA REST API

    See https://github.com/SwissSign-AG/RaApi/README.md  # noqa: E501

    The version of the OpenAPI document: 2.5.17
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


def lazy_import():
    from swisssign_ra_api.v2.model.client_domain_validation_status import ClientDomainValidationStatus
    globals()['ClientDomainValidationStatus'] = ClientDomainValidationStatus


class ClientDNS(ModelNormal):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
      allowed_values (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          with a capitalized key describing the allowed value and an allowed
          value. These dicts store the allowed enum values.
      attribute_map (dict): The key is attribute name
          and the value is json key in definition.
      discriminator_value_class_map (dict): A dict to go from the discriminator
          variable value to the discriminator class name.
      validations (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          that stores validations for max_length, min_length, max_items,
          min_items, exclusive_maximum, inclusive_maximum, exclusive_minimum,
          inclusive_minimum, and regex.
      additional_properties_type (tuple): A tuple of classes accepted
          as additional properties values.
    """

    allowed_values = {
    }

    validations = {
        ('uuid',): {
            'regex': {
                'pattern': r'cld-[0-9a-f-]{36}',  # noqa: E501
            },
        },
    }

    @cached_property
    def additional_properties_type():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded
        """
        lazy_import()
        return (bool, date, datetime, dict, float, int, list, str, none_type,)  # noqa: E501

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
        lazy_import()
        return {
            'uuid': (str,),  # noqa: E501
            'domain': (str,),  # noqa: E501
            'domain_unicode': (str,),  # noqa: E501
            'validated': (bool,),  # noqa: E501
            'trusted_domain': (bool,),  # noqa: E501
            'validation_method': (str,),  # noqa: E501
            'expired': (bool,),  # noqa: E501
            'random_value_time_expired': (bool,),  # noqa: E501
            'time_validated': (datetime, none_type,),  # noqa: E501
            'random_value': (str, none_type,),  # noqa: E501
            'random_value_time_created': (datetime,),  # noqa: E501
            'random_value_time_expire': (datetime,),  # noqa: E501
            'validation_result': (str, none_type,),  # noqa: E501
            'time_expired': (datetime, none_type,),  # noqa: E501
            'status': (ClientDomainValidationStatus,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'uuid': 'uuid',  # noqa: E501
        'domain': 'domain',  # noqa: E501
        'domain_unicode': 'domainUnicode',  # noqa: E501
        'validated': 'validated',  # noqa: E501
        'trusted_domain': 'trustedDomain',  # noqa: E501
        'validation_method': 'validationMethod',  # noqa: E501
        'expired': 'expired',  # noqa: E501
        'random_value_time_expired': 'randomValueTimeExpired',  # noqa: E501
        'time_validated': 'timeValidated',  # noqa: E501
        'random_value': 'randomValue',  # noqa: E501
        'random_value_time_created': 'randomValueTimeCreated',  # noqa: E501
        'random_value_time_expire': 'randomValueTimeExpire',  # noqa: E501
        'validation_result': 'validationResult',  # noqa: E501
        'time_expired': 'timeExpired',  # noqa: E501
        'status': 'status',  # noqa: E501
    }

    read_only_vars = {
        'uuid',  # noqa: E501
        'domain_unicode',  # noqa: E501
        'validated',  # noqa: E501
        'validation_method',  # noqa: E501
        'expired',  # noqa: E501
        'random_value_time_expired',  # noqa: E501
        'time_validated',  # noqa: E501
        'random_value',  # noqa: E501
        'random_value_time_created',  # noqa: E501
        'random_value_time_expire',  # noqa: E501
        'validation_result',  # noqa: E501
        'time_expired',  # noqa: E501
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, uuid, domain, domain_unicode, validated, trusted_domain, validation_method, expired, random_value_time_expired, *args, **kwargs):  # noqa: E501
        """ClientDNS - a model defined in OpenAPI

        Args:
            uuid (str): Pre validated client domain reference
            domain (str): Client domain in punycode
            domain_unicode (str): Client domain in unicode
            validated (bool): Indicates if the domain is validated
            trusted_domain (bool): Indicates if the domain is a trusted domain (for private PKIs). This setting is linked to the certificate product DNS validation rule for Private PKIs.
            validation_method (str): DNS validation type
            expired (bool): Indicates if the pre validation of the domain has expired
            random_value_time_expired (bool): Indicates if the random value is expired

        Keyword Args:
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
            time_validated (datetime, none_type): Indicates when the domain got validated. [optional]  # noqa: E501
            random_value (str, none_type): The random value to add to the DNS TXT record for the domain. [optional]  # noqa: E501
            random_value_time_created (datetime): Indicates when the random value was created. [optional]  # noqa: E501
            random_value_time_expire (datetime): Indicates when the random value expires. [optional]  # noqa: E501
            validation_result (str, none_type): Indicates the validation result. [optional]  # noqa: E501
            time_expired (datetime, none_type): Indicates when the random value was created. [optional]  # noqa: E501
            status (ClientDomainValidationStatus): [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', True)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        self = super(OpenApiModel, cls).__new__(cls)

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

        self.uuid = uuid
        self.domain = domain
        self.domain_unicode = domain_unicode
        self.validated = validated
        self.trusted_domain = trusted_domain
        self.validation_method = validation_method
        self.expired = expired
        self.random_value_time_expired = random_value_time_expired
        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
        return self

    required_properties = set([
        '_data_store',
        '_check_type',
        '_spec_property_naming',
        '_path_to_item',
        '_configuration',
        '_visited_composed_classes',
    ])

    @convert_js_args_to_python_args
    def __init__(self, domain, trusted_domain, *args, **kwargs):  # noqa: E501
        """ClientDNS - a model defined in OpenAPI

            domain (str): Client domain in punycode
            trusted_domain (bool): Indicates if the domain is a trusted domain (for private PKIs). This setting is linked to the certificate product DNS validation rule for Private PKIs.
        Keyword Args:
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
            time_validated (datetime, none_type): Indicates when the domain got validated. [optional]  # noqa: E501
            random_value (str, none_type): The random value to add to the DNS TXT record for the domain. [optional]  # noqa: E501
            random_value_time_created (datetime): Indicates when the random value was created. [optional]  # noqa: E501
            random_value_time_expire (datetime): Indicates when the random value expires. [optional]  # noqa: E501
            validation_result (str, none_type): Indicates the validation result. [optional]  # noqa: E501
            time_expired (datetime, none_type): Indicates when the random value was created. [optional]  # noqa: E501
            status (ClientDomainValidationStatus): [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
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

        self.domain = domain
        self.trusted_domain = trusted_domain
        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
            if var_name in self.read_only_vars:
                raise ApiAttributeError(f"`{var_name}` is a read-only attribute. Use `from_openapi_data` to instantiate "
                                     f"class with read only attributes.")
