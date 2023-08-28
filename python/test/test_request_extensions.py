"""
    SwissSign RA REST API

    See https://github.com/SwissSign-AG/RaApi/README.md  # noqa: E501

    The version of the OpenAPI document: 2.3.0
    Contact: ssc@swisssign.com
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import swisssign_ra_api.v2
from swisssign_ra_api.v2.model.request_dns import RequestDNS
from swisssign_ra_api.v2.model.request_rfc822 import RequestRFC822
from swisssign_ra_api.v2.model.request_upn import RequestUPN
globals()['RequestDNS'] = RequestDNS
globals()['RequestRFC822'] = RequestRFC822
globals()['RequestUPN'] = RequestUPN
from swisssign_ra_api.v2.model.request_extensions import RequestExtensions


class TestRequestExtensions(unittest.TestCase):
    """RequestExtensions unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testRequestExtensions(self):
        """Test RequestExtensions"""
        # FIXME: construct object with mandatory attributes with example values
        # model = RequestExtensions()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
