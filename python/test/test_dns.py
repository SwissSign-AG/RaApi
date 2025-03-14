# coding: utf-8

"""
    SwissSign RA REST API

    See https://github.com/SwissSign-AG/RaApi/README.md

    The version of the OpenAPI document: 3.4.4
    Contact: ssc@swisssign.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from swisssign_ra_api.v2.models.dns import DNS

class TestDNS(unittest.TestCase):
    """DNS unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DNS:
        """Test DNS
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DNS`
        """
        model = DNS()
        if include_optional:
            return DNS(
                dns = 'support.sample.org',
                include_base_domain_for_wildcard = True,
                include_www_domain = True
            )
        else:
            return DNS(
                dns = 'support.sample.org',
        )
        """

    def testDNS(self):
        """Test DNS"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
