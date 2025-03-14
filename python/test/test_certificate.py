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

from swisssign_ra_api.v2.models.certificate import Certificate

class TestCertificate(unittest.TestCase):
    """Certificate unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Certificate:
        """Test Certificate
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Certificate`
        """
        model = Certificate()
        if include_optional:
            return Certificate(
                subject = 'DC=COM,DC=Domain,OU=Some Organizational Unit,CN=Some Name',
                issuer = 'DC=COM,DC=Domain,OU=Some Organizational Unit,CN=Issuer Name',
                serial = '3893409CB666E1F092B7B6F28E1EAF4582AA7F21',
                start_validity = '2022-01-12T23:20:50.52Z',
                end_validity = '2023-01-12T23:20:50.52Z',
                certificate = '... [snipped] ... dGhpcyBpcyBhbiBleGFtcGxl ... [snipped] ...',
                revocation_status = swisssign_ra_api.v2.models.revocation_status.RevocationStatus(
                    revoked_on = '2022-02-12T05:10:50.52Z', 
                    reason = 'SUPERSEDED', 
                    revoked_by = 'some@email.org', 
                    revocation_requestor = 'John Doe', )
            )
        else:
            return Certificate(
                subject = 'DC=COM,DC=Domain,OU=Some Organizational Unit,CN=Some Name',
                issuer = 'DC=COM,DC=Domain,OU=Some Organizational Unit,CN=Issuer Name',
                serial = '3893409CB666E1F092B7B6F28E1EAF4582AA7F21',
                start_validity = '2022-01-12T23:20:50.52Z',
                end_validity = '2023-01-12T23:20:50.52Z',
                certificate = '... [snipped] ... dGhpcyBpcyBhbiBleGFtcGxl ... [snipped] ...',
        )
        """

    def testCertificate(self):
        """Test Certificate"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
