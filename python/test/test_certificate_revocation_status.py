"""
    SwissSign RA REST API

    See https://github.com/SwissSign-AG/RaApi/README.md  # noqa: E501

    The version of the OpenAPI document: 2.0.0
    Contact: opensource@swisssign.com
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import swisssign_ra_api.v2
from swisssign_ra_api.v2.model.null_type import NullType
from swisssign_ra_api.v2.model.revocation_reason import RevocationReason
from swisssign_ra_api.v2.model.revocation_status import RevocationStatus
globals()['NullType'] = NullType
globals()['RevocationReason'] = RevocationReason
globals()['RevocationStatus'] = RevocationStatus
from swisssign_ra_api.v2.model.certificate_revocation_status import CertificateRevocationStatus


class TestCertificateRevocationStatus(unittest.TestCase):
    """CertificateRevocationStatus unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testCertificateRevocationStatus(self):
        """Test CertificateRevocationStatus"""
        # FIXME: construct object with mandatory attributes with example values
        # model = CertificateRevocationStatus()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()