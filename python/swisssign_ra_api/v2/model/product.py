"""
    SwissSign RA REST API

    See https://github.com/SwissSign-AG/RaApi/README.md  # noqa: E501

    The version of the OpenAPI document: 2.0.209
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
    from swisssign_ra_api.v2.model.key_type import KeyType
    globals()['KeyType'] = KeyType


class Product(ModelNormal):
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
        ('key_generation_type',): {
            'PKCS10': "PKCS10",
            'PKCS12': "PKCS12",
            'PKCS12WITHPIN': "PKCS12withPIN",
            'PKCS10OR12WITHPIN': "PKCS10or12withPIN",
            'HSM': "HSM",
            'CNG': "CNG",
        },
    }

    validations = {
        ('uuid',): {
            'regex': {
                'pattern': r'pma-[0-9a-f-]{36}',  # noqa: E501
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
            'key_generation_type': (str,),  # noqa: E501
            'key_type': (KeyType,),  # noqa: E501
            'issuance_notification': (bool,),  # noqa: E501
            'revocation_notification': (bool,),  # noqa: E501
            'authorization': (bool,),  # noqa: E501
            'renewal_rule': (bool,),  # noqa: E501
            'publish_certificate': (bool,),  # noqa: E501
            'client_publish_certificate_override': (bool,),  # noqa: E501
            'client_publish_certificate_override_default': (bool,),  # noqa: E501
            'product_name': (str,),  # noqa: E501
            'product_description': (str, none_type,),  # noqa: E501
            'expiration_date': (date, none_type,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'uuid': 'uuid',  # noqa: E501
        'key_generation_type': 'keyGenerationType',  # noqa: E501
        'key_type': 'keyType',  # noqa: E501
        'issuance_notification': 'issuanceNotification',  # noqa: E501
        'revocation_notification': 'revocationNotification',  # noqa: E501
        'authorization': 'authorization',  # noqa: E501
        'renewal_rule': 'renewalRule',  # noqa: E501
        'publish_certificate': 'publishCertificate',  # noqa: E501
        'client_publish_certificate_override': 'clientPublishCertificateOverride',  # noqa: E501
        'client_publish_certificate_override_default': 'clientPublishCertificateOverrideDefault',  # noqa: E501
        'product_name': 'productName',  # noqa: E501
        'product_description': 'productDescription',  # noqa: E501
        'expiration_date': 'expirationDate',  # noqa: E501
    }

    read_only_vars = {
        'uuid',  # noqa: E501
        'key_generation_type',  # noqa: E501
        'issuance_notification',  # noqa: E501
        'revocation_notification',  # noqa: E501
        'authorization',  # noqa: E501
        'renewal_rule',  # noqa: E501
        'publish_certificate',  # noqa: E501
        'client_publish_certificate_override',  # noqa: E501
        'client_publish_certificate_override_default',  # noqa: E501
        'product_name',  # noqa: E501
        'product_description',  # noqa: E501
        'expiration_date',  # noqa: E501
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, uuid, key_generation_type, key_type, issuance_notification, revocation_notification, authorization, renewal_rule, publish_certificate, client_publish_certificate_override, client_publish_certificate_override_default, *args, **kwargs):  # noqa: E501
        """Product - a model defined in OpenAPI

        Args:
            uuid (str): Product UUID reference
            key_generation_type (str): Key generation protocol
            key_type (KeyType):
            issuance_notification (bool): Indicate if the certificate sends a notification on issuance
            revocation_notification (bool): Indicate if the certificate sends a notification on revocation
            authorization (bool): Indicate if the certificate requires an authorization on issuance/revocation
            renewal_rule (bool): Indicate if the certificate sends a notification for renewal
            publish_certificate (bool): Indicate if the certificate is published to the public LDAP after issuance
            client_publish_certificate_override (bool): Indicate if the certificate publication can be overridden
            client_publish_certificate_override_default (bool): Indicate the default value if publication override is enabled

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
            product_name (str): Certificate product name. [optional]  # noqa: E501
            product_description (str, none_type): Product additional description. [optional]  # noqa: E501
            expiration_date (date, none_type): Indicate if the certificate product has an expiration date. [optional]  # noqa: E501
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
        self.key_generation_type = key_generation_type
        self.key_type = key_type
        self.issuance_notification = issuance_notification
        self.revocation_notification = revocation_notification
        self.authorization = authorization
        self.renewal_rule = renewal_rule
        self.publish_certificate = publish_certificate
        self.client_publish_certificate_override = client_publish_certificate_override
        self.client_publish_certificate_override_default = client_publish_certificate_override_default
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
    def __init__(self, key_type, *args, **kwargs):  # noqa: E501
        """Product - a model defined in OpenAPI

            key_type (KeyType):
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
            product_name (str): Certificate product name. [optional]  # noqa: E501
            product_description (str, none_type): Product additional description. [optional]  # noqa: E501
            expiration_date (date, none_type): Indicate if the certificate product has an expiration date. [optional]  # noqa: E501
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

        self.key_type = key_type
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
