"""
    SwissSign RA REST API

    See https://github.com/SwissSign-AG/RaApi/README.md  # noqa: E501

    The version of the OpenAPI document: 2.4.9
    Contact: ssc@swisssign.com
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import swisssign_ra_api.v2
from swisssign_ra_api.v2.model.key_type import KeyType
from swisssign_ra_api.v2.model.product_validity import ProductValidity
globals()['KeyType'] = KeyType
globals()['ProductValidity'] = ProductValidity
from swisssign_ra_api.v2.model.product import Product


class TestProduct(unittest.TestCase):
    """Product unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testProduct(self):
        """Test Product"""
        # FIXME: construct object with mandatory attributes with example values
        # model = Product()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
