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

from swisssign_ra_api.v2.models.certificate_order_task import CertificateOrderTask

class TestCertificateOrderTask(unittest.TestCase):
    """CertificateOrderTask unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CertificateOrderTask:
        """Test CertificateOrderTask
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CertificateOrderTask`
        """
        model = CertificateOrderTask()
        if include_optional:
            return CertificateOrderTask(
                uuid = 'job-f0725b50-c533-4802-a844-de57bfb7a80e',
                time_created = '2022-02-12T05:10:50.52Z',
                time_scheduled = '2022-02-12T05:10:50.52Z',
                time_started = '2022-02-12T05:10:50.52Z',
                time_finished = '2022-02-12T05:10:50.52Z',
                status = 'SUCCESS',
                type = 'ISSUE_FINALIZE_ISSUE_CERTIFICATE_JOB',
                number_of_executions = 2,
                response = 'Processed successfully',
                error = 'Error processing xyz ...'
            )
        else:
            return CertificateOrderTask(
                uuid = 'job-f0725b50-c533-4802-a844-de57bfb7a80e',
                status = 'SUCCESS',
                type = 'ISSUE_FINALIZE_ISSUE_CERTIFICATE_JOB',
                number_of_executions = 2,
        )
        """

    def testCertificateOrderTask(self):
        """Test CertificateOrderTask"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
