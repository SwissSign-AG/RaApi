"""
    SwissSign RA REST API

    See https://github.com/SwissSign-AG/RaApi/README.md  # noqa: E501

    The version of the OpenAPI document: 2.5.17
    Contact: ssc@swisssign.com
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import swisssign_ra_api.v2
from swisssign_ra_api.v2.model.certificate_order_status import CertificateOrderStatus
from swisssign_ra_api.v2.model.revocation_reason import RevocationReason
globals()['CertificateOrderStatus'] = CertificateOrderStatus
globals()['RevocationReason'] = RevocationReason
from swisssign_ra_api.v2.model.search_certificate_order import SearchCertificateOrder


class TestSearchCertificateOrder(unittest.TestCase):
    """SearchCertificateOrder unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testSearchCertificateOrder(self):
        """Test SearchCertificateOrder"""
        # FIXME: construct object with mandatory attributes with example values
        # model = SearchCertificateOrder()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
