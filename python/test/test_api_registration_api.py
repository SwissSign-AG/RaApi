"""
    SwissSign RA REST API

    See https://github.com/SwissSign-AG/RaApi/README.md  # noqa: E501

    The version of the OpenAPI document: 2.0.214
    Contact: ssc@swisssign.com
    Generated by: https://openapi-generator.tech
"""


import unittest

import swisssign_ra_api.v2
from swisssign_ra_api.v2.api.api_registration_api import ApiRegistrationApi  # noqa: E501


class TestApiRegistrationApi(unittest.TestCase):
    """ApiRegistrationApi unit test stubs"""

    def setUp(self):
        self.api = ApiRegistrationApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_client_prevalidated_domains(self):
        """Test case for create_client_prevalidated_domains

        Register new prevalidated domains for the selected client given its reference Id  # noqa: E501
        """
        pass

    def test_delete_client_prevalidated_domain(self):
        """Test case for delete_client_prevalidated_domain

        Delete prevalidated domain for the selected reference Id  # noqa: E501
        """
        pass

    def test_delete_client_prevalidated_domain_token(self):
        """Test case for delete_client_prevalidated_domain_token

        Delete prevalidated domain token for the selected reference Id  # noqa: E501
        """
        pass

    def test_get_certificate_chain(self):
        """Test case for get_certificate_chain

        Retrieve the certificate chain for the given Order reference  # noqa: E501
        """
        pass

    def test_get_certificate_order(self):
        """Test case for get_certificate_order

        Retrieve a Certificate Order given the Order reference  # noqa: E501
        """
        pass

    def test_get_certificate_order_status(self):
        """Test case for get_certificate_order_status

        Retrieve a Certificate Order status given the Order reference  # noqa: E501
        """
        pass

    def test_get_certificate_order_tasks(self):
        """Test case for get_certificate_order_tasks

        Retrieve a Certificate Order Tasks given the Order reference  # noqa: E501
        """
        pass

    def test_get_certificate_orders(self):
        """Test case for get_certificate_orders

        Search Certificate Orders  # noqa: E501
        """
        pass

    def test_get_client(self):
        """Test case for get_client

        Get a client given its reference Id  # noqa: E501
        """
        pass

    def test_get_client_prevalidated_domain(self):
        """Test case for get_client_prevalidated_domain

        Get prevalidated domains for the selected domain reference Id  # noqa: E501
        """
        pass

    def test_get_client_prevalidated_domains(self):
        """Test case for get_client_prevalidated_domains

        Get the list of prevalidated domains for the selected client given its reference Id  # noqa: E501
        """
        pass

    def test_issue_certificate(self):
        """Test case for issue_certificate

        Issue certificate using CSR  # noqa: E501
        """
        pass

    def test_jwt(self):
        """Test case for jwt

        Produce a user JWT  # noqa: E501
        """
        pass

    def test_reset_client_prevalidated_domain(self):
        """Test case for reset_client_prevalidated_domain

        Reset prevalidated domain token for the selected reference Id  # noqa: E501
        """
        pass

    def test_revoke_certificates(self):
        """Test case for revoke_certificates

        Revoke certificates  # noqa: E501
        """
        pass

    def test_search_clients(self):
        """Test case for search_clients

        Search Clients available to the RA Operator  # noqa: E501
        """
        pass

    def test_validate_client_prevalidated_domain(self):
        """Test case for validate_client_prevalidated_domain

        Prevalidate domain for the selected domain reference Id  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
