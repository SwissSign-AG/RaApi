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
from swisssign_ra_api.v2.model.revocation_reason import RevocationReason
globals()['RevocationReason'] = RevocationReason
from swisssign_ra_api.v2.model.revocation_status import RevocationStatus


class TestRevocationStatus(unittest.TestCase):
    """RevocationStatus unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testRevocationStatus(self):
        """Test RevocationStatus"""
        # FIXME: construct object with mandatory attributes with example values
        # model = RevocationStatus()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
